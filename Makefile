VERSION := $(shell cat VERSION)

.PHONY: build
build:
	find . -mindepth 1 -maxdepth 1 -not -name Makefile -not -name .git -not -name .gitignore -exec rm -Rf {} ';'
	echo $(VERSION) > VERSION
	curl https://raw.githubusercontent.com/argoproj/argo/$(VERSION)/api/openapi-spec/swagger.json | sed 's/io.argoproj.workflow.v1alpha1.//' | sed 's/io.k8s.api.core.v1.//' | sed 's/io.k8s.apimachinery.pkg.apis.meta.v1.//' > swagger.json
	docker run --rm -v `pwd`:/wd openapitools/openapi-generator-cli:v4.3.1 \
		generate \
		-i /wd/swagger.json \
		-g java \
		-o /wd \
		-p hideGenerationTimestamp=true \
		-p dateLibrary=joda \
		--api-package io.argoproj.workflow.apis \
		--invoker-package io.argoproj.workflow \
		--model-package io.argoproj.workflow.models \
		--group-id io.argoproj.workflow \
		--artifact-id argo-client-java \
		--artifact-version $(VERSION) \
		--import-mappings Time=org.joda.time.DateTime \
		--import-mappings Affinity=io.kubernetes.client.models.V1Affinity \
		--import-mappings ConfigMapKeySelector=io.kubernetes.client.models.V1ConfigMapKeySelector \
		--import-mappings Container=io.kubernetes.client.models.V1Container \
		--import-mappings ContainerPort=io.kubernetes.client.models.V1ContainerPort \
		--import-mappings EnvFromSource=io.kubernetes.client.models.V1EnvFromSource \
		--import-mappings EnvVar=io.kubernetes.client.models.V1EnvVar \
		--import-mappings HostAlias=io.kubernetes.client.models.V1HostAlias \
		--import-mappings Lifecycle=io.kubernetes.client.models.V1Lifecycle \
		--import-mappings ListMeta=io.kubernetes.client.models.V1ListMeta \
		--import-mappings LocalObjectReference=io.kubernetes.client.models.V1LocalObjectReference \
		--import-mappings ObjectMeta=io.kubernetes.client.models.V1ObjectMeta \
		--import-mappings ObjectReference=io.kubernetes.client.models.V1ObjectReference \
		--import-mappings PersistentVolumeClaim=io.kubernetes.client.models.V1PersistentVolumeClaim \
		--import-mappings PodDisruptionBudgetSpec=io.kubernetes.client.models.V1beta1PodDisruptionBudgetSpec \
		--import-mappings PodDNSConfig=io.kubernetes.client.models.V1PodDNSConfig \
		--import-mappings PodSecurityContext=io.kubernetes.client.models.V1PodSecurityContext \
		--import-mappings Probe=io.kubernetes.client.models.V1Probe \
		--import-mappings ResourceRequirements=io.kubernetes.client.models.V1ResourceRequirements \
		--import-mappings SecretKeySelector=io.kubernetes.client.models.V1SecretKeySelector \
		--import-mappings SecurityContext=io.kubernetes.client.models.V1SecurityContext \
		--import-mappings Toleration=io.kubernetes.client.models.V1Toleration \
		--import-mappings Volume=io.kubernetes.client.models.V1Volume \
		--import-mappings VolumeDevice=io.kubernetes.client.models.V1VolumeDevice \
		--import-mappings VolumeMount=io.kubernetes.client.models.V1VolumeMount \
		--generate-alias-as-model
	# add the io.kubernetes:java-client to the deps
	sed 's/<dependencies>/<dependencies><dependency><groupId>io.kubernetes<\/groupId><artifactId>client-java<\/artifactId><version>5.0.0<\/version><\/dependency>/g' pom.xml > tmp && mv tmp pom.xml
	docker run -v ~/.m2:/root/.m2 -v `pwd`:/wd -w /wd maven:3-openjdk-8 \
		mvn install -DskipTests -Dmaven.javadoc.skip
	git add .
	git commit -m 'Updated to $(VERSION)' || git diff --exit-code
	git tag -f $(VERSION)

.PHONY: publish
publish: build
	# https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages
	docker run -v ~/.m2:/root/.m2 -v `pwd`:/wd -w /wd maven:3-openjdk-8 \
		mvn deploy -DskipTests -Dmaven.javadoc.skip -DaltDeploymentRepository=github::default::https://maven.pkg.github.com/argoproj-labs/argo-client-java
	git push --tags

VERSION := v2.10.1

.PHONY: build
build:
	find . -mindepth 1 -maxdepth 1 -not -name Makefile -not -name .git -exec rm -Rf {} ';'
	docker run --rm -v `pwd`:/wd openapitools/openapi-generator-cli:v4.3.1 \
		generate \
		-i https://raw.githubusercontent.com/argoproj/argo/$(VERSION)/api/openapi-spec/swagger.json \
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
		--generate-alias-as-model \
		--model-name-prefix=''

	# add the io.kubernetes:java-client to the deps
	# sed 's/<dependencies>/<dependencies><dependency><groupId>io.kubernetes<\/groupId><artifactId>client-java<\/artifactId><version>5.0.0<\/version><\/dependency>/g' pom.xml > tmp && mv tmp pom.xml
	mvn install -DskipTests -Dmaven.javadoc.skip
	git add .
	git commit -m 'Updated to $(VERSION)' || git diff --exit-code
	git tag -f $(VERSION)

.PHONY: publish
publish: build
	# https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages
	mvn deploy -DskipTests -Dmaven.javadoc.skip -DaltDeploymentRepository=github::default::https://maven.pkg.github.com/argoproj-labs/argo-client-java
ifneq ($(VERSION),HEAD)
	git tag $(VERSION)
endif
	git push --tags



# IoK8sApiCoreV1EnvVarSource

EnvVarSource represents a source for the value of an EnvVar.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMapKeyRef** | [**io.kubernetes.client.models.V1ConfigMapKeySelector**](io.kubernetes.client.models.V1ConfigMapKeySelector.md) |  |  [optional]
**fieldRef** | [**IoK8sApiCoreV1ObjectFieldSelector**](IoK8sApiCoreV1ObjectFieldSelector.md) |  |  [optional]
**resourceFieldRef** | [**IoK8sApiCoreV1ResourceFieldSelector**](IoK8sApiCoreV1ResourceFieldSelector.md) |  |  [optional]
**secretKeyRef** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]




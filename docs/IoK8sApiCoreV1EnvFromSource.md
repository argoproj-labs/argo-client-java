

# IoK8sApiCoreV1EnvFromSource

EnvFromSource represents the source of a set of ConfigMaps
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMapRef** | [**IoK8sApiCoreV1ConfigMapEnvSource**](IoK8sApiCoreV1ConfigMapEnvSource.md) |  |  [optional]
**prefix** | **String** | An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER. |  [optional]
**secretRef** | [**IoK8sApiCoreV1SecretEnvSource**](IoK8sApiCoreV1SecretEnvSource.md) |  |  [optional]




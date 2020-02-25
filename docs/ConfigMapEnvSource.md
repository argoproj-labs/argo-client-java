

# ConfigMapEnvSource

ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.  The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localObjectReference** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**optional** | **Boolean** |  |  [optional]




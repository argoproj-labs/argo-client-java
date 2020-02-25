

# SecretEnvSource

SecretEnvSource selects a Secret to populate the environment variables with.  The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localObjectReference** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**optional** | **Boolean** |  |  [optional]




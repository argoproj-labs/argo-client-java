

# S3Bucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]
**bucket** | **String** |  |  [optional]
**endpoint** | **String** |  |  [optional]
**insecure** | **Boolean** |  |  [optional]
**region** | **String** |  |  [optional]
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**secretKeySecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  |  [optional]
**useSDKCreds** | **Boolean** | UseSDKCreds tells the driver to figure out credentials based on sdk defaults. |  [optional]




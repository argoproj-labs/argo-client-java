

# S3Bucket

S3Bucket contains the access information required for interfacing with an S3 bucket
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  | 
**bucket** | **String** | Bucket is the name of the bucket | 
**endpoint** | **String** | Endpoint is the hostname of the bucket endpoint | 
**insecure** | **Boolean** | Insecure will connect to the service with TLS |  [optional]
**region** | **String** | Region contains the optional bucket region |  [optional]
**roleARN** | **String** | RoleARN is the Amazon Resource Name (ARN) of the role to assume. |  [optional]
**secretKeySecret** | [**io.kubernetes.client.models.V1SecretKeySelector**](io.kubernetes.client.models.V1SecretKeySelector.md) |  | 




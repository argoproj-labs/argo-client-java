

# IoK8sApiCoreV1PersistentVolumeClaimStatus

PersistentVolumeClaimStatus is the current status of a persistent volume claim.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** |  |  [optional]
**capacity** | [**Map&lt;String, IoK8sApiCoreV1Quantity&gt;**](IoK8sApiCoreV1Quantity.md) |  |  [optional]
**conditions** | [**List&lt;IoK8sApiCoreV1PersistentVolumeClaimCondition&gt;**](IoK8sApiCoreV1PersistentVolumeClaimCondition.md) |  |  [optional]
**phase** | **String** |  |  [optional]




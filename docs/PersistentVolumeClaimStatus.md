

# PersistentVolumeClaimStatus

PersistentVolumeClaimStatus is the current status of a persistent volume claim.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** |  |  [optional]
**capacity** | [**Map&lt;String, Quantity&gt;**](Quantity.md) |  |  [optional]
**conditions** | [**List&lt;PersistentVolumeClaimCondition&gt;**](PersistentVolumeClaimCondition.md) |  |  [optional]
**phase** | **String** |  |  [optional]






# ScaleIOVolumeSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsType** | **String** |  |  [optional]
**gateway** | **String** | The host address of the ScaleIO API Gateway. |  [optional]
**protectionDomain** | **String** |  |  [optional]
**readOnly** | **Boolean** |  |  [optional]
**secretRef** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**sslEnabled** | **Boolean** |  |  [optional]
**storageMode** | **String** |  |  [optional]
**storagePool** | **String** |  |  [optional]
**system** | **String** | The name of the storage system as configured in ScaleIO. |  [optional]
**volumeName** | **String** | The name of a volume already created in the ScaleIO system that is associated with this volume source. |  [optional]




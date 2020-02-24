

# IoK8sApiCoreV1CephFSVolumeSource

Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monitors** | **List&lt;String&gt;** |  |  [optional]
**path** | **String** |  |  [optional]
**readOnly** | **Boolean** |  |  [optional]
**secretFile** | **String** |  |  [optional]
**secretRef** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**user** | **String** |  |  [optional]




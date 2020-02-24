

# IoK8sApiCoreV1ConfigMapVolumeSource

Adapts a ConfigMap into a volume.  The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultMode** | **Integer** |  |  [optional]
**items** | [**List&lt;IoK8sApiCoreV1KeyToPath&gt;**](IoK8sApiCoreV1KeyToPath.md) |  |  [optional]
**localObjectReference** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**optional** | **Boolean** |  |  [optional]




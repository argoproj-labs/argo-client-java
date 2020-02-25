

# WorkflowStatus

WorkflowStatus contains overall status information about a workflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compressedNodes** | **String** | Compressed and base64 decoded Nodes map |  [optional]
**finishedAt** | [**IoK8sApimachineryPkgApisMetaV1Time**](IoK8sApimachineryPkgApisMetaV1Time.md) |  |  [optional]
**message** | **String** | A human readable message indicating details about why the workflow is in this condition. |  [optional]
**nodes** | [**Map&lt;String, NodeStatus&gt;**](NodeStatus.md) | Nodes is a mapping between a node ID and the node&#39;s status. |  [optional]
**outputs** | [**Outputs**](Outputs.md) |  |  [optional]
**persistentVolumeClaims** | [**List&lt;io.kubernetes.client.models.V1Volume&gt;**](io.kubernetes.client.models.V1Volume.md) | PersistentVolumeClaims tracks all PVCs that were created as part of the workflow. The contents of this list are drained at the end of the workflow. |  [optional]
**phase** | **String** | Phase a simple, high-level summary of where the workflow is in its lifecycle. |  [optional]
**startedAt** | [**IoK8sApimachineryPkgApisMetaV1Time**](IoK8sApimachineryPkgApisMetaV1Time.md) |  |  [optional]
**storedTemplates** | [**Map&lt;String, Template&gt;**](Template.md) | StoredTemplates is a mapping between a template ref and the node&#39;s status. |  [optional]




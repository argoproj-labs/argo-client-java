

# WorkflowStatus

WorkflowStatus contains overall status information about a workflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifactRepositoryRef** | [**ArtifactRepositoryRefStatus**](ArtifactRepositoryRefStatus.md) |  |  [optional]
**compressedNodes** | **String** | Compressed and base64 decoded Nodes map |  [optional]
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | Conditions is a list of conditions the Workflow may have |  [optional]
**estimatedDuration** | **Integer** | EstimatedDuration in seconds. |  [optional]
**finishedAt** | [**org.joda.time.DateTime**](org.joda.time.DateTime.md) |  |  [optional]
**message** | **String** | A human readable message indicating details about why the workflow is in this condition. |  [optional]
**nodes** | [**Map&lt;String, NodeStatus&gt;**](NodeStatus.md) | Nodes is a mapping between a node ID and the node&#39;s status. |  [optional]
**offloadNodeStatusVersion** | **String** | Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data. |  [optional]
**outputs** | [**Outputs**](Outputs.md) |  |  [optional]
**persistentVolumeClaims** | [**List&lt;io.kubernetes.client.openapi.models.V1Volume&gt;**](io.kubernetes.client.openapi.models.V1Volume.md) | PersistentVolumeClaims tracks all PVCs that were created as part of the  The contents of this list are drained at the end of the workflow. |  [optional]
**phase** | **String** | Phase a simple, high-level summary of where the workflow is in its lifecycle. |  [optional]
**progress** | **String** | Progress to completion |  [optional]
**resourcesDuration** | **Map&lt;String, Long&gt;** | ResourcesDuration is the total for the workflow |  [optional]
**startedAt** | [**org.joda.time.DateTime**](org.joda.time.DateTime.md) |  |  [optional]
**storedTemplates** | [**Map&lt;String, Template&gt;**](Template.md) | StoredTemplates is a mapping between a template ref and the node&#39;s status. |  [optional]
**storedWorkflowTemplateSpec** | [**WorkflowSpec**](WorkflowSpec.md) |  |  [optional]
**synchronization** | [**SynchronizationStatus**](SynchronizationStatus.md) |  |  [optional]




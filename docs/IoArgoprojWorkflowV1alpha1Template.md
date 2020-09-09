

# IoArgoprojWorkflowV1alpha1Template

Template is a reusable and composable unit of execution in a workflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates. |  [optional]
**affinity** | [**IoK8sApiCoreV1Affinity**](IoK8sApiCoreV1Affinity.md) |  |  [optional]
**archiveLocation** | [**IoArgoprojWorkflowV1alpha1ArtifactLocation**](IoArgoprojWorkflowV1alpha1ArtifactLocation.md) |  |  [optional]
**arguments** | [**IoArgoprojWorkflowV1alpha1Arguments**](IoArgoprojWorkflowV1alpha1Arguments.md) |  |  [optional]
**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. |  [optional]
**container** | [**IoK8sApiCoreV1Container**](IoK8sApiCoreV1Container.md) |  |  [optional]
**daemon** | **Boolean** | Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness |  [optional]
**dag** | [**IoArgoprojWorkflowV1alpha1DAGTemplate**](IoArgoprojWorkflowV1alpha1DAGTemplate.md) |  |  [optional]
**executor** | [**IoArgoprojWorkflowV1alpha1ExecutorConfig**](IoArgoprojWorkflowV1alpha1ExecutorConfig.md) |  |  [optional]
**hostAliases** | [**List&lt;IoK8sApiCoreV1HostAlias&gt;**](IoK8sApiCoreV1HostAlias.md) | HostAliases is an optional list of hosts and IPs that will be injected into the pod spec |  [optional]
**initContainers** | [**List&lt;IoArgoprojWorkflowV1alpha1UserContainer&gt;**](IoArgoprojWorkflowV1alpha1UserContainer.md) | InitContainers is a list of containers which run before the main container. |  [optional]
**inputs** | [**IoArgoprojWorkflowV1alpha1Inputs**](IoArgoprojWorkflowV1alpha1Inputs.md) |  |  [optional]
**metadata** | [**IoArgoprojWorkflowV1alpha1Metadata**](IoArgoprojWorkflowV1alpha1Metadata.md) |  |  [optional]
**metrics** | [**IoArgoprojWorkflowV1alpha1Metrics**](IoArgoprojWorkflowV1alpha1Metrics.md) |  |  [optional]
**name** | **String** | Name is the name of the template | 
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level. |  [optional]
**outputs** | [**IoArgoprojWorkflowV1alpha1Outputs**](IoArgoprojWorkflowV1alpha1Outputs.md) |  |  [optional]
**parallelism** | **Long** | Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total. |  [optional]
**podSpecPatch** | **String** | PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). |  [optional]
**priority** | **Integer** | Priority to apply to workflow pods. |  [optional]
**priorityClassName** | **String** | PriorityClassName to apply to workflow pods. |  [optional]
**resource** | [**IoArgoprojWorkflowV1alpha1ResourceTemplate**](IoArgoprojWorkflowV1alpha1ResourceTemplate.md) |  |  [optional]
**resubmitPendingPods** | **Boolean** | ResubmitPendingPods is a flag to enable resubmitting pods that remain Pending after initial submission |  [optional]
**retryStrategy** | [**IoArgoprojWorkflowV1alpha1RetryStrategy**](IoArgoprojWorkflowV1alpha1RetryStrategy.md) |  |  [optional]
**schedulerName** | **String** | If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler. |  [optional]
**script** | [**IoArgoprojWorkflowV1alpha1ScriptTemplate**](IoArgoprojWorkflowV1alpha1ScriptTemplate.md) |  |  [optional]
**securityContext** | [**IoK8sApiCoreV1PodSecurityContext**](IoK8sApiCoreV1PodSecurityContext.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName to apply to workflow pods |  [optional]
**sidecars** | [**List&lt;IoArgoprojWorkflowV1alpha1UserContainer&gt;**](IoArgoprojWorkflowV1alpha1UserContainer.md) | Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes |  [optional]
**steps** | [**List&lt;IoArgoprojWorkflowV1alpha1ParallelSteps&gt;**](IoArgoprojWorkflowV1alpha1ParallelSteps.md) | Steps define a series of sequential/parallel workflow steps |  [optional]
**suspend** | [**IoArgoprojWorkflowV1alpha1SuspendTemplate**](IoArgoprojWorkflowV1alpha1SuspendTemplate.md) |  |  [optional]
**synchronization** | [**IoArgoprojWorkflowV1alpha1Synchronization**](IoArgoprojWorkflowV1alpha1Synchronization.md) |  |  [optional]
**template** | **String** | Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used. |  [optional]
**templateRef** | [**IoArgoprojWorkflowV1alpha1TemplateRef**](IoArgoprojWorkflowV1alpha1TemplateRef.md) |  |  [optional]
**tolerations** | [**List&lt;IoK8sApiCoreV1Toleration&gt;**](IoK8sApiCoreV1Toleration.md) | Tolerations to apply to workflow pods. |  [optional]
**volumes** | [**List&lt;IoK8sApiCoreV1Volume&gt;**](IoK8sApiCoreV1Volume.md) | Volumes is a list of volumes that can be mounted by containers in a template. |  [optional]




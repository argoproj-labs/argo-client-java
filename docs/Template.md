

# Template

Template is a reusable and composable unit of execution in a workflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates. |  [optional]
**affinity** | [**io.kubernetes.client.openapi.models.V1Affinity**](io.kubernetes.client.openapi.models.V1Affinity.md) |  |  [optional]
**archiveLocation** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional]
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. |  [optional]
**container** | [**io.kubernetes.client.openapi.models.V1Container**](io.kubernetes.client.openapi.models.V1Container.md) |  |  [optional]
**daemon** | **Boolean** | Deamon will allow a workflow to proceed to the next step so long as the container reaches readiness |  [optional]
**dag** | [**DAGTemplate**](DAGTemplate.md) |  |  [optional]
**executor** | [**ExecutorConfig**](ExecutorConfig.md) |  |  [optional]
**hostAliases** | [**List&lt;io.kubernetes.client.openapi.models.V1HostAlias&gt;**](io.kubernetes.client.openapi.models.V1HostAlias.md) | HostAliases is an optional list of hosts and IPs that will be injected into the pod spec |  [optional]
**initContainers** | [**List&lt;UserContainer&gt;**](UserContainer.md) | InitContainers is a list of containers which run before the main container. |  [optional]
**inputs** | [**Inputs**](Inputs.md) |  |  [optional]
**metadata** | [**Metadata**](Metadata.md) |  |  [optional]
**metrics** | [**Metrics**](Metrics.md) |  |  [optional]
**name** | **String** | Name is the name of the template | 
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level. |  [optional]
**outputs** | [**Outputs**](Outputs.md) |  |  [optional]
**parallelism** | **Long** | Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total. |  [optional]
**podSpecPatch** | **String** | PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). |  [optional]
**priority** | **Integer** | Priority to apply to workflow pods. |  [optional]
**priorityClassName** | **String** | PriorityClassName to apply to workflow pods. |  [optional]
**resource** | [**ResourceTemplate**](ResourceTemplate.md) |  |  [optional]
**resubmitPendingPods** | **Boolean** | ResubmitPendingPods is a flag to enable resubmitting pods that remain Pending after initial submission |  [optional]
**retryStrategy** | [**RetryStrategy**](RetryStrategy.md) |  |  [optional]
**schedulerName** | **String** | If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler. |  [optional]
**script** | [**ScriptTemplate**](ScriptTemplate.md) |  |  [optional]
**securityContext** | [**io.kubernetes.client.openapi.models.V1PodSecurityContext**](io.kubernetes.client.openapi.models.V1PodSecurityContext.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName to apply to workflow pods |  [optional]
**sidecars** | [**List&lt;UserContainer&gt;**](UserContainer.md) | Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes |  [optional]
**steps** | [**List&lt;ParallelSteps&gt;**](ParallelSteps.md) | Steps define a series of sequential/parallel workflow steps |  [optional]
**suspend** | [**SuspendTemplate**](SuspendTemplate.md) |  |  [optional]
**synchronization** | [**Synchronization**](Synchronization.md) |  |  [optional]
**template** | **String** | Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used. |  [optional]
**templateRef** | [**TemplateRef**](TemplateRef.md) |  |  [optional]
**tolerations** | [**List&lt;io.kubernetes.client.openapi.models.V1Toleration&gt;**](io.kubernetes.client.openapi.models.V1Toleration.md) | Tolerations to apply to workflow pods. |  [optional]
**volumes** | [**List&lt;io.kubernetes.client.openapi.models.V1Volume&gt;**](io.kubernetes.client.openapi.models.V1Volume.md) | Volumes is a list of volumes that can be mounted by containers in a template. |  [optional]




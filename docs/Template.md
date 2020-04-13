

# Template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **String** | Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates. |  [optional]
**affinity** | [**io.kubernetes.client.models.V1Affinity**](io.kubernetes.client.models.V1Affinity.md) |  |  [optional]
**archiveLocation** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional]
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. |  [optional]
**container** | [**io.kubernetes.client.models.V1Container**](io.kubernetes.client.models.V1Container.md) |  |  [optional]
**daemon** | **Boolean** |  |  [optional]
**dag** | [**DAGTemplate**](DAGTemplate.md) |  |  [optional]
**executor** | [**ExecutorConfig**](ExecutorConfig.md) |  |  [optional]
**hostAliases** | [**List&lt;io.kubernetes.client.models.V1HostAlias&gt;**](io.kubernetes.client.models.V1HostAlias.md) |  |  [optional]
**initContainers** | [**List&lt;UserContainer&gt;**](UserContainer.md) |  |  [optional]
**inputs** | [**Inputs**](Inputs.md) |  |  [optional]
**metadata** | [**Metadata**](Metadata.md) |  |  [optional]
**metrics** | [**Metrics**](Metrics.md) |  |  [optional]
**name** | **String** |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level. |  [optional]
**outputs** | [**Outputs**](Outputs.md) |  |  [optional]
**parallelism** | **String** | Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total. |  [optional]
**podSpecPatch** | **String** | PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). |  [optional]
**priority** | **Integer** | Priority to apply to workflow pods. |  [optional]
**priorityClassName** | **String** | PriorityClassName to apply to workflow pods. |  [optional]
**resource** | [**ResourceTemplate**](ResourceTemplate.md) |  |  [optional]
**resubmitPendingPods** | **Boolean** |  |  [optional]
**retryStrategy** | [**RetryStrategy**](RetryStrategy.md) |  |  [optional]
**schedulerName** | **String** |  |  [optional]
**script** | [**ScriptTemplate**](ScriptTemplate.md) |  |  [optional]
**securityContext** | [**io.kubernetes.client.models.V1PodSecurityContext**](io.kubernetes.client.models.V1PodSecurityContext.md) |  |  [optional]
**serviceAccountName** | **String** |  |  [optional]
**sidecars** | [**List&lt;UserContainer&gt;**](UserContainer.md) |  |  [optional]
**steps** | [**List&lt;ParallelSteps&gt;**](ParallelSteps.md) |  |  [optional]
**suspend** | [**SuspendTemplate**](SuspendTemplate.md) |  |  [optional]
**template** | **String** | Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used. |  [optional]
**templateRef** | [**TemplateRef**](TemplateRef.md) |  |  [optional]
**tolerations** | [**List&lt;io.kubernetes.client.models.V1Toleration&gt;**](io.kubernetes.client.models.V1Toleration.md) |  |  [optional]
**volumes** | [**List&lt;io.kubernetes.client.models.V1Volume&gt;**](io.kubernetes.client.models.V1Volume.md) |  |  [optional]






# WorkflowSpec

WorkflowSpec is the specification of a Workflow.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **String** |  |  [optional]
**affinity** | [**io.kubernetes.client.models.V1Affinity**](io.kubernetes.client.models.V1Affinity.md) |  |  [optional]
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**artifactRepositoryRef** | [**ArtifactRepositoryRef**](ArtifactRepositoryRef.md) |  |  [optional]
**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. |  [optional]
**dnsConfig** | [**io.kubernetes.client.models.V1PodDNSConfig**](io.kubernetes.client.models.V1PodDNSConfig.md) |  |  [optional]
**dnsPolicy** | **String** | Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;. |  [optional]
**entrypoint** | **String** |  |  [optional]
**executor** | [**ExecutorConfig**](ExecutorConfig.md) |  |  [optional]
**hostAliases** | [**List&lt;io.kubernetes.client.models.V1HostAlias&gt;**](io.kubernetes.client.models.V1HostAlias.md) |  |  [optional]
**hostNetwork** | **Boolean** | Host networking requested for this workflow pod. Default to false. |  [optional]
**imagePullSecrets** | [**List&lt;io.kubernetes.client.models.V1LocalObjectReference&gt;**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template. |  [optional]
**onExit** | **String** | OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary  |  [optional]
**parallelism** | **String** |  |  [optional]
**podDisruptionBudget** | [**K8sIoApiPolicyV1beta1PodDisruptionBudgetSpec**](K8sIoApiPolicyV1beta1PodDisruptionBudgetSpec.md) |  |  [optional]
**podGC** | [**PodGC**](PodGC.md) |  |  [optional]
**podPriority** | **Integer** | Priority to apply to workflow pods. |  [optional]
**podPriorityClassName** | **String** | PriorityClassName to apply to workflow pods. |  [optional]
**podSpecPatch** | **String** | PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). |  [optional]
**priority** | **Integer** | Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first. |  [optional]
**schedulerName** | **String** |  |  [optional]
**securityContext** | [**io.kubernetes.client.models.V1PodSecurityContext**](io.kubernetes.client.models.V1PodSecurityContext.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as. |  [optional]
**suspend** | **Boolean** |  |  [optional]
**templates** | [**List&lt;Template&gt;**](Template.md) |  |  [optional]
**tolerations** | [**List&lt;io.kubernetes.client.models.V1Toleration&gt;**](io.kubernetes.client.models.V1Toleration.md) |  |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished limits the lifetime of a Workflow that has finished execution (Succeeded, Failed, Error). If this field is set, once the Workflow finishes, it will be deleted after ttlSecondsAfterFinished expires. If this field is unset, ttlSecondsAfterFinished will not expire. If this field is set to zero, ttlSecondsAfterFinished expires immediately after the Workflow finishes. DEPRECATED: Use TTLStrategy.SecondsAfterCompletion instead. |  [optional]
**ttlStrategy** | [**TTLStrategy**](TTLStrategy.md) |  |  [optional]
**volumeClaimTemplates** | [**List&lt;io.kubernetes.client.models.V1PersistentVolumeClaim&gt;**](io.kubernetes.client.models.V1PersistentVolumeClaim.md) |  |  [optional]
**volumes** | [**List&lt;io.kubernetes.client.models.V1Volume&gt;**](io.kubernetes.client.models.V1Volume.md) |  |  [optional]




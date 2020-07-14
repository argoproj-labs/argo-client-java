

# CronWorkflowStatus

CronWorkflowStatus is the status of a CronWorkflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | [**List&lt;io.kubernetes.client.models.V1ObjectReference&gt;**](io.kubernetes.client.models.V1ObjectReference.md) | Active is a list of active workflows stemming from this CronWorkflow |  [optional]
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | Conditions is a list of conditions the CronWorkflow may have |  [optional]
**lastScheduledTime** | [**DateTime**](DateTime.md) | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. |  [optional]




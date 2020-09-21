

# CronWorkflowStatus

CronWorkflowStatus is the status of a CronWorkflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | [**List&lt;io.kubernetes.client.openapi.models.V1ObjectReference&gt;**](io.kubernetes.client.openapi.models.V1ObjectReference.md) | Active is a list of active workflows stemming from this CronWorkflow |  [optional]
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | Conditions is a list of conditions the CronWorkflow may have |  [optional]
**lastScheduledTime** | [**org.joda.time.DateTime**](org.joda.time.DateTime.md) |  |  [optional]




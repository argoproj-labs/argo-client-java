

# WorkflowStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**continueOn** | [**ContinueOn**](ContinueOn.md) |  |  [optional]
**name** | **String** |  |  [optional]
**onExit** | **String** | OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. |  [optional]
**template** | **String** |  |  [optional]
**templateRef** | [**TemplateRef**](TemplateRef.md) |  |  [optional]
**when** | **String** |  |  [optional]
**withItems** | [**List&lt;Item&gt;**](Item.md) |  |  [optional]
**withParam** | **String** | WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list. |  [optional]
**withSequence** | [**Sequence**](Sequence.md) |  |  [optional]




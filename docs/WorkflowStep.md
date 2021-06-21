

# WorkflowStep

WorkflowStep is a reference to a template to execute in a series of step
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**continueOn** | [**ContinueOn**](ContinueOn.md) |  |  [optional]
**hooks** | [**Map&lt;String, LifecycleHook&gt;**](LifecycleHook.md) | Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step |  [optional]
**name** | **String** | Name of the step |  [optional]
**onExit** | **String** | OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. DEPRECATED: Use Hooks[exit].Template instead. |  [optional]
**template** | **String** | Template is the name of the template to execute as the step |  [optional]
**templateRef** | [**TemplateRef**](TemplateRef.md) |  |  [optional]
**when** | **String** | When is an expression in which the step should conditionally execute |  [optional]
**withItems** | **List&lt;Object&gt;** | WithItems expands a step into multiple parallel steps from the items in the list |  [optional]
**withParam** | **String** | WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list. |  [optional]
**withSequence** | [**Sequence**](Sequence.md) |  |  [optional]




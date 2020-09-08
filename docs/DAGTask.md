

# DAGTask

DAGTask represents a node in the graph during DAG execution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**continueOn** | [**ContinueOn**](ContinueOn.md) |  |  [optional]
**dependencies** | **List&lt;String&gt;** | Dependencies are name of other targets which this depends on |  [optional]
**depends** | **String** | Depends are name of other targets which this depends on |  [optional]
**name** | **String** | Name is the name of the target | 
**onExit** | **String** | OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. |  [optional]
**template** | **String** | Name of template to execute | 
**templateRef** | [**TemplateRef**](TemplateRef.md) |  |  [optional]
**when** | **String** | When is an expression in which the task should conditionally execute |  [optional]
**withItems** | **List&lt;Object&gt;** | WithItems expands a task into multiple parallel tasks from the items in the list |  [optional]
**withParam** | **String** | WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list. |  [optional]
**withSequence** | [**Sequence**](Sequence.md) |  |  [optional]




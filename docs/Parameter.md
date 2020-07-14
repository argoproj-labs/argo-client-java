

# Parameter

Parameter indicate a passed string parameter to a service template with an optional default value
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_default** | **String** | Default is the default value to use for an input parameter if a value was not supplied DEPRECATED: This field is not used |  [optional]
**globalName** | **String** | GlobalName exports an output parameter to the global scope, making it available as &#39;{{outputs.parameters.XXXX}} and in workflow.status.outputs.parameters |  [optional]
**name** | **String** | Name is the parameter name | 
**value** | **String** | Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values |  [optional]
**valueFrom** | [**ValueFrom**](ValueFrom.md) |  |  [optional]




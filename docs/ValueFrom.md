

# ValueFrom

ValueFrom describes a location in which to obtain the value to a parameter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jqFilter** | **String** | JQFilter expression against the resource object in resource templates |  [optional]
**jsonPath** | **String** | JSONPath of a resource to retrieve an output parameter value from in resource templates |  [optional]
**parameter** | **String** | Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. &#39;{{steps.mystep.outputs.myparam}}&#39;) |  [optional]
**path** | **String** | Path in the container to retrieve an output parameter value from in container templates |  [optional]






# IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec

PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxUnavailable** | **String** | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**minAvailable** | **String** | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**selector** | [**LabelSelector**](LabelSelector.md) |  |  [optional]




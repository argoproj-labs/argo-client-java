

# RetryStrategy

RetryStrategy provides controls on how to retry a workflow step
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backoff** | [**Backoff**](Backoff.md) |  |  [optional]
**limit** | **String** | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**retryPolicy** | **String** | RetryPolicy is a policy of NodePhase statuses that will be retried |  [optional]




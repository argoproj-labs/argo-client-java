

# Backoff

Backoff is a backoff strategy to use within retryStrategy
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **String** | Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \&quot;2m\&quot;, \&quot;1h\&quot;) |  [optional]
**factor** | **String** | IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number. |  [optional]
**maxDuration** | **String** | MaxDuration is the maximum amount of time allowed for the backoff strategy |  [optional]




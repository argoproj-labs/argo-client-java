

# IoArgoprojWorkflowV1alpha1Backoff

Backoff is a backoff strategy to use within retryStrategy
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **String** | Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \&quot;2m\&quot;, \&quot;1h\&quot;) |  [optional]
**factor** | **Integer** | Factor is a factor to multiply the base duration after each failed retry |  [optional]
**maxDuration** | **String** | MaxDuration is the maximum amount of time allowed for the backoff strategy |  [optional]




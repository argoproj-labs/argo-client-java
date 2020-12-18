

# Link

A link to another app.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the link, E.g. \&quot;Workflow Logs\&quot; or \&quot;Pod Logs\&quot; | 
**scope** | **String** | Either \&quot;workflow\&quot; or \&quot;pod\&quot; | 
**url** | **String** | The URL. May contain \&quot;${metadata.namespace}\&quot;, \&quot;${metadata.name}\&quot;, \&quot;${status.startedAt}\&quot; and \&quot;${status.finishedAt}\&quot;. | 




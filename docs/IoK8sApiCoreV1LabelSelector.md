

# IoK8sApiCoreV1LabelSelector

A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchExpressions** | [**List&lt;IoK8sApiCoreV1LabelSelectorRequirement&gt;**](IoK8sApiCoreV1LabelSelectorRequirement.md) |  |  [optional]
**matchLabels** | **Map&lt;String, String&gt;** |  |  [optional]




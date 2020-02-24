

# IoK8sApiCoreV1PodAffinityTerm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelSelector** | [**IoK8sApiCoreV1LabelSelector**](IoK8sApiCoreV1LabelSelector.md) |  |  [optional]
**namespaces** | **List&lt;String&gt;** |  |  [optional]
**topologyKey** | **String** | This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. |  [optional]




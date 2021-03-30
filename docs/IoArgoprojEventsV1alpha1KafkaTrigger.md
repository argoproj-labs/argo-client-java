

# IoArgoprojEventsV1alpha1KafkaTrigger

KafkaTrigger refers to the specification of the Kafka trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compress** | **Boolean** |  |  [optional]
**flushFrequency** | **Integer** |  |  [optional]
**parameters** | [**List&lt;IoArgoprojEventsV1alpha1TriggerParameter&gt;**](IoArgoprojEventsV1alpha1TriggerParameter.md) |  |  [optional]
**partition** | **Integer** | Partition to write data to. |  [optional]
**partitioningKey** | **String** | The partitioning key for the messages put on the Kafka topic. Defaults to broker url. +optional. |  [optional]
**payload** | [**List&lt;IoArgoprojEventsV1alpha1TriggerParameter&gt;**](IoArgoprojEventsV1alpha1TriggerParameter.md) |  |  [optional]
**requiredAcks** | **Integer** | RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). +optional. |  [optional]
**tls** | [**IoArgoprojEventsV1alpha1TLSConfig**](IoArgoprojEventsV1alpha1TLSConfig.md) |  |  [optional]
**topic** | **String** |  |  [optional]
**url** | **String** | URL of the Kafka broker. |  [optional]
**version** | **String** |  |  [optional]




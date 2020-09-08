

# Prometheus

Prometheus is a prometheus metric to be emitted
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counter** | [**Counter**](Counter.md) |  |  [optional]
**gauge** | [**Gauge**](Gauge.md) |  |  [optional]
**help** | **String** | Help is a string that describes the metric | 
**histogram** | [**Histogram**](Histogram.md) |  |  [optional]
**labels** | [**List&lt;MetricLabel&gt;**](MetricLabel.md) | Labels is a list of metric labels |  [optional]
**name** | **String** | Name is the name of the metric | 
**when** | **String** | When is a conditional statement that decides when to emit the metric |  [optional]




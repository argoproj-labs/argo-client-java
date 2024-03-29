/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TLSConfig;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KafkaTrigger refers to the specification of the Kafka trigger.
 */
@ApiModel(description = "KafkaTrigger refers to the specification of the Kafka trigger.")

public class IoArgoprojEventsV1alpha1KafkaTrigger {
  public static final String SERIALIZED_NAME_COMPRESS = "compress";
  @SerializedName(SERIALIZED_NAME_COMPRESS)
  private Boolean compress;

  public static final String SERIALIZED_NAME_FLUSH_FREQUENCY = "flushFrequency";
  @SerializedName(SERIALIZED_NAME_FLUSH_FREQUENCY)
  private Integer flushFrequency;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_PARTITIONING_KEY = "partitioningKey";
  @SerializedName(SERIALIZED_NAME_PARTITIONING_KEY)
  private String partitioningKey;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_REQUIRED_ACKS = "requiredAcks";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ACKS)
  private Integer requiredAcks;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private IoArgoprojEventsV1alpha1TLSConfig tls;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public IoArgoprojEventsV1alpha1KafkaTrigger compress(Boolean compress) {
    
    this.compress = compress;
    return this;
  }

   /**
   * Get compress
   * @return compress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompress() {
    return compress;
  }


  public void setCompress(Boolean compress) {
    this.compress = compress;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger flushFrequency(Integer flushFrequency) {
    
    this.flushFrequency = flushFrequency;
    return this;
  }

   /**
   * Get flushFrequency
   * @return flushFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFlushFrequency() {
    return flushFrequency;
  }


  public void setFlushFrequency(Integer flushFrequency) {
    this.flushFrequency = flushFrequency;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1KafkaTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Partition to write data to.
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Partition to write data to.")

  public Integer getPartition() {
    return partition;
  }


  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger partitioningKey(String partitioningKey) {
    
    this.partitioningKey = partitioningKey;
    return this;
  }

   /**
   * The partitioning key for the messages put on the Kafka topic. Defaults to broker url. +optional.
   * @return partitioningKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The partitioning key for the messages put on the Kafka topic. Defaults to broker url. +optional.")

  public String getPartitioningKey() {
    return partitioningKey;
  }


  public void setPartitioningKey(String partitioningKey) {
    this.partitioningKey = partitioningKey;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1KafkaTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger requiredAcks(Integer requiredAcks) {
    
    this.requiredAcks = requiredAcks;
    return this;
  }

   /**
   * RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). +optional.
   * @return requiredAcks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). +optional.")

  public Integer getRequiredAcks() {
    return requiredAcks;
  }


  public void setRequiredAcks(Integer requiredAcks) {
    this.requiredAcks = requiredAcks;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger tls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TLSConfig getTls() {
    return tls;
  }


  public void setTls(IoArgoprojEventsV1alpha1TLSConfig tls) {
    this.tls = tls;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the Kafka broker.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the Kafka broker.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public IoArgoprojEventsV1alpha1KafkaTrigger version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1KafkaTrigger ioArgoprojEventsV1alpha1KafkaTrigger = (IoArgoprojEventsV1alpha1KafkaTrigger) o;
    return Objects.equals(this.compress, ioArgoprojEventsV1alpha1KafkaTrigger.compress) &&
        Objects.equals(this.flushFrequency, ioArgoprojEventsV1alpha1KafkaTrigger.flushFrequency) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1KafkaTrigger.parameters) &&
        Objects.equals(this.partition, ioArgoprojEventsV1alpha1KafkaTrigger.partition) &&
        Objects.equals(this.partitioningKey, ioArgoprojEventsV1alpha1KafkaTrigger.partitioningKey) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1KafkaTrigger.payload) &&
        Objects.equals(this.requiredAcks, ioArgoprojEventsV1alpha1KafkaTrigger.requiredAcks) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1KafkaTrigger.tls) &&
        Objects.equals(this.topic, ioArgoprojEventsV1alpha1KafkaTrigger.topic) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1KafkaTrigger.url) &&
        Objects.equals(this.version, ioArgoprojEventsV1alpha1KafkaTrigger.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compress, flushFrequency, parameters, partition, partitioningKey, payload, requiredAcks, tls, topic, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1KafkaTrigger {\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    flushFrequency: ").append(toIndentedString(flushFrequency)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    partitioningKey: ").append(toIndentedString(partitioningKey)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    requiredAcks: ").append(toIndentedString(requiredAcks)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


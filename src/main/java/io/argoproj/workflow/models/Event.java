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
import io.argoproj.workflow.models.EventSeries;
import io.argoproj.workflow.models.EventSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@ApiModel(description = "Event is a report of an event somewhere in the cluster.")

public class Event {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private DateTime eventTime;

  public static final String SERIALIZED_NAME_FIRST_TIMESTAMP = "firstTimestamp";
  @SerializedName(SERIALIZED_NAME_FIRST_TIMESTAMP)
  private org.joda.time.DateTime firstTimestamp;

  public static final String SERIALIZED_NAME_INVOLVED_OBJECT = "involvedObject";
  @SerializedName(SERIALIZED_NAME_INVOLVED_OBJECT)
  private io.kubernetes.client.openapi.models.V1ObjectReference involvedObject;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_LAST_TIMESTAMP = "lastTimestamp";
  @SerializedName(SERIALIZED_NAME_LAST_TIMESTAMP)
  private org.joda.time.DateTime lastTimestamp;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.openapi.models.V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_RELATED = "related";
  @SerializedName(SERIALIZED_NAME_RELATED)
  private io.kubernetes.client.openapi.models.V1ObjectReference related;

  public static final String SERIALIZED_NAME_REPORTING_COMPONENT = "reportingComponent";
  @SerializedName(SERIALIZED_NAME_REPORTING_COMPONENT)
  private String reportingComponent;

  public static final String SERIALIZED_NAME_REPORTING_INSTANCE = "reportingInstance";
  @SerializedName(SERIALIZED_NAME_REPORTING_INSTANCE)
  private String reportingInstance;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private EventSeries series;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private EventSource source;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Event action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * What action was taken/failed regarding to the Regarding object.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public Event apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public Event count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of times this event has occurred.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times this event has occurred.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public Event eventTime(DateTime eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * MicroTime is version of Time with microsecond level precision.
   * @return eventTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MicroTime is version of Time with microsecond level precision.")

  public DateTime getEventTime() {
    return eventTime;
  }


  public void setEventTime(DateTime eventTime) {
    this.eventTime = eventTime;
  }


  public Event firstTimestamp(org.joda.time.DateTime firstTimestamp) {
    
    this.firstTimestamp = firstTimestamp;
    return this;
  }

   /**
   * Get firstTimestamp
   * @return firstTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getFirstTimestamp() {
    return firstTimestamp;
  }


  public void setFirstTimestamp(org.joda.time.DateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }


  public Event involvedObject(io.kubernetes.client.openapi.models.V1ObjectReference involvedObject) {
    
    this.involvedObject = involvedObject;
    return this;
  }

   /**
   * Get involvedObject
   * @return involvedObject
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }


  public void setInvolvedObject(io.kubernetes.client.openapi.models.V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }


  public Event kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public Event lastTimestamp(org.joda.time.DateTime lastTimestamp) {
    
    this.lastTimestamp = lastTimestamp;
    return this;
  }

   /**
   * Get lastTimestamp
   * @return lastTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getLastTimestamp() {
    return lastTimestamp;
  }


  public void setLastTimestamp(org.joda.time.DateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }


  public Event message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the status of this operation.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Event metadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public Event reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public Event related(io.kubernetes.client.openapi.models.V1ObjectReference related) {
    
    this.related = related;
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ObjectReference getRelated() {
    return related;
  }


  public void setRelated(io.kubernetes.client.openapi.models.V1ObjectReference related) {
    this.related = related;
  }


  public Event reportingComponent(String reportingComponent) {
    
    this.reportingComponent = reportingComponent;
    return this;
  }

   /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingComponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")

  public String getReportingComponent() {
    return reportingComponent;
  }


  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }


  public Event reportingInstance(String reportingInstance) {
    
    this.reportingInstance = reportingInstance;
    return this;
  }

   /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   * @return reportingInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")

  public String getReportingInstance() {
    return reportingInstance;
  }


  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }


  public Event series(EventSeries series) {
    
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSeries getSeries() {
    return series;
  }


  public void setSeries(EventSeries series) {
    this.series = series;
  }


  public Event source(EventSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSource getSource() {
    return source;
  }


  public void setSource(EventSource source) {
    this.source = source;
  }


  public Event type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of this event (Normal, Warning), new types could be added in the future
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.action, event.action) &&
        Objects.equals(this.apiVersion, event.apiVersion) &&
        Objects.equals(this.count, event.count) &&
        Objects.equals(this.eventTime, event.eventTime) &&
        Objects.equals(this.firstTimestamp, event.firstTimestamp) &&
        Objects.equals(this.involvedObject, event.involvedObject) &&
        Objects.equals(this.kind, event.kind) &&
        Objects.equals(this.lastTimestamp, event.lastTimestamp) &&
        Objects.equals(this.message, event.message) &&
        Objects.equals(this.metadata, event.metadata) &&
        Objects.equals(this.reason, event.reason) &&
        Objects.equals(this.related, event.related) &&
        Objects.equals(this.reportingComponent, event.reportingComponent) &&
        Objects.equals(this.reportingInstance, event.reportingInstance) &&
        Objects.equals(this.series, event.series) &&
        Objects.equals(this.source, event.source) &&
        Objects.equals(this.type, event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


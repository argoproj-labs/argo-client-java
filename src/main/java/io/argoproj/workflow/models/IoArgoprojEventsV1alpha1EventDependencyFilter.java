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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1DataFilter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventContext;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TimeFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EventDependencyFilter defines filters and constraints for a 
 */
@ApiModel(description = "EventDependencyFilter defines filters and constraints for a ")

public class IoArgoprojEventsV1alpha1EventDependencyFilter {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private IoArgoprojEventsV1alpha1EventContext context;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<IoArgoprojEventsV1alpha1DataFilter> data = null;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private IoArgoprojEventsV1alpha1TimeFilter time;


  public IoArgoprojEventsV1alpha1EventDependencyFilter context(IoArgoprojEventsV1alpha1EventContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventContext getContext() {
    return context;
  }


  public void setContext(IoArgoprojEventsV1alpha1EventContext context) {
    this.context = context;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter data(List<IoArgoprojEventsV1alpha1DataFilter> data) {
    
    this.data = data;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventDependencyFilter addDataItem(IoArgoprojEventsV1alpha1DataFilter dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<IoArgoprojEventsV1alpha1DataFilter>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1DataFilter> getData() {
    return data;
  }


  public void setData(List<IoArgoprojEventsV1alpha1DataFilter> data) {
    this.data = data;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter time(IoArgoprojEventsV1alpha1TimeFilter time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TimeFilter getTime() {
    return time;
  }


  public void setTime(IoArgoprojEventsV1alpha1TimeFilter time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EventDependencyFilter ioArgoprojEventsV1alpha1EventDependencyFilter = (IoArgoprojEventsV1alpha1EventDependencyFilter) o;
    return Objects.equals(this.context, ioArgoprojEventsV1alpha1EventDependencyFilter.context) &&
        Objects.equals(this.data, ioArgoprojEventsV1alpha1EventDependencyFilter.data) &&
        Objects.equals(this.time, ioArgoprojEventsV1alpha1EventDependencyFilter.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, data, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventDependencyFilter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

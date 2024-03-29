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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojEventsV1alpha1StatusPolicy
 */

public class IoArgoprojEventsV1alpha1StatusPolicy {
  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private List<Integer> allow = null;


  public IoArgoprojEventsV1alpha1StatusPolicy allow(List<Integer> allow) {
    
    this.allow = allow;
    return this;
  }

  public IoArgoprojEventsV1alpha1StatusPolicy addAllowItem(Integer allowItem) {
    if (this.allow == null) {
      this.allow = new ArrayList<Integer>();
    }
    this.allow.add(allowItem);
    return this;
  }

   /**
   * Get allow
   * @return allow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAllow() {
    return allow;
  }


  public void setAllow(List<Integer> allow) {
    this.allow = allow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1StatusPolicy ioArgoprojEventsV1alpha1StatusPolicy = (IoArgoprojEventsV1alpha1StatusPolicy) o;
    return Objects.equals(this.allow, ioArgoprojEventsV1alpha1StatusPolicy.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1StatusPolicy {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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


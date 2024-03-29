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

/**
 * WorkflowRetryRequest
 */

public class WorkflowRetryRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NODE_FIELD_SELECTOR = "nodeFieldSelector";
  @SerializedName(SERIALIZED_NAME_NODE_FIELD_SELECTOR)
  private String nodeFieldSelector;

  public static final String SERIALIZED_NAME_RESTART_SUCCESSFUL = "restartSuccessful";
  @SerializedName(SERIALIZED_NAME_RESTART_SUCCESSFUL)
  private Boolean restartSuccessful;


  public WorkflowRetryRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowRetryRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public WorkflowRetryRequest nodeFieldSelector(String nodeFieldSelector) {
    
    this.nodeFieldSelector = nodeFieldSelector;
    return this;
  }

   /**
   * Get nodeFieldSelector
   * @return nodeFieldSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeFieldSelector() {
    return nodeFieldSelector;
  }


  public void setNodeFieldSelector(String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
  }


  public WorkflowRetryRequest restartSuccessful(Boolean restartSuccessful) {
    
    this.restartSuccessful = restartSuccessful;
    return this;
  }

   /**
   * Get restartSuccessful
   * @return restartSuccessful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRestartSuccessful() {
    return restartSuccessful;
  }


  public void setRestartSuccessful(Boolean restartSuccessful) {
    this.restartSuccessful = restartSuccessful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRetryRequest workflowRetryRequest = (WorkflowRetryRequest) o;
    return Objects.equals(this.name, workflowRetryRequest.name) &&
        Objects.equals(this.namespace, workflowRetryRequest.namespace) &&
        Objects.equals(this.nodeFieldSelector, workflowRetryRequest.nodeFieldSelector) &&
        Objects.equals(this.restartSuccessful, workflowRetryRequest.restartSuccessful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, nodeFieldSelector, restartSuccessful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRetryRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
    sb.append("    restartSuccessful: ").append(toIndentedString(restartSuccessful)).append("\n");
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


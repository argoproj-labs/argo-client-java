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
import io.argoproj.workflow.models.GroupVersionResource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1ArtifactLocation;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojEventsV1alpha1ArgoWorkflowTrigger
 */

public class IoArgoprojEventsV1alpha1ArgoWorkflowTrigger {
  public static final String SERIALIZED_NAME_GROUP_VERSION_RESOURCE = "groupVersionResource";
  @SerializedName(SERIALIZED_NAME_GROUP_VERSION_RESOURCE)
  private GroupVersionResource groupVersionResource;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private IoArgoprojEventsV1alpha1ArtifactLocation source;


  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger groupVersionResource(GroupVersionResource groupVersionResource) {
    
    this.groupVersionResource = groupVersionResource;
    return this;
  }

   /**
   * Get groupVersionResource
   * @return groupVersionResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupVersionResource getGroupVersionResource() {
    return groupVersionResource;
  }


  public void setGroupVersionResource(GroupVersionResource groupVersionResource) {
    this.groupVersionResource = groupVersionResource;
  }


  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
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


  public IoArgoprojEventsV1alpha1ArgoWorkflowTrigger source(IoArgoprojEventsV1alpha1ArtifactLocation source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1ArtifactLocation getSource() {
    return source;
  }


  public void setSource(IoArgoprojEventsV1alpha1ArtifactLocation source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1ArgoWorkflowTrigger ioArgoprojEventsV1alpha1ArgoWorkflowTrigger = (IoArgoprojEventsV1alpha1ArgoWorkflowTrigger) o;
    return Objects.equals(this.groupVersionResource, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.groupVersionResource) &&
        Objects.equals(this.operation, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.operation) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.parameters) &&
        Objects.equals(this.source, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupVersionResource, operation, parameters, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1ArgoWorkflowTrigger {\n");
    sb.append("    groupVersionResource: ").append(toIndentedString(groupVersionResource)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


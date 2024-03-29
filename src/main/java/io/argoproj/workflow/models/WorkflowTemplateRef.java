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
 * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
 */
@ApiModel(description = "WorkflowTemplateRef is a reference to a WorkflowTemplate resource.")

public class WorkflowTemplateRef {
  public static final String SERIALIZED_NAME_CLUSTER_SCOPE = "clusterScope";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SCOPE)
  private Boolean clusterScope;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public WorkflowTemplateRef clusterScope(Boolean clusterScope) {
    
    this.clusterScope = clusterScope;
    return this;
  }

   /**
   * ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).
   * @return clusterScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).")

  public Boolean getClusterScope() {
    return clusterScope;
  }


  public void setClusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
  }


  public WorkflowTemplateRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the resource name of the workflow template.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the resource name of the workflow template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTemplateRef workflowTemplateRef = (WorkflowTemplateRef) o;
    return Objects.equals(this.clusterScope, workflowTemplateRef.clusterScope) &&
        Objects.equals(this.name, workflowTemplateRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterScope, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTemplateRef {\n");
    sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


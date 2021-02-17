/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.9
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
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.WorkflowTemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Submit
 */

public class Submit {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_REF = "workflowTemplateRef";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_REF)
  private WorkflowTemplateRef workflowTemplateRef;


  public Submit arguments(Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Arguments getArguments() {
    return arguments;
  }


  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }


  public Submit workflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
    
    this.workflowTemplateRef = workflowTemplateRef;
    return this;
  }

   /**
   * Get workflowTemplateRef
   * @return workflowTemplateRef
  **/
  @ApiModelProperty(required = true, value = "")

  public WorkflowTemplateRef getWorkflowTemplateRef() {
    return workflowTemplateRef;
  }


  public void setWorkflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
    this.workflowTemplateRef = workflowTemplateRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submit submit = (Submit) o;
    return Objects.equals(this.arguments, submit.arguments) &&
        Objects.equals(this.workflowTemplateRef, submit.workflowTemplateRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, workflowTemplateRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submit {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    workflowTemplateRef: ").append(toIndentedString(workflowTemplateRef)).append("\n");
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


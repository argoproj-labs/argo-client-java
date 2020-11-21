/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.8
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
import io.argoproj.workflow.models.CreateOptions;
import io.argoproj.workflow.models.Workflow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowCreateRequest
 */

public class WorkflowCreateRequest {
  public static final String SERIALIZED_NAME_CREATE_OPTIONS = "createOptions";
  @SerializedName(SERIALIZED_NAME_CREATE_OPTIONS)
  private CreateOptions createOptions;

  public static final String SERIALIZED_NAME_INSTANCE_I_D = "instanceID";
  @SerializedName(SERIALIZED_NAME_INSTANCE_I_D)
  private String instanceID;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SERVER_DRY_RUN = "serverDryRun";
  @SerializedName(SERIALIZED_NAME_SERVER_DRY_RUN)
  private Boolean serverDryRun;

  public static final String SERIALIZED_NAME_WORKFLOW = "workflow";
  @SerializedName(SERIALIZED_NAME_WORKFLOW)
  private Workflow workflow;


  public WorkflowCreateRequest createOptions(CreateOptions createOptions) {
    
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOptions getCreateOptions() {
    return createOptions;
  }


  public void setCreateOptions(CreateOptions createOptions) {
    this.createOptions = createOptions;
  }


  public WorkflowCreateRequest instanceID(String instanceID) {
    
    this.instanceID = instanceID;
    return this;
  }

   /**
   * This field is no longer used.
   * @return instanceID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is no longer used.")

  public String getInstanceID() {
    return instanceID;
  }


  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }


  public WorkflowCreateRequest namespace(String namespace) {
    
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


  public WorkflowCreateRequest serverDryRun(Boolean serverDryRun) {
    
    this.serverDryRun = serverDryRun;
    return this;
  }

   /**
   * Get serverDryRun
   * @return serverDryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getServerDryRun() {
    return serverDryRun;
  }


  public void setServerDryRun(Boolean serverDryRun) {
    this.serverDryRun = serverDryRun;
  }


  public WorkflowCreateRequest workflow(Workflow workflow) {
    
    this.workflow = workflow;
    return this;
  }

   /**
   * Get workflow
   * @return workflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Workflow getWorkflow() {
    return workflow;
  }


  public void setWorkflow(Workflow workflow) {
    this.workflow = workflow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCreateRequest workflowCreateRequest = (WorkflowCreateRequest) o;
    return Objects.equals(this.createOptions, workflowCreateRequest.createOptions) &&
        Objects.equals(this.instanceID, workflowCreateRequest.instanceID) &&
        Objects.equals(this.namespace, workflowCreateRequest.namespace) &&
        Objects.equals(this.serverDryRun, workflowCreateRequest.serverDryRun) &&
        Objects.equals(this.workflow, workflowCreateRequest.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, instanceID, namespace, serverDryRun, workflow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCreateRequest {\n");
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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


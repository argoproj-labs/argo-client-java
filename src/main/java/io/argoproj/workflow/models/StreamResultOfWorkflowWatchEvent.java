/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.5
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
import io.argoproj.workflow.models.GrpcGatewayRuntimeStreamError;
import io.argoproj.workflow.models.WorkflowWatchEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StreamResultOfWorkflowWatchEvent
 */

public class StreamResultOfWorkflowWatchEvent {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GrpcGatewayRuntimeStreamError error;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private WorkflowWatchEvent result;


  public StreamResultOfWorkflowWatchEvent error(GrpcGatewayRuntimeStreamError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GrpcGatewayRuntimeStreamError getError() {
    return error;
  }


  public void setError(GrpcGatewayRuntimeStreamError error) {
    this.error = error;
  }


  public StreamResultOfWorkflowWatchEvent result(WorkflowWatchEvent result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowWatchEvent getResult() {
    return result;
  }


  public void setResult(WorkflowWatchEvent result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfWorkflowWatchEvent streamResultOfWorkflowWatchEvent = (StreamResultOfWorkflowWatchEvent) o;
    return Objects.equals(this.error, streamResultOfWorkflowWatchEvent.error) &&
        Objects.equals(this.result, streamResultOfWorkflowWatchEvent.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfWorkflowWatchEvent {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


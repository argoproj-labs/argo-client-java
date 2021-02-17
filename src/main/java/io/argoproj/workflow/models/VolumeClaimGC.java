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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeClaimGC describes how to delete volumes from completed Workflows
 */
@ApiModel(description = "VolumeClaimGC describes how to delete volumes from completed Workflows")

public class VolumeClaimGC {
  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;


  public VolumeClaimGC strategy(String strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Strategy is the strategy to use. One of \&quot;OnWorkflowCompletion\&quot;, \&quot;OnWorkflowSuccess\&quot;
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Strategy is the strategy to use. One of \"OnWorkflowCompletion\", \"OnWorkflowSuccess\"")

  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeClaimGC volumeClaimGC = (VolumeClaimGC) o;
    return Objects.equals(this.strategy, volumeClaimGC.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeClaimGC {\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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


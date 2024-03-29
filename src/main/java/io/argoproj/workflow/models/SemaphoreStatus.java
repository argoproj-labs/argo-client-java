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
import io.argoproj.workflow.models.SemaphoreHolding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SemaphoreStatus
 */

public class SemaphoreStatus {
  public static final String SERIALIZED_NAME_HOLDING = "holding";
  @SerializedName(SERIALIZED_NAME_HOLDING)
  private List<SemaphoreHolding> holding = null;

  public static final String SERIALIZED_NAME_WAITING = "waiting";
  @SerializedName(SERIALIZED_NAME_WAITING)
  private List<SemaphoreHolding> waiting = null;


  public SemaphoreStatus holding(List<SemaphoreHolding> holding) {
    
    this.holding = holding;
    return this;
  }

  public SemaphoreStatus addHoldingItem(SemaphoreHolding holdingItem) {
    if (this.holding == null) {
      this.holding = new ArrayList<SemaphoreHolding>();
    }
    this.holding.add(holdingItem);
    return this;
  }

   /**
   * Holding stores the list of resource acquired synchronization lock for workflows.
   * @return holding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holding stores the list of resource acquired synchronization lock for workflows.")

  public List<SemaphoreHolding> getHolding() {
    return holding;
  }


  public void setHolding(List<SemaphoreHolding> holding) {
    this.holding = holding;
  }


  public SemaphoreStatus waiting(List<SemaphoreHolding> waiting) {
    
    this.waiting = waiting;
    return this;
  }

  public SemaphoreStatus addWaitingItem(SemaphoreHolding waitingItem) {
    if (this.waiting == null) {
      this.waiting = new ArrayList<SemaphoreHolding>();
    }
    this.waiting.add(waitingItem);
    return this;
  }

   /**
   * Waiting indicates the list of current synchronization lock holders.
   * @return waiting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Waiting indicates the list of current synchronization lock holders.")

  public List<SemaphoreHolding> getWaiting() {
    return waiting;
  }


  public void setWaiting(List<SemaphoreHolding> waiting) {
    this.waiting = waiting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemaphoreStatus semaphoreStatus = (SemaphoreStatus) o;
    return Objects.equals(this.holding, semaphoreStatus.holding) &&
        Objects.equals(this.waiting, semaphoreStatus.waiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holding, waiting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemaphoreStatus {\n");
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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


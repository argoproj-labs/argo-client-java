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
import io.argoproj.workflow.models.PodAffinityTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@ApiModel(description = "The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")

public class WeightedPodAffinityTerm {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private PodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public WeightedPodAffinityTerm podAffinityTerm(PodAffinityTerm podAffinityTerm) {
    
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Get podAffinityTerm
   * @return podAffinityTerm
  **/
  @ApiModelProperty(required = true, value = "")

  public PodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }


  public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public WeightedPodAffinityTerm weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightedPodAffinityTerm weightedPodAffinityTerm = (WeightedPodAffinityTerm) o;
    return Objects.equals(this.podAffinityTerm, weightedPodAffinityTerm.podAffinityTerm) &&
        Objects.equals(this.weight, weightedPodAffinityTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightedPodAffinityTerm {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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


/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.2
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
import io.argoproj.workflow.models.WeightedPodAffinityTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 */
@ApiModel(description = "Pod anti affinity is a group of inter pod anti affinity scheduling rules.")

public class PodAntiAffinity {
  public static final String SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "preferredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution = null;

  public static final String SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = "requiredDuringSchedulingIgnoredDuringExecution";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION)
  private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution = null;


  public PodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public PodAntiAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(WeightedPodAffinityTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<WeightedPodAffinityTerm>();
    }
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.")

  public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }


  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }


  public PodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public PodAntiAffinity addRequiredDuringSchedulingIgnoredDuringExecutionItem(PodAffinityTerm requiredDuringSchedulingIgnoredDuringExecutionItem) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<PodAffinityTerm>();
    }
    this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

   /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.")

  public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }


  public void setRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodAntiAffinity podAntiAffinity = (PodAntiAffinity) o;
    return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution, podAntiAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution, podAntiAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodAntiAffinity {\n");
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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


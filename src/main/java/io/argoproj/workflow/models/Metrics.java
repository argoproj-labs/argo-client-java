/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.11.0
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
import io.argoproj.workflow.models.Prometheus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metrics are a list of metrics emitted from a Workflow/Template
 */
@ApiModel(description = "Metrics are a list of metrics emitted from a Workflow/Template")

public class Metrics {
  public static final String SERIALIZED_NAME_PROMETHEUS = "prometheus";
  @SerializedName(SERIALIZED_NAME_PROMETHEUS)
  private List<Prometheus> prometheus = new ArrayList<Prometheus>();


  public Metrics prometheus(List<Prometheus> prometheus) {
    
    this.prometheus = prometheus;
    return this;
  }

  public Metrics addPrometheusItem(Prometheus prometheusItem) {
    this.prometheus.add(prometheusItem);
    return this;
  }

   /**
   * Prometheus is a list of prometheus metrics to be emitted
   * @return prometheus
  **/
  @ApiModelProperty(required = true, value = "Prometheus is a list of prometheus metrics to be emitted")

  public List<Prometheus> getPrometheus() {
    return prometheus;
  }


  public void setPrometheus(List<Prometheus> prometheus) {
    this.prometheus = prometheus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.prometheus, metrics.prometheus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prometheus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    sb.append("    prometheus: ").append(toIndentedString(prometheus)).append("\n");
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


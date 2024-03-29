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
 * TemplateRef is a reference of template resource.
 */
@ApiModel(description = "TemplateRef is a reference of template resource.")

public class TemplateRef {
  public static final String SERIALIZED_NAME_CLUSTER_SCOPE = "clusterScope";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SCOPE)
  private Boolean clusterScope;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;


  public TemplateRef clusterScope(Boolean clusterScope) {
    
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


  public TemplateRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the resource name of the template.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the resource name of the template.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateRef template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template is the name of referred template in the resource.
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template is the name of referred template in the resource.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRef templateRef = (TemplateRef) o;
    return Objects.equals(this.clusterScope, templateRef.clusterScope) &&
        Objects.equals(this.name, templateRef.name) &&
        Objects.equals(this.template, templateRef.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterScope, name, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRef {\n");
    sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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


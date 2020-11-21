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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@ApiModel(description = "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")

public class ManagedFieldsEntry {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private String manager;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private org.joda.time.DateTime time;


  public ManagedFieldsEntry apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ManagedFieldsEntry fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Fields stores a set of fields in a data structure like a Trie. To understand how this is used, see: https://github.com/kubernetes-sigs/structured-merge-diff
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields stores a set of fields in a data structure like a Trie. To understand how this is used, see: https://github.com/kubernetes-sigs/structured-merge-diff")

  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public ManagedFieldsEntry manager(String manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")

  public String getManager() {
    return manager;
  }


  public void setManager(String manager) {
    this.manager = manager;
  }


  public ManagedFieldsEntry operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ManagedFieldsEntry time(org.joda.time.DateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getTime() {
    return time;
  }


  public void setTime(org.joda.time.DateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedFieldsEntry managedFieldsEntry = (ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, managedFieldsEntry.apiVersion) &&
        Objects.equals(this.fields, managedFieldsEntry.fields) &&
        Objects.equals(this.manager, managedFieldsEntry.manager) &&
        Objects.equals(this.operation, managedFieldsEntry.operation) &&
        Objects.equals(this.time, managedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fields, manager, operation, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedFieldsEntry {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


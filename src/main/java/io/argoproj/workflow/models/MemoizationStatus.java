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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MemoizationStatus
 */

public class MemoizationStatus {
  public static final String SERIALIZED_NAME_CACHE_NAME = "cacheName";
  @SerializedName(SERIALIZED_NAME_CACHE_NAME)
  private String cacheName;

  public static final String SERIALIZED_NAME_HIT = "hit";
  @SerializedName(SERIALIZED_NAME_HIT)
  private Boolean hit;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public MemoizationStatus cacheName(String cacheName) {
    
    this.cacheName = cacheName;
    return this;
  }

   /**
   * Get cacheName
   * @return cacheName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCacheName() {
    return cacheName;
  }


  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }


  public MemoizationStatus hit(Boolean hit) {
    
    this.hit = hit;
    return this;
  }

   /**
   * Get hit
   * @return hit
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getHit() {
    return hit;
  }


  public void setHit(Boolean hit) {
    this.hit = hit;
  }


  public MemoizationStatus key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoizationStatus memoizationStatus = (MemoizationStatus) o;
    return Objects.equals(this.cacheName, memoizationStatus.cacheName) &&
        Objects.equals(this.hit, memoizationStatus.hit) &&
        Objects.equals(this.key, memoizationStatus.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheName, hit, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoizationStatus {\n");
    sb.append("    cacheName: ").append(toIndentedString(cacheName)).append("\n");
    sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


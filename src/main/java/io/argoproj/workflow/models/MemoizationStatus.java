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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MemoizationStatus is the status of this memoized node
 */
@ApiModel(description = "MemoizationStatus is the status of this memoized node")

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
   * Cache is the name of the cache that was used
   * @return cacheName
  **/
  @ApiModelProperty(required = true, value = "Cache is the name of the cache that was used")

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
   * Hit indicates whether this node was created from a cache entry
   * @return hit
  **/
  @ApiModelProperty(required = true, value = "Hit indicates whether this node was created from a cache entry")

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
   * Key is the name of the key used for this node&#39;s cache
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key is the name of the key used for this node's cache")

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


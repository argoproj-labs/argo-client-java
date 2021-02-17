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
 * GCSArtifact is the location of a GCS artifact
 */
@ApiModel(description = "GCSArtifact is the location of a GCS artifact")

public class GCSArtifact {
  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_KEY_SECRET = "serviceAccountKeySecret";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector serviceAccountKeySecret;


  public GCSArtifact bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Bucket is the name of the bucket
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "Bucket is the name of the bucket")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public GCSArtifact key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key is the path in the bucket where the artifact resides
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key is the path in the bucket where the artifact resides")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public GCSArtifact serviceAccountKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector serviceAccountKeySecret) {
    
    this.serviceAccountKeySecret = serviceAccountKeySecret;
    return this;
  }

   /**
   * Get serviceAccountKeySecret
   * @return serviceAccountKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getServiceAccountKeySecret() {
    return serviceAccountKeySecret;
  }


  public void setServiceAccountKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector serviceAccountKeySecret) {
    this.serviceAccountKeySecret = serviceAccountKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCSArtifact gcSArtifact = (GCSArtifact) o;
    return Objects.equals(this.bucket, gcSArtifact.bucket) &&
        Objects.equals(this.key, gcSArtifact.key) &&
        Objects.equals(this.serviceAccountKeySecret, gcSArtifact.serviceAccountKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, key, serviceAccountKeySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCSArtifact {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    serviceAccountKeySecret: ").append(toIndentedString(serviceAccountKeySecret)).append("\n");
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


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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CustomTrigger refers to the specification of the custom trigger.
 */
@ApiModel(description = "CustomTrigger refers to the specification of the custom trigger.")

public class IoArgoprojEventsV1alpha1CustomTrigger {
  public static final String SERIALIZED_NAME_CERT_FILE_PATH = "certFilePath";
  @SerializedName(SERIALIZED_NAME_CERT_FILE_PATH)
  private String certFilePath;

  public static final String SERIALIZED_NAME_CERT_SECRET = "certSecret";
  @SerializedName(SERIALIZED_NAME_CERT_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_SECURE = "secure";
  @SerializedName(SERIALIZED_NAME_SECURE)
  private Boolean secure;

  public static final String SERIALIZED_NAME_SERVER_NAME_OVERRIDE = "serverNameOverride";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME_OVERRIDE)
  private String serverNameOverride;

  public static final String SERIALIZED_NAME_SERVER_U_R_L = "serverURL";
  @SerializedName(SERIALIZED_NAME_SERVER_U_R_L)
  private String serverURL;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private Map<String, String> spec = null;


  public IoArgoprojEventsV1alpha1CustomTrigger certFilePath(String certFilePath) {
    
    this.certFilePath = certFilePath;
    return this;
  }

   /**
   * Get certFilePath
   * @return certFilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertFilePath() {
    return certFilePath;
  }


  public void setCertFilePath(String certFilePath) {
    this.certFilePath = certFilePath;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger certSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret) {
    
    this.certSecret = certSecret;
    return this;
  }

   /**
   * Get certSecret
   * @return certSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getCertSecret() {
    return certSecret;
  }


  public void setCertSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger secure(Boolean secure) {
    
    this.secure = secure;
    return this;
  }

   /**
   * Get secure
   * @return secure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecure() {
    return secure;
  }


  public void setSecure(Boolean secure) {
    this.secure = secure;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger serverNameOverride(String serverNameOverride) {
    
    this.serverNameOverride = serverNameOverride;
    return this;
  }

   /**
   * ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.
   * @return serverNameOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.")

  public String getServerNameOverride() {
    return serverNameOverride;
  }


  public void setServerNameOverride(String serverNameOverride) {
    this.serverNameOverride = serverNameOverride;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger serverURL(String serverURL) {
    
    this.serverURL = serverURL;
    return this;
  }

   /**
   * Get serverURL
   * @return serverURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerURL() {
    return serverURL;
  }


  public void setServerURL(String serverURL) {
    this.serverURL = serverURL;
  }


  public IoArgoprojEventsV1alpha1CustomTrigger spec(Map<String, String> spec) {
    
    this.spec = spec;
    return this;
  }

  public IoArgoprojEventsV1alpha1CustomTrigger putSpecItem(String key, String specItem) {
    if (this.spec == null) {
      this.spec = new HashMap<String, String>();
    }
    this.spec.put(key, specItem);
    return this;
  }

   /**
   * Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.")

  public Map<String, String> getSpec() {
    return spec;
  }


  public void setSpec(Map<String, String> spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1CustomTrigger ioArgoprojEventsV1alpha1CustomTrigger = (IoArgoprojEventsV1alpha1CustomTrigger) o;
    return Objects.equals(this.certFilePath, ioArgoprojEventsV1alpha1CustomTrigger.certFilePath) &&
        Objects.equals(this.certSecret, ioArgoprojEventsV1alpha1CustomTrigger.certSecret) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1CustomTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1CustomTrigger.payload) &&
        Objects.equals(this.secure, ioArgoprojEventsV1alpha1CustomTrigger.secure) &&
        Objects.equals(this.serverNameOverride, ioArgoprojEventsV1alpha1CustomTrigger.serverNameOverride) &&
        Objects.equals(this.serverURL, ioArgoprojEventsV1alpha1CustomTrigger.serverURL) &&
        Objects.equals(this.spec, ioArgoprojEventsV1alpha1CustomTrigger.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certFilePath, certSecret, parameters, payload, secure, serverNameOverride, serverURL, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1CustomTrigger {\n");
    sb.append("    certFilePath: ").append(toIndentedString(certFilePath)).append("\n");
    sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    serverNameOverride: ").append(toIndentedString(serverNameOverride)).append("\n");
    sb.append("    serverURL: ").append(toIndentedString(serverURL)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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


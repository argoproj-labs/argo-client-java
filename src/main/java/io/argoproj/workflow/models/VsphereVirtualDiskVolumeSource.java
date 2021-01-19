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
 * Represents a vSphere volume resource.
 */
@ApiModel(description = "Represents a vSphere volume resource.")

public class VsphereVirtualDiskVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_I_D = "storagePolicyID";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_I_D)
  private String storagePolicyID;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_NAME = "storagePolicyName";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NAME)
  private String storagePolicyName;

  public static final String SERIALIZED_NAME_VOLUME_PATH = "volumePath";
  @SerializedName(SERIALIZED_NAME_VOLUME_PATH)
  private String volumePath;


  public VsphereVirtualDiskVolumeSource fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public VsphereVirtualDiskVolumeSource storagePolicyID(String storagePolicyID) {
    
    this.storagePolicyID = storagePolicyID;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   * @return storagePolicyID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")

  public String getStoragePolicyID() {
    return storagePolicyID;
  }


  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }


  public VsphereVirtualDiskVolumeSource storagePolicyName(String storagePolicyName) {
    
    this.storagePolicyName = storagePolicyName;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile name.
   * @return storagePolicyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")

  public String getStoragePolicyName() {
    return storagePolicyName;
  }


  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }


  public VsphereVirtualDiskVolumeSource volumePath(String volumePath) {
    
    this.volumePath = volumePath;
    return this;
  }

   /**
   * Path that identifies vSphere volume vmdk
   * @return volumePath
  **/
  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")

  public String getVolumePath() {
    return volumePath;
  }


  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource = (VsphereVirtualDiskVolumeSource) o;
    return Objects.equals(this.fsType, vsphereVirtualDiskVolumeSource.fsType) &&
        Objects.equals(this.storagePolicyID, vsphereVirtualDiskVolumeSource.storagePolicyID) &&
        Objects.equals(this.storagePolicyName, vsphereVirtualDiskVolumeSource.storagePolicyName) &&
        Objects.equals(this.volumePath, vsphereVirtualDiskVolumeSource.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsphereVirtualDiskVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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


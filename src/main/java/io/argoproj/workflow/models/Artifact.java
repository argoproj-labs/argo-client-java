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
import io.argoproj.workflow.models.ArchiveStrategy;
import io.argoproj.workflow.models.ArtifactoryArtifact;
import io.argoproj.workflow.models.GCSArtifact;
import io.argoproj.workflow.models.GitArtifact;
import io.argoproj.workflow.models.HDFSArtifact;
import io.argoproj.workflow.models.HTTPArtifact;
import io.argoproj.workflow.models.OSSArtifact;
import io.argoproj.workflow.models.RawArtifact;
import io.argoproj.workflow.models.S3Artifact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Artifact indicates an artifact to place at a specified path
 */
@ApiModel(description = "Artifact indicates an artifact to place at a specified path")

public class Artifact {
  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private ArchiveStrategy archive;

  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private ArtifactoryArtifact artifactory;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  private GCSArtifact gcs;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitArtifact git;

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  private String globalName;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private HDFSArtifact hdfs;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private HTTPArtifact http;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  private OSSArtifact oss;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private RawArtifact raw;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private S3Artifact s3;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;


  public Artifact archive(ArchiveStrategy archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArchiveStrategy getArchive() {
    return archive;
  }


  public void setArchive(ArchiveStrategy archive) {
    this.archive = archive;
  }


  public Artifact archiveLogs(Boolean archiveLogs) {
    
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArchiveLogs indicates if the container logs should be archived")

  public Boolean getArchiveLogs() {
    return archiveLogs;
  }


  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public Artifact artifactory(ArtifactoryArtifact artifactory) {
    
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }


  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }


  public Artifact from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * From allows an artifact to reference an artifact from a previous step
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From allows an artifact to reference an artifact from a previous step")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public Artifact gcs(GCSArtifact gcs) {
    
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCSArtifact getGcs() {
    return gcs;
  }


  public void setGcs(GCSArtifact gcs) {
    this.gcs = gcs;
  }


  public Artifact git(GitArtifact git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitArtifact getGit() {
    return git;
  }


  public void setGit(GitArtifact git) {
    this.git = git;
  }


  public Artifact globalName(String globalName) {
    
    this.globalName = globalName;
    return this;
  }

   /**
   * GlobalName exports an output artifact to the global scope, making it available as &#39;{{outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
   * @return globalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GlobalName exports an output artifact to the global scope, making it available as '{{outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts")

  public String getGlobalName() {
    return globalName;
  }


  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }


  public Artifact hdfs(HDFSArtifact hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HDFSArtifact getHdfs() {
    return hdfs;
  }


  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }


  public Artifact http(HTTPArtifact http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HTTPArtifact getHttp() {
    return http;
  }


  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }


  public Artifact mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public Artifact name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the artifact. must be unique within a template&#39;s inputs/outputs.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the artifact. must be unique within a template's inputs/outputs.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Artifact optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Make Artifacts optional, if Artifacts doesn&#39;t generate or exist
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Make Artifacts optional, if Artifacts doesn't generate or exist")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public Artifact oss(OSSArtifact oss) {
    
    this.oss = oss;
    return this;
  }

   /**
   * Get oss
   * @return oss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OSSArtifact getOss() {
    return oss;
  }


  public void setOss(OSSArtifact oss) {
    this.oss = oss;
  }


  public Artifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the container path to the artifact
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is the container path to the artifact")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public Artifact raw(RawArtifact raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RawArtifact getRaw() {
    return raw;
  }


  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }


  public Artifact s3(S3Artifact s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3Artifact getS3() {
    return s3;
  }


  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  public Artifact subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * SubPath allows an artifact to be sourced from a subpath within the specified source
   * @return subPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubPath allows an artifact to be sourced from a subpath within the specified source")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact artifact = (Artifact) o;
    return Objects.equals(this.archive, artifact.archive) &&
        Objects.equals(this.archiveLogs, artifact.archiveLogs) &&
        Objects.equals(this.artifactory, artifact.artifactory) &&
        Objects.equals(this.from, artifact.from) &&
        Objects.equals(this.gcs, artifact.gcs) &&
        Objects.equals(this.git, artifact.git) &&
        Objects.equals(this.globalName, artifact.globalName) &&
        Objects.equals(this.hdfs, artifact.hdfs) &&
        Objects.equals(this.http, artifact.http) &&
        Objects.equals(this.mode, artifact.mode) &&
        Objects.equals(this.name, artifact.name) &&
        Objects.equals(this.optional, artifact.optional) &&
        Objects.equals(this.oss, artifact.oss) &&
        Objects.equals(this.path, artifact.path) &&
        Objects.equals(this.raw, artifact.raw) &&
        Objects.equals(this.s3, artifact.s3) &&
        Objects.equals(this.subPath, artifact.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archiveLogs, artifactory, from, gcs, git, globalName, hdfs, http, mode, name, optional, oss, path, raw, s3, subPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artifact {\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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


/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.1
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
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.  DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s container.
 */
@ApiModel(description = "Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.  DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")

public class GitRepoVolumeSource {
  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;


  public GitRepoVolumeSource directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
   * @return directory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.")

  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public GitRepoVolumeSource repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Repository URL
   * @return repository
  **/
  @ApiModelProperty(required = true, value = "Repository URL")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public GitRepoVolumeSource revision(String revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Commit hash for the specified revision.
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Commit hash for the specified revision.")

  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitRepoVolumeSource gitRepoVolumeSource = (GitRepoVolumeSource) o;
    return Objects.equals(this.directory, gitRepoVolumeSource.directory) &&
        Objects.equals(this.repository, gitRepoVolumeSource.repository) &&
        Objects.equals(this.revision, gitRepoVolumeSource.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, repository, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitRepoVolumeSource {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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


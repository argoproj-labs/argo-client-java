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
import java.util.ArrayList;
import java.util.List;

/**
 * GitArtifact is the location of an git artifact
 */
@ApiModel(description = "GitArtifact is the location of an git artifact")

public class GitArtifact {
  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public static final String SERIALIZED_NAME_DISABLE_SUBMODULES = "disableSubmodules";
  @SerializedName(SERIALIZED_NAME_DISABLE_SUBMODULES)
  private Boolean disableSubmodules;

  public static final String SERIALIZED_NAME_FETCH = "fetch";
  @SerializedName(SERIALIZED_NAME_FETCH)
  private List<String> fetch = null;

  public static final String SERIALIZED_NAME_INSECURE_IGNORE_HOST_KEY = "insecureIgnoreHostKey";
  @SerializedName(SERIALIZED_NAME_INSECURE_IGNORE_HOST_KEY)
  private Boolean insecureIgnoreHostKey;

  public static final String SERIALIZED_NAME_PASSWORD_SECRET = "passwordSecret";
  @SerializedName(SERIALIZED_NAME_PASSWORD_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret;

  public static final String SERIALIZED_NAME_REPO = "repo";
  @SerializedName(SERIALIZED_NAME_REPO)
  private String repo;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_SSH_PRIVATE_KEY_SECRET = "sshPrivateKeySecret";
  @SerializedName(SERIALIZED_NAME_SSH_PRIVATE_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector sshPrivateKeySecret;

  public static final String SERIALIZED_NAME_USERNAME_SECRET = "usernameSecret";
  @SerializedName(SERIALIZED_NAME_USERNAME_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret;


  public GitArtifact depth(Integer depth) {
    
    this.depth = depth;
    return this;
  }

   /**
   * Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip
   * @return depth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip")

  public Integer getDepth() {
    return depth;
  }


  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  public GitArtifact disableSubmodules(Boolean disableSubmodules) {
    
    this.disableSubmodules = disableSubmodules;
    return this;
  }

   /**
   * DisableSubmodules disables submodules during git clone
   * @return disableSubmodules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DisableSubmodules disables submodules during git clone")

  public Boolean getDisableSubmodules() {
    return disableSubmodules;
  }


  public void setDisableSubmodules(Boolean disableSubmodules) {
    this.disableSubmodules = disableSubmodules;
  }


  public GitArtifact fetch(List<String> fetch) {
    
    this.fetch = fetch;
    return this;
  }

  public GitArtifact addFetchItem(String fetchItem) {
    if (this.fetch == null) {
      this.fetch = new ArrayList<String>();
    }
    this.fetch.add(fetchItem);
    return this;
  }

   /**
   * Fetch specifies a number of refs that should be fetched before checkout
   * @return fetch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fetch specifies a number of refs that should be fetched before checkout")

  public List<String> getFetch() {
    return fetch;
  }


  public void setFetch(List<String> fetch) {
    this.fetch = fetch;
  }


  public GitArtifact insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    return this;
  }

   /**
   * InsecureIgnoreHostKey disables SSH strict host key checking during git clone
   * @return insecureIgnoreHostKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "InsecureIgnoreHostKey disables SSH strict host key checking during git clone")

  public Boolean getInsecureIgnoreHostKey() {
    return insecureIgnoreHostKey;
  }


  public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
  }


  public GitArtifact passwordSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret) {
    
    this.passwordSecret = passwordSecret;
    return this;
  }

   /**
   * Get passwordSecret
   * @return passwordSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }


  public void setPasswordSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }


  public GitArtifact repo(String repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Repo is the git repository
   * @return repo
  **/
  @ApiModelProperty(required = true, value = "Repo is the git repository")

  public String getRepo() {
    return repo;
  }


  public void setRepo(String repo) {
    this.repo = repo;
  }


  public GitArtifact revision(String revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Revision is the git commit, tag, branch to checkout
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revision is the git commit, tag, branch to checkout")

  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    this.revision = revision;
  }


  public GitArtifact sshPrivateKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector sshPrivateKeySecret) {
    
    this.sshPrivateKeySecret = sshPrivateKeySecret;
    return this;
  }

   /**
   * Get sshPrivateKeySecret
   * @return sshPrivateKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSshPrivateKeySecret() {
    return sshPrivateKeySecret;
  }


  public void setSshPrivateKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector sshPrivateKeySecret) {
    this.sshPrivateKeySecret = sshPrivateKeySecret;
  }


  public GitArtifact usernameSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret) {
    
    this.usernameSecret = usernameSecret;
    return this;
  }

   /**
   * Get usernameSecret
   * @return usernameSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }


  public void setUsernameSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitArtifact gitArtifact = (GitArtifact) o;
    return Objects.equals(this.depth, gitArtifact.depth) &&
        Objects.equals(this.disableSubmodules, gitArtifact.disableSubmodules) &&
        Objects.equals(this.fetch, gitArtifact.fetch) &&
        Objects.equals(this.insecureIgnoreHostKey, gitArtifact.insecureIgnoreHostKey) &&
        Objects.equals(this.passwordSecret, gitArtifact.passwordSecret) &&
        Objects.equals(this.repo, gitArtifact.repo) &&
        Objects.equals(this.revision, gitArtifact.revision) &&
        Objects.equals(this.sshPrivateKeySecret, gitArtifact.sshPrivateKeySecret) &&
        Objects.equals(this.usernameSecret, gitArtifact.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depth, disableSubmodules, fetch, insecureIgnoreHostKey, passwordSecret, repo, revision, sshPrivateKeySecret, usernameSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitArtifact {\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    disableSubmodules: ").append(toIndentedString(disableSubmodules)).append("\n");
    sb.append("    fetch: ").append(toIndentedString(fetch)).append("\n");
    sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    sshPrivateKeySecret: ").append(toIndentedString(sshPrivateKeySecret)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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


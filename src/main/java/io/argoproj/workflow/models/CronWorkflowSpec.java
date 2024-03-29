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
import io.argoproj.workflow.models.WorkflowSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CronWorkflowSpec is the specification of a CronWorkflow
 */
@ApiModel(description = "CronWorkflowSpec is the specification of a CronWorkflow")

public class CronWorkflowSpec {
  public static final String SERIALIZED_NAME_CONCURRENCY_POLICY = "concurrencyPolicy";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY_POLICY)
  private String concurrencyPolicy;

  public static final String SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT = "failedJobsHistoryLimit";
  @SerializedName(SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT)
  private Integer failedJobsHistoryLimit;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_STARTING_DEADLINE_SECONDS = "startingDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_STARTING_DEADLINE_SECONDS)
  private Integer startingDeadlineSeconds;

  public static final String SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT = "successfulJobsHistoryLimit";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT)
  private Integer successfulJobsHistoryLimit;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private Boolean suspend;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_WORKFLOW_METADATA = "workflowMetadata";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_METADATA)
  private io.kubernetes.client.openapi.models.V1ObjectMeta workflowMetadata;

  public static final String SERIALIZED_NAME_WORKFLOW_SPEC = "workflowSpec";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_SPEC)
  private WorkflowSpec workflowSpec;


  public CronWorkflowSpec concurrencyPolicy(String concurrencyPolicy) {
    
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

   /**
   * ConcurrencyPolicy is the K8s-style concurrency policy that will be used
   * @return concurrencyPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ConcurrencyPolicy is the K8s-style concurrency policy that will be used")

  public String getConcurrencyPolicy() {
    return concurrencyPolicy;
  }


  public void setConcurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }


  public CronWorkflowSpec failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

   /**
   * FailedJobsHistoryLimit is the number of failed jobs to be kept at a time
   * @return failedJobsHistoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FailedJobsHistoryLimit is the number of failed jobs to be kept at a time")

  public Integer getFailedJobsHistoryLimit() {
    return failedJobsHistoryLimit;
  }


  public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
  }


  public CronWorkflowSpec schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule is a schedule to run the Workflow in Cron format
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "Schedule is a schedule to run the Workflow in Cron format")

  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public CronWorkflowSpec startingDeadlineSeconds(Integer startingDeadlineSeconds) {
    
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

   /**
   * StartingDeadlineSeconds is the K8s-style deadline that will limit the time a CronWorkflow will be run after its original scheduled time if it is missed.
   * @return startingDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StartingDeadlineSeconds is the K8s-style deadline that will limit the time a CronWorkflow will be run after its original scheduled time if it is missed.")

  public Integer getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }


  public void setStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }


  public CronWorkflowSpec successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

   /**
   * SuccessfulJobsHistoryLimit is the number of successful jobs to be kept at a time
   * @return successfulJobsHistoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SuccessfulJobsHistoryLimit is the number of successful jobs to be kept at a time")

  public Integer getSuccessfulJobsHistoryLimit() {
    return successfulJobsHistoryLimit;
  }


  public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
  }


  public CronWorkflowSpec suspend(Boolean suspend) {
    
    this.suspend = suspend;
    return this;
  }

   /**
   * Suspend is a flag that will stop new CronWorkflows from running if set to true
   * @return suspend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suspend is a flag that will stop new CronWorkflows from running if set to true")

  public Boolean getSuspend() {
    return suspend;
  }


  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }


  public CronWorkflowSpec timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone is the timezone against which the cron schedule will be calculated, e.g. \&quot;Asia/Tokyo\&quot;. Default is machine&#39;s local time.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timezone is the timezone against which the cron schedule will be calculated, e.g. \"Asia/Tokyo\". Default is machine's local time.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public CronWorkflowSpec workflowMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta workflowMetadata) {
    
    this.workflowMetadata = workflowMetadata;
    return this;
  }

   /**
   * Get workflowMetadata
   * @return workflowMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ObjectMeta getWorkflowMetadata() {
    return workflowMetadata;
  }


  public void setWorkflowMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta workflowMetadata) {
    this.workflowMetadata = workflowMetadata;
  }


  public CronWorkflowSpec workflowSpec(WorkflowSpec workflowSpec) {
    
    this.workflowSpec = workflowSpec;
    return this;
  }

   /**
   * Get workflowSpec
   * @return workflowSpec
  **/
  @ApiModelProperty(required = true, value = "")

  public WorkflowSpec getWorkflowSpec() {
    return workflowSpec;
  }


  public void setWorkflowSpec(WorkflowSpec workflowSpec) {
    this.workflowSpec = workflowSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronWorkflowSpec cronWorkflowSpec = (CronWorkflowSpec) o;
    return Objects.equals(this.concurrencyPolicy, cronWorkflowSpec.concurrencyPolicy) &&
        Objects.equals(this.failedJobsHistoryLimit, cronWorkflowSpec.failedJobsHistoryLimit) &&
        Objects.equals(this.schedule, cronWorkflowSpec.schedule) &&
        Objects.equals(this.startingDeadlineSeconds, cronWorkflowSpec.startingDeadlineSeconds) &&
        Objects.equals(this.successfulJobsHistoryLimit, cronWorkflowSpec.successfulJobsHistoryLimit) &&
        Objects.equals(this.suspend, cronWorkflowSpec.suspend) &&
        Objects.equals(this.timezone, cronWorkflowSpec.timezone) &&
        Objects.equals(this.workflowMetadata, cronWorkflowSpec.workflowMetadata) &&
        Objects.equals(this.workflowSpec, cronWorkflowSpec.workflowSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrencyPolicy, failedJobsHistoryLimit, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend, timezone, workflowMetadata, workflowSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronWorkflowSpec {\n");
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
    sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    workflowMetadata: ").append(toIndentedString(workflowMetadata)).append("\n");
    sb.append("    workflowSpec: ").append(toIndentedString(workflowSpec)).append("\n");
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


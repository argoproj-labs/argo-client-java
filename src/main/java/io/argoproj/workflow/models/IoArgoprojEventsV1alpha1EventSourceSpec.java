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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1AMQPEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1AzureEventsHubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1CalendarEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EmitterEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1FileEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GenericEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GithubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GitlabEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1HDFSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1KafkaEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1MQTTEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1NATSEventsSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1NSQEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1PubSubEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1PulsarEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1RedisEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1ResourceEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1S3Artifact;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SNSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SQSEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Service;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1SlackEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1StorageGridEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1StripeEventSource;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Template;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1EventSourceSpec
 */

public class IoArgoprojEventsV1alpha1EventSourceSpec {
  public static final String SERIALIZED_NAME_AMQP = "amqp";
  @SerializedName(SERIALIZED_NAME_AMQP)
  private Map<String, IoArgoprojEventsV1alpha1AMQPEventSource> amqp = null;

  public static final String SERIALIZED_NAME_AZURE_EVENTS_HUB = "azureEventsHub";
  @SerializedName(SERIALIZED_NAME_AZURE_EVENTS_HUB)
  private Map<String, IoArgoprojEventsV1alpha1AzureEventsHubEventSource> azureEventsHub = null;

  public static final String SERIALIZED_NAME_CALENDAR = "calendar";
  @SerializedName(SERIALIZED_NAME_CALENDAR)
  private Map<String, IoArgoprojEventsV1alpha1CalendarEventSource> calendar = null;

  public static final String SERIALIZED_NAME_EMITTER = "emitter";
  @SerializedName(SERIALIZED_NAME_EMITTER)
  private Map<String, IoArgoprojEventsV1alpha1EmitterEventSource> emitter = null;

  public static final String SERIALIZED_NAME_EVENT_BUS_NAME = "eventBusName";
  @SerializedName(SERIALIZED_NAME_EVENT_BUS_NAME)
  private String eventBusName;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private Map<String, IoArgoprojEventsV1alpha1FileEventSource> file = null;

  public static final String SERIALIZED_NAME_GENERIC = "generic";
  @SerializedName(SERIALIZED_NAME_GENERIC)
  private Map<String, IoArgoprojEventsV1alpha1GenericEventSource> generic = null;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private Map<String, IoArgoprojEventsV1alpha1GithubEventSource> github = null;

  public static final String SERIALIZED_NAME_GITLAB = "gitlab";
  @SerializedName(SERIALIZED_NAME_GITLAB)
  private Map<String, IoArgoprojEventsV1alpha1GitlabEventSource> gitlab = null;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private Map<String, IoArgoprojEventsV1alpha1HDFSEventSource> hdfs = null;

  public static final String SERIALIZED_NAME_KAFKA = "kafka";
  @SerializedName(SERIALIZED_NAME_KAFKA)
  private Map<String, IoArgoprojEventsV1alpha1KafkaEventSource> kafka = null;

  public static final String SERIALIZED_NAME_MINIO = "minio";
  @SerializedName(SERIALIZED_NAME_MINIO)
  private Map<String, IoArgoprojEventsV1alpha1S3Artifact> minio = null;

  public static final String SERIALIZED_NAME_MQTT = "mqtt";
  @SerializedName(SERIALIZED_NAME_MQTT)
  private Map<String, IoArgoprojEventsV1alpha1MQTTEventSource> mqtt = null;

  public static final String SERIALIZED_NAME_NATS = "nats";
  @SerializedName(SERIALIZED_NAME_NATS)
  private Map<String, IoArgoprojEventsV1alpha1NATSEventsSource> nats = null;

  public static final String SERIALIZED_NAME_NSQ = "nsq";
  @SerializedName(SERIALIZED_NAME_NSQ)
  private Map<String, IoArgoprojEventsV1alpha1NSQEventSource> nsq = null;

  public static final String SERIALIZED_NAME_PUB_SUB = "pubSub";
  @SerializedName(SERIALIZED_NAME_PUB_SUB)
  private Map<String, IoArgoprojEventsV1alpha1PubSubEventSource> pubSub = null;

  public static final String SERIALIZED_NAME_PULSAR = "pulsar";
  @SerializedName(SERIALIZED_NAME_PULSAR)
  private Map<String, IoArgoprojEventsV1alpha1PulsarEventSource> pulsar = null;

  public static final String SERIALIZED_NAME_REDIS = "redis";
  @SerializedName(SERIALIZED_NAME_REDIS)
  private Map<String, IoArgoprojEventsV1alpha1RedisEventSource> redis = null;

  public static final String SERIALIZED_NAME_REPLICA = "replica";
  @SerializedName(SERIALIZED_NAME_REPLICA)
  private Integer replica;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private Map<String, IoArgoprojEventsV1alpha1ResourceEventSource> resource = null;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private IoArgoprojEventsV1alpha1Service service;

  public static final String SERIALIZED_NAME_SLACK = "slack";
  @SerializedName(SERIALIZED_NAME_SLACK)
  private Map<String, IoArgoprojEventsV1alpha1SlackEventSource> slack = null;

  public static final String SERIALIZED_NAME_SNS = "sns";
  @SerializedName(SERIALIZED_NAME_SNS)
  private Map<String, IoArgoprojEventsV1alpha1SNSEventSource> sns = null;

  public static final String SERIALIZED_NAME_SQS = "sqs";
  @SerializedName(SERIALIZED_NAME_SQS)
  private Map<String, IoArgoprojEventsV1alpha1SQSEventSource> sqs = null;

  public static final String SERIALIZED_NAME_STORAGE_GRID = "storageGrid";
  @SerializedName(SERIALIZED_NAME_STORAGE_GRID)
  private Map<String, IoArgoprojEventsV1alpha1StorageGridEventSource> storageGrid = null;

  public static final String SERIALIZED_NAME_STRIPE = "stripe";
  @SerializedName(SERIALIZED_NAME_STRIPE)
  private Map<String, IoArgoprojEventsV1alpha1StripeEventSource> stripe = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private IoArgoprojEventsV1alpha1Template template;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private Map<String, IoArgoprojEventsV1alpha1WebhookContext> webhook = null;


  public IoArgoprojEventsV1alpha1EventSourceSpec amqp(Map<String, IoArgoprojEventsV1alpha1AMQPEventSource> amqp) {
    
    this.amqp = amqp;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putAmqpItem(String key, IoArgoprojEventsV1alpha1AMQPEventSource amqpItem) {
    if (this.amqp == null) {
      this.amqp = new HashMap<String, IoArgoprojEventsV1alpha1AMQPEventSource>();
    }
    this.amqp.put(key, amqpItem);
    return this;
  }

   /**
   * Get amqp
   * @return amqp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1AMQPEventSource> getAmqp() {
    return amqp;
  }


  public void setAmqp(Map<String, IoArgoprojEventsV1alpha1AMQPEventSource> amqp) {
    this.amqp = amqp;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec azureEventsHub(Map<String, IoArgoprojEventsV1alpha1AzureEventsHubEventSource> azureEventsHub) {
    
    this.azureEventsHub = azureEventsHub;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putAzureEventsHubItem(String key, IoArgoprojEventsV1alpha1AzureEventsHubEventSource azureEventsHubItem) {
    if (this.azureEventsHub == null) {
      this.azureEventsHub = new HashMap<String, IoArgoprojEventsV1alpha1AzureEventsHubEventSource>();
    }
    this.azureEventsHub.put(key, azureEventsHubItem);
    return this;
  }

   /**
   * Get azureEventsHub
   * @return azureEventsHub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1AzureEventsHubEventSource> getAzureEventsHub() {
    return azureEventsHub;
  }


  public void setAzureEventsHub(Map<String, IoArgoprojEventsV1alpha1AzureEventsHubEventSource> azureEventsHub) {
    this.azureEventsHub = azureEventsHub;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec calendar(Map<String, IoArgoprojEventsV1alpha1CalendarEventSource> calendar) {
    
    this.calendar = calendar;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putCalendarItem(String key, IoArgoprojEventsV1alpha1CalendarEventSource calendarItem) {
    if (this.calendar == null) {
      this.calendar = new HashMap<String, IoArgoprojEventsV1alpha1CalendarEventSource>();
    }
    this.calendar.put(key, calendarItem);
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1CalendarEventSource> getCalendar() {
    return calendar;
  }


  public void setCalendar(Map<String, IoArgoprojEventsV1alpha1CalendarEventSource> calendar) {
    this.calendar = calendar;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec emitter(Map<String, IoArgoprojEventsV1alpha1EmitterEventSource> emitter) {
    
    this.emitter = emitter;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putEmitterItem(String key, IoArgoprojEventsV1alpha1EmitterEventSource emitterItem) {
    if (this.emitter == null) {
      this.emitter = new HashMap<String, IoArgoprojEventsV1alpha1EmitterEventSource>();
    }
    this.emitter.put(key, emitterItem);
    return this;
  }

   /**
   * Get emitter
   * @return emitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1EmitterEventSource> getEmitter() {
    return emitter;
  }


  public void setEmitter(Map<String, IoArgoprojEventsV1alpha1EmitterEventSource> emitter) {
    this.emitter = emitter;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec eventBusName(String eventBusName) {
    
    this.eventBusName = eventBusName;
    return this;
  }

   /**
   * Get eventBusName
   * @return eventBusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventBusName() {
    return eventBusName;
  }


  public void setEventBusName(String eventBusName) {
    this.eventBusName = eventBusName;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec file(Map<String, IoArgoprojEventsV1alpha1FileEventSource> file) {
    
    this.file = file;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putFileItem(String key, IoArgoprojEventsV1alpha1FileEventSource fileItem) {
    if (this.file == null) {
      this.file = new HashMap<String, IoArgoprojEventsV1alpha1FileEventSource>();
    }
    this.file.put(key, fileItem);
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1FileEventSource> getFile() {
    return file;
  }


  public void setFile(Map<String, IoArgoprojEventsV1alpha1FileEventSource> file) {
    this.file = file;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec generic(Map<String, IoArgoprojEventsV1alpha1GenericEventSource> generic) {
    
    this.generic = generic;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putGenericItem(String key, IoArgoprojEventsV1alpha1GenericEventSource genericItem) {
    if (this.generic == null) {
      this.generic = new HashMap<String, IoArgoprojEventsV1alpha1GenericEventSource>();
    }
    this.generic.put(key, genericItem);
    return this;
  }

   /**
   * Get generic
   * @return generic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1GenericEventSource> getGeneric() {
    return generic;
  }


  public void setGeneric(Map<String, IoArgoprojEventsV1alpha1GenericEventSource> generic) {
    this.generic = generic;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec github(Map<String, IoArgoprojEventsV1alpha1GithubEventSource> github) {
    
    this.github = github;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putGithubItem(String key, IoArgoprojEventsV1alpha1GithubEventSource githubItem) {
    if (this.github == null) {
      this.github = new HashMap<String, IoArgoprojEventsV1alpha1GithubEventSource>();
    }
    this.github.put(key, githubItem);
    return this;
  }

   /**
   * Get github
   * @return github
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1GithubEventSource> getGithub() {
    return github;
  }


  public void setGithub(Map<String, IoArgoprojEventsV1alpha1GithubEventSource> github) {
    this.github = github;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec gitlab(Map<String, IoArgoprojEventsV1alpha1GitlabEventSource> gitlab) {
    
    this.gitlab = gitlab;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putGitlabItem(String key, IoArgoprojEventsV1alpha1GitlabEventSource gitlabItem) {
    if (this.gitlab == null) {
      this.gitlab = new HashMap<String, IoArgoprojEventsV1alpha1GitlabEventSource>();
    }
    this.gitlab.put(key, gitlabItem);
    return this;
  }

   /**
   * Get gitlab
   * @return gitlab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1GitlabEventSource> getGitlab() {
    return gitlab;
  }


  public void setGitlab(Map<String, IoArgoprojEventsV1alpha1GitlabEventSource> gitlab) {
    this.gitlab = gitlab;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec hdfs(Map<String, IoArgoprojEventsV1alpha1HDFSEventSource> hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putHdfsItem(String key, IoArgoprojEventsV1alpha1HDFSEventSource hdfsItem) {
    if (this.hdfs == null) {
      this.hdfs = new HashMap<String, IoArgoprojEventsV1alpha1HDFSEventSource>();
    }
    this.hdfs.put(key, hdfsItem);
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1HDFSEventSource> getHdfs() {
    return hdfs;
  }


  public void setHdfs(Map<String, IoArgoprojEventsV1alpha1HDFSEventSource> hdfs) {
    this.hdfs = hdfs;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec kafka(Map<String, IoArgoprojEventsV1alpha1KafkaEventSource> kafka) {
    
    this.kafka = kafka;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putKafkaItem(String key, IoArgoprojEventsV1alpha1KafkaEventSource kafkaItem) {
    if (this.kafka == null) {
      this.kafka = new HashMap<String, IoArgoprojEventsV1alpha1KafkaEventSource>();
    }
    this.kafka.put(key, kafkaItem);
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1KafkaEventSource> getKafka() {
    return kafka;
  }


  public void setKafka(Map<String, IoArgoprojEventsV1alpha1KafkaEventSource> kafka) {
    this.kafka = kafka;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec minio(Map<String, IoArgoprojEventsV1alpha1S3Artifact> minio) {
    
    this.minio = minio;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putMinioItem(String key, IoArgoprojEventsV1alpha1S3Artifact minioItem) {
    if (this.minio == null) {
      this.minio = new HashMap<String, IoArgoprojEventsV1alpha1S3Artifact>();
    }
    this.minio.put(key, minioItem);
    return this;
  }

   /**
   * Get minio
   * @return minio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1S3Artifact> getMinio() {
    return minio;
  }


  public void setMinio(Map<String, IoArgoprojEventsV1alpha1S3Artifact> minio) {
    this.minio = minio;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec mqtt(Map<String, IoArgoprojEventsV1alpha1MQTTEventSource> mqtt) {
    
    this.mqtt = mqtt;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putMqttItem(String key, IoArgoprojEventsV1alpha1MQTTEventSource mqttItem) {
    if (this.mqtt == null) {
      this.mqtt = new HashMap<String, IoArgoprojEventsV1alpha1MQTTEventSource>();
    }
    this.mqtt.put(key, mqttItem);
    return this;
  }

   /**
   * Get mqtt
   * @return mqtt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1MQTTEventSource> getMqtt() {
    return mqtt;
  }


  public void setMqtt(Map<String, IoArgoprojEventsV1alpha1MQTTEventSource> mqtt) {
    this.mqtt = mqtt;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec nats(Map<String, IoArgoprojEventsV1alpha1NATSEventsSource> nats) {
    
    this.nats = nats;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putNatsItem(String key, IoArgoprojEventsV1alpha1NATSEventsSource natsItem) {
    if (this.nats == null) {
      this.nats = new HashMap<String, IoArgoprojEventsV1alpha1NATSEventsSource>();
    }
    this.nats.put(key, natsItem);
    return this;
  }

   /**
   * Get nats
   * @return nats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1NATSEventsSource> getNats() {
    return nats;
  }


  public void setNats(Map<String, IoArgoprojEventsV1alpha1NATSEventsSource> nats) {
    this.nats = nats;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec nsq(Map<String, IoArgoprojEventsV1alpha1NSQEventSource> nsq) {
    
    this.nsq = nsq;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putNsqItem(String key, IoArgoprojEventsV1alpha1NSQEventSource nsqItem) {
    if (this.nsq == null) {
      this.nsq = new HashMap<String, IoArgoprojEventsV1alpha1NSQEventSource>();
    }
    this.nsq.put(key, nsqItem);
    return this;
  }

   /**
   * Get nsq
   * @return nsq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1NSQEventSource> getNsq() {
    return nsq;
  }


  public void setNsq(Map<String, IoArgoprojEventsV1alpha1NSQEventSource> nsq) {
    this.nsq = nsq;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec pubSub(Map<String, IoArgoprojEventsV1alpha1PubSubEventSource> pubSub) {
    
    this.pubSub = pubSub;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putPubSubItem(String key, IoArgoprojEventsV1alpha1PubSubEventSource pubSubItem) {
    if (this.pubSub == null) {
      this.pubSub = new HashMap<String, IoArgoprojEventsV1alpha1PubSubEventSource>();
    }
    this.pubSub.put(key, pubSubItem);
    return this;
  }

   /**
   * Get pubSub
   * @return pubSub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1PubSubEventSource> getPubSub() {
    return pubSub;
  }


  public void setPubSub(Map<String, IoArgoprojEventsV1alpha1PubSubEventSource> pubSub) {
    this.pubSub = pubSub;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec pulsar(Map<String, IoArgoprojEventsV1alpha1PulsarEventSource> pulsar) {
    
    this.pulsar = pulsar;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putPulsarItem(String key, IoArgoprojEventsV1alpha1PulsarEventSource pulsarItem) {
    if (this.pulsar == null) {
      this.pulsar = new HashMap<String, IoArgoprojEventsV1alpha1PulsarEventSource>();
    }
    this.pulsar.put(key, pulsarItem);
    return this;
  }

   /**
   * Get pulsar
   * @return pulsar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1PulsarEventSource> getPulsar() {
    return pulsar;
  }


  public void setPulsar(Map<String, IoArgoprojEventsV1alpha1PulsarEventSource> pulsar) {
    this.pulsar = pulsar;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec redis(Map<String, IoArgoprojEventsV1alpha1RedisEventSource> redis) {
    
    this.redis = redis;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putRedisItem(String key, IoArgoprojEventsV1alpha1RedisEventSource redisItem) {
    if (this.redis == null) {
      this.redis = new HashMap<String, IoArgoprojEventsV1alpha1RedisEventSource>();
    }
    this.redis.put(key, redisItem);
    return this;
  }

   /**
   * Get redis
   * @return redis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1RedisEventSource> getRedis() {
    return redis;
  }


  public void setRedis(Map<String, IoArgoprojEventsV1alpha1RedisEventSource> redis) {
    this.redis = redis;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec replica(Integer replica) {
    
    this.replica = replica;
    return this;
  }

   /**
   * Get replica
   * @return replica
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplica() {
    return replica;
  }


  public void setReplica(Integer replica) {
    this.replica = replica;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec resource(Map<String, IoArgoprojEventsV1alpha1ResourceEventSource> resource) {
    
    this.resource = resource;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putResourceItem(String key, IoArgoprojEventsV1alpha1ResourceEventSource resourceItem) {
    if (this.resource == null) {
      this.resource = new HashMap<String, IoArgoprojEventsV1alpha1ResourceEventSource>();
    }
    this.resource.put(key, resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1ResourceEventSource> getResource() {
    return resource;
  }


  public void setResource(Map<String, IoArgoprojEventsV1alpha1ResourceEventSource> resource) {
    this.resource = resource;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec service(IoArgoprojEventsV1alpha1Service service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Service getService() {
    return service;
  }


  public void setService(IoArgoprojEventsV1alpha1Service service) {
    this.service = service;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec slack(Map<String, IoArgoprojEventsV1alpha1SlackEventSource> slack) {
    
    this.slack = slack;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putSlackItem(String key, IoArgoprojEventsV1alpha1SlackEventSource slackItem) {
    if (this.slack == null) {
      this.slack = new HashMap<String, IoArgoprojEventsV1alpha1SlackEventSource>();
    }
    this.slack.put(key, slackItem);
    return this;
  }

   /**
   * Get slack
   * @return slack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1SlackEventSource> getSlack() {
    return slack;
  }


  public void setSlack(Map<String, IoArgoprojEventsV1alpha1SlackEventSource> slack) {
    this.slack = slack;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec sns(Map<String, IoArgoprojEventsV1alpha1SNSEventSource> sns) {
    
    this.sns = sns;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putSnsItem(String key, IoArgoprojEventsV1alpha1SNSEventSource snsItem) {
    if (this.sns == null) {
      this.sns = new HashMap<String, IoArgoprojEventsV1alpha1SNSEventSource>();
    }
    this.sns.put(key, snsItem);
    return this;
  }

   /**
   * Get sns
   * @return sns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1SNSEventSource> getSns() {
    return sns;
  }


  public void setSns(Map<String, IoArgoprojEventsV1alpha1SNSEventSource> sns) {
    this.sns = sns;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec sqs(Map<String, IoArgoprojEventsV1alpha1SQSEventSource> sqs) {
    
    this.sqs = sqs;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putSqsItem(String key, IoArgoprojEventsV1alpha1SQSEventSource sqsItem) {
    if (this.sqs == null) {
      this.sqs = new HashMap<String, IoArgoprojEventsV1alpha1SQSEventSource>();
    }
    this.sqs.put(key, sqsItem);
    return this;
  }

   /**
   * Get sqs
   * @return sqs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1SQSEventSource> getSqs() {
    return sqs;
  }


  public void setSqs(Map<String, IoArgoprojEventsV1alpha1SQSEventSource> sqs) {
    this.sqs = sqs;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec storageGrid(Map<String, IoArgoprojEventsV1alpha1StorageGridEventSource> storageGrid) {
    
    this.storageGrid = storageGrid;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putStorageGridItem(String key, IoArgoprojEventsV1alpha1StorageGridEventSource storageGridItem) {
    if (this.storageGrid == null) {
      this.storageGrid = new HashMap<String, IoArgoprojEventsV1alpha1StorageGridEventSource>();
    }
    this.storageGrid.put(key, storageGridItem);
    return this;
  }

   /**
   * Get storageGrid
   * @return storageGrid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1StorageGridEventSource> getStorageGrid() {
    return storageGrid;
  }


  public void setStorageGrid(Map<String, IoArgoprojEventsV1alpha1StorageGridEventSource> storageGrid) {
    this.storageGrid = storageGrid;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec stripe(Map<String, IoArgoprojEventsV1alpha1StripeEventSource> stripe) {
    
    this.stripe = stripe;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putStripeItem(String key, IoArgoprojEventsV1alpha1StripeEventSource stripeItem) {
    if (this.stripe == null) {
      this.stripe = new HashMap<String, IoArgoprojEventsV1alpha1StripeEventSource>();
    }
    this.stripe.put(key, stripeItem);
    return this;
  }

   /**
   * Get stripe
   * @return stripe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1StripeEventSource> getStripe() {
    return stripe;
  }


  public void setStripe(Map<String, IoArgoprojEventsV1alpha1StripeEventSource> stripe) {
    this.stripe = stripe;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec template(IoArgoprojEventsV1alpha1Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Template getTemplate() {
    return template;
  }


  public void setTemplate(IoArgoprojEventsV1alpha1Template template) {
    this.template = template;
  }


  public IoArgoprojEventsV1alpha1EventSourceSpec webhook(Map<String, IoArgoprojEventsV1alpha1WebhookContext> webhook) {
    
    this.webhook = webhook;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventSourceSpec putWebhookItem(String key, IoArgoprojEventsV1alpha1WebhookContext webhookItem) {
    if (this.webhook == null) {
      this.webhook = new HashMap<String, IoArgoprojEventsV1alpha1WebhookContext>();
    }
    this.webhook.put(key, webhookItem);
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IoArgoprojEventsV1alpha1WebhookContext> getWebhook() {
    return webhook;
  }


  public void setWebhook(Map<String, IoArgoprojEventsV1alpha1WebhookContext> webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EventSourceSpec ioArgoprojEventsV1alpha1EventSourceSpec = (IoArgoprojEventsV1alpha1EventSourceSpec) o;
    return Objects.equals(this.amqp, ioArgoprojEventsV1alpha1EventSourceSpec.amqp) &&
        Objects.equals(this.azureEventsHub, ioArgoprojEventsV1alpha1EventSourceSpec.azureEventsHub) &&
        Objects.equals(this.calendar, ioArgoprojEventsV1alpha1EventSourceSpec.calendar) &&
        Objects.equals(this.emitter, ioArgoprojEventsV1alpha1EventSourceSpec.emitter) &&
        Objects.equals(this.eventBusName, ioArgoprojEventsV1alpha1EventSourceSpec.eventBusName) &&
        Objects.equals(this.file, ioArgoprojEventsV1alpha1EventSourceSpec.file) &&
        Objects.equals(this.generic, ioArgoprojEventsV1alpha1EventSourceSpec.generic) &&
        Objects.equals(this.github, ioArgoprojEventsV1alpha1EventSourceSpec.github) &&
        Objects.equals(this.gitlab, ioArgoprojEventsV1alpha1EventSourceSpec.gitlab) &&
        Objects.equals(this.hdfs, ioArgoprojEventsV1alpha1EventSourceSpec.hdfs) &&
        Objects.equals(this.kafka, ioArgoprojEventsV1alpha1EventSourceSpec.kafka) &&
        Objects.equals(this.minio, ioArgoprojEventsV1alpha1EventSourceSpec.minio) &&
        Objects.equals(this.mqtt, ioArgoprojEventsV1alpha1EventSourceSpec.mqtt) &&
        Objects.equals(this.nats, ioArgoprojEventsV1alpha1EventSourceSpec.nats) &&
        Objects.equals(this.nsq, ioArgoprojEventsV1alpha1EventSourceSpec.nsq) &&
        Objects.equals(this.pubSub, ioArgoprojEventsV1alpha1EventSourceSpec.pubSub) &&
        Objects.equals(this.pulsar, ioArgoprojEventsV1alpha1EventSourceSpec.pulsar) &&
        Objects.equals(this.redis, ioArgoprojEventsV1alpha1EventSourceSpec.redis) &&
        Objects.equals(this.replica, ioArgoprojEventsV1alpha1EventSourceSpec.replica) &&
        Objects.equals(this.resource, ioArgoprojEventsV1alpha1EventSourceSpec.resource) &&
        Objects.equals(this.service, ioArgoprojEventsV1alpha1EventSourceSpec.service) &&
        Objects.equals(this.slack, ioArgoprojEventsV1alpha1EventSourceSpec.slack) &&
        Objects.equals(this.sns, ioArgoprojEventsV1alpha1EventSourceSpec.sns) &&
        Objects.equals(this.sqs, ioArgoprojEventsV1alpha1EventSourceSpec.sqs) &&
        Objects.equals(this.storageGrid, ioArgoprojEventsV1alpha1EventSourceSpec.storageGrid) &&
        Objects.equals(this.stripe, ioArgoprojEventsV1alpha1EventSourceSpec.stripe) &&
        Objects.equals(this.template, ioArgoprojEventsV1alpha1EventSourceSpec.template) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1EventSourceSpec.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amqp, azureEventsHub, calendar, emitter, eventBusName, file, generic, github, gitlab, hdfs, kafka, minio, mqtt, nats, nsq, pubSub, pulsar, redis, replica, resource, service, slack, sns, sqs, storageGrid, stripe, template, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventSourceSpec {\n");
    sb.append("    amqp: ").append(toIndentedString(amqp)).append("\n");
    sb.append("    azureEventsHub: ").append(toIndentedString(azureEventsHub)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    emitter: ").append(toIndentedString(emitter)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    minio: ").append(toIndentedString(minio)).append("\n");
    sb.append("    mqtt: ").append(toIndentedString(mqtt)).append("\n");
    sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
    sb.append("    nsq: ").append(toIndentedString(nsq)).append("\n");
    sb.append("    pubSub: ").append(toIndentedString(pubSub)).append("\n");
    sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
    sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
    sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    sns: ").append(toIndentedString(sns)).append("\n");
    sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
    sb.append("    storageGrid: ").append(toIndentedString(storageGrid)).append("\n");
    sb.append("    stripe: ").append(toIndentedString(stripe)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

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
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.ContinueOn;
import io.argoproj.workflow.models.LifecycleHook;
import io.argoproj.workflow.models.Sequence;
import io.argoproj.workflow.models.TemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DAGTask represents a node in the graph during DAG execution
 */
@ApiModel(description = "DAGTask represents a node in the graph during DAG execution")

public class DAGTask {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_CONTINUE_ON = "continueOn";
  @SerializedName(SERIALIZED_NAME_CONTINUE_ON)
  private ContinueOn continueOn;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies = null;

  public static final String SERIALIZED_NAME_DEPENDS = "depends";
  @SerializedName(SERIALIZED_NAME_DEPENDS)
  private String depends;

  public static final String SERIALIZED_NAME_HOOKS = "hooks";
  @SerializedName(SERIALIZED_NAME_HOOKS)
  private Map<String, LifecycleHook> hooks = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_EXIT = "onExit";
  @SerializedName(SERIALIZED_NAME_ON_EXIT)
  private String onExit;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private TemplateRef templateRef;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private String when;

  public static final String SERIALIZED_NAME_WITH_ITEMS = "withItems";
  @SerializedName(SERIALIZED_NAME_WITH_ITEMS)
  private List<Object> withItems = null;

  public static final String SERIALIZED_NAME_WITH_PARAM = "withParam";
  @SerializedName(SERIALIZED_NAME_WITH_PARAM)
  private String withParam;

  public static final String SERIALIZED_NAME_WITH_SEQUENCE = "withSequence";
  @SerializedName(SERIALIZED_NAME_WITH_SEQUENCE)
  private Sequence withSequence;


  public DAGTask arguments(Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Arguments getArguments() {
    return arguments;
  }


  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }


  public DAGTask continueOn(ContinueOn continueOn) {
    
    this.continueOn = continueOn;
    return this;
  }

   /**
   * Get continueOn
   * @return continueOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContinueOn getContinueOn() {
    return continueOn;
  }


  public void setContinueOn(ContinueOn continueOn) {
    this.continueOn = continueOn;
  }


  public DAGTask dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public DAGTask addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<String>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies are name of other targets which this depends on
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dependencies are name of other targets which this depends on")

  public List<String> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }


  public DAGTask depends(String depends) {
    
    this.depends = depends;
    return this;
  }

   /**
   * Depends are name of other targets which this depends on
   * @return depends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Depends are name of other targets which this depends on")

  public String getDepends() {
    return depends;
  }


  public void setDepends(String depends) {
    this.depends = depends;
  }


  public DAGTask hooks(Map<String, LifecycleHook> hooks) {
    
    this.hooks = hooks;
    return this;
  }

  public DAGTask putHooksItem(String key, LifecycleHook hooksItem) {
    if (this.hooks == null) {
      this.hooks = new HashMap<String, LifecycleHook>();
    }
    this.hooks.put(key, hooksItem);
    return this;
  }

   /**
   * Hooks hold the lifecycle hook which is invoked at lifecycle of task, irrespective of the success, failure, or error status of the primary task
   * @return hooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hooks hold the lifecycle hook which is invoked at lifecycle of task, irrespective of the success, failure, or error status of the primary task")

  public Map<String, LifecycleHook> getHooks() {
    return hooks;
  }


  public void setHooks(Map<String, LifecycleHook> hooks) {
    this.hooks = hooks;
  }


  public DAGTask name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the target
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the target")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DAGTask onExit(String onExit) {
    
    this.onExit = onExit;
    return this;
  }

   /**
   * OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. DEPRECATED: Use Hooks[exit].Template instead.
   * @return onExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. DEPRECATED: Use Hooks[exit].Template instead.")

  public String getOnExit() {
    return onExit;
  }


  public void setOnExit(String onExit) {
    this.onExit = onExit;
  }


  public DAGTask template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Name of template to execute
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of template to execute")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public DAGTask templateRef(TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  public DAGTask when(String when) {
    
    this.when = when;
    return this;
  }

   /**
   * When is an expression in which the task should conditionally execute
   * @return when
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When is an expression in which the task should conditionally execute")

  public String getWhen() {
    return when;
  }


  public void setWhen(String when) {
    this.when = when;
  }


  public DAGTask withItems(List<Object> withItems) {
    
    this.withItems = withItems;
    return this;
  }

  public DAGTask addWithItemsItem(Object withItemsItem) {
    if (this.withItems == null) {
      this.withItems = new ArrayList<Object>();
    }
    this.withItems.add(withItemsItem);
    return this;
  }

   /**
   * WithItems expands a task into multiple parallel tasks from the items in the list
   * @return withItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WithItems expands a task into multiple parallel tasks from the items in the list")

  public List<Object> getWithItems() {
    return withItems;
  }


  public void setWithItems(List<Object> withItems) {
    this.withItems = withItems;
  }


  public DAGTask withParam(String withParam) {
    
    this.withParam = withParam;
    return this;
  }

   /**
   * WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.
   * @return withParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.")

  public String getWithParam() {
    return withParam;
  }


  public void setWithParam(String withParam) {
    this.withParam = withParam;
  }


  public DAGTask withSequence(Sequence withSequence) {
    
    this.withSequence = withSequence;
    return this;
  }

   /**
   * Get withSequence
   * @return withSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sequence getWithSequence() {
    return withSequence;
  }


  public void setWithSequence(Sequence withSequence) {
    this.withSequence = withSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGTask daGTask = (DAGTask) o;
    return Objects.equals(this.arguments, daGTask.arguments) &&
        Objects.equals(this.continueOn, daGTask.continueOn) &&
        Objects.equals(this.dependencies, daGTask.dependencies) &&
        Objects.equals(this.depends, daGTask.depends) &&
        Objects.equals(this.hooks, daGTask.hooks) &&
        Objects.equals(this.name, daGTask.name) &&
        Objects.equals(this.onExit, daGTask.onExit) &&
        Objects.equals(this.template, daGTask.template) &&
        Objects.equals(this.templateRef, daGTask.templateRef) &&
        Objects.equals(this.when, daGTask.when) &&
        Objects.equals(this.withItems, daGTask.withItems) &&
        Objects.equals(this.withParam, daGTask.withParam) &&
        Objects.equals(this.withSequence, daGTask.withSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, continueOn, dependencies, depends, hooks, name, onExit, template, templateRef, when, withItems, withParam, withSequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGTask {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
    sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
    sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
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


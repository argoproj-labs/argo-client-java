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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.ArtifactLocation;
import io.argoproj.workflow.models.DAGTemplate;
import io.argoproj.workflow.models.ExecutorConfig;
import io.argoproj.workflow.models.Inputs;
import io.argoproj.workflow.models.Memoize;
import io.argoproj.workflow.models.Metadata;
import io.argoproj.workflow.models.Metrics;
import io.argoproj.workflow.models.Outputs;
import io.argoproj.workflow.models.ParallelSteps;
import io.argoproj.workflow.models.ResourceTemplate;
import io.argoproj.workflow.models.RetryStrategy;
import io.argoproj.workflow.models.ScriptTemplate;
import io.argoproj.workflow.models.SuspendTemplate;
import io.argoproj.workflow.models.Synchronization;
import io.argoproj.workflow.models.TemplateRef;
import io.argoproj.workflow.models.UserContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Template
 */
public class TemplateTest {
    private final Template model = new Template();

    /**
     * Model tests for Template
     */
    @Test
    public void testTemplate() {
        // TODO: test Template
    }

    /**
     * Test the property 'activeDeadlineSeconds'
     */
    @Test
    public void activeDeadlineSecondsTest() {
        // TODO: test activeDeadlineSeconds
    }

    /**
     * Test the property 'affinity'
     */
    @Test
    public void affinityTest() {
        // TODO: test affinity
    }

    /**
     * Test the property 'archiveLocation'
     */
    @Test
    public void archiveLocationTest() {
        // TODO: test archiveLocation
    }

    /**
     * Test the property 'arguments'
     */
    @Test
    public void argumentsTest() {
        // TODO: test arguments
    }

    /**
     * Test the property 'automountServiceAccountToken'
     */
    @Test
    public void automountServiceAccountTokenTest() {
        // TODO: test automountServiceAccountToken
    }

    /**
     * Test the property 'container'
     */
    @Test
    public void containerTest() {
        // TODO: test container
    }

    /**
     * Test the property 'daemon'
     */
    @Test
    public void daemonTest() {
        // TODO: test daemon
    }

    /**
     * Test the property 'dag'
     */
    @Test
    public void dagTest() {
        // TODO: test dag
    }

    /**
     * Test the property 'executor'
     */
    @Test
    public void executorTest() {
        // TODO: test executor
    }

    /**
     * Test the property 'hostAliases'
     */
    @Test
    public void hostAliasesTest() {
        // TODO: test hostAliases
    }

    /**
     * Test the property 'initContainers'
     */
    @Test
    public void initContainersTest() {
        // TODO: test initContainers
    }

    /**
     * Test the property 'inputs'
     */
    @Test
    public void inputsTest() {
        // TODO: test inputs
    }

    /**
     * Test the property 'memoize'
     */
    @Test
    public void memoizeTest() {
        // TODO: test memoize
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'metrics'
     */
    @Test
    public void metricsTest() {
        // TODO: test metrics
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'nodeSelector'
     */
    @Test
    public void nodeSelectorTest() {
        // TODO: test nodeSelector
    }

    /**
     * Test the property 'outputs'
     */
    @Test
    public void outputsTest() {
        // TODO: test outputs
    }

    /**
     * Test the property 'parallelism'
     */
    @Test
    public void parallelismTest() {
        // TODO: test parallelism
    }

    /**
     * Test the property 'podSpecPatch'
     */
    @Test
    public void podSpecPatchTest() {
        // TODO: test podSpecPatch
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'priorityClassName'
     */
    @Test
    public void priorityClassNameTest() {
        // TODO: test priorityClassName
    }

    /**
     * Test the property 'resource'
     */
    @Test
    public void resourceTest() {
        // TODO: test resource
    }

    /**
     * Test the property 'resubmitPendingPods'
     */
    @Test
    public void resubmitPendingPodsTest() {
        // TODO: test resubmitPendingPods
    }

    /**
     * Test the property 'retryStrategy'
     */
    @Test
    public void retryStrategyTest() {
        // TODO: test retryStrategy
    }

    /**
     * Test the property 'schedulerName'
     */
    @Test
    public void schedulerNameTest() {
        // TODO: test schedulerName
    }

    /**
     * Test the property 'script'
     */
    @Test
    public void scriptTest() {
        // TODO: test script
    }

    /**
     * Test the property 'securityContext'
     */
    @Test
    public void securityContextTest() {
        // TODO: test securityContext
    }

    /**
     * Test the property 'serviceAccountName'
     */
    @Test
    public void serviceAccountNameTest() {
        // TODO: test serviceAccountName
    }

    /**
     * Test the property 'sidecars'
     */
    @Test
    public void sidecarsTest() {
        // TODO: test sidecars
    }

    /**
     * Test the property 'steps'
     */
    @Test
    public void stepsTest() {
        // TODO: test steps
    }

    /**
     * Test the property 'suspend'
     */
    @Test
    public void suspendTest() {
        // TODO: test suspend
    }

    /**
     * Test the property 'synchronization'
     */
    @Test
    public void synchronizationTest() {
        // TODO: test synchronization
    }

    /**
     * Test the property 'template'
     */
    @Test
    public void templateTest() {
        // TODO: test template
    }

    /**
     * Test the property 'templateRef'
     */
    @Test
    public void templateRefTest() {
        // TODO: test templateRef
    }

    /**
     * Test the property 'timeout'
     */
    @Test
    public void timeoutTest() {
        // TODO: test timeout
    }

    /**
     * Test the property 'tolerations'
     */
    @Test
    public void tolerationsTest() {
        // TODO: test tolerations
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

}

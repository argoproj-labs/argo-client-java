/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.models.ClusterWorkflowTemplate;
import io.argoproj.workflow.models.ClusterWorkflowTemplateCreateRequest;
import io.argoproj.workflow.models.ClusterWorkflowTemplateLintRequest;
import io.argoproj.workflow.models.ClusterWorkflowTemplateList;
import io.argoproj.workflow.models.ClusterWorkflowTemplateUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterWorkflowTemplateServiceApi
 */
@Ignore
public class ClusterWorkflowTemplateServiceApiTest {

    private final ClusterWorkflowTemplateServiceApi api = new ClusterWorkflowTemplateServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClusterWorkflowTemplateTest() throws ApiException {
        ClusterWorkflowTemplateCreateRequest body = null;
        ClusterWorkflowTemplate response = api.createClusterWorkflowTemplate(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterWorkflowTemplateTest() throws ApiException {
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.deleteClusterWorkflowTemplate(name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterWorkflowTemplateTest() throws ApiException {
        String name = null;
        String getOptionsResourceVersion = null;
        ClusterWorkflowTemplate response = api.getClusterWorkflowTemplate(name, getOptionsResourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lintClusterWorkflowTemplateTest() throws ApiException {
        ClusterWorkflowTemplateLintRequest body = null;
        ClusterWorkflowTemplate response = api.lintClusterWorkflowTemplate(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterWorkflowTemplatesTest() throws ApiException {
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        ClusterWorkflowTemplateList response = api.listClusterWorkflowTemplates(listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClusterWorkflowTemplateTest() throws ApiException {
        String name = null;
        ClusterWorkflowTemplateUpdateRequest body = null;
        ClusterWorkflowTemplate response = api.updateClusterWorkflowTemplate(name, body);

        // TODO: test validations
    }
    
}

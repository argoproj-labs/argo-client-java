/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventServiceApi
 */
@Ignore
public class EventServiceApiTest {

    private final EventServiceApi api = new EventServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void receiveEventTest() throws ApiException {
        String namespace = null;
        String discriminator = null;
        Object body = null;
        Object response = api.receiveEvent(namespace, discriminator, body);

        // TODO: test validations
    }
    
}

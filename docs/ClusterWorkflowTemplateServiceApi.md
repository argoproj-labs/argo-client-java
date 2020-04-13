# ClusterWorkflowTemplateServiceApi

All URIs are relative to *http://localhost:2746*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterWorkflowTemplate**](ClusterWorkflowTemplateServiceApi.md#createClusterWorkflowTemplate) | **POST** /api/v1/cluster-workflow-templates | 
[**deleteClusterWorkflowTemplate**](ClusterWorkflowTemplateServiceApi.md#deleteClusterWorkflowTemplate) | **DELETE** /api/v1/cluster-workflow-templates/{name} | 
[**getClusterWorkflowTemplate**](ClusterWorkflowTemplateServiceApi.md#getClusterWorkflowTemplate) | **GET** /api/v1/cluster-workflow-templates/{name} | 
[**lintClusterWorkflowTemplate**](ClusterWorkflowTemplateServiceApi.md#lintClusterWorkflowTemplate) | **POST** /api/v1/cluster-workflow-templates/lint | 
[**listClusterWorkflowTemplates**](ClusterWorkflowTemplateServiceApi.md#listClusterWorkflowTemplates) | **GET** /api/v1/cluster-workflow-templates | 
[**updateClusterWorkflowTemplate**](ClusterWorkflowTemplateServiceApi.md#updateClusterWorkflowTemplate) | **PUT** /api/v1/cluster-workflow-templates/{name} | 


<a name="createClusterWorkflowTemplate"></a>
# **createClusterWorkflowTemplate**
> ClusterWorkflowTemplate createClusterWorkflowTemplate(body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    ClusterClusterWorkflowTemplateCreateRequest body = new ClusterClusterWorkflowTemplateCreateRequest(); // ClusterClusterWorkflowTemplateCreateRequest | 
    try {
      ClusterWorkflowTemplate result = apiInstance.createClusterWorkflowTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#createClusterWorkflowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterClusterWorkflowTemplateCreateRequest**](ClusterClusterWorkflowTemplateCreateRequest.md)|  |

### Return type

[**ClusterWorkflowTemplate**](ClusterWorkflowTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="deleteClusterWorkflowTemplate"></a>
# **deleteClusterWorkflowTemplate**
> Object deleteClusterWorkflowTemplate(name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    String name = "name_example"; // String | 
    String deleteOptionsGracePeriodSeconds = "deleteOptionsGracePeriodSeconds_example"; // String | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. +optional.
    String deleteOptionsPreconditionsUid = "deleteOptionsPreconditionsUid_example"; // String | Specifies the target UID. +optional.
    String deleteOptionsPreconditionsResourceVersion = "deleteOptionsPreconditionsResourceVersion_example"; // String | Specifies the target ResourceVersion +optional.
    Boolean deleteOptionsOrphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both. +optional.
    String deleteOptionsPropagationPolicy = "deleteOptionsPropagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground. +optional.
    List<String> deleteOptionsDryRun = Arrays.asList(); // List<String> | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed +optional.
    try {
      Object result = apiInstance.deleteClusterWorkflowTemplate(name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#deleteClusterWorkflowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **deleteOptionsGracePeriodSeconds** | **String**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. +optional. | [optional]
 **deleteOptionsPreconditionsUid** | **String**| Specifies the target UID. +optional. | [optional]
 **deleteOptionsPreconditionsResourceVersion** | **String**| Specifies the target ResourceVersion +optional. | [optional]
 **deleteOptionsOrphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. +optional. | [optional]
 **deleteOptionsPropagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. +optional. | [optional]
 **deleteOptionsDryRun** | [**List&lt;String&gt;**](String.md)| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed +optional. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="getClusterWorkflowTemplate"></a>
# **getClusterWorkflowTemplate**
> ClusterWorkflowTemplate getClusterWorkflowTemplate(name, getOptionsResourceVersion)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    String name = "name_example"; // String | 
    String getOptionsResourceVersion = "getOptionsResourceVersion_example"; // String | When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
    try {
      ClusterWorkflowTemplate result = apiInstance.getClusterWorkflowTemplate(name, getOptionsResourceVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#getClusterWorkflowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **getOptionsResourceVersion** | **String**| When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]

### Return type

[**ClusterWorkflowTemplate**](ClusterWorkflowTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="lintClusterWorkflowTemplate"></a>
# **lintClusterWorkflowTemplate**
> ClusterWorkflowTemplate lintClusterWorkflowTemplate(body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    ClusterClusterWorkflowTemplateLintRequest body = new ClusterClusterWorkflowTemplateLintRequest(); // ClusterClusterWorkflowTemplateLintRequest | 
    try {
      ClusterWorkflowTemplate result = apiInstance.lintClusterWorkflowTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#lintClusterWorkflowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterClusterWorkflowTemplateLintRequest**](ClusterClusterWorkflowTemplateLintRequest.md)|  |

### Return type

[**ClusterWorkflowTemplate**](ClusterWorkflowTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="listClusterWorkflowTemplates"></a>
# **listClusterWorkflowTemplates**
> ClusterWorkflowTemplateList listClusterWorkflowTemplates(listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    String listOptionsLabelSelector = "listOptionsLabelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional.
    String listOptionsFieldSelector = "listOptionsFieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional.
    Boolean listOptionsWatch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional.
    Boolean listOptionsAllowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.  +optional
    String listOptionsResourceVersion = "listOptionsResourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional.
    String listOptionsTimeoutSeconds = "listOptionsTimeoutSeconds_example"; // String | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional.
    String listOptionsLimit = "listOptionsLimit_example"; // String | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
    String listOptionsContinue = "listOptionsContinue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
    try {
      ClusterWorkflowTemplateList result = apiInstance.listClusterWorkflowTemplates(listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#listClusterWorkflowTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listOptionsLabelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. +optional. | [optional]
 **listOptionsFieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. +optional. | [optional]
 **listOptionsWatch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. +optional. | [optional]
 **listOptionsAllowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.  +optional | [optional]
 **listOptionsResourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. +optional. | [optional]
 **listOptionsTimeoutSeconds** | **String**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. +optional. | [optional]
 **listOptionsLimit** | **String**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **listOptionsContinue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]

### Return type

[**ClusterWorkflowTemplateList**](ClusterWorkflowTemplateList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |

<a name="updateClusterWorkflowTemplate"></a>
# **updateClusterWorkflowTemplate**
> ClusterWorkflowTemplate updateClusterWorkflowTemplate(name, body)



### Example
```java
// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ClusterWorkflowTemplateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ClusterWorkflowTemplateServiceApi apiInstance = new ClusterWorkflowTemplateServiceApi(defaultClient);
    String name = "name_example"; // String | 
    ClusterClusterWorkflowTemplateUpdateRequest body = new ClusterClusterWorkflowTemplateUpdateRequest(); // ClusterClusterWorkflowTemplateUpdateRequest | 
    try {
      ClusterWorkflowTemplate result = apiInstance.updateClusterWorkflowTemplate(name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterWorkflowTemplateServiceApi#updateClusterWorkflowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**ClusterClusterWorkflowTemplateUpdateRequest**](ClusterClusterWorkflowTemplateUpdateRequest.md)|  |

### Return type

[**ClusterWorkflowTemplate**](ClusterWorkflowTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |


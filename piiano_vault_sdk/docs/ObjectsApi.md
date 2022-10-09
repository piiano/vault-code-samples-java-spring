# ObjectsApi

All URIs are relative to *http://localhost:8123*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addObject**](ObjectsApi.md#addObject) | **POST** /api/pvlt/1.0/data/collections/{collection}/objects | Add object |
| [**deleteObjectById**](ObjectsApi.md#deleteObjectById) | **DELETE** /api/pvlt/1.0/data/collections/{collection}/objects | Delete object |
| [**getObjects**](ObjectsApi.md#getObjects) | **GET** /api/pvlt/1.0/data/collections/{collection}/objects | List objects |
| [**getObjectsProperty**](ObjectsApi.md#getObjectsProperty) | **GET** /api/pvlt/1.0/data/collections/{collection}/properties/{property} | Get objects property |
| [**searchObjects**](ObjectsApi.md#searchObjects) | **POST** /api/pvlt/1.0/data/collections/{collection}/query/objects | Search objects |
| [**updateObjectById**](ObjectsApi.md#updateObjectById) | **PATCH** /api/pvlt/1.0/data/collections/{collection}/objects | Update object |


<a name="addObject"></a>
# **addObject**
> ModelsObjectID addObject(collection, reason, requestBody, adhocReason, reloadCache, ttl)

Add object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection to add the object to.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    Map<String, Object> requestBody = null; // Map<String, Object> | The object details.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    String ttl = "ttl_example"; // String | Object time to live (TTL) in seconds, cannot be set to 0. If not set, the default TTL is used. See the `PVAULT_TTL_ASSOCIATED_OBJECTS` and `PVAULT_TTL_UNASSOCIATED_OBJECTS` time to live environment variables.
    try {
      ModelsObjectID result = apiInstance.addObject(collection, reason, requestBody, adhocReason, reloadCache, ttl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#addObject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collection** | **String**| The name of the collection to add the object to. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The object details. | |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |
| **ttl** | **String**| Object time to live (TTL) in seconds, cannot be set to 0. If not set, the default TTL is used. See the &#x60;PVAULT_TTL_ASSOCIATED_OBJECTS&#x60; and &#x60;PVAULT_TTL_UNASSOCIATED_OBJECTS&#x60; time to live environment variables. | [optional] |

### Return type

[**ModelsObjectID**](ModelsObjectID.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection or properties isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="deleteObjectById"></a>
# **deleteObjectById**
> deleteObjectById(collection, id, reason, options, adhocReason, reloadCache)

Delete object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    List<String> id = Arrays.asList(); // List<String> | The ID of the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `hard_delete` – permanently delete the objects. - `deleted` – remove only deleted objects, requires `hard_delete` to be specified. 
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      apiInstance.deleteObjectById(collection, id, reason, options, adhocReason, reloadCache);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#deleteObjectById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collection** | **String**| The name of the collection containing the object. | |
| **id** | [**List&lt;String&gt;**](String.md)| The ID of the object. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;hard_delete&#x60; – permanently delete the objects. - &#x60;deleted&#x60; – remove only deleted objects, requires &#x60;hard_delete&#x60; to be specified.  | [optional] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection or object is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getObjects"></a>
# **getObjects**
> ModelsObjectFieldsPage getObjects(collection, reason, adhocReason, reloadCache, pageSize, cursor, id, options, props)

List objects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the objects.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    Integer pageSize = 56; // Integer | The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`. The value must not exceed the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`
    String cursor = "cursor_example"; // String | The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the `id` is specified, paging is not supported. In this case, if the number of `id` values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST).
    List<UUID> id = Arrays.asList(); // List<UUID> | A comma-separated list of object IDs. If not provided, all objects are returned. The number of IDs provided cannot exceed the default page size.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `unsafe` – fetch all the properties, cannot be specified with `props`. - `show_builtins` – show built-in properties, can only be specified with `unsafe`. - `deleted` – get only deleted objects. 
    List<String> props = Arrays.asList(); // List<String> | The list of property names and transformations. To include multiple names and transformation bindings, provide a comma-separated list. For example, `props=first_name,last_name`. If the `unsafe` option is used, must be empty.
    try {
      ModelsObjectFieldsPage result = apiInstance.getObjects(collection, reason, adhocReason, reloadCache, pageSize, cursor, id, options, props);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#getObjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collection** | **String**| The name of the collection containing the objects. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |
| **pageSize** | **Integer**| The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60;. The value must not exceed the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60; | [optional] |
| **cursor** | **String**| The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the &#x60;id&#x60; is specified, paging is not supported. In this case, if the number of &#x60;id&#x60; values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST). | [optional] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)| A comma-separated list of object IDs. If not provided, all objects are returned. The number of IDs provided cannot exceed the default page size. | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;unsafe&#x60; – fetch all the properties, cannot be specified with &#x60;props&#x60;. - &#x60;show_builtins&#x60; – show built-in properties, can only be specified with &#x60;unsafe&#x60;. - &#x60;deleted&#x60; – get only deleted objects.  | [optional] |
| **props** | [**List&lt;String&gt;**](String.md)| The list of property names and transformations. To include multiple names and transformation bindings, provide a comma-separated list. For example, &#x60;props&#x3D;first_name,last_name&#x60;. If the &#x60;unsafe&#x60; option is used, must be empty. | [optional] |

### Return type

[**ModelsObjectFieldsPage**](ModelsObjectFieldsPage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection, properties or object isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getObjectsProperty"></a>
# **getObjectsProperty**
> ModelsObjectFieldsPage getObjectsProperty(reason, collection, property, adhocReason, reloadCache, pageSize, cursor, options, id)

Get objects property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    String collection = "collection_example"; // String | The name of the collection containing the objects.
    String property = "property_example"; // String | The required property.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    Integer pageSize = 56; // Integer | The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`. The value must not exceed the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`
    String cursor = "cursor_example"; // String | The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the `id` is specified, paging is not supported. In this case, if the number of `id` values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST).
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `deleted` – get only deleted objects. 
    List<UUID> id = Arrays.asList(); // List<UUID> | The ID of the object. If not given - return all objects
    try {
      ModelsObjectFieldsPage result = apiInstance.getObjectsProperty(reason, collection, property, adhocReason, reloadCache, pageSize, cursor, options, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#getObjectsProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **collection** | **String**| The name of the collection containing the objects. | |
| **property** | **String**| The required property. | |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |
| **pageSize** | **Integer**| The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60;. The value must not exceed the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60; | [optional] |
| **cursor** | **String**| The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the &#x60;id&#x60; is specified, paging is not supported. In this case, if the number of &#x60;id&#x60; values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST). | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;deleted&#x60; – get only deleted objects.  | [optional] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)| The ID of the object. If not given - return all objects | [optional] |

### Return type

[**ModelsObjectFieldsPage**](ModelsObjectFieldsPage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection, properties or object isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="searchObjects"></a>
# **searchObjects**
> ModelsObjectFieldsPage searchObjects(collection, reason, modelsQuery, adhocReason, reloadCache, pageSize, cursor, options, props)

Search objects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the objects.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    ModelsQuery modelsQuery = new ModelsQuery(); // ModelsQuery | The query. This is a JSON object consisting of property keys and match values. For example: ```json {   \"match\": {     \"first_name\": \"John\",     \"last_name\": \"Doe\"   } } ``` is the equivalent to: ```sql where first_name = \"John\" AND last_name=\"Doe\" ``` 
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    Integer pageSize = 56; // Integer | The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`. The value must not exceed the value specified in the environment variable `PVAULT_SERVICE_DEFAULT_PAGE_SIZE`
    String cursor = "cursor_example"; // String | The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the `id` is specified, paging is not supported. In this case, if the number of `id` values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST).
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `unsafe` – fetch all the properties, cannot be specified with `props`. - `show_builtins` – show built-in properties, can only be specified with `unsafe`. - `deleted` – get only deleted objects. 
    List<String> props = Arrays.asList(); // List<String> | The list of property names and transformations. To include multiple names and transformation bindings, provide a comma-separated list. For example, `props=first_name,last_name`. If the `unsafe` option is used, must be empty.
    try {
      ModelsObjectFieldsPage result = apiInstance.searchObjects(collection, reason, modelsQuery, adhocReason, reloadCache, pageSize, cursor, options, props);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#searchObjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collection** | **String**| The name of the collection containing the objects. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **modelsQuery** | [**ModelsQuery**](ModelsQuery.md)| The query. This is a JSON object consisting of property keys and match values. For example: &#x60;&#x60;&#x60;json {   \&quot;match\&quot;: {     \&quot;first_name\&quot;: \&quot;John\&quot;,     \&quot;last_name\&quot;: \&quot;Doe\&quot;   } } &#x60;&#x60;&#x60; is the equivalent to: &#x60;&#x60;&#x60;sql where first_name &#x3D; \&quot;John\&quot; AND last_name&#x3D;\&quot;Doe\&quot; &#x60;&#x60;&#x60;  | |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |
| **pageSize** | **Integer**| The maximum number of items to return in this request. If not specified, the default value is used. The default value is the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60;. The value must not exceed the value specified in the environment variable &#x60;PVAULT_SERVICE_DEFAULT_PAGE_SIZE&#x60; | [optional] |
| **cursor** | **String**| The cursor represents the state of consecutive queries for the same request parameters. In the first call, the cursor may be omitted or specified as an empty string. In consecutive calls, it should be set to the value of the cursor field of the models.ObjectFieldsPage returned by the previous call. Note: when the &#x60;id&#x60; is specified, paging is not supported. In this case, if the number of &#x60;id&#x60; values specified exceeds the maximum page size, the method returns 400 (BAD REQUEST). | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;unsafe&#x60; – fetch all the properties, cannot be specified with &#x60;props&#x60;. - &#x60;show_builtins&#x60; – show built-in properties, can only be specified with &#x60;unsafe&#x60;. - &#x60;deleted&#x60; – get only deleted objects.  | [optional] |
| **props** | [**List&lt;String&gt;**](String.md)| The list of property names and transformations. To include multiple names and transformation bindings, provide a comma-separated list. For example, &#x60;props&#x3D;first_name,last_name&#x60;. If the &#x60;unsafe&#x60; option is used, must be empty. | [optional] |

### Return type

[**ModelsObjectFieldsPage**](ModelsObjectFieldsPage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection or properties isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="updateObjectById"></a>
# **updateObjectById**
> updateObjectById(collection, id, reason, requestBody, adhocReason, reloadCache, ttl, options)

Update object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ObjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ObjectsApi apiInstance = new ObjectsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    List<UUID> id = Arrays.asList(); // List<UUID> | The ID of the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    Map<String, Object> requestBody = null; // Map<String, Object> | The object properties to update.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    String ttl = "ttl_example"; // String | Object time to live (TTL) in seconds. If not set, the default TTL is used. See the `PVAULT_TTL_ASSOCIATED_OBJECTS` and `PVAULT_TTL_UNASSOCIATED_OBJECTS` time to live environment variables.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `deleted` – update only deleted objects. 
    try {
      apiInstance.updateObjectById(collection, id, reason, requestBody, adhocReason, reloadCache, ttl, options);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectsApi#updateObjectById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collection** | **String**| The name of the collection containing the object. | |
| **id** | [**List&lt;UUID&gt;**](UUID.md)| The ID of the object. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| The object properties to update. | |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |
| **ttl** | **String**| Object time to live (TTL) in seconds. If not set, the default TTL is used. See the &#x60;PVAULT_TTL_ASSOCIATED_OBJECTS&#x60; and &#x60;PVAULT_TTL_UNASSOCIATED_OBJECTS&#x60; time to live environment variables. | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;deleted&#x60; – update only deleted objects.  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection, properties, or object is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |


# SystemApi

All URIs are relative to *http://localhost:8123*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**controlHealth**](SystemApi.md#controlHealth) | **GET** /api/pvlt/1.0/ctl/info/health | Get control service status |
| [**dataHealth**](SystemApi.md#dataHealth) | **GET** /api/pvlt/1.0/data/info/health | Get data service status |
| [**garbageCollection**](SystemApi.md#garbageCollection) | **POST** /api/pvlt/1.0/system/admin/lifecycle/gc | Purge expired and soft deleted objects and tokens |
| [**getClusterInfo**](SystemApi.md#getClusterInfo) | **GET** /api/pvlt/1.0/ctl/info/cluster | Get cluster information |
| [**getConfiguration**](SystemApi.md#getConfiguration) | **GET** /api/pvlt/1.0/system/info/configuration | Get system configuration |
| [**getKms**](SystemApi.md#getKms) | **GET** /api/pvlt/1.0/system/info/kms | Get KMS status |
| [**getLicense**](SystemApi.md#getLicense) | **GET** /api/pvlt/1.0/system/info/license | Get license |
| [**getVaultVersion**](SystemApi.md#getVaultVersion) | **GET** /api/pvlt/1.0/system/info/version | Get Vault version |
| [**rotateKeys**](SystemApi.md#rotateKeys) | **POST** /api/pvlt/1.0/system/admin/keys/rotate | Rotate data encryption keys |
| [**triggerError**](SystemApi.md#triggerError) | **POST** /api/pvlt/1.0/system/debug/error/trigger | Trigger an artificial error |


<a name="controlHealth"></a>
# **controlHealth**
> ModelsHealth controlHealth()

Get control service status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsHealth result = apiInstance.controlHealth();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#controlHealth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsHealth**](ModelsHealth.md)

### Authorization

No authorization required

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="dataHealth"></a>
# **dataHealth**
> ModelsHealth dataHealth()

Get data service status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsHealth result = apiInstance.dataHealth();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#dataHealth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsHealth**](ModelsHealth.md)

### Authorization

No authorization required

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="garbageCollection"></a>
# **garbageCollection**
> List&lt;GcDeletionCount&gt; garbageCollection(reason, filter, dryRun, adhocReason, reloadCache)

Purge expired and soft deleted objects and tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    String filter = "objects_only"; // String | Filter for the GC operation. Options include: `objects_only`,`tokens_only`.
    Boolean dryRun = false; // Boolean | Runs dry run GC if set to true.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      List<GcDeletionCount> result = apiInstance.garbageCollection(reason, filter, dryRun, adhocReason, reloadCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#garbageCollection");
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
| **filter** | **String**| Filter for the GC operation. Options include: &#x60;objects_only&#x60;,&#x60;tokens_only&#x60;. | [optional] [default to all] [enum: objects_only, tokens_only, all] |
| **dryRun** | **Boolean**| Runs dry run GC if set to true. | [optional] [default to false] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

[**List&lt;GcDeletionCount&gt;**](GcDeletionCount.md)

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getClusterInfo"></a>
# **getClusterInfo**
> ModelsAllGenerations getClusterInfo()

Get cluster information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsAllGenerations result = apiInstance.getClusterInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getClusterInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsAllGenerations**](ModelsAllGenerations.md)

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getConfiguration"></a>
# **getConfiguration**
> ConfigConfig getConfiguration()

Get system configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ConfigConfig result = apiInstance.getConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigConfig**](ConfigConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/toml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getKms"></a>
# **getKms**
> ModelsKMSStatus getKms()

Get KMS status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsKMSStatus result = apiInstance.getKms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getKms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsKMSStatus**](ModelsKMSStatus.md)

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getLicense"></a>
# **getLicense**
> ModelsLicense getLicense()

Get license

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsLicense result = apiInstance.getLicense();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getLicense");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsLicense**](ModelsLicense.md)

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getVaultVersion"></a>
# **getVaultVersion**
> ModelsProductVersion getVaultVersion()

Get Vault version

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      ModelsProductVersion result = apiInstance.getVaultVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#getVaultVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelsProductVersion**](ModelsProductVersion.md)

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="rotateKeys"></a>
# **rotateKeys**
> rotateKeys()

Rotate data encryption keys

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      apiInstance.rotateKeys();
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#rotateKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="triggerError"></a>
# **triggerError**
> triggerError()

Trigger an artificial error

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SystemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SystemApi apiInstance = new SystemApi(defaultClient);
    try {
      apiInstance.triggerError();
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemApi#triggerError");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **400** | The request is invalid. |  -  |
| **401** | An error occurred on the server. |  -  |
| **403** | An error occurred on the server. |  -  |
| **404** | The requested resource is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |


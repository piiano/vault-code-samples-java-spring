# IamApi

All URIs are relative to *http://localhost:8123*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIamConf**](IamApi.md#getIamConf) | **GET** /api/pvlt/1.0/ctl/iam/conf | Get IAM configuration |
| [**regenerateUserApiKey**](IamApi.md#regenerateUserApiKey) | **POST** /api/pvlt/1.0/ctl/iam/user/regen | Regenerate user API key |
| [**setIamConf**](IamApi.md#setIamConf) | **POST** /api/pvlt/1.0/ctl/iam/conf | Set IAM configuration |


<a name="getIamConf"></a>
# **getIamConf**
> AuthConfig getIamConf()

Get IAM configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    IamApi apiInstance = new IamApi(defaultClient);
    try {
      AuthConfig result = apiInstance.getIamConf();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamApi#getIamConf");
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

[**AuthConfig**](AuthConfig.md)

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

<a name="regenerateUserApiKey"></a>
# **regenerateUserApiKey**
> ModelsAPIKey regenerateUserApiKey(modelsUserName)

Regenerate user API key

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    IamApi apiInstance = new IamApi(defaultClient);
    ModelsUserName modelsUserName = new ModelsUserName(); // ModelsUserName | The name of the user to regenerate API key for.
    try {
      ModelsAPIKey result = apiInstance.regenerateUserApiKey(modelsUserName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamApi#regenerateUserApiKey");
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
| **modelsUserName** | [**ModelsUserName**](ModelsUserName.md)| The name of the user to regenerate API key for. | |

### Return type

[**ModelsAPIKey**](ModelsAPIKey.md)

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
| **404** | The user is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="setIamConf"></a>
# **setIamConf**
> setIamConf(authConfig)

Set IAM configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    IamApi apiInstance = new IamApi(defaultClient);
    AuthConfig authConfig = new AuthConfig(); // AuthConfig | IAM configuration in TOML format.
    try {
      apiInstance.setIamConf(authConfig);
    } catch (ApiException e) {
      System.err.println("Exception when calling IamApi#setIamConf");
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
| **authConfig** | [**AuthConfig**](AuthConfig.md)| IAM configuration in TOML format. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/toml
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


# TokensApi

All URIs are relative to *http://localhost:8123*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTokens**](TokensApi.md#deleteTokens) | **DELETE** /api/pvlt/1.0/data/collections/{collection}/tokens | Delete tokens |
| [**detokenize**](TokensApi.md#detokenize) | **GET** /api/pvlt/1.0/data/collections/{collection}/tokens | Detokenize tokens |
| [**rotateTokens**](TokensApi.md#rotateTokens) | **POST** /api/pvlt/1.0/data/collections/{collection}/rotate/tokens | Rotate tokens |
| [**searchTokens**](TokensApi.md#searchTokens) | **POST** /api/pvlt/1.0/data/collections/{collection}/query/tokens | Search tokens |
| [**tokenize**](TokensApi.md#tokenize) | **POST** /api/pvlt/1.0/data/collections/{collection}/tokens | Tokenize properties of an object data |
| [**updateTokens**](TokensApi.md#updateTokens) | **PATCH** /api/pvlt/1.0/data/collections/{collection}/tokens | Update tokens |


<a name="deleteTokens"></a>
# **deleteTokens**
> deleteTokens(collection, reason, objectId, tag, tokenId, options, adhocReason, reloadCache)

Delete tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    List<String> objectId = Arrays.asList(); // List<String> | Comma-separated list of object IDs.
    List<String> tag = Arrays.asList(); // List<String> | Comma-separated list of tags.
    List<String> tokenId = Arrays.asList(); // List<String> | Comma-separated list of token IDs.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `hard_delete` – permanently delete the tokens. - `deleted` – remove only deleted tokens, requires `hard_delete` to be specified. 
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      apiInstance.deleteTokens(collection, reason, objectId, tag, tokenId, options, adhocReason, reloadCache);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#deleteTokens");
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
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **objectId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of object IDs. | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| Comma-separated list of tags. | [optional] |
| **tokenId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of token IDs. | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;hard_delete&#x60; – permanently delete the tokens. - &#x60;deleted&#x60; – remove only deleted tokens, requires &#x60;hard_delete&#x60; to be specified.  | [optional] |
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
| **404** | The collection or token isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="detokenize"></a>
# **detokenize**
> List&lt;ModelsDetokenizedToken&gt; detokenize(collection, reason, objectId, options, tag, tokenId, adhocReason, reloadCache)

Detokenize tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    List<String> objectId = Arrays.asList(); // List<String> | Comma-separated list of object IDs.
    List<String> options = Arrays.asList(); // List<String> | Comma-separated list of options.
    List<String> tag = Arrays.asList(); // List<String> | Comma-separated list of tags.
    List<String> tokenId = Arrays.asList(); // List<String> | Comma-separated list of token IDs.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      List<ModelsDetokenizedToken> result = apiInstance.detokenize(collection, reason, objectId, options, tag, tokenId, adhocReason, reloadCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#detokenize");
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
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **objectId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of object IDs. | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Comma-separated list of options. | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| Comma-separated list of tags. | [optional] |
| **tokenId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of token IDs. | [optional] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

[**List&lt;ModelsDetokenizedToken&gt;**](ModelsDetokenizedToken.md)

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
| **404** | The collection, properties, referenced objects or token isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="rotateTokens"></a>
# **rotateTokens**
> List&lt;ModelsRotatedToken&gt; rotateTokens(tokenId, collection, reason, adhocReason, reloadCache)

Rotate tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    List<String> tokenId = Arrays.asList(); // List<String> | Comma-separated list of token IDs.
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      List<ModelsRotatedToken> result = apiInstance.rotateTokens(tokenId, collection, reason, adhocReason, reloadCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#rotateTokens");
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
| **tokenId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of token IDs. | |
| **collection** | **String**| The name of the collection containing the object. | |
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

[**List&lt;ModelsRotatedToken&gt;**](ModelsRotatedToken.md)

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
| **404** | The collection, token, or referenced object or property was not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="searchTokens"></a>
# **searchTokens**
> List&lt;ModelsTokenMetadata&gt; searchTokens(collection, reason, modelsQueryToken, options, adhocReason, reloadCache)

Search tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    ModelsQueryToken modelsQueryToken = new ModelsQueryToken(); // ModelsQueryToken | The query. This is a JSON object consisting of query filters.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `deleted` – get only deleted tokens. 
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      List<ModelsTokenMetadata> result = apiInstance.searchTokens(collection, reason, modelsQueryToken, options, adhocReason, reloadCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#searchTokens");
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
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **modelsQueryToken** | [**ModelsQueryToken**](ModelsQueryToken.md)| The query. This is a JSON object consisting of query filters. | |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;deleted&#x60; – get only deleted tokens.  | [optional] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

[**List&lt;ModelsTokenMetadata&gt;**](ModelsTokenMetadata.md)

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
| **404** | The collection, token, or referenced object or property was not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="tokenize"></a>
# **tokenize**
> List&lt;ModelsTokenValue&gt; tokenize(collection, reason, modelsTokenizeRequest, ttl, adhocReason, reloadCache)

Tokenize properties of an object data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    ModelsTokenizeRequest modelsTokenizeRequest = new ModelsTokenizeRequest(); // ModelsTokenizeRequest | Details of the object and property.
    String ttl = "ttl_example"; // String | Token time to live (TTL) in seconds. If not set, the default TTL is used. See the `PVAULT_TTL_TOKENS` time to live environment variable.
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      List<ModelsTokenValue> result = apiInstance.tokenize(collection, reason, modelsTokenizeRequest, ttl, adhocReason, reloadCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#tokenize");
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
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **modelsTokenizeRequest** | [**ModelsTokenizeRequest**](ModelsTokenizeRequest.md)| Details of the object and property. | |
| **ttl** | **String**| Token time to live (TTL) in seconds. If not set, the default TTL is used. See the &#x60;PVAULT_TTL_TOKENS&#x60; time to live environment variable. | [optional] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

### Return type

[**List&lt;ModelsTokenValue&gt;**](ModelsTokenValue.md)

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
| **404** | The collection, properties or referenced objects isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="updateTokens"></a>
# **updateTokens**
> updateTokens(collection, reason, modelsUpdateTokenRequest, ttl, objectId, tag, tokenId, options, adhocReason, reloadCache)

Update tokens

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TokensApi apiInstance = new TokensApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the object.
    String reason = "AppFunctionality"; // String | Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false.
    ModelsUpdateTokenRequest modelsUpdateTokenRequest = new ModelsUpdateTokenRequest(); // ModelsUpdateTokenRequest | Update token request details.
    String ttl = "ttl_example"; // String | Token time to live (TTL) in seconds. If not set, the token's expiry date is not changed.
    List<UUID> objectId = Arrays.asList(); // List<UUID> | Comma-separated list of object IDs.
    List<String> tag = Arrays.asList(); // List<String> | Comma-separated list of tags.
    List<String> tokenId = Arrays.asList(); // List<String> | Comma-separated list of token IDs.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `deleted` – update only deleted tokens. 
    String adhocReason = "adhocReason_example"; // String | An ad-hoc reason for accessing the Vault data.
    Boolean reloadCache = true; // Boolean | Reloads the cache before the action.
    try {
      apiInstance.updateTokens(collection, reason, modelsUpdateTokenRequest, ttl, objectId, tag, tokenId, options, adhocReason, reloadCache);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#updateTokens");
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
| **reason** | **String**| Details of the reason for requesting the property. The default is set when no access reason is provided and PVAULT_SERVICE_FORCE_ACCESS_REASON is false. | [enum: AppFunctionality, Analytics, Notifications, Marketing, ThirdPartyMarketing, FraudPreventionSecurityAndCompliance, AccountManagement, Maintenance, DataSubjectRequest, Other] |
| **modelsUpdateTokenRequest** | [**ModelsUpdateTokenRequest**](ModelsUpdateTokenRequest.md)| Update token request details. | |
| **ttl** | **String**| Token time to live (TTL) in seconds. If not set, the token&#39;s expiry date is not changed. | [optional] |
| **objectId** | [**List&lt;UUID&gt;**](UUID.md)| Comma-separated list of object IDs. | [optional] |
| **tag** | [**List&lt;String&gt;**](String.md)| Comma-separated list of tags. | [optional] |
| **tokenId** | [**List&lt;String&gt;**](String.md)| Comma-separated list of token IDs. | [optional] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;deleted&#x60; – update only deleted tokens.  | [optional] |
| **adhocReason** | **String**| An ad-hoc reason for accessing the Vault data. | [optional] |
| **reloadCache** | **Boolean**| Reloads the cache before the action. | [optional] |

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
| **404** | The collection, token, or referenced object or property was not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |


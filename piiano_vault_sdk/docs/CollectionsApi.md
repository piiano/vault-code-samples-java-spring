# CollectionsApi

All URIs are relative to *http://localhost:8123*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollection**](CollectionsApi.md#addCollection) | **POST** /api/pvlt/1.0/ctl/collections | Add collection |
| [**addCollectionProperty**](CollectionsApi.md#addCollectionProperty) | **POST** /api/pvlt/1.0/ctl/collections/{collection}/properties/{property} | Add collection property |
| [**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /api/pvlt/1.0/ctl/collections/{collection} | Delete collection |
| [**deleteCollectionProperty**](CollectionsApi.md#deleteCollectionProperty) | **DELETE** /api/pvlt/1.0/ctl/collections/{collection}/properties/{property} | Delete collection property |
| [**getAllCollections**](CollectionsApi.md#getAllCollections) | **GET** /api/pvlt/1.0/ctl/collections | List collections |
| [**getCollection**](CollectionsApi.md#getCollection) | **GET** /api/pvlt/1.0/ctl/collections/{collection} | Get collection details |
| [**getCollectionProperty**](CollectionsApi.md#getCollectionProperty) | **GET** /api/pvlt/1.0/ctl/collections/{collection}/properties/{property} | Get collection property |
| [**listCollectionProperties**](CollectionsApi.md#listCollectionProperties) | **GET** /api/pvlt/1.0/ctl/collections/{collection}/properties | List collection properties |
| [**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /api/pvlt/1.0/ctl/collections/{collection} | Update collection details |
| [**updateCollectionProperty**](CollectionsApi.md#updateCollectionProperty) | **PATCH** /api/pvlt/1.0/ctl/collections/{collection}/properties/{property} | Update collection property |


<a name="addCollection"></a>
# **addCollection**
> ModelsCollection addCollection(modelsCollection, format, options)

Add collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    ModelsCollection modelsCollection = new ModelsCollection(); // ModelsCollection | Details of the collection including its properties.
    String format = "pvschema"; // String | When set to `pvschema`, returns the collection in the PVSchema format. Otherwise, returns the JSON format.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `show_builtins` – show built-in properties from response. 
    try {
      ModelsCollection result = apiInstance.addCollection(modelsCollection, format, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#addCollection");
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
| **modelsCollection** | [**ModelsCollection**](ModelsCollection.md)| Details of the collection including its properties. | |
| **format** | **String**| When set to &#x60;pvschema&#x60;, returns the collection in the PVSchema format. Otherwise, returns the JSON format. | [optional] [default to json] [enum: pvschema, json] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;show_builtins&#x60; – show built-in properties from response.  | [optional] [enum: show_builtins] |

### Return type

[**ModelsCollection**](ModelsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/pvschema
 - **Accept**: application/json, application/pvschema

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

<a name="addCollectionProperty"></a>
# **addCollectionProperty**
> ModelsProperty addCollectionProperty(collection, property, modelsProperty)

Add collection property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection to add the property to.
    String property = "property_example"; // String | The name of the property to add.
    ModelsProperty modelsProperty = new ModelsProperty(); // ModelsProperty | Details of the property.
    try {
      ModelsProperty result = apiInstance.addCollectionProperty(collection, property, modelsProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#addCollectionProperty");
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
| **collection** | **String**| The name of the collection to add the property to. | |
| **property** | **String**| The name of the property to add. | |
| **modelsProperty** | [**ModelsProperty**](ModelsProperty.md)| Details of the property. | |

### Return type

[**ModelsProperty**](ModelsProperty.md)

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
| **404** | The collection isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(collection)

Delete collection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection.
    try {
      apiInstance.deleteCollection(collection);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#deleteCollection");
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
| **collection** | **String**| The name of the collection. | |

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
| **404** | The collection is not found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="deleteCollectionProperty"></a>
# **deleteCollectionProperty**
> deleteCollectionProperty(collection, property)

Delete collection property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the property.
    String property = "property_example"; // String | The name of the property.
    try {
      apiInstance.deleteCollectionProperty(collection, property);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#deleteCollectionProperty");
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
| **collection** | **String**| The name of the collection containing the property. | |
| **property** | **String**| The name of the property. | |

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
| **404** | The collection or property wasn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getAllCollections"></a>
# **getAllCollections**
> List&lt;ModelsCollection&gt; getAllCollections(format, options)

List collections

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String format = "pvschema"; // String | When set to `pvschema`, returns the collection in the PVSchema format. Otherwise, returns the JSON format.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `show_builtins` – show built-in properties from response. 
    try {
      List<ModelsCollection> result = apiInstance.getAllCollections(format, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getAllCollections");
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
| **format** | **String**| When set to &#x60;pvschema&#x60;, returns the collection in the PVSchema format. Otherwise, returns the JSON format. | [optional] [default to json] [enum: pvschema, json] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;show_builtins&#x60; – show built-in properties from response.  | [optional] [enum: show_builtins] |

### Return type

[**List&lt;ModelsCollection&gt;**](ModelsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pvschema

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

<a name="getCollection"></a>
# **getCollection**
> ModelsCollection getCollection(collection, format, options)

Get collection details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection.
    String format = "pvschema"; // String | When set to `pvschema`, returns the collection in the PVSchema format. Otherwise, returns the JSON format.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `show_builtins` – show built-in properties from response. 
    try {
      ModelsCollection result = apiInstance.getCollection(collection, format, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getCollection");
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
| **collection** | **String**| The name of the collection. | |
| **format** | **String**| When set to &#x60;pvschema&#x60;, returns the collection in the PVSchema format. Otherwise, returns the JSON format. | [optional] [default to json] [enum: pvschema, json] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;show_builtins&#x60; – show built-in properties from response.  | [optional] [enum: show_builtins] |

### Return type

[**ModelsCollection**](ModelsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pvschema

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="getCollectionProperty"></a>
# **getCollectionProperty**
> ModelsProperty getCollectionProperty(collection, property)

Get collection property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The ID of the collection containing the property.
    String property = "property_example"; // String | The name of the property.
    try {
      ModelsProperty result = apiInstance.getCollectionProperty(collection, property);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getCollectionProperty");
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
| **collection** | **String**| The ID of the collection containing the property. | |
| **property** | **String**| The name of the property. | |

### Return type

[**ModelsProperty**](ModelsProperty.md)

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
| **404** | The collection or property wasn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="listCollectionProperties"></a>
# **listCollectionProperties**
> List&lt;ModelsProperty&gt; listCollectionProperties(collection, options)

List collection properties

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the properties.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include:  - `show_builtins` – show built-in properties from response. 
    try {
      List<ModelsProperty> result = apiInstance.listCollectionProperties(collection, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#listCollectionProperties");
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
| **collection** | **String**| The name of the collection containing the properties. | |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include:  - &#x60;show_builtins&#x60; – show built-in properties from response.  | [optional] [enum: show_builtins] |

### Return type

[**List&lt;ModelsProperty&gt;**](ModelsProperty.md)

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
| **404** | The collection isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="updateCollection"></a>
# **updateCollection**
> ModelsCollection updateCollection(collection, modelsCollection, format, options)

Update collection details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection to import the properties to.
    ModelsCollection modelsCollection = new ModelsCollection(); // ModelsCollection | Details of the collection including its properties.
    String format = "pvschema"; // String | When set to `pvschema`, returns the collection in the PVSchema format. Otherwise, returns the JSON format.
    List<String> options = Arrays.asList(); // List<String> | Options for the operation. Options include: - `show_builtins` – show built-in properties from response. 
    try {
      ModelsCollection result = apiInstance.updateCollection(collection, modelsCollection, format, options);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollection");
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
| **collection** | **String**| The name of the collection to import the properties to. | |
| **modelsCollection** | [**ModelsCollection**](ModelsCollection.md)| Details of the collection including its properties. | |
| **format** | **String**| When set to &#x60;pvschema&#x60;, returns the collection in the PVSchema format. Otherwise, returns the JSON format. | [optional] [default to json] [enum: pvschema, json] |
| **options** | [**List&lt;String&gt;**](String.md)| Options for the operation. Options include: - &#x60;show_builtins&#x60; – show built-in properties from response.  | [optional] [enum: show_builtins] |

### Return type

[**ModelsCollection**](ModelsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/pvschema
 - **Accept**: application/json, application/pvschema

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is successful. |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection isn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **501** | Not implemented. |  -  |
| **503** | The service is unavailable. |  -  |

<a name="updateCollectionProperty"></a>
# **updateCollectionProperty**
> updateCollectionProperty(collection, property, modelsProperty)

Update collection property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8123");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collection = "collection_example"; // String | The name of the collection containing the property.
    String property = "property_example"; // String | The name of the property.
    ModelsProperty modelsProperty = new ModelsProperty(); // ModelsProperty | property info
    try {
      apiInstance.updateCollectionProperty(collection, property, modelsProperty);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollectionProperty");
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
| **collection** | **String**| The name of the collection containing the property. | |
| **property** | **String**| The name of the property. | |
| **modelsProperty** | [**ModelsProperty**](ModelsProperty.md)| property info | |

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
| **200** | Property updated successfully |  -  |
| **400** | The request is invalid. |  -  |
| **401** | Authentication credentials are incorrect or missing. |  -  |
| **403** | The caller doesn&#39;t have the required access rights. |  -  |
| **404** | The collection or property wasn&#39;t found. |  -  |
| **500** | An error occurred on the server. |  -  |
| **501** | Not implemented. |  -  |
| **503** | The service is unavailable. |  -  |


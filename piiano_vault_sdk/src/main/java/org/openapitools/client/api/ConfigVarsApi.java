/*
 * Piiano Vault REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ModelsConfVar;
import org.openapitools.client.model.ModelsConfVarValue;
import org.openapitools.client.model.RestHTTPError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ConfigVarsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConfigVarsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConfigVarsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for clearAllConfVars
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllConfVarsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/pvlt/1.0/system/confvar";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clearAllConfVarsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = clearAllConfVarsCall(_callback);
        return localVarCall;

    }

    /**
     * Clear configuration variables
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public void clearAllConfVars() throws ApiException {
        clearAllConfVarsWithHttpInfo();
    }

    /**
     * Clear configuration variables
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> clearAllConfVarsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = clearAllConfVarsValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Clear configuration variables (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllConfVarsAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearAllConfVarsValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConfVar
     * @param name The name of the configuration variable. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfVarCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/pvlt/1.0/system/confvar/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConfVarValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getConfVar(Async)");
        }
        

        okhttp3.Call localVarCall = getConfVarCall(name, _callback);
        return localVarCall;

    }

    /**
     * Get configuration variable
     * 
     * @param name The name of the configuration variable. (required)
     * @return ModelsConfVar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public ModelsConfVar getConfVar(String name) throws ApiException {
        ApiResponse<ModelsConfVar> localVarResp = getConfVarWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Get configuration variable
     * 
     * @param name The name of the configuration variable. (required)
     * @return ApiResponse&lt;ModelsConfVar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelsConfVar> getConfVarWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = getConfVarValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<ModelsConfVar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get configuration variable (asynchronously)
     * 
     * @param name The name of the configuration variable. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getConfVarAsync(String name, final ApiCallback<ModelsConfVar> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfVarValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<ModelsConfVar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setConfVar
     * @param name The name of the configuration variable. (required)
     * @param modelsConfVarValue Value of the configuration. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setConfVarCall(String name, ModelsConfVarValue modelsConfVarValue, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = modelsConfVarValue;

        // create path and map variables
        String localVarPath = "/api/pvlt/1.0/system/confvar/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setConfVarValidateBeforeCall(String name, ModelsConfVarValue modelsConfVarValue, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling setConfVar(Async)");
        }
        
        // verify the required parameter 'modelsConfVarValue' is set
        if (modelsConfVarValue == null) {
            throw new ApiException("Missing the required parameter 'modelsConfVarValue' when calling setConfVar(Async)");
        }
        

        okhttp3.Call localVarCall = setConfVarCall(name, modelsConfVarValue, _callback);
        return localVarCall;

    }

    /**
     * Set configuration variable
     * 
     * @param name The name of the configuration variable. (required)
     * @param modelsConfVarValue Value of the configuration. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public void setConfVar(String name, ModelsConfVarValue modelsConfVarValue) throws ApiException {
        setConfVarWithHttpInfo(name, modelsConfVarValue);
    }

    /**
     * Set configuration variable
     * 
     * @param name The name of the configuration variable. (required)
     * @param modelsConfVarValue Value of the configuration. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> setConfVarWithHttpInfo(String name, ModelsConfVarValue modelsConfVarValue) throws ApiException {
        okhttp3.Call localVarCall = setConfVarValidateBeforeCall(name, modelsConfVarValue, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Set configuration variable (asynchronously)
     * 
     * @param name The name of the configuration variable. (required)
     * @param modelsConfVarValue Value of the configuration. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The caller doesn&#39;t have the required access rights. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource is not found. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error occurred on the server. </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> The service is unavailable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setConfVarAsync(String name, ModelsConfVarValue modelsConfVarValue, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = setConfVarValidateBeforeCall(name, modelsConfVarValue, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}

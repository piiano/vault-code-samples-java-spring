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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ConfigService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ConfigService {
  public static final String SERIALIZED_NAME_ADMIN_API_KEY = "admin_api_key";
  @SerializedName(SERIALIZED_NAME_ADMIN_API_KEY)
  private String adminApiKey;

  public static final String SERIALIZED_NAME_ADMIN_MAY_READ_DATA = "admin_may_read_data";
  @SerializedName(SERIALIZED_NAME_ADMIN_MAY_READ_DATA)
  private Boolean adminMayReadData;

  public static final String SERIALIZED_NAME_DEFAULT_PAGE_SIZE = "default_page_size";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAGE_SIZE)
  private Integer defaultPageSize;

  public static final String SERIALIZED_NAME_FORCE_ACCESS_REASON = "force_access_reason";
  @SerializedName(SERIALIZED_NAME_FORCE_ACCESS_REASON)
  private Boolean forceAccessReason;

  public static final String SERIALIZED_NAME_LISTEN_ADDR = "listen_addr";
  @SerializedName(SERIALIZED_NAME_LISTEN_ADDR)
  private String listenAddr;

  public static final String SERIALIZED_NAME_MAX_PAGE_SIZE = "max_page_size";
  @SerializedName(SERIALIZED_NAME_MAX_PAGE_SIZE)
  private Integer maxPageSize;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeout_seconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private BigDecimal timeoutSeconds;

  public static final String SERIALIZED_NAME_CACHE_REFRESH_INTERVAL_SECONDS = "cache_refresh_interval_seconds";
  @SerializedName(SERIALIZED_NAME_CACHE_REFRESH_INTERVAL_SECONDS)
  private BigDecimal cacheRefreshIntervalSeconds;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;

  public ConfigService() {
  }

  public ConfigService adminApiKey(String adminApiKey) {
    
    this.adminApiKey = adminApiKey;
    return this;
  }

   /**
   * Get adminApiKey
   * @return adminApiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdminApiKey() {
    return adminApiKey;
  }


  public void setAdminApiKey(String adminApiKey) {
    this.adminApiKey = adminApiKey;
  }


  public ConfigService adminMayReadData(Boolean adminMayReadData) {
    
    this.adminMayReadData = adminMayReadData;
    return this;
  }

   /**
   * Get adminMayReadData
   * @return adminMayReadData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdminMayReadData() {
    return adminMayReadData;
  }


  public void setAdminMayReadData(Boolean adminMayReadData) {
    this.adminMayReadData = adminMayReadData;
  }


  public ConfigService defaultPageSize(Integer defaultPageSize) {
    
    this.defaultPageSize = defaultPageSize;
    return this;
  }

   /**
   * Get defaultPageSize
   * @return defaultPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDefaultPageSize() {
    return defaultPageSize;
  }


  public void setDefaultPageSize(Integer defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
  }


  public ConfigService forceAccessReason(Boolean forceAccessReason) {
    
    this.forceAccessReason = forceAccessReason;
    return this;
  }

   /**
   * Get forceAccessReason
   * @return forceAccessReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForceAccessReason() {
    return forceAccessReason;
  }


  public void setForceAccessReason(Boolean forceAccessReason) {
    this.forceAccessReason = forceAccessReason;
  }


  public ConfigService listenAddr(String listenAddr) {
    
    this.listenAddr = listenAddr;
    return this;
  }

   /**
   * Get listenAddr
   * @return listenAddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListenAddr() {
    return listenAddr;
  }


  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }


  public ConfigService maxPageSize(Integer maxPageSize) {
    
    this.maxPageSize = maxPageSize;
    return this;
  }

   /**
   * Get maxPageSize
   * @return maxPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxPageSize() {
    return maxPageSize;
  }


  public void setMaxPageSize(Integer maxPageSize) {
    this.maxPageSize = maxPageSize;
  }


  public ConfigService timeoutSeconds(BigDecimal timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(BigDecimal timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  public ConfigService cacheRefreshIntervalSeconds(BigDecimal cacheRefreshIntervalSeconds) {
    
    this.cacheRefreshIntervalSeconds = cacheRefreshIntervalSeconds;
    return this;
  }

   /**
   * Get cacheRefreshIntervalSeconds
   * @return cacheRefreshIntervalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCacheRefreshIntervalSeconds() {
    return cacheRefreshIntervalSeconds;
  }


  public void setCacheRefreshIntervalSeconds(BigDecimal cacheRefreshIntervalSeconds) {
    this.cacheRefreshIntervalSeconds = cacheRefreshIntervalSeconds;
  }


  public ConfigService license(String license) {
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicense() {
    return license;
  }


  public void setLicense(String license) {
    this.license = license;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigService configService = (ConfigService) o;
    return Objects.equals(this.adminApiKey, configService.adminApiKey) &&
        Objects.equals(this.adminMayReadData, configService.adminMayReadData) &&
        Objects.equals(this.defaultPageSize, configService.defaultPageSize) &&
        Objects.equals(this.forceAccessReason, configService.forceAccessReason) &&
        Objects.equals(this.listenAddr, configService.listenAddr) &&
        Objects.equals(this.maxPageSize, configService.maxPageSize) &&
        Objects.equals(this.timeoutSeconds, configService.timeoutSeconds) &&
        Objects.equals(this.cacheRefreshIntervalSeconds, configService.cacheRefreshIntervalSeconds) &&
        Objects.equals(this.license, configService.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminApiKey, adminMayReadData, defaultPageSize, forceAccessReason, listenAddr, maxPageSize, timeoutSeconds, cacheRefreshIntervalSeconds, license);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigService {\n");
    sb.append("    adminApiKey: ").append(toIndentedString(adminApiKey)).append("\n");
    sb.append("    adminMayReadData: ").append(toIndentedString(adminMayReadData)).append("\n");
    sb.append("    defaultPageSize: ").append(toIndentedString(defaultPageSize)).append("\n");
    sb.append("    forceAccessReason: ").append(toIndentedString(forceAccessReason)).append("\n");
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    maxPageSize: ").append(toIndentedString(maxPageSize)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    cacheRefreshIntervalSeconds: ").append(toIndentedString(cacheRefreshIntervalSeconds)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("admin_api_key");
    openapiFields.add("admin_may_read_data");
    openapiFields.add("default_page_size");
    openapiFields.add("force_access_reason");
    openapiFields.add("listen_addr");
    openapiFields.add("max_page_size");
    openapiFields.add("timeout_seconds");
    openapiFields.add("cache_refresh_interval_seconds");
    openapiFields.add("license");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigService
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigService.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigService is not found in the empty JSON string", ConfigService.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigService.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigService` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("admin_api_key") != null && !jsonObj.get("admin_api_key").isJsonNull()) && !jsonObj.get("admin_api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin_api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin_api_key").toString()));
      }
      if ((jsonObj.get("listen_addr") != null && !jsonObj.get("listen_addr").isJsonNull()) && !jsonObj.get("listen_addr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listen_addr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listen_addr").toString()));
      }
      if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) && !jsonObj.get("license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigService.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigService' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigService> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigService.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigService>() {
           @Override
           public void write(JsonWriter out, ConfigService value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigService read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigService given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigService
  * @throws IOException if the JSON string is invalid with respect to ConfigService
  */
  public static ConfigService fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigService.class);
  }

 /**
  * Convert an instance of ConfigService to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


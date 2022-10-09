package com.piiano.connector;

import com.google.common.collect.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.ObjectsApi;
import org.openapitools.client.api.TokensApi;
import org.openapitools.client.model.*;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public class PiianoVaultConnector {

    public static final String USERS = "users";
    public static final String REASON = "AppFunctionality";
    public static final String ADHOC_REASON = "";
    public static final String TTL = ""; // String | Token time to live (TTL) in seconds. If not set, the default TTL is used. See the `PVAULT_TTL_TOKENS` time to live environment variable.
    public static final Integer PAGE_SIZE = 100; // String | Token time to live (TTL) in seconds. If not set, the default TTL is used. See the `PVAULT_TTL_TOKENS` time to live environment variable.
    public static final Boolean RELOAD_CACHE = false; // Boolean | Reloads the cache before the action.

    public static UUID createObject(String email) {
        ApiClient pvaultClient = getApiClient();

        ObjectsApi objectsApi = new ObjectsApi(pvaultClient);

        Map<String, Object> fields = new HashMap<>();
        fields.put("email", email);
        UUID id;
        try {
            ModelsObjectID objectID = objectsApi.addObject(USERS, REASON, fields, ADHOC_REASON, RELOAD_CACHE, TTL);
            id = objectID.getId();
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        return id;
    }

    public static List<UUID> findObject(String email) {
        ApiClient pvaultClient = getApiClient();

        ObjectsApi objectsApi = new ObjectsApi(pvaultClient);

        List<UUID> objectIds;
        try {
            ModelsQuery modelsQuery = new ModelsQuery();
            modelsQuery.setMatch(Collections.singletonMap("email", email));
            ModelsObjectFieldsPage objectIdsPage =
                    objectsApi.searchObjects(USERS, REASON, modelsQuery, ADHOC_REASON,
                            RELOAD_CACHE, PAGE_SIZE, "", emptyList(), ImmutableList.of("_id"));
            objectIds = objectIdsPage.getResults().stream().map(props -> UUID.fromString((String)props.get("_id")))
                    .collect(Collectors.toList());
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        return objectIds;
    }

    public static String tokenize(UUID id) {
        // Create configuration, bearer auth and client API
        ApiClient pvaultClient = getApiClient();

        TokensApi tokensApi = new TokensApi(pvaultClient);

        ModelsTokenizeRequest body = new ModelsTokenizeRequest(); // ModelsTokenizeRequest | Details of the object and property.
        body.addObjectIdsItem(id);
        body.addPropsItem("email");
        body.setType(ModelsTokenizeRequest.TypeEnum.VALUE);
        body.setReuseTokenId(true);
        String output = "";
        try {
            List<ModelsTokenValue> result = tokensApi.tokenize(USERS, REASON, body, TTL, ADHOC_REASON, RELOAD_CACHE);
            output = result.get(0).getTokenId();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#tokenize");
            e.printStackTrace();
        }
        return output;
    }

    public static String detokenize(String token) {
        // Create configuration, bearer auth and client API
        ApiClient pvaultClient = getApiClient();

        TokensApi tokensApi = new TokensApi(pvaultClient);
        List<String> tokenIds = new ArrayList<>();
        tokenIds.add(token);

        String output = "";
        try {
            List<ModelsDetokenizedToken> detokenize = tokensApi.detokenize(USERS, REASON, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), tokenIds, ADHOC_REASON, RELOAD_CACHE);
            output = (String)detokenize.get(0).getFields().get("email");
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#tokenize");
            e.printStackTrace();
        }
        return output;
    }

    @NotNull
    private static ApiClient getApiClient() {
        // Create configuration, bearer auth and client API
        ApiClient pvaultClient = Configuration.getDefaultApiClient();
        pvaultClient.setBasePath("http://localhost:8123");
        pvaultClient.setBearerToken("pvaultauth");
        pvaultClient.addDefaultHeader("Content-Type", "application/json");
        return pvaultClient;
    }
}

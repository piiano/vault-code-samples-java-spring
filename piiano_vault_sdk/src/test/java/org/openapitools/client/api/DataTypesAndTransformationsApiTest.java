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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ModelsTransformationDoc;
import org.openapitools.client.model.PiitypePIIType;
import org.openapitools.client.model.RestHTTPError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataTypesAndTransformationsApi
 */
@Disabled
public class DataTypesAndTransformationsApiTest {

    private final DataTypesAndTransformationsApi api = new DataTypesAndTransformationsApi();

    /**
     * List property types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPropertyTypesTest() throws ApiException {
        List<PiitypePIIType> response = api.listPropertyTypes();
        // TODO: test validations
    }

    /**
     * List transformations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTransformationsTest() throws ApiException {
        List<ModelsTransformationDoc> response = api.listTransformations();
        // TODO: test validations
    }

}

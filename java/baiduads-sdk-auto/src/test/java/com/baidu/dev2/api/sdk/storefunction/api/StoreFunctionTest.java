/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.storefunction.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.storefunction.model.GetStoreListFromCompanyRequestWrapper;
import com.baidu.dev2.api.sdk.storefunction.model.GetStoreListFromCompanyResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreFunction
 */
@Ignore
public class StoreFunctionTest {

    private final StoreFunction api = new StoreFunction();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreListFromCompanyTest() throws ApiException {
        GetStoreListFromCompanyRequestWrapper getStoreListFromCompanyRequestWrapper = null;
        GetStoreListFromCompanyResponseWrapper response = api.getStoreListFromCompany(getStoreListFromCompanyRequestWrapper);

        // TODO: test validations
    }
}
/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 * The version of the OpenAPI document: 1.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.account.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.account.model.GetAccountInfoRequestWrapper;
import com.baidu.dev2.api.sdk.account.model.GetAccountInfoResponseWrapper;
import com.baidu.dev2.api.sdk.account.model.UpdateAccountInfoRequestWrapper;
import com.baidu.dev2.api.sdk.account.model.UpdateAccountInfoResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountService
 */
@Ignore
public class AccountServiceTest {

    private final AccountService api = new AccountService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountInfoTest() throws ApiException {
        GetAccountInfoRequestWrapper getAccountInfoRequestWrapper = null;
        GetAccountInfoResponseWrapper response = api.getAccountInfo(getAccountInfoRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountInfoTest() throws ApiException {
        UpdateAccountInfoRequestWrapper updateAccountInfoRequestWrapper = null;
        UpdateAccountInfoResponseWrapper response = api.updateAccountInfo(updateAccountInfoRequestWrapper);

        // TODO: test validations
    }
}
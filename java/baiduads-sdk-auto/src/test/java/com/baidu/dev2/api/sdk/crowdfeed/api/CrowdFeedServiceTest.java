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


package com.baidu.dev2.api.sdk.crowdfeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetBindAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetBindAdgroupResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrowdFeedService
 */
@Ignore
public class CrowdFeedServiceTest {

    private final CrowdFeedService api = new CrowdFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBindAdgroupTest() throws ApiException {
        GetBindAdgroupRequestWrapper getBindAdgroupRequestWrapper = null;
        GetBindAdgroupResponseWrapper response = api.getBindAdgroup(getBindAdgroupRequestWrapper);

        // TODO: test validations
    }
}
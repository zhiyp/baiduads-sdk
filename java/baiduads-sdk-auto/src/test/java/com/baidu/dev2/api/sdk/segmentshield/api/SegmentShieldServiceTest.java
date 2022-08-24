/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.segmentshield.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.segmentshield.model.AddSegmentShieldRequestWrapper;
import com.baidu.dev2.api.sdk.segmentshield.model.AddSegmentShieldResponseWrapper;
import com.baidu.dev2.api.sdk.segmentshield.model.GetSegmentShieldPageRequestWrapper;
import com.baidu.dev2.api.sdk.segmentshield.model.GetSegmentShieldPageResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentShieldService
 */
@Ignore
public class SegmentShieldServiceTest {

    private final SegmentShieldService api = new SegmentShieldService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSegmentShieldTest() throws ApiException {
        AddSegmentShieldRequestWrapper addSegmentShieldRequestWrapper = null;
        AddSegmentShieldResponseWrapper response = api.addSegmentShield(addSegmentShieldRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentShieldPageTest() throws ApiException {
        GetSegmentShieldPageRequestWrapper getSegmentShieldPageRequestWrapper = null;
        GetSegmentShieldPageResponseWrapper response = api.getSegmentShieldPage(getSegmentShieldPageRequestWrapper);

        // TODO: test validations
    }
}
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


package com.baidu.dev2.api.sdk.productadskeyword.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.productadskeyword.model.AddWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.AddWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.DeleteWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.DeleteWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.GetPagedWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.GetPagedWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.PauseKeywordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.PauseKeywordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.StartKeywordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.StartKeywordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateMatchTypeRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateMatchTypeResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdatePriceRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdatePriceResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateTargetUrlRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateTargetUrlResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductAdsKeywordService
 */
@Ignore
public class ProductAdsKeywordServiceTest {

    private final ProductAdsKeywordService api = new ProductAdsKeywordService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWordTest() throws ApiException {
        AddWordRequestWrapper addWordRequestWrapper = null;
        AddWordResponseWrapper response = api.addWord(addWordRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWordTest() throws ApiException {
        DeleteWordRequestWrapper deleteWordRequestWrapper = null;
        DeleteWordResponseWrapper response = api.deleteWord(deleteWordRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagedWordTest() throws ApiException {
        GetPagedWordRequestWrapper getPagedWordRequestWrapper = null;
        GetPagedWordResponseWrapper response = api.getPagedWord(getPagedWordRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseKeywordTest() throws ApiException {
        PauseKeywordRequestWrapper pauseKeywordRequestWrapper = null;
        PauseKeywordResponseWrapper response = api.pauseKeyword(pauseKeywordRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startKeywordTest() throws ApiException {
        StartKeywordRequestWrapper startKeywordRequestWrapper = null;
        StartKeywordResponseWrapper response = api.startKeyword(startKeywordRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMatchTypeTest() throws ApiException {
        UpdateMatchTypeRequestWrapper updateMatchTypeRequestWrapper = null;
        UpdateMatchTypeResponseWrapper response = api.updateMatchType(updateMatchTypeRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePriceTest() throws ApiException {
        UpdatePriceRequestWrapper updatePriceRequestWrapper = null;
        UpdatePriceResponseWrapper response = api.updatePrice(updatePriceRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTargetUrlTest() throws ApiException {
        UpdateTargetUrlRequestWrapper updateTargetUrlRequestWrapper = null;
        UpdateTargetUrlResponseWrapper response = api.updateTargetUrl(updateTargetUrlRequestWrapper);

        // TODO: test validations
    }
}
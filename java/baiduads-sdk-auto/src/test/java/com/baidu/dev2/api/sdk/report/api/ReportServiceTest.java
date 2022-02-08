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


package com.baidu.dev2.api.sdk.report.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.report.model.GetProfessionalReportIdRequestWrapper;
import com.baidu.dev2.api.sdk.report.model.GetProfessionalReportIdResponseWrapper;
import com.baidu.dev2.api.sdk.report.model.GetRealTimeDataRequestWrapper;
import com.baidu.dev2.api.sdk.report.model.GetRealTimeDataResponseWrapper;
import com.baidu.dev2.api.sdk.report.model.GetRealTimeQueryDataRequestWrapper;
import com.baidu.dev2.api.sdk.report.model.GetRealTimeQueryDataResponseWrapper;
import com.baidu.dev2.api.sdk.report.model.GetReportFileUrlRequestWrapper;
import com.baidu.dev2.api.sdk.report.model.GetReportFileUrlResponseWrapper;
import com.baidu.dev2.api.sdk.report.model.GetReportStateRequestWrapper;
import com.baidu.dev2.api.sdk.report.model.GetReportStateResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportService
 */
@Ignore
public class ReportServiceTest {

    private final ReportService api = new ReportService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProfessionalReportIdTest() throws ApiException {
        GetProfessionalReportIdRequestWrapper getProfessionalReportIdRequestWrapper = null;
        GetProfessionalReportIdResponseWrapper response = api.getProfessionalReportId(getProfessionalReportIdRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRealTimeDataTest() throws ApiException {
        GetRealTimeDataRequestWrapper getRealTimeDataRequestWrapper = null;
        GetRealTimeDataResponseWrapper response = api.getRealTimeData(getRealTimeDataRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRealTimeQueryDataTest() throws ApiException {
        GetRealTimeQueryDataRequestWrapper getRealTimeQueryDataRequestWrapper = null;
        GetRealTimeQueryDataResponseWrapper response = api.getRealTimeQueryData(getRealTimeQueryDataRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportFileUrlTest() throws ApiException {
        GetReportFileUrlRequestWrapper getReportFileUrlRequestWrapper = null;
        GetReportFileUrlResponseWrapper response = api.getReportFileUrl(getReportFileUrlRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportStateTest() throws ApiException {
        GetReportStateRequestWrapper getReportStateRequestWrapper = null;
        GetReportStateResponseWrapper response = api.getReportState(getReportStateRequestWrapper);

        // TODO: test validations
    }
}
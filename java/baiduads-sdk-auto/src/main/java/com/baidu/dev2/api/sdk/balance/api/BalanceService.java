/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.balance.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.balance.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.balance.model.GetBalanceInfoRequestWrapper;
import com.baidu.dev2.api.sdk.balance.model.GetBalanceInfoResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BalanceService {
  private ApiClient apiClient;

  public BalanceService() {
    this(Configuration.getDefaultApiClient());
  }

  public BalanceService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param getBalanceInfoRequestWrapper  (required)
   * @return GetBalanceInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetBalanceInfoResponseWrapper getBalanceInfo(GetBalanceInfoRequestWrapper getBalanceInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = getBalanceInfoRequestWrapper;
    
    // verify the required parameter 'getBalanceInfoRequestWrapper' is set
    if (getBalanceInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getBalanceInfoRequestWrapper' when calling getBalanceInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/BalanceService/getBalanceInfo";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetBalanceInfoResponseWrapper> localVarReturnType = new TypeReference<GetBalanceInfoResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}

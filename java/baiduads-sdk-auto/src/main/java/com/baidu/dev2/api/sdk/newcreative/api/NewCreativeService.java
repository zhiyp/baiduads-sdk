/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.newcreative.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.newcreative.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.newcreative.model.AddCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.AddCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.AddCreativesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.AddCreativesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.AddDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.AddDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.BatSetRangeRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.BatSetRangeResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteCreativesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteCreativesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.DeleteDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetCreativesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetCreativesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetDpaMaterialTypesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetDpaMaterialTypesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetFormatTemplatesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.GetFormatTemplatesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateCreativesRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateCreativesResponseWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.newcreative.model.UpdateDpaCreativeResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewCreativeService {
  private ApiClient apiClient;

  public NewCreativeService() {
    this(Configuration.getDefaultApiClient());
  }

  public NewCreativeService(ApiClient apiClient) {
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
   * @param addCreativeGroupRequestWrapper  (required)
   * @return AddCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddCreativeGroupResponseWrapper addCreativeGroup(AddCreativeGroupRequestWrapper addCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = addCreativeGroupRequestWrapper;
    
    // verify the required parameter 'addCreativeGroupRequestWrapper' is set
    if (addCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addCreativeGroupRequestWrapper' when calling addCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/addCreativeGroup";

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

    TypeReference<AddCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<AddCreativeGroupResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param addCreativesRequestWrapper  (required)
   * @return AddCreativesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddCreativesResponseWrapper addCreatives(AddCreativesRequestWrapper addCreativesRequestWrapper) throws ApiException {
    Object localVarPostBody = addCreativesRequestWrapper;
    
    // verify the required parameter 'addCreativesRequestWrapper' is set
    if (addCreativesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addCreativesRequestWrapper' when calling addCreatives");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/addCreatives";

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

    TypeReference<AddCreativesResponseWrapper> localVarReturnType = new TypeReference<AddCreativesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param addDpaCreativeRequestWrapper  (required)
   * @return AddDpaCreativeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddDpaCreativeResponseWrapper addDpaCreative(AddDpaCreativeRequestWrapper addDpaCreativeRequestWrapper) throws ApiException {
    Object localVarPostBody = addDpaCreativeRequestWrapper;
    
    // verify the required parameter 'addDpaCreativeRequestWrapper' is set
    if (addDpaCreativeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addDpaCreativeRequestWrapper' when calling addDpaCreative");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/addDpaCreative";

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

    TypeReference<AddDpaCreativeResponseWrapper> localVarReturnType = new TypeReference<AddDpaCreativeResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param batSetRangeRequestWrapper  (required)
   * @return BatSetRangeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public BatSetRangeResponseWrapper batSetRange(BatSetRangeRequestWrapper batSetRangeRequestWrapper) throws ApiException {
    Object localVarPostBody = batSetRangeRequestWrapper;
    
    // verify the required parameter 'batSetRangeRequestWrapper' is set
    if (batSetRangeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'batSetRangeRequestWrapper' when calling batSetRange");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/batSetRange";

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

    TypeReference<BatSetRangeResponseWrapper> localVarReturnType = new TypeReference<BatSetRangeResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param deleteCreativeGroupRequestWrapper  (required)
   * @return DeleteCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteCreativeGroupResponseWrapper deleteCreativeGroup(DeleteCreativeGroupRequestWrapper deleteCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteCreativeGroupRequestWrapper;
    
    // verify the required parameter 'deleteCreativeGroupRequestWrapper' is set
    if (deleteCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteCreativeGroupRequestWrapper' when calling deleteCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/deleteCreativeGroup";

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

    TypeReference<DeleteCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<DeleteCreativeGroupResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param deleteCreativesRequestWrapper  (required)
   * @return DeleteCreativesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteCreativesResponseWrapper deleteCreatives(DeleteCreativesRequestWrapper deleteCreativesRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteCreativesRequestWrapper;
    
    // verify the required parameter 'deleteCreativesRequestWrapper' is set
    if (deleteCreativesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteCreativesRequestWrapper' when calling deleteCreatives");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/deleteCreatives";

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

    TypeReference<DeleteCreativesResponseWrapper> localVarReturnType = new TypeReference<DeleteCreativesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param deleteDpaCreativeRequestWrapper  (required)
   * @return DeleteDpaCreativeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteDpaCreativeResponseWrapper deleteDpaCreative(DeleteDpaCreativeRequestWrapper deleteDpaCreativeRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteDpaCreativeRequestWrapper;
    
    // verify the required parameter 'deleteDpaCreativeRequestWrapper' is set
    if (deleteDpaCreativeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteDpaCreativeRequestWrapper' when calling deleteDpaCreative");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/deleteDpaCreative";

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

    TypeReference<DeleteDpaCreativeResponseWrapper> localVarReturnType = new TypeReference<DeleteDpaCreativeResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getCreativeGroupRequestWrapper  (required)
   * @return GetCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativeGroupResponseWrapper getCreativeGroup(GetCreativeGroupRequestWrapper getCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativeGroupRequestWrapper;
    
    // verify the required parameter 'getCreativeGroupRequestWrapper' is set
    if (getCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativeGroupRequestWrapper' when calling getCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/getCreativeGroup";

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

    TypeReference<GetCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<GetCreativeGroupResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getCreativesRequestWrapper  (required)
   * @return GetCreativesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativesResponseWrapper getCreatives(GetCreativesRequestWrapper getCreativesRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativesRequestWrapper;
    
    // verify the required parameter 'getCreativesRequestWrapper' is set
    if (getCreativesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativesRequestWrapper' when calling getCreatives");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/getCreatives";

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

    TypeReference<GetCreativesResponseWrapper> localVarReturnType = new TypeReference<GetCreativesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getDpaCreativeRequestWrapper  (required)
   * @return GetDpaCreativeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetDpaCreativeResponseWrapper getDpaCreative(GetDpaCreativeRequestWrapper getDpaCreativeRequestWrapper) throws ApiException {
    Object localVarPostBody = getDpaCreativeRequestWrapper;
    
    // verify the required parameter 'getDpaCreativeRequestWrapper' is set
    if (getDpaCreativeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getDpaCreativeRequestWrapper' when calling getDpaCreative");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/getDpaCreative";

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

    TypeReference<GetDpaCreativeResponseWrapper> localVarReturnType = new TypeReference<GetDpaCreativeResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getDpaMaterialTypesRequestWrapper  (required)
   * @return GetDpaMaterialTypesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetDpaMaterialTypesResponseWrapper getDpaMaterialTypes(GetDpaMaterialTypesRequestWrapper getDpaMaterialTypesRequestWrapper) throws ApiException {
    Object localVarPostBody = getDpaMaterialTypesRequestWrapper;
    
    // verify the required parameter 'getDpaMaterialTypesRequestWrapper' is set
    if (getDpaMaterialTypesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getDpaMaterialTypesRequestWrapper' when calling getDpaMaterialTypes");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/getDpaMaterialTypes";

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

    TypeReference<GetDpaMaterialTypesResponseWrapper> localVarReturnType = new TypeReference<GetDpaMaterialTypesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getFormatTemplatesRequestWrapper  (required)
   * @return GetFormatTemplatesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetFormatTemplatesResponseWrapper getFormatTemplates(GetFormatTemplatesRequestWrapper getFormatTemplatesRequestWrapper) throws ApiException {
    Object localVarPostBody = getFormatTemplatesRequestWrapper;
    
    // verify the required parameter 'getFormatTemplatesRequestWrapper' is set
    if (getFormatTemplatesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getFormatTemplatesRequestWrapper' when calling getFormatTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/getFormatTemplates";

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

    TypeReference<GetFormatTemplatesResponseWrapper> localVarReturnType = new TypeReference<GetFormatTemplatesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param updateCreativeGroupRequestWrapper  (required)
   * @return UpdateCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateCreativeGroupResponseWrapper updateCreativeGroup(UpdateCreativeGroupRequestWrapper updateCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = updateCreativeGroupRequestWrapper;
    
    // verify the required parameter 'updateCreativeGroupRequestWrapper' is set
    if (updateCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCreativeGroupRequestWrapper' when calling updateCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/updateCreativeGroup";

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

    TypeReference<UpdateCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<UpdateCreativeGroupResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param updateCreativesRequestWrapper  (required)
   * @return UpdateCreativesResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateCreativesResponseWrapper updateCreatives(UpdateCreativesRequestWrapper updateCreativesRequestWrapper) throws ApiException {
    Object localVarPostBody = updateCreativesRequestWrapper;
    
    // verify the required parameter 'updateCreativesRequestWrapper' is set
    if (updateCreativesRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCreativesRequestWrapper' when calling updateCreatives");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/updateCreatives";

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

    TypeReference<UpdateCreativesResponseWrapper> localVarReturnType = new TypeReference<UpdateCreativesResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param updateDpaCreativeRequestWrapper  (required)
   * @return UpdateDpaCreativeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateDpaCreativeResponseWrapper updateDpaCreative(UpdateDpaCreativeRequestWrapper updateDpaCreativeRequestWrapper) throws ApiException {
    Object localVarPostBody = updateDpaCreativeRequestWrapper;
    
    // verify the required parameter 'updateDpaCreativeRequestWrapper' is set
    if (updateDpaCreativeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDpaCreativeRequestWrapper' when calling updateDpaCreative");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/NewCreativeService/updateDpaCreative";

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

    TypeReference<UpdateDpaCreativeResponseWrapper> localVarReturnType = new TypeReference<UpdateDpaCreativeResponseWrapper>() {};
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
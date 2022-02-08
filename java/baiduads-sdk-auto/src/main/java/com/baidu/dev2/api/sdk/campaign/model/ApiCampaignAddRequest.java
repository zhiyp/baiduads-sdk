/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaign.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.campaign.model.ApiCampaignType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiCampaignAddRequest
 */
@JsonPropertyOrder({
  ApiCampaignAddRequest.JSON_PROPERTY_CAMPAIGN_TYPES,
  ApiCampaignAddRequest.JSON_PROPERTY_AD_TYPE
})
@JsonTypeName("ApiCampaignAddRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiCampaignAddRequest {
  public static final String JSON_PROPERTY_CAMPAIGN_TYPES = "campaignTypes";
  private List<ApiCampaignType> campaignTypes = null;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public ApiCampaignAddRequest() { 
  }

  public ApiCampaignAddRequest campaignTypes(List<ApiCampaignType> campaignTypes) {
    
    this.campaignTypes = campaignTypes;
    return this;
  }

  public ApiCampaignAddRequest addCampaignTypesItem(ApiCampaignType campaignTypesItem) {
    if (this.campaignTypes == null) {
      this.campaignTypes = new ArrayList<>();
    }
    this.campaignTypes.add(campaignTypesItem);
    return this;
  }

   /**
   * Get campaignTypes
   * @return campaignTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiCampaignType> getCampaignTypes() {
    return campaignTypes;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignTypes(List<ApiCampaignType> campaignTypes) {
    this.campaignTypes = campaignTypes;
  }


  public ApiCampaignAddRequest adType(Integer adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(Integer adType) {
    this.adType = adType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCampaignAddRequest apiCampaignAddRequest = (ApiCampaignAddRequest) o;
    return Objects.equals(this.campaignTypes, apiCampaignAddRequest.campaignTypes) &&
        Objects.equals(this.adType, apiCampaignAddRequest.adType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignTypes, adType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCampaignAddRequest {\n");
    sb.append("    campaignTypes: ").append(toIndentedString(campaignTypes)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

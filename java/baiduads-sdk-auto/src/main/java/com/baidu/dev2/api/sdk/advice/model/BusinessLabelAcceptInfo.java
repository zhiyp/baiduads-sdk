/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.BusinessLabelType;
import com.baidu.dev2.api.sdk.advice.model.FieldFilter;
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
 * BusinessLabelAcceptInfo
 */
@JsonPropertyOrder({
  BusinessLabelAcceptInfo.JSON_PROPERTY_ITEMS,
  BusinessLabelAcceptInfo.JSON_PROPERTY_TOTAL_COUNT,
  BusinessLabelAcceptInfo.JSON_PROPERTY_CAMPAIGN_ID,
  BusinessLabelAcceptInfo.JSON_PROPERTY_CAMPAIGN_NAME,
  BusinessLabelAcceptInfo.JSON_PROPERTY_ADGROUP_ID,
  BusinessLabelAcceptInfo.JSON_PROPERTY_ADGROUP_NAME,
  BusinessLabelAcceptInfo.JSON_PROPERTY_MULTI_PRICE,
  BusinessLabelAcceptInfo.JSON_PROPERTY_PRICE,
  BusinessLabelAcceptInfo.JSON_PROPERTY_FILTERS
})
@JsonTypeName("BusinessLabelAcceptInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessLabelAcceptInfo {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<BusinessLabelType> items = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_MULTI_PRICE = "multiPrice";
  private String multiPrice;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FieldFilter> filters = null;

  public BusinessLabelAcceptInfo() { 
  }

  public BusinessLabelAcceptInfo items(List<BusinessLabelType> items) {
    
    this.items = items;
    return this;
  }

  public BusinessLabelAcceptInfo addItemsItem(BusinessLabelType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BusinessLabelType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<BusinessLabelType> items) {
    this.items = items;
  }


  public BusinessLabelAcceptInfo totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public BusinessLabelAcceptInfo campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BusinessLabelAcceptInfo campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BusinessLabelAcceptInfo adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public BusinessLabelAcceptInfo adgroupName(String adgroupName) {
    
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupName() {
    return adgroupName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }


  public BusinessLabelAcceptInfo multiPrice(String multiPrice) {
    
    this.multiPrice = multiPrice;
    return this;
  }

   /**
   * Get multiPrice
   * @return multiPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTI_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMultiPrice() {
    return multiPrice;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiPrice(String multiPrice) {
    this.multiPrice = multiPrice;
  }


  public BusinessLabelAcceptInfo price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public BusinessLabelAcceptInfo filters(List<FieldFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public BusinessLabelAcceptInfo addFiltersItem(FieldFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FieldFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FieldFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLabelAcceptInfo businessLabelAcceptInfo = (BusinessLabelAcceptInfo) o;
    return Objects.equals(this.items, businessLabelAcceptInfo.items) &&
        Objects.equals(this.totalCount, businessLabelAcceptInfo.totalCount) &&
        Objects.equals(this.campaignId, businessLabelAcceptInfo.campaignId) &&
        Objects.equals(this.campaignName, businessLabelAcceptInfo.campaignName) &&
        Objects.equals(this.adgroupId, businessLabelAcceptInfo.adgroupId) &&
        Objects.equals(this.adgroupName, businessLabelAcceptInfo.adgroupName) &&
        Objects.equals(this.multiPrice, businessLabelAcceptInfo.multiPrice) &&
        Objects.equals(this.price, businessLabelAcceptInfo.price) &&
        Objects.equals(this.filters, businessLabelAcceptInfo.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount, campaignId, campaignName, adgroupId, adgroupName, multiPrice, price, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLabelAcceptInfo {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    multiPrice: ").append(toIndentedString(multiPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

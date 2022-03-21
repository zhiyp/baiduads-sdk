/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.danubecreativegroup.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DanubeMaterialType;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.TradeVo;
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
 * ConstantResponse
 */
@JsonPropertyOrder({
  ConstantResponse.JSON_PROPERTY_NAV_LABEL_MAP_BY_TRADE,
  ConstantResponse.JSON_PROPERTY_TRADE_LIST,
  ConstantResponse.JSON_PROPERTY_CATEGORY_LIST,
  ConstantResponse.JSON_PROPERTY_MATERIAL_TYPES
})
@JsonTypeName("ConstantResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConstantResponse {
  public static final String JSON_PROPERTY_NAV_LABEL_MAP_BY_TRADE = "navLabelMapByTrade";
  private java.util.Map navLabelMapByTrade;

  public static final String JSON_PROPERTY_TRADE_LIST = "tradeList";
  private List<TradeVo> tradeList = null;

  public static final String JSON_PROPERTY_CATEGORY_LIST = "categoryList";
  private List<TradeVo> categoryList = null;

  public static final String JSON_PROPERTY_MATERIAL_TYPES = "materialTypes";
  private List<DanubeMaterialType> materialTypes = null;

  public ConstantResponse() { 
  }

  public ConstantResponse navLabelMapByTrade(java.util.Map navLabelMapByTrade) {
    
    this.navLabelMapByTrade = navLabelMapByTrade;
    return this;
  }

   /**
   * Get navLabelMapByTrade
   * @return navLabelMapByTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAV_LABEL_MAP_BY_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map getNavLabelMapByTrade() {
    return navLabelMapByTrade;
  }


  @JsonProperty(JSON_PROPERTY_NAV_LABEL_MAP_BY_TRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNavLabelMapByTrade(java.util.Map navLabelMapByTrade) {
    this.navLabelMapByTrade = navLabelMapByTrade;
  }


  public ConstantResponse tradeList(List<TradeVo> tradeList) {
    
    this.tradeList = tradeList;
    return this;
  }

  public ConstantResponse addTradeListItem(TradeVo tradeListItem) {
    if (this.tradeList == null) {
      this.tradeList = new ArrayList<>();
    }
    this.tradeList.add(tradeListItem);
    return this;
  }

   /**
   * Get tradeList
   * @return tradeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TradeVo> getTradeList() {
    return tradeList;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeList(List<TradeVo> tradeList) {
    this.tradeList = tradeList;
  }


  public ConstantResponse categoryList(List<TradeVo> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public ConstantResponse addCategoryListItem(TradeVo categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * Get categoryList
   * @return categoryList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TradeVo> getCategoryList() {
    return categoryList;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryList(List<TradeVo> categoryList) {
    this.categoryList = categoryList;
  }


  public ConstantResponse materialTypes(List<DanubeMaterialType> materialTypes) {
    
    this.materialTypes = materialTypes;
    return this;
  }

  public ConstantResponse addMaterialTypesItem(DanubeMaterialType materialTypesItem) {
    if (this.materialTypes == null) {
      this.materialTypes = new ArrayList<>();
    }
    this.materialTypes.add(materialTypesItem);
    return this;
  }

   /**
   * Get materialTypes
   * @return materialTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DanubeMaterialType> getMaterialTypes() {
    return materialTypes;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialTypes(List<DanubeMaterialType> materialTypes) {
    this.materialTypes = materialTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstantResponse constantResponse = (ConstantResponse) o;
    return Objects.equals(this.navLabelMapByTrade, constantResponse.navLabelMapByTrade) &&
        Objects.equals(this.tradeList, constantResponse.tradeList) &&
        Objects.equals(this.categoryList, constantResponse.categoryList) &&
        Objects.equals(this.materialTypes, constantResponse.materialTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(navLabelMapByTrade, tradeList, categoryList, materialTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstantResponse {\n");
    sb.append("    navLabelMapByTrade: ").append(toIndentedString(navLabelMapByTrade)).append("\n");
    sb.append("    tradeList: ").append(toIndentedString(tradeList)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    materialTypes: ").append(toIndentedString(materialTypes)).append("\n");
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

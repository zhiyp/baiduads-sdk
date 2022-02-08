/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.search.model;

import java.util.Objects;
import java.util.Arrays;
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
 * GetIdsByTabsParams
 */
@JsonPropertyOrder({
  GetIdsByTabsParams.JSON_PROPERTY_TAB_IDS,
  GetIdsByTabsParams.JSON_PROPERTY_ID_TYPE,
  GetIdsByTabsParams.JSON_PROPERTY_PAGE
})
@JsonTypeName("GetIdsByTabsParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetIdsByTabsParams {
  public static final String JSON_PROPERTY_TAB_IDS = "tabIds";
  private List<Integer> tabIds = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public GetIdsByTabsParams() { 
  }

  public GetIdsByTabsParams tabIds(List<Integer> tabIds) {
    
    this.tabIds = tabIds;
    return this;
  }

  public GetIdsByTabsParams addTabIdsItem(Integer tabIdsItem) {
    if (this.tabIds == null) {
      this.tabIds = new ArrayList<>();
    }
    this.tabIds.add(tabIdsItem);
    return this;
  }

   /**
   * Get tabIds
   * @return tabIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTabIds() {
    return tabIds;
  }


  @JsonProperty(JSON_PROPERTY_TAB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabIds(List<Integer> tabIds) {
    this.tabIds = tabIds;
  }


  public GetIdsByTabsParams idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  public GetIdsByTabsParams page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIdsByTabsParams getIdsByTabsParams = (GetIdsByTabsParams) o;
    return Objects.equals(this.tabIds, getIdsByTabsParams.tabIds) &&
        Objects.equals(this.idType, getIdsByTabsParams.idType) &&
        Objects.equals(this.page, getIdsByTabsParams.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabIds, idType, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIdsByTabsParams {\n");
    sb.append("    tabIds: ").append(toIndentedString(tabIds)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

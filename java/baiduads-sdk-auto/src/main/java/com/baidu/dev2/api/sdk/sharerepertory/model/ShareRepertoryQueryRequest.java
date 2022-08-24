/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.sharerepertory.model;

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
 * ShareRepertoryQueryRequest
 */
@JsonPropertyOrder({
  ShareRepertoryQueryRequest.JSON_PROPERTY_ORDER_BY,
  ShareRepertoryQueryRequest.JSON_PROPERTY_SHARE_REPERTORY_FIELDS,
  ShareRepertoryQueryRequest.JSON_PROPERTY_SHARE_REPERTORY_TYPE,
  ShareRepertoryQueryRequest.JSON_PROPERTY_LIMIT,
  ShareRepertoryQueryRequest.JSON_PROPERTY_DESC
})
@JsonTypeName("ShareRepertoryQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShareRepertoryQueryRequest {
  public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
  private String orderBy;

  public static final String JSON_PROPERTY_SHARE_REPERTORY_FIELDS = "shareRepertoryFields";
  private List<String> shareRepertoryFields = null;

  public static final String JSON_PROPERTY_SHARE_REPERTORY_TYPE = "shareRepertoryType";
  private Integer shareRepertoryType;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public static final String JSON_PROPERTY_DESC = "desc";
  private Boolean desc;

  public ShareRepertoryQueryRequest() { 
  }

  public ShareRepertoryQueryRequest orderBy(String orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderBy() {
    return orderBy;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  public ShareRepertoryQueryRequest shareRepertoryFields(List<String> shareRepertoryFields) {
    
    this.shareRepertoryFields = shareRepertoryFields;
    return this;
  }

  public ShareRepertoryQueryRequest addShareRepertoryFieldsItem(String shareRepertoryFieldsItem) {
    if (this.shareRepertoryFields == null) {
      this.shareRepertoryFields = new ArrayList<>();
    }
    this.shareRepertoryFields.add(shareRepertoryFieldsItem);
    return this;
  }

   /**
   * Get shareRepertoryFields
   * @return shareRepertoryFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getShareRepertoryFields() {
    return shareRepertoryFields;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareRepertoryFields(List<String> shareRepertoryFields) {
    this.shareRepertoryFields = shareRepertoryFields;
  }


  public ShareRepertoryQueryRequest shareRepertoryType(Integer shareRepertoryType) {
    
    this.shareRepertoryType = shareRepertoryType;
    return this;
  }

   /**
   * Get shareRepertoryType
   * @return shareRepertoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShareRepertoryType() {
    return shareRepertoryType;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_REPERTORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareRepertoryType(Integer shareRepertoryType) {
    this.shareRepertoryType = shareRepertoryType;
  }


  public ShareRepertoryQueryRequest limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public ShareRepertoryQueryRequest addLimitItem(Integer limitItem) {
    if (this.limit == null) {
      this.limit = new ArrayList<>();
    }
    this.limit.add(limitItem);
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(List<Integer> limit) {
    this.limit = limit;
  }


  public ShareRepertoryQueryRequest desc(Boolean desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(Boolean desc) {
    this.desc = desc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareRepertoryQueryRequest shareRepertoryQueryRequest = (ShareRepertoryQueryRequest) o;
    return Objects.equals(this.orderBy, shareRepertoryQueryRequest.orderBy) &&
        Objects.equals(this.shareRepertoryFields, shareRepertoryQueryRequest.shareRepertoryFields) &&
        Objects.equals(this.shareRepertoryType, shareRepertoryQueryRequest.shareRepertoryType) &&
        Objects.equals(this.limit, shareRepertoryQueryRequest.limit) &&
        Objects.equals(this.desc, shareRepertoryQueryRequest.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, shareRepertoryFields, shareRepertoryType, limit, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareRepertoryQueryRequest {\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    shareRepertoryFields: ").append(toIndentedString(shareRepertoryFields)).append("\n");
    sb.append("    shareRepertoryType: ").append(toIndentedString(shareRepertoryType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

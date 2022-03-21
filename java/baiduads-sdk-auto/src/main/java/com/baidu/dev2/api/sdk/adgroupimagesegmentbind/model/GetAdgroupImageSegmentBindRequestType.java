/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroupimagesegmentbind.model;

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
 * GetAdgroupImageSegmentBindRequestType
 */
@JsonPropertyOrder({
  GetAdgroupImageSegmentBindRequestType.JSON_PROPERTY_ADGROUP_IDS,
  GetAdgroupImageSegmentBindRequestType.JSON_PROPERTY_FIELDS,
  GetAdgroupImageSegmentBindRequestType.JSON_PROPERTY_LIMIT
})
@JsonTypeName("GetAdgroupImageSegmentBindRequestType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAdgroupImageSegmentBindRequestType {
  public static final String JSON_PROPERTY_ADGROUP_IDS = "adgroupIds";
  private List<Long> adgroupIds = null;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public GetAdgroupImageSegmentBindRequestType() { 
  }

  public GetAdgroupImageSegmentBindRequestType adgroupIds(List<Long> adgroupIds) {
    
    this.adgroupIds = adgroupIds;
    return this;
  }

  public GetAdgroupImageSegmentBindRequestType addAdgroupIdsItem(Long adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * Get adgroupIds
   * @return adgroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdgroupIds() {
    return adgroupIds;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupIds(List<Long> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }


  public GetAdgroupImageSegmentBindRequestType fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public GetAdgroupImageSegmentBindRequestType addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public GetAdgroupImageSegmentBindRequestType limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public GetAdgroupImageSegmentBindRequestType addLimitItem(Integer limitItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAdgroupImageSegmentBindRequestType getAdgroupImageSegmentBindRequestType = (GetAdgroupImageSegmentBindRequestType) o;
    return Objects.equals(this.adgroupIds, getAdgroupImageSegmentBindRequestType.adgroupIds) &&
        Objects.equals(this.fields, getAdgroupImageSegmentBindRequestType.fields) &&
        Objects.equals(this.limit, getAdgroupImageSegmentBindRequestType.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, fields, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAdgroupImageSegmentBindRequestType {\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

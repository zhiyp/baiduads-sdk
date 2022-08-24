/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.segmentshield.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.segmentshield.model.SegmentShieldType;
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
 * SegmentShieldModRequest
 */
@JsonPropertyOrder({
  SegmentShieldModRequest.JSON_PROPERTY_SEGMENT_SHIELD_TYPES
})
@JsonTypeName("SegmentShieldModRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentShieldModRequest {
  public static final String JSON_PROPERTY_SEGMENT_SHIELD_TYPES = "segmentShieldTypes";
  private List<SegmentShieldType> segmentShieldTypes = null;

  public SegmentShieldModRequest() { 
  }

  public SegmentShieldModRequest segmentShieldTypes(List<SegmentShieldType> segmentShieldTypes) {
    
    this.segmentShieldTypes = segmentShieldTypes;
    return this;
  }

  public SegmentShieldModRequest addSegmentShieldTypesItem(SegmentShieldType segmentShieldTypesItem) {
    if (this.segmentShieldTypes == null) {
      this.segmentShieldTypes = new ArrayList<>();
    }
    this.segmentShieldTypes.add(segmentShieldTypesItem);
    return this;
  }

   /**
   * Get segmentShieldTypes
   * @return segmentShieldTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_SHIELD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SegmentShieldType> getSegmentShieldTypes() {
    return segmentShieldTypes;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_SHIELD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentShieldTypes(List<SegmentShieldType> segmentShieldTypes) {
    this.segmentShieldTypes = segmentShieldTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentShieldModRequest segmentShieldModRequest = (SegmentShieldModRequest) o;
    return Objects.equals(this.segmentShieldTypes, segmentShieldModRequest.segmentShieldTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentShieldTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentShieldModRequest {\n");
    sb.append("    segmentShieldTypes: ").append(toIndentedString(segmentShieldTypes)).append("\n");
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

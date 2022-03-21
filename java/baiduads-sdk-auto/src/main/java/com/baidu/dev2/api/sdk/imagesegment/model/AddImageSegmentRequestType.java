/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagesegment.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.imagesegment.model.AddImageSegmentType;
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
 * AddImageSegmentRequestType
 */
@JsonPropertyOrder({
  AddImageSegmentRequestType.JSON_PROPERTY_ADD_SEGMENT_REQUEST_TYPES,
  AddImageSegmentRequestType.JSON_PROPERTY_PREVIEW
})
@JsonTypeName("AddImageSegmentRequestType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddImageSegmentRequestType {
  public static final String JSON_PROPERTY_ADD_SEGMENT_REQUEST_TYPES = "addSegmentRequestTypes";
  private List<AddImageSegmentType> addSegmentRequestTypes = null;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private Boolean preview;

  public AddImageSegmentRequestType() { 
  }

  public AddImageSegmentRequestType addSegmentRequestTypes(List<AddImageSegmentType> addSegmentRequestTypes) {
    
    this.addSegmentRequestTypes = addSegmentRequestTypes;
    return this;
  }

  public AddImageSegmentRequestType addAddSegmentRequestTypesItem(AddImageSegmentType addSegmentRequestTypesItem) {
    if (this.addSegmentRequestTypes == null) {
      this.addSegmentRequestTypes = new ArrayList<>();
    }
    this.addSegmentRequestTypes.add(addSegmentRequestTypesItem);
    return this;
  }

   /**
   * Get addSegmentRequestTypes
   * @return addSegmentRequestTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADD_SEGMENT_REQUEST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddImageSegmentType> getAddSegmentRequestTypes() {
    return addSegmentRequestTypes;
  }


  @JsonProperty(JSON_PROPERTY_ADD_SEGMENT_REQUEST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddSegmentRequestTypes(List<AddImageSegmentType> addSegmentRequestTypes) {
    this.addSegmentRequestTypes = addSegmentRequestTypes;
  }


  public AddImageSegmentRequestType preview(Boolean preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * Get preview
   * @return preview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreview() {
    return preview;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreview(Boolean preview) {
    this.preview = preview;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddImageSegmentRequestType addImageSegmentRequestType = (AddImageSegmentRequestType) o;
    return Objects.equals(this.addSegmentRequestTypes, addImageSegmentRequestType.addSegmentRequestTypes) &&
        Objects.equals(this.preview, addImageSegmentRequestType.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addSegmentRequestTypes, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddImageSegmentRequestType {\n");
    sb.append("    addSegmentRequestTypes: ").append(toIndentedString(addSegmentRequestTypes)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.marketapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.marketapi.model.OpenSitePreviewRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OpenSitePreviewRequestSingleRequest
 */
@JsonPropertyOrder({
  OpenSitePreviewRequestSingleRequest.JSON_PROPERTY_ITEM
})
@JsonTypeName("OpenSitePreviewRequestSingleRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OpenSitePreviewRequestSingleRequest {
  public static final String JSON_PROPERTY_ITEM = "item";
  private OpenSitePreviewRequest item;

  public OpenSitePreviewRequestSingleRequest() { 
  }

  public OpenSitePreviewRequestSingleRequest item(OpenSitePreviewRequest item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OpenSitePreviewRequest getItem() {
    return item;
  }


  @JsonProperty(JSON_PROPERTY_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItem(OpenSitePreviewRequest item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSitePreviewRequestSingleRequest openSitePreviewRequestSingleRequest = (OpenSitePreviewRequestSingleRequest) o;
    return Objects.equals(this.item, openSitePreviewRequestSingleRequest.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSitePreviewRequestSingleRequest {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

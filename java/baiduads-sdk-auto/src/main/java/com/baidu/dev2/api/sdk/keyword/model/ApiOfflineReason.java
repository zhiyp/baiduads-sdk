/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.keyword.model;

import java.util.Objects;
import java.util.Arrays;
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
 * ApiOfflineReason
 */
@JsonPropertyOrder({
  ApiOfflineReason.JSON_PROPERTY_MAIN_REASON,
  ApiOfflineReason.JSON_PROPERTY_DETAIL_REASON
})
@JsonTypeName("ApiOfflineReason")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiOfflineReason {
  public static final String JSON_PROPERTY_MAIN_REASON = "mainReason";
  private String mainReason;

  public static final String JSON_PROPERTY_DETAIL_REASON = "detailReason";
  private String detailReason;

  public ApiOfflineReason() { 
  }

  public ApiOfflineReason mainReason(String mainReason) {
    
    this.mainReason = mainReason;
    return this;
  }

   /**
   * Get mainReason
   * @return mainReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAIN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainReason() {
    return mainReason;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainReason(String mainReason) {
    this.mainReason = mainReason;
  }


  public ApiOfflineReason detailReason(String detailReason) {
    
    this.detailReason = detailReason;
    return this;
  }

   /**
   * Get detailReason
   * @return detailReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAIL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetailReason() {
    return detailReason;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailReason(String detailReason) {
    this.detailReason = detailReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOfflineReason apiOfflineReason = (ApiOfflineReason) o;
    return Objects.equals(this.mainReason, apiOfflineReason.mainReason) &&
        Objects.equals(this.detailReason, apiOfflineReason.detailReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainReason, detailReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOfflineReason {\n");
    sb.append("    mainReason: ").append(toIndentedString(mainReason)).append("\n");
    sb.append("    detailReason: ").append(toIndentedString(detailReason)).append("\n");
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

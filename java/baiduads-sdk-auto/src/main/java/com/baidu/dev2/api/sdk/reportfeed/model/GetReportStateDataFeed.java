/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.reportfeed.model;

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
 * GetReportStateDataFeed
 */
@JsonPropertyOrder({
  GetReportStateDataFeed.JSON_PROPERTY_IS_GENERATED
})
@JsonTypeName("GetReportStateDataFeed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetReportStateDataFeed {
  public static final String JSON_PROPERTY_IS_GENERATED = "isGenerated";
  private String isGenerated;

  public GetReportStateDataFeed() { 
  }

  public GetReportStateDataFeed isGenerated(String isGenerated) {
    
    this.isGenerated = isGenerated;
    return this;
  }

   /**
   * Get isGenerated
   * @return isGenerated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_GENERATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsGenerated() {
    return isGenerated;
  }


  @JsonProperty(JSON_PROPERTY_IS_GENERATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGenerated(String isGenerated) {
    this.isGenerated = isGenerated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportStateDataFeed getReportStateDataFeed = (GetReportStateDataFeed) o;
    return Objects.equals(this.isGenerated, getReportStateDataFeed.isGenerated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGenerated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportStateDataFeed {\n");
    sb.append("    isGenerated: ").append(toIndentedString(isGenerated)).append("\n");
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

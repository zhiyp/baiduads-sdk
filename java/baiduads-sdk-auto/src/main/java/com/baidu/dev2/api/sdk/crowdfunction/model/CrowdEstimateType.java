/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.crowdfunction.model;

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
 * CrowdEstimateType
 */
@JsonPropertyOrder({
  CrowdEstimateType.JSON_PROPERTY_COVERAGE
})
@JsonTypeName("CrowdEstimateType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdEstimateType {
  public static final String JSON_PROPERTY_COVERAGE = "coverage";
  private Object coverage;

  public CrowdEstimateType() { 
  }

  public CrowdEstimateType coverage(Object coverage) {
    
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCoverage() {
    return coverage;
  }


  @JsonProperty(JSON_PROPERTY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverage(Object coverage) {
    this.coverage = coverage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdEstimateType crowdEstimateType = (CrowdEstimateType) o;
    return Objects.equals(this.coverage, crowdEstimateType.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdEstimateType {\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
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

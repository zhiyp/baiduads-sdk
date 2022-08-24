/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shieldfunction.model;

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
 * IPBlackManualCondition
 */
@JsonPropertyOrder({
  IPBlackManualCondition.JSON_PROPERTY_IPLIKE
})
@JsonTypeName("IPBlackManualCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPBlackManualCondition {
  public static final String JSON_PROPERTY_IPLIKE = "iplike";
  private String iplike;

  public IPBlackManualCondition() { 
  }

  public IPBlackManualCondition iplike(String iplike) {
    
    this.iplike = iplike;
    return this;
  }

   /**
   * Get iplike
   * @return iplike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IPLIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIplike() {
    return iplike;
  }


  @JsonProperty(JSON_PROPERTY_IPLIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIplike(String iplike) {
    this.iplike = iplike;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPBlackManualCondition ipBlackManualCondition = (IPBlackManualCondition) o;
    return Objects.equals(this.iplike, ipBlackManualCondition.iplike);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iplike);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPBlackManualCondition {\n");
    sb.append("    iplike: ").append(toIndentedString(iplike)).append("\n");
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

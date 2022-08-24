/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.shield.model;

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
 * ShieldIPDelRequest
 */
@JsonPropertyOrder({
  ShieldIPDelRequest.JSON_PROPERTY_IDS,
  ShieldIPDelRequest.JSON_PROPERTY_BLACK_IPS
})
@JsonTypeName("ShieldIPDelRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShieldIPDelRequest {
  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_BLACK_IPS = "blackIps";
  private List<String> blackIps = null;

  public ShieldIPDelRequest() { 
  }

  public ShieldIPDelRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public ShieldIPDelRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public ShieldIPDelRequest blackIps(List<String> blackIps) {
    
    this.blackIps = blackIps;
    return this;
  }

  public ShieldIPDelRequest addBlackIpsItem(String blackIpsItem) {
    if (this.blackIps == null) {
      this.blackIps = new ArrayList<>();
    }
    this.blackIps.add(blackIpsItem);
    return this;
  }

   /**
   * Get blackIps
   * @return blackIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BLACK_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBlackIps() {
    return blackIps;
  }


  @JsonProperty(JSON_PROPERTY_BLACK_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackIps(List<String> blackIps) {
    this.blackIps = blackIps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShieldIPDelRequest shieldIPDelRequest = (ShieldIPDelRequest) o;
    return Objects.equals(this.ids, shieldIPDelRequest.ids) &&
        Objects.equals(this.blackIps, shieldIPDelRequest.blackIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, blackIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShieldIPDelRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    blackIps: ").append(toIndentedString(blackIps)).append("\n");
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

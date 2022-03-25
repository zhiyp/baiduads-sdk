/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.payment.model;

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
 * Paytime
 */
@JsonPropertyOrder({
  Paytime.JSON_PROPERTY_GTE,
  Paytime.JSON_PROPERTY_LTE
})
@JsonTypeName("Paytime")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Paytime {
  public static final String JSON_PROPERTY_GTE = "gte";
  private String gte;

  public static final String JSON_PROPERTY_LTE = "lte";
  private String lte;

  public Paytime() { 
  }

  public Paytime gte(String gte) {
    
    this.gte = gte;
    return this;
  }

   /**
   * Get gte
   * @return gte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGte() {
    return gte;
  }


  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGte(String gte) {
    this.gte = gte;
  }


  public Paytime lte(String lte) {
    
    this.lte = lte;
    return this;
  }

   /**
   * Get lte
   * @return lte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLte() {
    return lte;
  }


  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLte(String lte) {
    this.lte = lte;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paytime paytime = (Paytime) o;
    return Objects.equals(this.gte, paytime.gte) &&
        Objects.equals(this.lte, paytime.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gte, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paytime {\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
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


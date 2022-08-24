/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.leadads.model;

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
 * RowFilter
 */
@JsonPropertyOrder({
  RowFilter.JSON_PROPERTY_FIELD,
  RowFilter.JSON_PROPERTY_OP,
  RowFilter.JSON_PROPERTY_VALUES
})
@JsonTypeName("RowFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RowFilter {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_OP = "op";
  private String op;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public RowFilter() { 
  }

  public RowFilter field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public RowFilter op(String op) {
    
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOp() {
    return op;
  }


  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOp(String op) {
    this.op = op;
  }


  public RowFilter values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public RowFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowFilter rowFilter = (RowFilter) o;
    return Objects.equals(this.field, rowFilter.field) &&
        Objects.equals(this.op, rowFilter.op) &&
        Objects.equals(this.values, rowFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, op, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowFilter {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

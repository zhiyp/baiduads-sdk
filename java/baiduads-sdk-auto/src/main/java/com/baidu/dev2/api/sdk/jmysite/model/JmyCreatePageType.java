/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.jmysite.model;

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
 * JmyCreatePageType
 */
@JsonPropertyOrder({
  JmyCreatePageType.JSON_PROPERTY_PAGE_NAME,
  JmyCreatePageType.JSON_PROPERTY_ALIAS_NAME,
  JmyCreatePageType.JSON_PROPERTY_WIDGETS
})
@JsonTypeName("JmyCreatePageType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JmyCreatePageType {
  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;

  public static final String JSON_PROPERTY_ALIAS_NAME = "aliasName";
  private String aliasName;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private String widgets;

  public JmyCreatePageType() { 
  }

  public JmyCreatePageType pageName(String pageName) {
    
    this.pageName = pageName;
    return this;
  }

   /**
   * Get pageName
   * @return pageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageName() {
    return pageName;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  public JmyCreatePageType aliasName(String aliasName) {
    
    this.aliasName = aliasName;
    return this;
  }

   /**
   * Get aliasName
   * @return aliasName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALIAS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAliasName() {
    return aliasName;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }


  public JmyCreatePageType widgets(String widgets) {
    
    this.widgets = widgets;
    return this;
  }

   /**
   * Get widgets
   * @return widgets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWidgets() {
    return widgets;
  }


  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidgets(String widgets) {
    this.widgets = widgets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JmyCreatePageType jmyCreatePageType = (JmyCreatePageType) o;
    return Objects.equals(this.pageName, jmyCreatePageType.pageName) &&
        Objects.equals(this.aliasName, jmyCreatePageType.aliasName) &&
        Objects.equals(this.widgets, jmyCreatePageType.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageName, aliasName, widgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JmyCreatePageType {\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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

/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.newcreative.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.newcreative.model.TemplateField;
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
 * MaterialType
 */
@JsonPropertyOrder({
  MaterialType.JSON_PROPERTY_MT_ID,
  MaterialType.JSON_PROPERTY_TEMPLATE_ID,
  MaterialType.JSON_PROPERTY_TEMPLATE_FIELDS,
  MaterialType.JSON_PROPERTY_MT_NAME
})
@JsonTypeName("MaterialType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MaterialType {
  public static final String JSON_PROPERTY_MT_ID = "mtId";
  private Long mtId;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private Long templateId;

  public static final String JSON_PROPERTY_TEMPLATE_FIELDS = "templateFields";
  private List<TemplateField> templateFields = null;

  public static final String JSON_PROPERTY_MT_NAME = "mtName";
  private String mtName;

  public MaterialType() { 
  }

  public MaterialType mtId(Long mtId) {
    
    this.mtId = mtId;
    return this;
  }

   /**
   * Get mtId
   * @return mtId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMtId() {
    return mtId;
  }


  @JsonProperty(JSON_PROPERTY_MT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtId(Long mtId) {
    this.mtId = mtId;
  }


  public MaterialType templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public MaterialType templateFields(List<TemplateField> templateFields) {
    
    this.templateFields = templateFields;
    return this;
  }

  public MaterialType addTemplateFieldsItem(TemplateField templateFieldsItem) {
    if (this.templateFields == null) {
      this.templateFields = new ArrayList<>();
    }
    this.templateFields.add(templateFieldsItem);
    return this;
  }

   /**
   * Get templateFields
   * @return templateFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TemplateField> getTemplateFields() {
    return templateFields;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateFields(List<TemplateField> templateFields) {
    this.templateFields = templateFields;
  }


  public MaterialType mtName(String mtName) {
    
    this.mtName = mtName;
    return this;
  }

   /**
   * Get mtName
   * @return mtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMtName() {
    return mtName;
  }


  @JsonProperty(JSON_PROPERTY_MT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtName(String mtName) {
    this.mtName = mtName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialType materialType = (MaterialType) o;
    return Objects.equals(this.mtId, materialType.mtId) &&
        Objects.equals(this.templateId, materialType.templateId) &&
        Objects.equals(this.templateFields, materialType.templateFields) &&
        Objects.equals(this.mtName, materialType.mtName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtId, templateId, templateFields, mtName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialType {\n");
    sb.append("    mtId: ").append(toIndentedString(mtId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateFields: ").append(toIndentedString(templateFields)).append("\n");
    sb.append("    mtName: ").append(toIndentedString(mtName)).append("\n");
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

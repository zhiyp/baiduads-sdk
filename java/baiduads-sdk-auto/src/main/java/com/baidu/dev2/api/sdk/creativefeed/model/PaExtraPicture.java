/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.creativefeed.model.ExtraPictureItem;
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
 * PaExtraPicture
 */
@JsonPropertyOrder({
  PaExtraPicture.JSON_PROPERTY_PICTURES,
  PaExtraPicture.JSON_PROPERTY_WIDTH,
  PaExtraPicture.JSON_PROPERTY_HEIGHT
})
@JsonTypeName("PaExtraPicture")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaExtraPicture {
  public static final String JSON_PROPERTY_PICTURES = "pictures";
  private List<ExtraPictureItem> pictures = null;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public PaExtraPicture() { 
  }

  public PaExtraPicture pictures(List<ExtraPictureItem> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public PaExtraPicture addPicturesItem(ExtraPictureItem picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtraPictureItem> getPictures() {
    return pictures;
  }


  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictures(List<ExtraPictureItem> pictures) {
    this.pictures = pictures;
  }


  public PaExtraPicture width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public PaExtraPicture height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaExtraPicture paExtraPicture = (PaExtraPicture) o;
    return Objects.equals(this.pictures, paExtraPicture.pictures) &&
        Objects.equals(this.width, paExtraPicture.width) &&
        Objects.equals(this.height, paExtraPicture.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pictures, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaExtraPicture {\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

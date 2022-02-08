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
import com.baidu.dev2.api.sdk.reportfeed.model.AttributeType;
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
 * ReportRequestType
 */
@JsonPropertyOrder({
  ReportRequestType.JSON_PROPERTY_SUBJECT,
  ReportRequestType.JSON_PROPERTY_MATERIAL_STYLE,
  ReportRequestType.JSON_PROPERTY_PERFORMANCE_DATA,
  ReportRequestType.JSON_PROPERTY_START_DATE,
  ReportRequestType.JSON_PROPERTY_END_DATE,
  ReportRequestType.JSON_PROPERTY_LEVEL_OF_DETAILS,
  ReportRequestType.JSON_PROPERTY_ID_ONLY,
  ReportRequestType.JSON_PROPERTY_ATTRIBUTES,
  ReportRequestType.JSON_PROPERTY_FORMAT,
  ReportRequestType.JSON_PROPERTY_STAT_IDS,
  ReportRequestType.JSON_PROPERTY_STAT_RANGE,
  ReportRequestType.JSON_PROPERTY_REPORT_TYPE,
  ReportRequestType.JSON_PROPERTY_UNIT_OF_TIME,
  ReportRequestType.JSON_PROPERTY_DEVICE,
  ReportRequestType.JSON_PROPERTY_ORDER,
  ReportRequestType.JSON_PROPERTY_NUMBER,
  ReportRequestType.JSON_PROPERTY_ISRELATIVETIME,
  ReportRequestType.JSON_PROPERTY_STYLE_TYPE,
  ReportRequestType.JSON_PROPERTY_PLATFORM,
  ReportRequestType.JSON_PROPERTY_PAGE_INDEX,
  ReportRequestType.JSON_PROPERTY_PRODUCTTYPE,
  ReportRequestType.JSON_PROPERTY_SEGMENT_TYPE,
  ReportRequestType.JSON_PROPERTY_BIND_SOURCE,
  ReportRequestType.JSON_PROPERTY_BID_TYPE,
  ReportRequestType.JSON_PROPERTY_PAY_MODE,
  ReportRequestType.JSON_PROPERTY_BSTYPE
})
@JsonTypeName("ReportRequestType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportRequestType {
  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private Integer subject;

  public static final String JSON_PROPERTY_MATERIAL_STYLE = "materialStyle";
  private Integer materialStyle;

  public static final String JSON_PROPERTY_PERFORMANCE_DATA = "performanceData";
  private List<String> performanceData = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_LEVEL_OF_DETAILS = "levelOfDetails";
  private Integer levelOfDetails;

  public static final String JSON_PROPERTY_ID_ONLY = "idOnly";
  private Boolean idOnly;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<AttributeType> attributes = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Integer format;

  public static final String JSON_PROPERTY_STAT_IDS = "statIds";
  private List<Long> statIds = null;

  public static final String JSON_PROPERTY_STAT_RANGE = "statRange";
  private Integer statRange;

  public static final String JSON_PROPERTY_REPORT_TYPE = "reportType";
  private Integer reportType;

  public static final String JSON_PROPERTY_UNIT_OF_TIME = "unitOfTime";
  private Integer unitOfTime;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Boolean order;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Integer number;

  public static final String JSON_PROPERTY_ISRELATIVETIME = "isrelativetime";
  private Integer isrelativetime;

  public static final String JSON_PROPERTY_STYLE_TYPE = "styleType";
  private Integer styleType;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Integer platform;

  public static final String JSON_PROPERTY_PAGE_INDEX = "pageIndex";
  private Integer pageIndex;

  public static final String JSON_PROPERTY_PRODUCTTYPE = "producttype";
  private Integer producttype;

  public static final String JSON_PROPERTY_SEGMENT_TYPE = "segmentType";
  private Integer segmentType;

  public static final String JSON_PROPERTY_BIND_SOURCE = "bindSource";
  private Integer bindSource;

  public static final String JSON_PROPERTY_BID_TYPE = "bidType";
  private List<String> bidType = null;

  public static final String JSON_PROPERTY_PAY_MODE = "payMode";
  private List<String> payMode = null;

  public static final String JSON_PROPERTY_BSTYPE = "bstype";
  private Integer bstype;

  public ReportRequestType() { 
  }

  public ReportRequestType subject(Integer subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(Integer subject) {
    this.subject = subject;
  }


  public ReportRequestType materialStyle(Integer materialStyle) {
    
    this.materialStyle = materialStyle;
    return this;
  }

   /**
   * Get materialStyle
   * @return materialStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATERIAL_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaterialStyle() {
    return materialStyle;
  }


  @JsonProperty(JSON_PROPERTY_MATERIAL_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaterialStyle(Integer materialStyle) {
    this.materialStyle = materialStyle;
  }


  public ReportRequestType performanceData(List<String> performanceData) {
    
    this.performanceData = performanceData;
    return this;
  }

  public ReportRequestType addPerformanceDataItem(String performanceDataItem) {
    if (this.performanceData == null) {
      this.performanceData = new ArrayList<>();
    }
    this.performanceData.add(performanceDataItem);
    return this;
  }

   /**
   * Get performanceData
   * @return performanceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPerformanceData() {
    return performanceData;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformanceData(List<String> performanceData) {
    this.performanceData = performanceData;
  }


  public ReportRequestType startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ReportRequestType endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ReportRequestType levelOfDetails(Integer levelOfDetails) {
    
    this.levelOfDetails = levelOfDetails;
    return this;
  }

   /**
   * Get levelOfDetails
   * @return levelOfDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL_OF_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLevelOfDetails() {
    return levelOfDetails;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL_OF_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevelOfDetails(Integer levelOfDetails) {
    this.levelOfDetails = levelOfDetails;
  }


  public ReportRequestType idOnly(Boolean idOnly) {
    
    this.idOnly = idOnly;
    return this;
  }

   /**
   * Get idOnly
   * @return idOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIdOnly() {
    return idOnly;
  }


  @JsonProperty(JSON_PROPERTY_ID_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdOnly(Boolean idOnly) {
    this.idOnly = idOnly;
  }


  public ReportRequestType attributes(List<AttributeType> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ReportRequestType addAttributesItem(AttributeType attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AttributeType> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(List<AttributeType> attributes) {
    this.attributes = attributes;
  }


  public ReportRequestType format(Integer format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(Integer format) {
    this.format = format;
  }


  public ReportRequestType statIds(List<Long> statIds) {
    
    this.statIds = statIds;
    return this;
  }

  public ReportRequestType addStatIdsItem(Long statIdsItem) {
    if (this.statIds == null) {
      this.statIds = new ArrayList<>();
    }
    this.statIds.add(statIdsItem);
    return this;
  }

   /**
   * Get statIds
   * @return statIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getStatIds() {
    return statIds;
  }


  @JsonProperty(JSON_PROPERTY_STAT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatIds(List<Long> statIds) {
    this.statIds = statIds;
  }


  public ReportRequestType statRange(Integer statRange) {
    
    this.statRange = statRange;
    return this;
  }

   /**
   * Get statRange
   * @return statRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatRange() {
    return statRange;
  }


  @JsonProperty(JSON_PROPERTY_STAT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatRange(Integer statRange) {
    this.statRange = statRange;
  }


  public ReportRequestType reportType(Integer reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportType() {
    return reportType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportType(Integer reportType) {
    this.reportType = reportType;
  }


  public ReportRequestType unitOfTime(Integer unitOfTime) {
    
    this.unitOfTime = unitOfTime;
    return this;
  }

   /**
   * Get unitOfTime
   * @return unitOfTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_OF_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnitOfTime() {
    return unitOfTime;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_OF_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitOfTime(Integer unitOfTime) {
    this.unitOfTime = unitOfTime;
  }


  public ReportRequestType device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(Integer device) {
    this.device = device;
  }


  public ReportRequestType order(Boolean order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Boolean order) {
    this.order = order;
  }


  public ReportRequestType number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(Integer number) {
    this.number = number;
  }


  public ReportRequestType isrelativetime(Integer isrelativetime) {
    
    this.isrelativetime = isrelativetime;
    return this;
  }

   /**
   * Get isrelativetime
   * @return isrelativetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISRELATIVETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsrelativetime() {
    return isrelativetime;
  }


  @JsonProperty(JSON_PROPERTY_ISRELATIVETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsrelativetime(Integer isrelativetime) {
    this.isrelativetime = isrelativetime;
  }


  public ReportRequestType styleType(Integer styleType) {
    
    this.styleType = styleType;
    return this;
  }

   /**
   * Get styleType
   * @return styleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STYLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStyleType() {
    return styleType;
  }


  @JsonProperty(JSON_PROPERTY_STYLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyleType(Integer styleType) {
    this.styleType = styleType;
  }


  public ReportRequestType platform(Integer platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Integer platform) {
    this.platform = platform;
  }


  public ReportRequestType pageIndex(Integer pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageIndex() {
    return pageIndex;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }


  public ReportRequestType producttype(Integer producttype) {
    
    this.producttype = producttype;
    return this;
  }

   /**
   * Get producttype
   * @return producttype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProducttype() {
    return producttype;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducttype(Integer producttype) {
    this.producttype = producttype;
  }


  public ReportRequestType segmentType(Integer segmentType) {
    
    this.segmentType = segmentType;
    return this;
  }

   /**
   * Get segmentType
   * @return segmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSegmentType() {
    return segmentType;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentType(Integer segmentType) {
    this.segmentType = segmentType;
  }


  public ReportRequestType bindSource(Integer bindSource) {
    
    this.bindSource = bindSource;
    return this;
  }

   /**
   * Get bindSource
   * @return bindSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBindSource() {
    return bindSource;
  }


  @JsonProperty(JSON_PROPERTY_BIND_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindSource(Integer bindSource) {
    this.bindSource = bindSource;
  }


  public ReportRequestType bidType(List<String> bidType) {
    
    this.bidType = bidType;
    return this;
  }

  public ReportRequestType addBidTypeItem(String bidTypeItem) {
    if (this.bidType == null) {
      this.bidType = new ArrayList<>();
    }
    this.bidType.add(bidTypeItem);
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBidType() {
    return bidType;
  }


  @JsonProperty(JSON_PROPERTY_BID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidType(List<String> bidType) {
    this.bidType = bidType;
  }


  public ReportRequestType payMode(List<String> payMode) {
    
    this.payMode = payMode;
    return this;
  }

  public ReportRequestType addPayModeItem(String payModeItem) {
    if (this.payMode == null) {
      this.payMode = new ArrayList<>();
    }
    this.payMode.add(payModeItem);
    return this;
  }

   /**
   * Get payMode
   * @return payMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPayMode() {
    return payMode;
  }


  @JsonProperty(JSON_PROPERTY_PAY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayMode(List<String> payMode) {
    this.payMode = payMode;
  }


  public ReportRequestType bstype(Integer bstype) {
    
    this.bstype = bstype;
    return this;
  }

   /**
   * Get bstype
   * @return bstype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBstype() {
    return bstype;
  }


  @JsonProperty(JSON_PROPERTY_BSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBstype(Integer bstype) {
    this.bstype = bstype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRequestType reportRequestType = (ReportRequestType) o;
    return Objects.equals(this.subject, reportRequestType.subject) &&
        Objects.equals(this.materialStyle, reportRequestType.materialStyle) &&
        Objects.equals(this.performanceData, reportRequestType.performanceData) &&
        Objects.equals(this.startDate, reportRequestType.startDate) &&
        Objects.equals(this.endDate, reportRequestType.endDate) &&
        Objects.equals(this.levelOfDetails, reportRequestType.levelOfDetails) &&
        Objects.equals(this.idOnly, reportRequestType.idOnly) &&
        Objects.equals(this.attributes, reportRequestType.attributes) &&
        Objects.equals(this.format, reportRequestType.format) &&
        Objects.equals(this.statIds, reportRequestType.statIds) &&
        Objects.equals(this.statRange, reportRequestType.statRange) &&
        Objects.equals(this.reportType, reportRequestType.reportType) &&
        Objects.equals(this.unitOfTime, reportRequestType.unitOfTime) &&
        Objects.equals(this.device, reportRequestType.device) &&
        Objects.equals(this.order, reportRequestType.order) &&
        Objects.equals(this.number, reportRequestType.number) &&
        Objects.equals(this.isrelativetime, reportRequestType.isrelativetime) &&
        Objects.equals(this.styleType, reportRequestType.styleType) &&
        Objects.equals(this.platform, reportRequestType.platform) &&
        Objects.equals(this.pageIndex, reportRequestType.pageIndex) &&
        Objects.equals(this.producttype, reportRequestType.producttype) &&
        Objects.equals(this.segmentType, reportRequestType.segmentType) &&
        Objects.equals(this.bindSource, reportRequestType.bindSource) &&
        Objects.equals(this.bidType, reportRequestType.bidType) &&
        Objects.equals(this.payMode, reportRequestType.payMode) &&
        Objects.equals(this.bstype, reportRequestType.bstype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, materialStyle, performanceData, startDate, endDate, levelOfDetails, idOnly, attributes, format, statIds, statRange, reportType, unitOfTime, device, order, number, isrelativetime, styleType, platform, pageIndex, producttype, segmentType, bindSource, bidType, payMode, bstype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRequestType {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    materialStyle: ").append(toIndentedString(materialStyle)).append("\n");
    sb.append("    performanceData: ").append(toIndentedString(performanceData)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    levelOfDetails: ").append(toIndentedString(levelOfDetails)).append("\n");
    sb.append("    idOnly: ").append(toIndentedString(idOnly)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    statIds: ").append(toIndentedString(statIds)).append("\n");
    sb.append("    statRange: ").append(toIndentedString(statRange)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    unitOfTime: ").append(toIndentedString(unitOfTime)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    isrelativetime: ").append(toIndentedString(isrelativetime)).append("\n");
    sb.append("    styleType: ").append(toIndentedString(styleType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    producttype: ").append(toIndentedString(producttype)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    bindSource: ").append(toIndentedString(bindSource)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    bstype: ").append(toIndentedString(bstype)).append("\n");
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

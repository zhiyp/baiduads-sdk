/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.appcenterjob.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.appcenterjob.model.JobDto;
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
 * BatchJobRequest
 */
@JsonPropertyOrder({
  BatchJobRequest.JSON_PROPERTY_UNIQUE_ID,
  BatchJobRequest.JSON_PROPERTY_JOB_LIST,
  BatchJobRequest.JSON_PROPERTY_FROM_TYPE,
  BatchJobRequest.JSON_PROPERTY_IF_ZHUAQU
})
@JsonTypeName("BatchJobRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchJobRequest {
  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public static final String JSON_PROPERTY_JOB_LIST = "jobList";
  private List<JobDto> jobList = null;

  public static final String JSON_PROPERTY_FROM_TYPE = "fromType";
  private Integer fromType;

  public static final String JSON_PROPERTY_IF_ZHUAQU = "ifZhuaqu";
  private Boolean ifZhuaqu;

  public BatchJobRequest() { 
  }

  public BatchJobRequest uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public BatchJobRequest jobList(List<JobDto> jobList) {
    
    this.jobList = jobList;
    return this;
  }

  public BatchJobRequest addJobListItem(JobDto jobListItem) {
    if (this.jobList == null) {
      this.jobList = new ArrayList<>();
    }
    this.jobList.add(jobListItem);
    return this;
  }

   /**
   * Get jobList
   * @return jobList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<JobDto> getJobList() {
    return jobList;
  }


  @JsonProperty(JSON_PROPERTY_JOB_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobList(List<JobDto> jobList) {
    this.jobList = jobList;
  }


  public BatchJobRequest fromType(Integer fromType) {
    
    this.fromType = fromType;
    return this;
  }

   /**
   * Get fromType
   * @return fromType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFromType() {
    return fromType;
  }


  @JsonProperty(JSON_PROPERTY_FROM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromType(Integer fromType) {
    this.fromType = fromType;
  }


  public BatchJobRequest ifZhuaqu(Boolean ifZhuaqu) {
    
    this.ifZhuaqu = ifZhuaqu;
    return this;
  }

   /**
   * Get ifZhuaqu
   * @return ifZhuaqu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IF_ZHUAQU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIfZhuaqu() {
    return ifZhuaqu;
  }


  @JsonProperty(JSON_PROPERTY_IF_ZHUAQU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIfZhuaqu(Boolean ifZhuaqu) {
    this.ifZhuaqu = ifZhuaqu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchJobRequest batchJobRequest = (BatchJobRequest) o;
    return Objects.equals(this.uniqueId, batchJobRequest.uniqueId) &&
        Objects.equals(this.jobList, batchJobRequest.jobList) &&
        Objects.equals(this.fromType, batchJobRequest.fromType) &&
        Objects.equals(this.ifZhuaqu, batchJobRequest.ifZhuaqu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, jobList, fromType, ifZhuaqu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchJobRequest {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
    sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
    sb.append("    ifZhuaqu: ").append(toIndentedString(ifZhuaqu)).append("\n");
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

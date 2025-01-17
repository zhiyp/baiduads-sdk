/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.keyword.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.keyword.model.ApiOfflineReason;
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
 * ApiKeywordType
 */
@JsonPropertyOrder({
  ApiKeywordType.JSON_PROPERTY_CAMPAIGN_ID,
  ApiKeywordType.JSON_PROPERTY_KEYWORD_ID,
  ApiKeywordType.JSON_PROPERTY_ADGROUP_ID,
  ApiKeywordType.JSON_PROPERTY_KEYWORD,
  ApiKeywordType.JSON_PROPERTY_PRICE,
  ApiKeywordType.JSON_PROPERTY_MATCH_TYPE,
  ApiKeywordType.JSON_PROPERTY_PAUSE,
  ApiKeywordType.JSON_PROPERTY_STATUS,
  ApiKeywordType.JSON_PROPERTY_PC_DESTINATION_URL,
  ApiKeywordType.JSON_PROPERTY_MOBILE_DESTINATION_URL,
  ApiKeywordType.JSON_PROPERTY_PHRASE_TYPE,
  ApiKeywordType.JSON_PROPERTY_OFFLINE_REASONS,
  ApiKeywordType.JSON_PROPERTY_TABS,
  ApiKeywordType.JSON_PROPERTY_LEFT_PRICE_GUIDE,
  ApiKeywordType.JSON_PROPERTY_M_PRICE_GUIDE,
  ApiKeywordType.JSON_PROPERTY_DEEPLINK,
  ApiKeywordType.JSON_PROPERTY_MINI_PROGRAM_URL,
  ApiKeywordType.JSON_PROPERTY_STRATEGY_ID,
  ApiKeywordType.JSON_PROPERTY_QUALITY,
  ApiKeywordType.JSON_PROPERTY_ESTIMATED_CLICK_RATE,
  ApiKeywordType.JSON_PROPERTY_BUSINESS_RELATIONSHIP,
  ApiKeywordType.JSON_PROPERTY_LAND_PAGE_EXPERIENCE,
  ApiKeywordType.JSON_PROPERTY_CREATE_TIME,
  ApiKeywordType.JSON_PROPERTY_MOBILE_FINAL_URL,
  ApiKeywordType.JSON_PROPERTY_MOBILE_TRACK_PARAM,
  ApiKeywordType.JSON_PROPERTY_MOBILE_TRACK_TEMPLATE,
  ApiKeywordType.JSON_PROPERTY_PC_FINAL_URL,
  ApiKeywordType.JSON_PROPERTY_PC_TRACK_PARAM,
  ApiKeywordType.JSON_PROPERTY_PC_TRACK_TEMPLATE,
  ApiKeywordType.JSON_PROPERTY_ULINK
})
@JsonTypeName("ApiKeywordType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiKeywordType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_KEYWORD_ID = "keywordId";
  private Long keywordId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private Integer matchType;

  public static final String JSON_PROPERTY_PAUSE = "pause";
  private Boolean pause;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_PC_DESTINATION_URL = "pcDestinationUrl";
  private String pcDestinationUrl;

  public static final String JSON_PROPERTY_MOBILE_DESTINATION_URL = "mobileDestinationUrl";
  private String mobileDestinationUrl;

  public static final String JSON_PROPERTY_PHRASE_TYPE = "phraseType";
  private Integer phraseType;

  public static final String JSON_PROPERTY_OFFLINE_REASONS = "offlineReasons";
  private List<ApiOfflineReason> offlineReasons = null;

  public static final String JSON_PROPERTY_TABS = "tabs";
  private List<Integer> tabs = null;

  public static final String JSON_PROPERTY_LEFT_PRICE_GUIDE = "leftPriceGuide";
  private Double leftPriceGuide;

  public static final String JSON_PROPERTY_M_PRICE_GUIDE = "mPriceGuide";
  private Double mPriceGuide;

  public static final String JSON_PROPERTY_DEEPLINK = "deeplink";
  private String deeplink;

  public static final String JSON_PROPERTY_MINI_PROGRAM_URL = "miniProgramUrl";
  private String miniProgramUrl;

  public static final String JSON_PROPERTY_STRATEGY_ID = "strategyId";
  private Long strategyId;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private Integer quality;

  public static final String JSON_PROPERTY_ESTIMATED_CLICK_RATE = "estimatedClickRate";
  private Integer estimatedClickRate;

  public static final String JSON_PROPERTY_BUSINESS_RELATIONSHIP = "businessRelationship";
  private Integer businessRelationship;

  public static final String JSON_PROPERTY_LAND_PAGE_EXPERIENCE = "landPageExperience";
  private Integer landPageExperience;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private String createTime;

  public static final String JSON_PROPERTY_MOBILE_FINAL_URL = "mobileFinalUrl";
  private String mobileFinalUrl;

  public static final String JSON_PROPERTY_MOBILE_TRACK_PARAM = "mobileTrackParam";
  private String mobileTrackParam;

  public static final String JSON_PROPERTY_MOBILE_TRACK_TEMPLATE = "mobileTrackTemplate";
  private String mobileTrackTemplate;

  public static final String JSON_PROPERTY_PC_FINAL_URL = "pcFinalUrl";
  private String pcFinalUrl;

  public static final String JSON_PROPERTY_PC_TRACK_PARAM = "pcTrackParam";
  private String pcTrackParam;

  public static final String JSON_PROPERTY_PC_TRACK_TEMPLATE = "pcTrackTemplate";
  private String pcTrackTemplate;

  public static final String JSON_PROPERTY_ULINK = "ulink";
  private String ulink;

  public ApiKeywordType() { 
  }

  public ApiKeywordType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ApiKeywordType keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * Get keywordId
   * @return keywordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordId() {
    return keywordId;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public ApiKeywordType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public ApiKeywordType keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public ApiKeywordType price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public ApiKeywordType matchType(Integer matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(Integer matchType) {
    this.matchType = matchType;
  }


  public ApiKeywordType pause(Boolean pause) {
    
    this.pause = pause;
    return this;
  }

   /**
   * Get pause
   * @return pause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPause() {
    return pause;
  }


  @JsonProperty(JSON_PROPERTY_PAUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPause(Boolean pause) {
    this.pause = pause;
  }


  public ApiKeywordType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public ApiKeywordType pcDestinationUrl(String pcDestinationUrl) {
    
    this.pcDestinationUrl = pcDestinationUrl;
    return this;
  }

   /**
   * Get pcDestinationUrl
   * @return pcDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcDestinationUrl() {
    return pcDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_PC_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcDestinationUrl(String pcDestinationUrl) {
    this.pcDestinationUrl = pcDestinationUrl;
  }


  public ApiKeywordType mobileDestinationUrl(String mobileDestinationUrl) {
    
    this.mobileDestinationUrl = mobileDestinationUrl;
    return this;
  }

   /**
   * Get mobileDestinationUrl
   * @return mobileDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileDestinationUrl() {
    return mobileDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileDestinationUrl(String mobileDestinationUrl) {
    this.mobileDestinationUrl = mobileDestinationUrl;
  }


  public ApiKeywordType phraseType(Integer phraseType) {
    
    this.phraseType = phraseType;
    return this;
  }

   /**
   * Get phraseType
   * @return phraseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHRASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPhraseType() {
    return phraseType;
  }


  @JsonProperty(JSON_PROPERTY_PHRASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhraseType(Integer phraseType) {
    this.phraseType = phraseType;
  }


  public ApiKeywordType offlineReasons(List<ApiOfflineReason> offlineReasons) {
    
    this.offlineReasons = offlineReasons;
    return this;
  }

  public ApiKeywordType addOfflineReasonsItem(ApiOfflineReason offlineReasonsItem) {
    if (this.offlineReasons == null) {
      this.offlineReasons = new ArrayList<>();
    }
    this.offlineReasons.add(offlineReasonsItem);
    return this;
  }

   /**
   * Get offlineReasons
   * @return offlineReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFLINE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiOfflineReason> getOfflineReasons() {
    return offlineReasons;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfflineReasons(List<ApiOfflineReason> offlineReasons) {
    this.offlineReasons = offlineReasons;
  }


  public ApiKeywordType tabs(List<Integer> tabs) {
    
    this.tabs = tabs;
    return this;
  }

  public ApiKeywordType addTabsItem(Integer tabsItem) {
    if (this.tabs == null) {
      this.tabs = new ArrayList<>();
    }
    this.tabs.add(tabsItem);
    return this;
  }

   /**
   * Get tabs
   * @return tabs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTabs() {
    return tabs;
  }


  @JsonProperty(JSON_PROPERTY_TABS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTabs(List<Integer> tabs) {
    this.tabs = tabs;
  }


  public ApiKeywordType leftPriceGuide(Double leftPriceGuide) {
    
    this.leftPriceGuide = leftPriceGuide;
    return this;
  }

   /**
   * Get leftPriceGuide
   * @return leftPriceGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT_PRICE_GUIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLeftPriceGuide() {
    return leftPriceGuide;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_PRICE_GUIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftPriceGuide(Double leftPriceGuide) {
    this.leftPriceGuide = leftPriceGuide;
  }


  public ApiKeywordType mPriceGuide(Double mPriceGuide) {
    
    this.mPriceGuide = mPriceGuide;
    return this;
  }

   /**
   * Get mPriceGuide
   * @return mPriceGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_M_PRICE_GUIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getmPriceGuide() {
    return mPriceGuide;
  }


  @JsonProperty(JSON_PROPERTY_M_PRICE_GUIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setmPriceGuide(Double mPriceGuide) {
    this.mPriceGuide = mPriceGuide;
  }


  public ApiKeywordType deeplink(String deeplink) {
    
    this.deeplink = deeplink;
    return this;
  }

   /**
   * Get deeplink
   * @return deeplink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEPLINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeeplink() {
    return deeplink;
  }


  @JsonProperty(JSON_PROPERTY_DEEPLINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }


  public ApiKeywordType miniProgramUrl(String miniProgramUrl) {
    
    this.miniProgramUrl = miniProgramUrl;
    return this;
  }

   /**
   * Get miniProgramUrl
   * @return miniProgramUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiniProgramUrl() {
    return miniProgramUrl;
  }


  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiniProgramUrl(String miniProgramUrl) {
    this.miniProgramUrl = miniProgramUrl;
  }


  public ApiKeywordType strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * Get strategyId
   * @return strategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyId() {
    return strategyId;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public ApiKeywordType quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public ApiKeywordType estimatedClickRate(Integer estimatedClickRate) {
    
    this.estimatedClickRate = estimatedClickRate;
    return this;
  }

   /**
   * Get estimatedClickRate
   * @return estimatedClickRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEstimatedClickRate() {
    return estimatedClickRate;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedClickRate(Integer estimatedClickRate) {
    this.estimatedClickRate = estimatedClickRate;
  }


  public ApiKeywordType businessRelationship(Integer businessRelationship) {
    
    this.businessRelationship = businessRelationship;
    return this;
  }

   /**
   * Get businessRelationship
   * @return businessRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBusinessRelationship() {
    return businessRelationship;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessRelationship(Integer businessRelationship) {
    this.businessRelationship = businessRelationship;
  }


  public ApiKeywordType landPageExperience(Integer landPageExperience) {
    
    this.landPageExperience = landPageExperience;
    return this;
  }

   /**
   * Get landPageExperience
   * @return landPageExperience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAND_PAGE_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLandPageExperience() {
    return landPageExperience;
  }


  @JsonProperty(JSON_PROPERTY_LAND_PAGE_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandPageExperience(Integer landPageExperience) {
    this.landPageExperience = landPageExperience;
  }


  public ApiKeywordType createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ApiKeywordType mobileFinalUrl(String mobileFinalUrl) {
    
    this.mobileFinalUrl = mobileFinalUrl;
    return this;
  }

   /**
   * Get mobileFinalUrl
   * @return mobileFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileFinalUrl() {
    return mobileFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileFinalUrl(String mobileFinalUrl) {
    this.mobileFinalUrl = mobileFinalUrl;
  }


  public ApiKeywordType mobileTrackParam(String mobileTrackParam) {
    
    this.mobileTrackParam = mobileTrackParam;
    return this;
  }

   /**
   * Get mobileTrackParam
   * @return mobileTrackParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_TRACK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileTrackParam() {
    return mobileTrackParam;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_TRACK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileTrackParam(String mobileTrackParam) {
    this.mobileTrackParam = mobileTrackParam;
  }


  public ApiKeywordType mobileTrackTemplate(String mobileTrackTemplate) {
    
    this.mobileTrackTemplate = mobileTrackTemplate;
    return this;
  }

   /**
   * Get mobileTrackTemplate
   * @return mobileTrackTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_TRACK_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileTrackTemplate() {
    return mobileTrackTemplate;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_TRACK_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileTrackTemplate(String mobileTrackTemplate) {
    this.mobileTrackTemplate = mobileTrackTemplate;
  }


  public ApiKeywordType pcFinalUrl(String pcFinalUrl) {
    
    this.pcFinalUrl = pcFinalUrl;
    return this;
  }

   /**
   * Get pcFinalUrl
   * @return pcFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcFinalUrl() {
    return pcFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_PC_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcFinalUrl(String pcFinalUrl) {
    this.pcFinalUrl = pcFinalUrl;
  }


  public ApiKeywordType pcTrackParam(String pcTrackParam) {
    
    this.pcTrackParam = pcTrackParam;
    return this;
  }

   /**
   * Get pcTrackParam
   * @return pcTrackParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_TRACK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcTrackParam() {
    return pcTrackParam;
  }


  @JsonProperty(JSON_PROPERTY_PC_TRACK_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcTrackParam(String pcTrackParam) {
    this.pcTrackParam = pcTrackParam;
  }


  public ApiKeywordType pcTrackTemplate(String pcTrackTemplate) {
    
    this.pcTrackTemplate = pcTrackTemplate;
    return this;
  }

   /**
   * Get pcTrackTemplate
   * @return pcTrackTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_TRACK_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcTrackTemplate() {
    return pcTrackTemplate;
  }


  @JsonProperty(JSON_PROPERTY_PC_TRACK_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcTrackTemplate(String pcTrackTemplate) {
    this.pcTrackTemplate = pcTrackTemplate;
  }


  public ApiKeywordType ulink(String ulink) {
    
    this.ulink = ulink;
    return this;
  }

   /**
   * Get ulink
   * @return ulink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ULINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUlink() {
    return ulink;
  }


  @JsonProperty(JSON_PROPERTY_ULINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUlink(String ulink) {
    this.ulink = ulink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeywordType apiKeywordType = (ApiKeywordType) o;
    return Objects.equals(this.campaignId, apiKeywordType.campaignId) &&
        Objects.equals(this.keywordId, apiKeywordType.keywordId) &&
        Objects.equals(this.adgroupId, apiKeywordType.adgroupId) &&
        Objects.equals(this.keyword, apiKeywordType.keyword) &&
        Objects.equals(this.price, apiKeywordType.price) &&
        Objects.equals(this.matchType, apiKeywordType.matchType) &&
        Objects.equals(this.pause, apiKeywordType.pause) &&
        Objects.equals(this.status, apiKeywordType.status) &&
        Objects.equals(this.pcDestinationUrl, apiKeywordType.pcDestinationUrl) &&
        Objects.equals(this.mobileDestinationUrl, apiKeywordType.mobileDestinationUrl) &&
        Objects.equals(this.phraseType, apiKeywordType.phraseType) &&
        Objects.equals(this.offlineReasons, apiKeywordType.offlineReasons) &&
        Objects.equals(this.tabs, apiKeywordType.tabs) &&
        Objects.equals(this.leftPriceGuide, apiKeywordType.leftPriceGuide) &&
        Objects.equals(this.mPriceGuide, apiKeywordType.mPriceGuide) &&
        Objects.equals(this.deeplink, apiKeywordType.deeplink) &&
        Objects.equals(this.miniProgramUrl, apiKeywordType.miniProgramUrl) &&
        Objects.equals(this.strategyId, apiKeywordType.strategyId) &&
        Objects.equals(this.quality, apiKeywordType.quality) &&
        Objects.equals(this.estimatedClickRate, apiKeywordType.estimatedClickRate) &&
        Objects.equals(this.businessRelationship, apiKeywordType.businessRelationship) &&
        Objects.equals(this.landPageExperience, apiKeywordType.landPageExperience) &&
        Objects.equals(this.createTime, apiKeywordType.createTime) &&
        Objects.equals(this.mobileFinalUrl, apiKeywordType.mobileFinalUrl) &&
        Objects.equals(this.mobileTrackParam, apiKeywordType.mobileTrackParam) &&
        Objects.equals(this.mobileTrackTemplate, apiKeywordType.mobileTrackTemplate) &&
        Objects.equals(this.pcFinalUrl, apiKeywordType.pcFinalUrl) &&
        Objects.equals(this.pcTrackParam, apiKeywordType.pcTrackParam) &&
        Objects.equals(this.pcTrackTemplate, apiKeywordType.pcTrackTemplate) &&
        Objects.equals(this.ulink, apiKeywordType.ulink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, keywordId, adgroupId, keyword, price, matchType, pause, status, pcDestinationUrl, mobileDestinationUrl, phraseType, offlineReasons, tabs, leftPriceGuide, mPriceGuide, deeplink, miniProgramUrl, strategyId, quality, estimatedClickRate, businessRelationship, landPageExperience, createTime, mobileFinalUrl, mobileTrackParam, mobileTrackTemplate, pcFinalUrl, pcTrackParam, pcTrackTemplate, ulink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeywordType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pcDestinationUrl: ").append(toIndentedString(pcDestinationUrl)).append("\n");
    sb.append("    mobileDestinationUrl: ").append(toIndentedString(mobileDestinationUrl)).append("\n");
    sb.append("    phraseType: ").append(toIndentedString(phraseType)).append("\n");
    sb.append("    offlineReasons: ").append(toIndentedString(offlineReasons)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    leftPriceGuide: ").append(toIndentedString(leftPriceGuide)).append("\n");
    sb.append("    mPriceGuide: ").append(toIndentedString(mPriceGuide)).append("\n");
    sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
    sb.append("    miniProgramUrl: ").append(toIndentedString(miniProgramUrl)).append("\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    estimatedClickRate: ").append(toIndentedString(estimatedClickRate)).append("\n");
    sb.append("    businessRelationship: ").append(toIndentedString(businessRelationship)).append("\n");
    sb.append("    landPageExperience: ").append(toIndentedString(landPageExperience)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    mobileFinalUrl: ").append(toIndentedString(mobileFinalUrl)).append("\n");
    sb.append("    mobileTrackParam: ").append(toIndentedString(mobileTrackParam)).append("\n");
    sb.append("    mobileTrackTemplate: ").append(toIndentedString(mobileTrackTemplate)).append("\n");
    sb.append("    pcFinalUrl: ").append(toIndentedString(pcFinalUrl)).append("\n");
    sb.append("    pcTrackParam: ").append(toIndentedString(pcTrackParam)).append("\n");
    sb.append("    pcTrackTemplate: ").append(toIndentedString(pcTrackTemplate)).append("\n");
    sb.append("    ulink: ").append(toIndentedString(ulink)).append("\n");
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


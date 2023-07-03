
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "topLevelContainerId",
    "isInitialised",
    "serviceNumber",
    "isAssignable",
    "subjectMatterRating",
    "tertiaryCode",
    "vanityCode",
    "addressId",
    "profileType",
    "serviceNumberHi",
    "modelDisplayValue",
    "image",
    "creditLimit",
    "networkId",
    "state",
    "assignmentAnnotation",
    "operatorId",
    "serialNumber",
    "maskPpvTitle",
    "secondaryCode",
    "equipmentConditionNotes",
    "endDateTime",
    "inventoryIdResets",
    "languageCode",
    "invsResponsiblePartyId",
    "locationDetailId",
    "channelMap",
    "accountId",
    "equipmentConditionId",
    "statusId",
    "warrantyExpDt",
    "serviceNumberLength",
    "tokenLimit",
    "inventoryTypeId",
    "blacklistReasonId",
    "rateCenterId",
    "isCustomerOwned",
    "annotation3",
    "inventoryBatchId",
    "primaryCode",
    "isDonated",
    "annotation2",
    "annotation1",
    "expireDt",
    "salesChannelId",
    "msgGroup",
    "portabilityIndicator",
    "geographicRegionId",
    "locationId",
    "stockPropertyConfigId",
    "serviceNumberLo",
    "provisioningData3",
    "provisioningData4",
    "inventoryLineId",
    "externalId",
    "provisioningData5",
    "provisioningData6",
    "provisioningData1",
    "provisioningData2",
    "startDateTime",
    "viewId",
    "networkDeviceId",
    "inventoryId",
    "topLevelContainerType",
    "isItem",
    "currencyCode",
    "paramA",
    "paramB",
    "mustBeReturned",
    "extendedData"
})
public class AssignInventoryToPlaceholderResponse {

    @JsonProperty("topLevelContainerId")
    private Integer topLevelContainerId;
    @JsonProperty("isInitialised")
    private Boolean isInitialised;
    @JsonProperty("serviceNumber")
    private String serviceNumber;
    @JsonProperty("isAssignable")
    private Boolean isAssignable;
    @JsonProperty("subjectMatterRating")
    private Integer subjectMatterRating;
    @JsonProperty("tertiaryCode")
    private String tertiaryCode;
    @JsonProperty("vanityCode")
    private VanityCode vanityCode;
    @JsonProperty("addressId")
    private Integer addressId;
    @JsonProperty("profileType")
    private Integer profileType;
    @JsonProperty("serviceNumberHi")
    private String serviceNumberHi;
    @JsonProperty("modelDisplayValue")
    private String modelDisplayValue;
    @JsonProperty("image")
    private String image;
    @JsonProperty("creditLimit")
    private Integer creditLimit;
    @JsonProperty("networkId")
    private String networkId;
    @JsonProperty("state")
    private Integer state;
    @JsonProperty("assignmentAnnotation")
    private String assignmentAnnotation;
    @JsonProperty("operatorId")
    private Integer operatorId;
    @JsonProperty("serialNumber")
    private String serialNumber;
    @JsonProperty("maskPpvTitle")
    private Boolean maskPpvTitle;
    @JsonProperty("secondaryCode")
    private String secondaryCode;
    @JsonProperty("equipmentConditionNotes")
    private String equipmentConditionNotes;
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("inventoryIdResets")
    private Integer inventoryIdResets;
    @JsonProperty("languageCode")
    private Integer languageCode;
    @JsonProperty("invsResponsiblePartyId")
    private InvsResponsiblePartyId invsResponsiblePartyId;
    @JsonProperty("locationDetailId")
    private Integer locationDetailId;
    @JsonProperty("channelMap")
    private String channelMap;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("equipmentConditionId")
    private Integer equipmentConditionId;
    @JsonProperty("statusId")
    private StatusId statusId;
    @JsonProperty("warrantyExpDt")
    private String warrantyExpDt;
    @JsonProperty("serviceNumberLength")
    private Integer serviceNumberLength;
    @JsonProperty("tokenLimit")
    private Integer tokenLimit;
    @JsonProperty("inventoryTypeId")
    private InventoryTypeId inventoryTypeId;
    @JsonProperty("blacklistReasonId")
    private BlacklistReasonId blacklistReasonId;
    @JsonProperty("rateCenterId")
    private Integer rateCenterId;
    @JsonProperty("isCustomerOwned")
    private Boolean isCustomerOwned;
    @JsonProperty("annotation3")
    private String annotation3;
    @JsonProperty("inventoryBatchId")
    private Integer inventoryBatchId;
    @JsonProperty("primaryCode")
    private String primaryCode;
    @JsonProperty("isDonated")
    private Boolean isDonated;
    @JsonProperty("annotation2")
    private String annotation2;
    @JsonProperty("annotation1")
    private String annotation1;
    @JsonProperty("expireDt")
    private String expireDt;
    @JsonProperty("salesChannelId")
    private SalesChannelId salesChannelId;
    @JsonProperty("msgGroup")
    private Integer msgGroup;
    @JsonProperty("portabilityIndicator")
    private Integer portabilityIndicator;
    @JsonProperty("geographicRegionId")
    private Integer geographicRegionId;
    @JsonProperty("locationId")
    private LocationId locationId;
    @JsonProperty("stockPropertyConfigId")
    private Integer stockPropertyConfigId;
    @JsonProperty("serviceNumberLo")
    private String serviceNumberLo;
    @JsonProperty("provisioningData3")
    private String provisioningData3;
    @JsonProperty("provisioningData4")
    private String provisioningData4;
    @JsonProperty("inventoryLineId")
    private InventoryLineId inventoryLineId;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("provisioningData5")
    private String provisioningData5;
    @JsonProperty("provisioningData6")
    private String provisioningData6;
    @JsonProperty("provisioningData1")
    private String provisioningData1;
    @JsonProperty("provisioningData2")
    private String provisioningData2;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("viewId")
    private Integer viewId;
    @JsonProperty("networkDeviceId")
    private Integer networkDeviceId;
    @JsonProperty("inventoryId")
    private Integer inventoryId;
    @JsonProperty("topLevelContainerType")
    private TopLevelContainerType topLevelContainerType;
    @JsonProperty("isItem")
    private Boolean isItem;
    @JsonProperty("currencyCode")
    private CurrencyCode currencyCode;
    @JsonProperty("paramA")
    private Integer paramA;
    @JsonProperty("paramB")
    private Integer paramB;
    @JsonProperty("mustBeReturned")
    private Integer mustBeReturned;
    @JsonProperty("extendedData")
    private ExtendedData extendedData;

    @JsonProperty("topLevelContainerId")
    public Integer getTopLevelContainerId() {
        return topLevelContainerId;
    }

    @JsonProperty("topLevelContainerId")
    public void setTopLevelContainerId(Integer topLevelContainerId) {
        this.topLevelContainerId = topLevelContainerId;
    }

    @JsonProperty("isInitialised")
    public Boolean getIsInitialised() {
        return isInitialised;
    }

    @JsonProperty("isInitialised")
    public void setIsInitialised(Boolean isInitialised) {
        this.isInitialised = isInitialised;
    }

    @JsonProperty("serviceNumber")
    public String getServiceNumber() {
        return serviceNumber;
    }

    @JsonProperty("serviceNumber")
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @JsonProperty("isAssignable")
    public Boolean getIsAssignable() {
        return isAssignable;
    }

    @JsonProperty("isAssignable")
    public void setIsAssignable(Boolean isAssignable) {
        this.isAssignable = isAssignable;
    }

    @JsonProperty("subjectMatterRating")
    public Integer getSubjectMatterRating() {
        return subjectMatterRating;
    }

    @JsonProperty("subjectMatterRating")
    public void setSubjectMatterRating(Integer subjectMatterRating) {
        this.subjectMatterRating = subjectMatterRating;
    }

    @JsonProperty("tertiaryCode")
    public String getTertiaryCode() {
        return tertiaryCode;
    }

    @JsonProperty("tertiaryCode")
    public void setTertiaryCode(String tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    @JsonProperty("vanityCode")
    public VanityCode getVanityCode() {
        return vanityCode;
    }

    @JsonProperty("vanityCode")
    public void setVanityCode(VanityCode vanityCode) {
        this.vanityCode = vanityCode;
    }

    @JsonProperty("addressId")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("profileType")
    public Integer getProfileType() {
        return profileType;
    }

    @JsonProperty("profileType")
    public void setProfileType(Integer profileType) {
        this.profileType = profileType;
    }

    @JsonProperty("serviceNumberHi")
    public String getServiceNumberHi() {
        return serviceNumberHi;
    }

    @JsonProperty("serviceNumberHi")
    public void setServiceNumberHi(String serviceNumberHi) {
        this.serviceNumberHi = serviceNumberHi;
    }

    @JsonProperty("modelDisplayValue")
    public String getModelDisplayValue() {
        return modelDisplayValue;
    }

    @JsonProperty("modelDisplayValue")
    public void setModelDisplayValue(String modelDisplayValue) {
        this.modelDisplayValue = modelDisplayValue;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("creditLimit")
    public Integer getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("networkId")
    public String getNetworkId() {
        return networkId;
    }

    @JsonProperty("networkId")
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    @JsonProperty("state")
    public Integer getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Integer state) {
        this.state = state;
    }

    @JsonProperty("assignmentAnnotation")
    public String getAssignmentAnnotation() {
        return assignmentAnnotation;
    }

    @JsonProperty("assignmentAnnotation")
    public void setAssignmentAnnotation(String assignmentAnnotation) {
        this.assignmentAnnotation = assignmentAnnotation;
    }

    @JsonProperty("operatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    @JsonProperty("operatorId")
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("maskPpvTitle")
    public Boolean getMaskPpvTitle() {
        return maskPpvTitle;
    }

    @JsonProperty("maskPpvTitle")
    public void setMaskPpvTitle(Boolean maskPpvTitle) {
        this.maskPpvTitle = maskPpvTitle;
    }

    @JsonProperty("secondaryCode")
    public String getSecondaryCode() {
        return secondaryCode;
    }

    @JsonProperty("secondaryCode")
    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    @JsonProperty("equipmentConditionNotes")
    public String getEquipmentConditionNotes() {
        return equipmentConditionNotes;
    }

    @JsonProperty("equipmentConditionNotes")
    public void setEquipmentConditionNotes(String equipmentConditionNotes) {
        this.equipmentConditionNotes = equipmentConditionNotes;
    }

    @JsonProperty("endDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("inventoryIdResets")
    public Integer getInventoryIdResets() {
        return inventoryIdResets;
    }

    @JsonProperty("inventoryIdResets")
    public void setInventoryIdResets(Integer inventoryIdResets) {
        this.inventoryIdResets = inventoryIdResets;
    }

    @JsonProperty("languageCode")
    public Integer getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("invsResponsiblePartyId")
    public InvsResponsiblePartyId getInvsResponsiblePartyId() {
        return invsResponsiblePartyId;
    }

    @JsonProperty("invsResponsiblePartyId")
    public void setInvsResponsiblePartyId(InvsResponsiblePartyId invsResponsiblePartyId) {
        this.invsResponsiblePartyId = invsResponsiblePartyId;
    }

    @JsonProperty("locationDetailId")
    public Integer getLocationDetailId() {
        return locationDetailId;
    }

    @JsonProperty("locationDetailId")
    public void setLocationDetailId(Integer locationDetailId) {
        this.locationDetailId = locationDetailId;
    }

    @JsonProperty("channelMap")
    public String getChannelMap() {
        return channelMap;
    }

    @JsonProperty("channelMap")
    public void setChannelMap(String channelMap) {
        this.channelMap = channelMap;
    }

    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("equipmentConditionId")
    public Integer getEquipmentConditionId() {
        return equipmentConditionId;
    }

    @JsonProperty("equipmentConditionId")
    public void setEquipmentConditionId(Integer equipmentConditionId) {
        this.equipmentConditionId = equipmentConditionId;
    }

    @JsonProperty("statusId")
    public StatusId getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(StatusId statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("warrantyExpDt")
    public String getWarrantyExpDt() {
        return warrantyExpDt;
    }

    @JsonProperty("warrantyExpDt")
    public void setWarrantyExpDt(String warrantyExpDt) {
        this.warrantyExpDt = warrantyExpDt;
    }

    @JsonProperty("serviceNumberLength")
    public Integer getServiceNumberLength() {
        return serviceNumberLength;
    }

    @JsonProperty("serviceNumberLength")
    public void setServiceNumberLength(Integer serviceNumberLength) {
        this.serviceNumberLength = serviceNumberLength;
    }

    @JsonProperty("tokenLimit")
    public Integer getTokenLimit() {
        return tokenLimit;
    }

    @JsonProperty("tokenLimit")
    public void setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

    @JsonProperty("inventoryTypeId")
    public InventoryTypeId getInventoryTypeId() {
        return inventoryTypeId;
    }

    @JsonProperty("inventoryTypeId")
    public void setInventoryTypeId(InventoryTypeId inventoryTypeId) {
        this.inventoryTypeId = inventoryTypeId;
    }

    @JsonProperty("blacklistReasonId")
    public BlacklistReasonId getBlacklistReasonId() {
        return blacklistReasonId;
    }

    @JsonProperty("blacklistReasonId")
    public void setBlacklistReasonId(BlacklistReasonId blacklistReasonId) {
        this.blacklistReasonId = blacklistReasonId;
    }

    @JsonProperty("rateCenterId")
    public Integer getRateCenterId() {
        return rateCenterId;
    }

    @JsonProperty("rateCenterId")
    public void setRateCenterId(Integer rateCenterId) {
        this.rateCenterId = rateCenterId;
    }

    @JsonProperty("isCustomerOwned")
    public Boolean getIsCustomerOwned() {
        return isCustomerOwned;
    }

    @JsonProperty("isCustomerOwned")
    public void setIsCustomerOwned(Boolean isCustomerOwned) {
        this.isCustomerOwned = isCustomerOwned;
    }

    @JsonProperty("annotation3")
    public String getAnnotation3() {
        return annotation3;
    }

    @JsonProperty("annotation3")
    public void setAnnotation3(String annotation3) {
        this.annotation3 = annotation3;
    }

    @JsonProperty("inventoryBatchId")
    public Integer getInventoryBatchId() {
        return inventoryBatchId;
    }

    @JsonProperty("inventoryBatchId")
    public void setInventoryBatchId(Integer inventoryBatchId) {
        this.inventoryBatchId = inventoryBatchId;
    }

    @JsonProperty("primaryCode")
    public String getPrimaryCode() {
        return primaryCode;
    }

    @JsonProperty("primaryCode")
    public void setPrimaryCode(String primaryCode) {
        this.primaryCode = primaryCode;
    }

    @JsonProperty("isDonated")
    public Boolean getIsDonated() {
        return isDonated;
    }

    @JsonProperty("isDonated")
    public void setIsDonated(Boolean isDonated) {
        this.isDonated = isDonated;
    }

    @JsonProperty("annotation2")
    public String getAnnotation2() {
        return annotation2;
    }

    @JsonProperty("annotation2")
    public void setAnnotation2(String annotation2) {
        this.annotation2 = annotation2;
    }

    @JsonProperty("annotation1")
    public String getAnnotation1() {
        return annotation1;
    }

    @JsonProperty("annotation1")
    public void setAnnotation1(String annotation1) {
        this.annotation1 = annotation1;
    }

    @JsonProperty("expireDt")
    public String getExpireDt() {
        return expireDt;
    }

    @JsonProperty("expireDt")
    public void setExpireDt(String expireDt) {
        this.expireDt = expireDt;
    }

    @JsonProperty("salesChannelId")
    public SalesChannelId getSalesChannelId() {
        return salesChannelId;
    }

    @JsonProperty("salesChannelId")
    public void setSalesChannelId(SalesChannelId salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    @JsonProperty("msgGroup")
    public Integer getMsgGroup() {
        return msgGroup;
    }

    @JsonProperty("msgGroup")
    public void setMsgGroup(Integer msgGroup) {
        this.msgGroup = msgGroup;
    }

    @JsonProperty("portabilityIndicator")
    public Integer getPortabilityIndicator() {
        return portabilityIndicator;
    }

    @JsonProperty("portabilityIndicator")
    public void setPortabilityIndicator(Integer portabilityIndicator) {
        this.portabilityIndicator = portabilityIndicator;
    }

    @JsonProperty("geographicRegionId")
    public Integer getGeographicRegionId() {
        return geographicRegionId;
    }

    @JsonProperty("geographicRegionId")
    public void setGeographicRegionId(Integer geographicRegionId) {
        this.geographicRegionId = geographicRegionId;
    }

    @JsonProperty("locationId")
    public LocationId getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(LocationId locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("stockPropertyConfigId")
    public Integer getStockPropertyConfigId() {
        return stockPropertyConfigId;
    }

    @JsonProperty("stockPropertyConfigId")
    public void setStockPropertyConfigId(Integer stockPropertyConfigId) {
        this.stockPropertyConfigId = stockPropertyConfigId;
    }

    @JsonProperty("serviceNumberLo")
    public String getServiceNumberLo() {
        return serviceNumberLo;
    }

    @JsonProperty("serviceNumberLo")
    public void setServiceNumberLo(String serviceNumberLo) {
        this.serviceNumberLo = serviceNumberLo;
    }

    @JsonProperty("provisioningData3")
    public String getProvisioningData3() {
        return provisioningData3;
    }

    @JsonProperty("provisioningData3")
    public void setProvisioningData3(String provisioningData3) {
        this.provisioningData3 = provisioningData3;
    }

    @JsonProperty("provisioningData4")
    public String getProvisioningData4() {
        return provisioningData4;
    }

    @JsonProperty("provisioningData4")
    public void setProvisioningData4(String provisioningData4) {
        this.provisioningData4 = provisioningData4;
    }

    @JsonProperty("inventoryLineId")
    public InventoryLineId getInventoryLineId() {
        return inventoryLineId;
    }

    @JsonProperty("inventoryLineId")
    public void setInventoryLineId(InventoryLineId inventoryLineId) {
        this.inventoryLineId = inventoryLineId;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("provisioningData5")
    public String getProvisioningData5() {
        return provisioningData5;
    }

    @JsonProperty("provisioningData5")
    public void setProvisioningData5(String provisioningData5) {
        this.provisioningData5 = provisioningData5;
    }

    @JsonProperty("provisioningData6")
    public String getProvisioningData6() {
        return provisioningData6;
    }

    @JsonProperty("provisioningData6")
    public void setProvisioningData6(String provisioningData6) {
        this.provisioningData6 = provisioningData6;
    }

    @JsonProperty("provisioningData1")
    public String getProvisioningData1() {
        return provisioningData1;
    }

    @JsonProperty("provisioningData1")
    public void setProvisioningData1(String provisioningData1) {
        this.provisioningData1 = provisioningData1;
    }

    @JsonProperty("provisioningData2")
    public String getProvisioningData2() {
        return provisioningData2;
    }

    @JsonProperty("provisioningData2")
    public void setProvisioningData2(String provisioningData2) {
        this.provisioningData2 = provisioningData2;
    }

    @JsonProperty("startDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("startDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("viewId")
    public Integer getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    @JsonProperty("networkDeviceId")
    public Integer getNetworkDeviceId() {
        return networkDeviceId;
    }

    @JsonProperty("networkDeviceId")
    public void setNetworkDeviceId(Integer networkDeviceId) {
        this.networkDeviceId = networkDeviceId;
    }

    @JsonProperty("inventoryId")
    public Integer getInventoryId() {
        return inventoryId;
    }

    @JsonProperty("inventoryId")
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @JsonProperty("topLevelContainerType")
    public TopLevelContainerType getTopLevelContainerType() {
        return topLevelContainerType;
    }

    @JsonProperty("topLevelContainerType")
    public void setTopLevelContainerType(TopLevelContainerType topLevelContainerType) {
        this.topLevelContainerType = topLevelContainerType;
    }

    @JsonProperty("isItem")
    public Boolean getIsItem() {
        return isItem;
    }

    @JsonProperty("isItem")
    public void setIsItem(Boolean isItem) {
        this.isItem = isItem;
    }

    @JsonProperty("currencyCode")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("paramA")
    public Integer getParamA() {
        return paramA;
    }

    @JsonProperty("paramA")
    public void setParamA(Integer paramA) {
        this.paramA = paramA;
    }

    @JsonProperty("paramB")
    public Integer getParamB() {
        return paramB;
    }

    @JsonProperty("paramB")
    public void setParamB(Integer paramB) {
        this.paramB = paramB;
    }

    @JsonProperty("mustBeReturned")
    public Integer getMustBeReturned() {
        return mustBeReturned;
    }

    @JsonProperty("mustBeReturned")
    public void setMustBeReturned(Integer mustBeReturned) {
        this.mustBeReturned = mustBeReturned;
    }

    @JsonProperty("extendedData")
    public ExtendedData getExtendedData() {
        return extendedData;
    }

    @JsonProperty("extendedData")
    public void setExtendedData(ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

}

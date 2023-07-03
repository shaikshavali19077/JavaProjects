
package swagger.services.pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "networkDeviceId",
    "accountId",
    "addressId",
    "annotation1",
    "annotation2",
    "annotation3",
    "assignmentAnnotation",
    "blacklistReasonId",
    "channelMap",
    "creditLimit",
    "currencyCode",
    "endDateTime",
    "equipmentConditionId",
    "equipmentConditionNotes",
    "expireDt",
    "externalId",
    "geographicRegionId",
    "inventoryBatchId",
    "inventoryId",
    "inventoryIdResets",
    "inventoryLineId",
    "inventoryTypeId",
    "isAssignable",
    "isCustomerOwned",
    "isDonated",
    "isInitialised",
    "isItem",
    "languageCode",
    "locationDetailId",
    "locationId",
    "rateCenterId",
    "msgGroup",
    "serviceNumberLo",
    "serviceNumberHi",
    "secondaryCode",
    "subjectMatterRating",
    "networkId",
    "topLevelContainerId",
    "tokenLimit",
    "warrantyExpDt",
    "serialNumber",
    "state",
    "salesChannelId",
    "topLevelContainerType",
    "statusId",
    "portabilityIndicator",
    "extendedDataList",
    "serviceNumber",
    "provisioningData1",
    "primaryCode",
    "provisioningData2",
    "provisioningData3",
    "provisioningData4",
    "provisioningData5",
    "provisioningData6",
    "serviceNumberLength",
    "responsiblePartyId",
    "tertiaryCode",
    "stockPropertyConfigId",
    "vanityCode",
    "maskPpvTitle",
    "profileType",
    "operatorId",
    "startDateTime",
    "viewId",
    "paramB",
    "paramA",
    "mustBeReturned",
    "image",
    "modelDisplayValue"
})
public class InvElement {

    @JsonProperty("networkDeviceId")
    private Integer networkDeviceId;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("addressId")
    private Integer addressId;
    @JsonProperty("annotation1")
    private String annotation1;
    @JsonProperty("annotation2")
    private String annotation2;
    @JsonProperty("annotation3")
    private String annotation3;
    @JsonProperty("assignmentAnnotation")
    private String assignmentAnnotation;
    @JsonProperty("blacklistReasonId")
    private BlacklistReasonId blacklistReasonId;
    @JsonProperty("channelMap")
    private String channelMap;
    @JsonProperty("creditLimit")
    private Integer creditLimit;
    @JsonProperty("currencyCode")
    private CurrencyCode currencyCode;
    @JsonProperty("endDateTime")
    private String endDateTime;
    @JsonProperty("equipmentConditionId")
    private Integer equipmentConditionId;
    @JsonProperty("equipmentConditionNotes")
    private String equipmentConditionNotes;
    @JsonProperty("expireDt")
    private String expireDt;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("geographicRegionId")
    private Integer geographicRegionId;
    @JsonProperty("inventoryBatchId")
    private Integer inventoryBatchId;
    @JsonProperty("inventoryId")
    private Integer inventoryId;
    @JsonProperty("inventoryIdResets")
    private Integer inventoryIdResets;
    @JsonProperty("inventoryLineId")
    private InventoryLineId inventoryLineId;
    @JsonProperty("inventoryTypeId")
    private InventoryTypeId inventoryTypeId;
    @JsonProperty("isAssignable")
    private Boolean isAssignable;
    @JsonProperty("isCustomerOwned")
    private Boolean isCustomerOwned;
    @JsonProperty("isDonated")
    private Boolean isDonated;
    @JsonProperty("isInitialised")
    private Boolean isInitialised;
    @JsonProperty("isItem")
    private Boolean isItem;
    @JsonProperty("languageCode")
    private Integer languageCode;
    @JsonProperty("locationDetailId")
    private Integer locationDetailId;
    @JsonProperty("locationId")
    private LocationId locationId;
    @JsonProperty("rateCenterId")
    private Integer rateCenterId;
    @JsonProperty("msgGroup")
    private Integer msgGroup;
    @JsonProperty("serviceNumberLo")
    private String serviceNumberLo;
    @JsonProperty("serviceNumberHi")
    private String serviceNumberHi;
    @JsonProperty("secondaryCode")
    private String secondaryCode;
    @JsonProperty("subjectMatterRating")
    private Integer subjectMatterRating;
    @JsonProperty("networkId")
    private String networkId;
    @JsonProperty("topLevelContainerId")
    private Integer topLevelContainerId;
    @JsonProperty("tokenLimit")
    private Integer tokenLimit;
    @JsonProperty("warrantyExpDt")
    private String warrantyExpDt;
    @JsonProperty("serialNumber")
    private String serialNumber;
    @JsonProperty("state")
    private Integer state;
    @JsonProperty("salesChannelId")
    private SalesChannelId salesChannelId;
    @JsonProperty("topLevelContainerType")
    private TopLevelContainerType topLevelContainerType;
    @JsonProperty("statusId")
    private StatusId statusId;
    @JsonProperty("portabilityIndicator")
    private Integer portabilityIndicator;
    @JsonProperty("extendedDataList")
    private List<ExtendedData> extendedDataList = new ArrayList<ExtendedData>();
    @JsonProperty("serviceNumber")
    private String serviceNumber;
    @JsonProperty("provisioningData1")
    private String provisioningData1;
    @JsonProperty("primaryCode")
    private String primaryCode;
    @JsonProperty("provisioningData2")
    private String provisioningData2;
    @JsonProperty("provisioningData3")
    private String provisioningData3;
    @JsonProperty("provisioningData4")
    private String provisioningData4;
    @JsonProperty("provisioningData5")
    private String provisioningData5;
    @JsonProperty("provisioningData6")
    private String provisioningData6;
    @JsonProperty("serviceNumberLength")
    private Integer serviceNumberLength;
    @JsonProperty("responsiblePartyId")
    private ResponsiblePartyId responsiblePartyId;
    @JsonProperty("tertiaryCode")
    private String tertiaryCode;
    @JsonProperty("stockPropertyConfigId")
    private Integer stockPropertyConfigId;
    @JsonProperty("vanityCode")
    private VanityCode vanityCode;
    @JsonProperty("maskPpvTitle")
    private Boolean maskPpvTitle;
    @JsonProperty("profileType")
    private Integer profileType;
    @JsonProperty("operatorId")
    private Integer operatorId;
    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("viewId")
    private Integer viewId;
    @JsonProperty("paramB")
    private Integer paramB;
    @JsonProperty("paramA")
    private Integer paramA;
    @JsonProperty("mustBeReturned")
    private Integer mustBeReturned;
    @JsonProperty("image")
    private String image;
    @JsonProperty("modelDisplayValue")
    private String modelDisplayValue;

    @JsonProperty("networkDeviceId")
    public Integer getNetworkDeviceId() {
        return networkDeviceId;
    }

    @JsonProperty("networkDeviceId")
    public void setNetworkDeviceId(Integer networkDeviceId) {
        this.networkDeviceId = networkDeviceId;
    }

    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("addressId")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("annotation1")
    public String getAnnotation1() {
        return annotation1;
    }

    @JsonProperty("annotation1")
    public void setAnnotation1(String annotation1) {
        this.annotation1 = annotation1;
    }

    @JsonProperty("annotation2")
    public String getAnnotation2() {
        return annotation2;
    }

    @JsonProperty("annotation2")
    public void setAnnotation2(String annotation2) {
        this.annotation2 = annotation2;
    }

    @JsonProperty("annotation3")
    public String getAnnotation3() {
        return annotation3;
    }

    @JsonProperty("annotation3")
    public void setAnnotation3(String annotation3) {
        this.annotation3 = annotation3;
    }

    @JsonProperty("assignmentAnnotation")
    public String getAssignmentAnnotation() {
        return assignmentAnnotation;
    }

    @JsonProperty("assignmentAnnotation")
    public void setAssignmentAnnotation(String assignmentAnnotation) {
        this.assignmentAnnotation = assignmentAnnotation;
    }

    @JsonProperty("blacklistReasonId")
    public BlacklistReasonId getBlacklistReasonId() {
        return blacklistReasonId;
    }

    @JsonProperty("blacklistReasonId")
    public void setBlacklistReasonId(BlacklistReasonId blacklistReasonId) {
        this.blacklistReasonId = blacklistReasonId;
    }

    @JsonProperty("channelMap")
    public String getChannelMap() {
        return channelMap;
    }

    @JsonProperty("channelMap")
    public void setChannelMap(String channelMap) {
        this.channelMap = channelMap;
    }

    @JsonProperty("creditLimit")
    public Integer getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("currencyCode")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("endDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("equipmentConditionId")
    public Integer getEquipmentConditionId() {
        return equipmentConditionId;
    }

    @JsonProperty("equipmentConditionId")
    public void setEquipmentConditionId(Integer equipmentConditionId) {
        this.equipmentConditionId = equipmentConditionId;
    }

    @JsonProperty("equipmentConditionNotes")
    public String getEquipmentConditionNotes() {
        return equipmentConditionNotes;
    }

    @JsonProperty("equipmentConditionNotes")
    public void setEquipmentConditionNotes(String equipmentConditionNotes) {
        this.equipmentConditionNotes = equipmentConditionNotes;
    }

    @JsonProperty("expireDt")
    public String getExpireDt() {
        return expireDt;
    }

    @JsonProperty("expireDt")
    public void setExpireDt(String expireDt) {
        this.expireDt = expireDt;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("geographicRegionId")
    public Integer getGeographicRegionId() {
        return geographicRegionId;
    }

    @JsonProperty("geographicRegionId")
    public void setGeographicRegionId(Integer geographicRegionId) {
        this.geographicRegionId = geographicRegionId;
    }

    @JsonProperty("inventoryBatchId")
    public Integer getInventoryBatchId() {
        return inventoryBatchId;
    }

    @JsonProperty("inventoryBatchId")
    public void setInventoryBatchId(Integer inventoryBatchId) {
        this.inventoryBatchId = inventoryBatchId;
    }

    @JsonProperty("inventoryId")
    public Integer getInventoryId() {
        return inventoryId;
    }

    @JsonProperty("inventoryId")
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @JsonProperty("inventoryIdResets")
    public Integer getInventoryIdResets() {
        return inventoryIdResets;
    }

    @JsonProperty("inventoryIdResets")
    public void setInventoryIdResets(Integer inventoryIdResets) {
        this.inventoryIdResets = inventoryIdResets;
    }

    @JsonProperty("inventoryLineId")
    public InventoryLineId getInventoryLineId() {
        return inventoryLineId;
    }

    @JsonProperty("inventoryLineId")
    public void setInventoryLineId(InventoryLineId inventoryLineId) {
        this.inventoryLineId = inventoryLineId;
    }

    @JsonProperty("inventoryTypeId")
    public InventoryTypeId getInventoryTypeId() {
        return inventoryTypeId;
    }

    @JsonProperty("inventoryTypeId")
    public void setInventoryTypeId(InventoryTypeId inventoryTypeId) {
        this.inventoryTypeId = inventoryTypeId;
    }

    @JsonProperty("isAssignable")
    public Boolean getIsAssignable() {
        return isAssignable;
    }

    @JsonProperty("isAssignable")
    public void setIsAssignable(Boolean isAssignable) {
        this.isAssignable = isAssignable;
    }

    @JsonProperty("isCustomerOwned")
    public Boolean getIsCustomerOwned() {
        return isCustomerOwned;
    }

    @JsonProperty("isCustomerOwned")
    public void setIsCustomerOwned(Boolean isCustomerOwned) {
        this.isCustomerOwned = isCustomerOwned;
    }

    @JsonProperty("isDonated")
    public Boolean getIsDonated() {
        return isDonated;
    }

    @JsonProperty("isDonated")
    public void setIsDonated(Boolean isDonated) {
        this.isDonated = isDonated;
    }

    @JsonProperty("isInitialised")
    public Boolean getIsInitialised() {
        return isInitialised;
    }

    @JsonProperty("isInitialised")
    public void setIsInitialised(Boolean isInitialised) {
        this.isInitialised = isInitialised;
    }

    @JsonProperty("isItem")
    public Boolean getIsItem() {
        return isItem;
    }

    @JsonProperty("isItem")
    public void setIsItem(Boolean isItem) {
        this.isItem = isItem;
    }

    @JsonProperty("languageCode")
    public Integer getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("locationDetailId")
    public Integer getLocationDetailId() {
        return locationDetailId;
    }

    @JsonProperty("locationDetailId")
    public void setLocationDetailId(Integer locationDetailId) {
        this.locationDetailId = locationDetailId;
    }

    @JsonProperty("locationId")
    public LocationId getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(LocationId locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("rateCenterId")
    public Integer getRateCenterId() {
        return rateCenterId;
    }

    @JsonProperty("rateCenterId")
    public void setRateCenterId(Integer rateCenterId) {
        this.rateCenterId = rateCenterId;
    }

    @JsonProperty("msgGroup")
    public Integer getMsgGroup() {
        return msgGroup;
    }

    @JsonProperty("msgGroup")
    public void setMsgGroup(Integer msgGroup) {
        this.msgGroup = msgGroup;
    }

    @JsonProperty("serviceNumberLo")
    public String getServiceNumberLo() {
        return serviceNumberLo;
    }

    @JsonProperty("serviceNumberLo")
    public void setServiceNumberLo(String serviceNumberLo) {
        this.serviceNumberLo = serviceNumberLo;
    }

    @JsonProperty("serviceNumberHi")
    public String getServiceNumberHi() {
        return serviceNumberHi;
    }

    @JsonProperty("serviceNumberHi")
    public void setServiceNumberHi(String serviceNumberHi) {
        this.serviceNumberHi = serviceNumberHi;
    }

    @JsonProperty("secondaryCode")
    public String getSecondaryCode() {
        return secondaryCode;
    }

    @JsonProperty("secondaryCode")
    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    @JsonProperty("subjectMatterRating")
    public Integer getSubjectMatterRating() {
        return subjectMatterRating;
    }

    @JsonProperty("subjectMatterRating")
    public void setSubjectMatterRating(Integer subjectMatterRating) {
        this.subjectMatterRating = subjectMatterRating;
    }

    @JsonProperty("networkId")
    public String getNetworkId() {
        return networkId;
    }

    @JsonProperty("networkId")
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    @JsonProperty("topLevelContainerId")
    public Integer getTopLevelContainerId() {
        return topLevelContainerId;
    }

    @JsonProperty("topLevelContainerId")
    public void setTopLevelContainerId(Integer topLevelContainerId) {
        this.topLevelContainerId = topLevelContainerId;
    }

    @JsonProperty("tokenLimit")
    public Integer getTokenLimit() {
        return tokenLimit;
    }

    @JsonProperty("tokenLimit")
    public void setTokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
    }

    @JsonProperty("warrantyExpDt")
    public String getWarrantyExpDt() {
        return warrantyExpDt;
    }

    @JsonProperty("warrantyExpDt")
    public void setWarrantyExpDt(String warrantyExpDt) {
        this.warrantyExpDt = warrantyExpDt;
    }

    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("state")
    public Integer getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Integer state) {
        this.state = state;
    }

    @JsonProperty("salesChannelId")
    public SalesChannelId getSalesChannelId() {
        return salesChannelId;
    }

    @JsonProperty("salesChannelId")
    public void setSalesChannelId(SalesChannelId salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    @JsonProperty("topLevelContainerType")
    public TopLevelContainerType getTopLevelContainerType() {
        return topLevelContainerType;
    }

    @JsonProperty("topLevelContainerType")
    public void setTopLevelContainerType(TopLevelContainerType topLevelContainerType) {
        this.topLevelContainerType = topLevelContainerType;
    }

    @JsonProperty("statusId")
    public StatusId getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(StatusId statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("portabilityIndicator")
    public Integer getPortabilityIndicator() {
        return portabilityIndicator;
    }

    @JsonProperty("portabilityIndicator")
    public void setPortabilityIndicator(Integer portabilityIndicator) {
        this.portabilityIndicator = portabilityIndicator;
    }

    @JsonProperty("extendedDataList")
    public List<ExtendedData> getExtendedDataList() {
        return extendedDataList;
    }

    @JsonProperty("extendedDataList")
    public void setExtendedDataList(List<ExtendedData> extendedDataList) {
        this.extendedDataList = extendedDataList;
    }

    @JsonProperty("serviceNumber")
    public String getServiceNumber() {
        return serviceNumber;
    }

    @JsonProperty("serviceNumber")
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @JsonProperty("provisioningData1")
    public String getProvisioningData1() {
        return provisioningData1;
    }

    @JsonProperty("provisioningData1")
    public void setProvisioningData1(String provisioningData1) {
        this.provisioningData1 = provisioningData1;
    }

    @JsonProperty("primaryCode")
    public String getPrimaryCode() {
        return primaryCode;
    }

    @JsonProperty("primaryCode")
    public void setPrimaryCode(String primaryCode) {
        this.primaryCode = primaryCode;
    }

    @JsonProperty("provisioningData2")
    public String getProvisioningData2() {
        return provisioningData2;
    }

    @JsonProperty("provisioningData2")
    public void setProvisioningData2(String provisioningData2) {
        this.provisioningData2 = provisioningData2;
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

    @JsonProperty("serviceNumberLength")
    public Integer getServiceNumberLength() {
        return serviceNumberLength;
    }

    @JsonProperty("serviceNumberLength")
    public void setServiceNumberLength(Integer serviceNumberLength) {
        this.serviceNumberLength = serviceNumberLength;
    }

    @JsonProperty("responsiblePartyId")
    public ResponsiblePartyId getResponsiblePartyId() {
        return responsiblePartyId;
    }

    @JsonProperty("responsiblePartyId")
    public void setResponsiblePartyId(ResponsiblePartyId responsiblePartyId) {
        this.responsiblePartyId = responsiblePartyId;
    }

    @JsonProperty("tertiaryCode")
    public String getTertiaryCode() {
        return tertiaryCode;
    }

    @JsonProperty("tertiaryCode")
    public void setTertiaryCode(String tertiaryCode) {
        this.tertiaryCode = tertiaryCode;
    }

    @JsonProperty("stockPropertyConfigId")
    public Integer getStockPropertyConfigId() {
        return stockPropertyConfigId;
    }

    @JsonProperty("stockPropertyConfigId")
    public void setStockPropertyConfigId(Integer stockPropertyConfigId) {
        this.stockPropertyConfigId = stockPropertyConfigId;
    }

    @JsonProperty("vanityCode")
    public VanityCode getVanityCode() {
        return vanityCode;
    }

    @JsonProperty("vanityCode")
    public void setVanityCode(VanityCode vanityCode) {
        this.vanityCode = vanityCode;
    }

    @JsonProperty("maskPpvTitle")
    public Boolean getMaskPpvTitle() {
        return maskPpvTitle;
    }

    @JsonProperty("maskPpvTitle")
    public void setMaskPpvTitle(Boolean maskPpvTitle) {
        this.maskPpvTitle = maskPpvTitle;
    }

    @JsonProperty("profileType")
    public Integer getProfileType() {
        return profileType;
    }

    @JsonProperty("profileType")
    public void setProfileType(Integer profileType) {
        this.profileType = profileType;
    }

    @JsonProperty("operatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    @JsonProperty("operatorId")
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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

    @JsonProperty("paramB")
    public Integer getParamB() {
        return paramB;
    }

    @JsonProperty("paramB")
    public void setParamB(Integer paramB) {
        this.paramB = paramB;
    }

    @JsonProperty("paramA")
    public Integer getParamA() {
        return paramA;
    }

    @JsonProperty("paramA")
    public void setParamA(Integer paramA) {
        this.paramA = paramA;
    }

    @JsonProperty("mustBeReturned")
    public Integer getMustBeReturned() {
        return mustBeReturned;
    }

    @JsonProperty("mustBeReturned")
    public void setMustBeReturned(Integer mustBeReturned) {
        this.mustBeReturned = mustBeReturned;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("modelDisplayValue")
    public String getModelDisplayValue() {
        return modelDisplayValue;
    }

    @JsonProperty("modelDisplayValue")
    public void setModelDisplayValue(String modelDisplayValue) {
        this.modelDisplayValue = modelDisplayValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvElement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networkDeviceId");
        sb.append('=');
        sb.append(((this.networkDeviceId == null)?"<null>":this.networkDeviceId));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("addressId");
        sb.append('=');
        sb.append(((this.addressId == null)?"<null>":this.addressId));
        sb.append(',');
        sb.append("annotation1");
        sb.append('=');
        sb.append(((this.annotation1 == null)?"<null>":this.annotation1));
        sb.append(',');
        sb.append("annotation2");
        sb.append('=');
        sb.append(((this.annotation2 == null)?"<null>":this.annotation2));
        sb.append(',');
        sb.append("annotation3");
        sb.append('=');
        sb.append(((this.annotation3 == null)?"<null>":this.annotation3));
        sb.append(',');
        sb.append("assignmentAnnotation");
        sb.append('=');
        sb.append(((this.assignmentAnnotation == null)?"<null>":this.assignmentAnnotation));
        sb.append(',');
        sb.append("blacklistReasonId");
        sb.append('=');
        sb.append(((this.blacklistReasonId == null)?"<null>":this.blacklistReasonId));
        sb.append(',');
        sb.append("channelMap");
        sb.append('=');
        sb.append(((this.channelMap == null)?"<null>":this.channelMap));
        sb.append(',');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null)?"<null>":this.creditLimit));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("endDateTime");
        sb.append('=');
        sb.append(((this.endDateTime == null)?"<null>":this.endDateTime));
        sb.append(',');
        sb.append("equipmentConditionId");
        sb.append('=');
        sb.append(((this.equipmentConditionId == null)?"<null>":this.equipmentConditionId));
        sb.append(',');
        sb.append("equipmentConditionNotes");
        sb.append('=');
        sb.append(((this.equipmentConditionNotes == null)?"<null>":this.equipmentConditionNotes));
        sb.append(',');
        sb.append("expireDt");
        sb.append('=');
        sb.append(((this.expireDt == null)?"<null>":this.expireDt));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("geographicRegionId");
        sb.append('=');
        sb.append(((this.geographicRegionId == null)?"<null>":this.geographicRegionId));
        sb.append(',');
        sb.append("inventoryBatchId");
        sb.append('=');
        sb.append(((this.inventoryBatchId == null)?"<null>":this.inventoryBatchId));
        sb.append(',');
        sb.append("inventoryId");
        sb.append('=');
        sb.append(((this.inventoryId == null)?"<null>":this.inventoryId));
        sb.append(',');
        sb.append("inventoryIdResets");
        sb.append('=');
        sb.append(((this.inventoryIdResets == null)?"<null>":this.inventoryIdResets));
        sb.append(',');
        sb.append("inventoryLineId");
        sb.append('=');
        sb.append(((this.inventoryLineId == null)?"<null>":this.inventoryLineId));
        sb.append(',');
        sb.append("inventoryTypeId");
        sb.append('=');
        sb.append(((this.inventoryTypeId == null)?"<null>":this.inventoryTypeId));
        sb.append(',');
        sb.append("isAssignable");
        sb.append('=');
        sb.append(((this.isAssignable == null)?"<null>":this.isAssignable));
        sb.append(',');
        sb.append("isCustomerOwned");
        sb.append('=');
        sb.append(((this.isCustomerOwned == null)?"<null>":this.isCustomerOwned));
        sb.append(',');
        sb.append("isDonated");
        sb.append('=');
        sb.append(((this.isDonated == null)?"<null>":this.isDonated));
        sb.append(',');
        sb.append("isInitialised");
        sb.append('=');
        sb.append(((this.isInitialised == null)?"<null>":this.isInitialised));
        sb.append(',');
        sb.append("isItem");
        sb.append('=');
        sb.append(((this.isItem == null)?"<null>":this.isItem));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        sb.append("locationDetailId");
        sb.append('=');
        sb.append(((this.locationDetailId == null)?"<null>":this.locationDetailId));
        sb.append(',');
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("rateCenterId");
        sb.append('=');
        sb.append(((this.rateCenterId == null)?"<null>":this.rateCenterId));
        sb.append(',');
        sb.append("msgGroup");
        sb.append('=');
        sb.append(((this.msgGroup == null)?"<null>":this.msgGroup));
        sb.append(',');
        sb.append("serviceNumberLo");
        sb.append('=');
        sb.append(((this.serviceNumberLo == null)?"<null>":this.serviceNumberLo));
        sb.append(',');
        sb.append("serviceNumberHi");
        sb.append('=');
        sb.append(((this.serviceNumberHi == null)?"<null>":this.serviceNumberHi));
        sb.append(',');
        sb.append("secondaryCode");
        sb.append('=');
        sb.append(((this.secondaryCode == null)?"<null>":this.secondaryCode));
        sb.append(',');
        sb.append("subjectMatterRating");
        sb.append('=');
        sb.append(((this.subjectMatterRating == null)?"<null>":this.subjectMatterRating));
        sb.append(',');
        sb.append("networkId");
        sb.append('=');
        sb.append(((this.networkId == null)?"<null>":this.networkId));
        sb.append(',');
        sb.append("topLevelContainerId");
        sb.append('=');
        sb.append(((this.topLevelContainerId == null)?"<null>":this.topLevelContainerId));
        sb.append(',');
        sb.append("tokenLimit");
        sb.append('=');
        sb.append(((this.tokenLimit == null)?"<null>":this.tokenLimit));
        sb.append(',');
        sb.append("warrantyExpDt");
        sb.append('=');
        sb.append(((this.warrantyExpDt == null)?"<null>":this.warrantyExpDt));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("salesChannelId");
        sb.append('=');
        sb.append(((this.salesChannelId == null)?"<null>":this.salesChannelId));
        sb.append(',');
        sb.append("topLevelContainerType");
        sb.append('=');
        sb.append(((this.topLevelContainerType == null)?"<null>":this.topLevelContainerType));
        sb.append(',');
        sb.append("statusId");
        sb.append('=');
        sb.append(((this.statusId == null)?"<null>":this.statusId));
        sb.append(',');
        sb.append("portabilityIndicator");
        sb.append('=');
        sb.append(((this.portabilityIndicator == null)?"<null>":this.portabilityIndicator));
        sb.append(',');
        sb.append("extendedDataList");
        sb.append('=');
        sb.append(((this.extendedDataList == null)?"<null>":this.extendedDataList));
        sb.append(',');
        sb.append("serviceNumber");
        sb.append('=');
        sb.append(((this.serviceNumber == null)?"<null>":this.serviceNumber));
        sb.append(',');
        sb.append("provisioningData1");
        sb.append('=');
        sb.append(((this.provisioningData1 == null)?"<null>":this.provisioningData1));
        sb.append(',');
        sb.append("primaryCode");
        sb.append('=');
        sb.append(((this.primaryCode == null)?"<null>":this.primaryCode));
        sb.append(',');
        sb.append("provisioningData2");
        sb.append('=');
        sb.append(((this.provisioningData2 == null)?"<null>":this.provisioningData2));
        sb.append(',');
        sb.append("provisioningData3");
        sb.append('=');
        sb.append(((this.provisioningData3 == null)?"<null>":this.provisioningData3));
        sb.append(',');
        sb.append("provisioningData4");
        sb.append('=');
        sb.append(((this.provisioningData4 == null)?"<null>":this.provisioningData4));
        sb.append(',');
        sb.append("provisioningData5");
        sb.append('=');
        sb.append(((this.provisioningData5 == null)?"<null>":this.provisioningData5));
        sb.append(',');
        sb.append("provisioningData6");
        sb.append('=');
        sb.append(((this.provisioningData6 == null)?"<null>":this.provisioningData6));
        sb.append(',');
        sb.append("serviceNumberLength");
        sb.append('=');
        sb.append(((this.serviceNumberLength == null)?"<null>":this.serviceNumberLength));
        sb.append(',');
        sb.append("responsiblePartyId");
        sb.append('=');
        sb.append(((this.responsiblePartyId == null)?"<null>":this.responsiblePartyId));
        sb.append(',');
        sb.append("tertiaryCode");
        sb.append('=');
        sb.append(((this.tertiaryCode == null)?"<null>":this.tertiaryCode));
        sb.append(',');
        sb.append("stockPropertyConfigId");
        sb.append('=');
        sb.append(((this.stockPropertyConfigId == null)?"<null>":this.stockPropertyConfigId));
        sb.append(',');
        sb.append("vanityCode");
        sb.append('=');
        sb.append(((this.vanityCode == null)?"<null>":this.vanityCode));
        sb.append(',');
        sb.append("maskPpvTitle");
        sb.append('=');
        sb.append(((this.maskPpvTitle == null)?"<null>":this.maskPpvTitle));
        sb.append(',');
        sb.append("profileType");
        sb.append('=');
        sb.append(((this.profileType == null)?"<null>":this.profileType));
        sb.append(',');
        sb.append("operatorId");
        sb.append('=');
        sb.append(((this.operatorId == null)?"<null>":this.operatorId));
        sb.append(',');
        sb.append("startDateTime");
        sb.append('=');
        sb.append(((this.startDateTime == null)?"<null>":this.startDateTime));
        sb.append(',');
        sb.append("viewId");
        sb.append('=');
        sb.append(((this.viewId == null)?"<null>":this.viewId));
        sb.append(',');
        sb.append("paramB");
        sb.append('=');
        sb.append(((this.paramB == null)?"<null>":this.paramB));
        sb.append(',');
        sb.append("paramA");
        sb.append('=');
        sb.append(((this.paramA == null)?"<null>":this.paramA));
        sb.append(',');
        sb.append("mustBeReturned");
        sb.append('=');
        sb.append(((this.mustBeReturned == null)?"<null>":this.mustBeReturned));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("modelDisplayValue");
        sb.append('=');
        sb.append(((this.modelDisplayValue == null)?"<null>":this.modelDisplayValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package swagger.services.Ordering;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "originalServiceInternalIdResets",
    "orderId",
    "transferFromAccountInternalId",
    "createWho",
    "workflowStartDt",
    "newOpenItemId",
    "newPostpaidAccountInternalId",
    "completeDt",
    "generateWorkflow",
    "packageInstIdServ",
    "waiveInstallmentNrc",
    "redirectChargesBack",
    "updateAlternateAddress",
    "isServiceLevel",
    "originalServiceInternalId",
    "serviceOrderTypeId",
    "transferToAccountInternalId",
    "packageInstId",
    "serviceOrderId",
    "isExpanded",
    "serviceExternalId",
    "waiveUnbilledNrc",
    "createDt",
    "wpProcessId",
    "workflowEstCompleteDt",
    "orderStatusId",
    "relatedServiceOrderId",
    "wpJobId",
    "noRevision",
    "waiveRefinanceNrc",
    "redirectChargesToBalance",
    "additionalProperties",
    "serviceInternalId",
    "serviceInternalIdResets",
    "items",
    "workflowId",
    "queueEntryId",
    "extendedData",
    "openItemId",
    "pivotDate",
    "primaryOffering",
    "batchId",
    "waiveTerminationObligation",
    "emfConfigId",
    "statusReasonId",
    "exceptionId",
    "accountInternalId",
    "expediteFlag",
    "itemTypeId",
    "annotation",
    "inventoryOrderItems",
    "waiveUnmetObligation",
    "nestedDisconnect",
    "parentOrderCreateDt",
    "updateBillingAddress",
    "noCancel",
    "accountExternalId",
    "alignStart",
    "isSuborder",
    "newBalanceAccountInternalId"
})
public class ServiceOrder {

    @JsonProperty("originalServiceInternalIdResets")
    private Integer originalServiceInternalIdResets;
    @JsonProperty("orderId")
    private Integer orderId;
    @JsonProperty("transferFromAccountInternalId")
    private Integer transferFromAccountInternalId;
    @JsonProperty("createWho")
    private String createWho;
    @JsonProperty("workflowStartDt")
    private String workflowStartDt;
    @JsonProperty("newOpenItemId")
    private Integer newOpenItemId;
    @JsonProperty("newPostpaidAccountInternalId")
    private Integer newPostpaidAccountInternalId;
    @JsonProperty("completeDt")
    private String completeDt;
    @JsonProperty("generateWorkflow")
    private Boolean generateWorkflow;
    @JsonProperty("packageInstIdServ")
    private Integer packageInstIdServ;
    @JsonProperty("waiveInstallmentNrc")
    private Integer waiveInstallmentNrc;
    @JsonProperty("redirectChargesBack")
    private Boolean redirectChargesBack;
    @JsonProperty("updateAlternateAddress")
    private Boolean updateAlternateAddress;
    @JsonProperty("isServiceLevel")
    private Boolean isServiceLevel;
    @JsonProperty("originalServiceInternalId")
    private Integer originalServiceInternalId;
    @JsonProperty("serviceOrderTypeId")
    private ServiceOrderTypeId serviceOrderTypeId;
    @JsonProperty("transferToAccountInternalId")
    private Integer transferToAccountInternalId;
    @JsonProperty("packageInstId")
    private Integer packageInstId;
    @JsonProperty("serviceOrderId")
    private Integer serviceOrderId;
    @JsonProperty("isExpanded")
    private Integer isExpanded;
    @JsonProperty("serviceExternalId")
    private String serviceExternalId;
    @JsonProperty("waiveUnbilledNrc")
    private Integer waiveUnbilledNrc;
    @JsonProperty("createDt")
    private String createDt;
    @JsonProperty("wpProcessId")
    private String wpProcessId;
    @JsonProperty("workflowEstCompleteDt")
    private String workflowEstCompleteDt;
    @JsonProperty("orderStatusId")
    private OrderStatusId orderStatusId;
    @JsonProperty("relatedServiceOrderId")
    private Integer relatedServiceOrderId;
    @JsonProperty("wpJobId")
    private String wpJobId;
    @JsonProperty("noRevision")
    private Boolean noRevision;
    @JsonProperty("waiveRefinanceNrc")
    private Integer waiveRefinanceNrc;
    @JsonProperty("redirectChargesToBalance")
    private Integer redirectChargesToBalance;
    @JsonProperty("additionalProperties")
    private AdditionalProperties additionalProperties;
    @JsonProperty("serviceInternalId")
    private Integer serviceInternalId;
    @JsonProperty("serviceInternalIdResets")
    private Integer serviceInternalIdResets;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("workflowId")
    private Integer workflowId;
    @JsonProperty("queueEntryId")
    private Integer queueEntryId;
    @JsonProperty("extendedData")
    private ExtendedData extendedData;
    @JsonProperty("openItemId")
    private OpenItemId openItemId;
    @JsonProperty("pivotDate")
    private String pivotDate;
    @JsonProperty("primaryOffering")
    private PrimaryOffering primaryOffering;
    @JsonProperty("batchId")
    private Integer batchId;
    @JsonProperty("waiveTerminationObligation")
    private Boolean waiveTerminationObligation;
    @JsonProperty("emfConfigId")
    private EmfConfigId emfConfigId;
    @JsonProperty("statusReasonId")
    private Integer statusReasonId;
    @JsonProperty("exceptionId")
    private Integer exceptionId;
    @JsonProperty("accountInternalId")
    private Integer accountInternalId;
    @JsonProperty("expediteFlag")
    private Integer expediteFlag;
    @JsonProperty("itemTypeId")
    private Integer itemTypeId;
    @JsonProperty("annotation")
    private String annotation;
    @JsonProperty("inventoryOrderItems")
    private List<InventoryOrderItem> inventoryOrderItems = new ArrayList<InventoryOrderItem>();
    @JsonProperty("waiveUnmetObligation")
    private Boolean waiveUnmetObligation;
    @JsonProperty("nestedDisconnect")
    private Boolean nestedDisconnect;
    @JsonProperty("parentOrderCreateDt")
    private String parentOrderCreateDt;
    @JsonProperty("updateBillingAddress")
    private Boolean updateBillingAddress;
    @JsonProperty("noCancel")
    private Boolean noCancel;
    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("alignStart")
    private Boolean alignStart;
    @JsonProperty("isSuborder")
    private Boolean isSuborder;
    @JsonProperty("newBalanceAccountInternalId")
    private Integer newBalanceAccountInternalId;

    @JsonProperty("originalServiceInternalIdResets")
    public Integer getOriginalServiceInternalIdResets() {
        return originalServiceInternalIdResets;
    }

    @JsonProperty("originalServiceInternalIdResets")
    public void setOriginalServiceInternalIdResets(Integer originalServiceInternalIdResets) {
        this.originalServiceInternalIdResets = originalServiceInternalIdResets;
    }

    @JsonProperty("orderId")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("transferFromAccountInternalId")
    public Integer getTransferFromAccountInternalId() {
        return transferFromAccountInternalId;
    }

    @JsonProperty("transferFromAccountInternalId")
    public void setTransferFromAccountInternalId(Integer transferFromAccountInternalId) {
        this.transferFromAccountInternalId = transferFromAccountInternalId;
    }

    @JsonProperty("createWho")
    public String getCreateWho() {
        return createWho;
    }

    @JsonProperty("createWho")
    public void setCreateWho(String createWho) {
        this.createWho = createWho;
    }

    @JsonProperty("workflowStartDt")
    public String getWorkflowStartDt() {
        return workflowStartDt;
    }

    @JsonProperty("workflowStartDt")
    public void setWorkflowStartDt(String workflowStartDt) {
        this.workflowStartDt = workflowStartDt;
    }

    @JsonProperty("newOpenItemId")
    public Integer getNewOpenItemId() {
        return newOpenItemId;
    }

    @JsonProperty("newOpenItemId")
    public void setNewOpenItemId(Integer newOpenItemId) {
        this.newOpenItemId = newOpenItemId;
    }

    @JsonProperty("newPostpaidAccountInternalId")
    public Integer getNewPostpaidAccountInternalId() {
        return newPostpaidAccountInternalId;
    }

    @JsonProperty("newPostpaidAccountInternalId")
    public void setNewPostpaidAccountInternalId(Integer newPostpaidAccountInternalId) {
        this.newPostpaidAccountInternalId = newPostpaidAccountInternalId;
    }

    @JsonProperty("completeDt")
    public String getCompleteDt() {
        return completeDt;
    }

    @JsonProperty("completeDt")
    public void setCompleteDt(String completeDt) {
        this.completeDt = completeDt;
    }

    @JsonProperty("generateWorkflow")
    public Boolean getGenerateWorkflow() {
        return generateWorkflow;
    }

    @JsonProperty("generateWorkflow")
    public void setGenerateWorkflow(Boolean generateWorkflow) {
        this.generateWorkflow = generateWorkflow;
    }

    @JsonProperty("packageInstIdServ")
    public Integer getPackageInstIdServ() {
        return packageInstIdServ;
    }

    @JsonProperty("packageInstIdServ")
    public void setPackageInstIdServ(Integer packageInstIdServ) {
        this.packageInstIdServ = packageInstIdServ;
    }

    @JsonProperty("waiveInstallmentNrc")
    public Integer getWaiveInstallmentNrc() {
        return waiveInstallmentNrc;
    }

    @JsonProperty("waiveInstallmentNrc")
    public void setWaiveInstallmentNrc(Integer waiveInstallmentNrc) {
        this.waiveInstallmentNrc = waiveInstallmentNrc;
    }

    @JsonProperty("redirectChargesBack")
    public Boolean getRedirectChargesBack() {
        return redirectChargesBack;
    }

    @JsonProperty("redirectChargesBack")
    public void setRedirectChargesBack(Boolean redirectChargesBack) {
        this.redirectChargesBack = redirectChargesBack;
    }

    @JsonProperty("updateAlternateAddress")
    public Boolean getUpdateAlternateAddress() {
        return updateAlternateAddress;
    }

    @JsonProperty("updateAlternateAddress")
    public void setUpdateAlternateAddress(Boolean updateAlternateAddress) {
        this.updateAlternateAddress = updateAlternateAddress;
    }

    @JsonProperty("isServiceLevel")
    public Boolean getIsServiceLevel() {
        return isServiceLevel;
    }

    @JsonProperty("isServiceLevel")
    public void setIsServiceLevel(Boolean isServiceLevel) {
        this.isServiceLevel = isServiceLevel;
    }

    @JsonProperty("originalServiceInternalId")
    public Integer getOriginalServiceInternalId() {
        return originalServiceInternalId;
    }

    @JsonProperty("originalServiceInternalId")
    public void setOriginalServiceInternalId(Integer originalServiceInternalId) {
        this.originalServiceInternalId = originalServiceInternalId;
    }

    @JsonProperty("serviceOrderTypeId")
    public ServiceOrderTypeId getServiceOrderTypeId() {
        return serviceOrderTypeId;
    }

    @JsonProperty("serviceOrderTypeId")
    public void setServiceOrderTypeId(ServiceOrderTypeId serviceOrderTypeId) {
        this.serviceOrderTypeId = serviceOrderTypeId;
    }

    @JsonProperty("transferToAccountInternalId")
    public Integer getTransferToAccountInternalId() {
        return transferToAccountInternalId;
    }

    @JsonProperty("transferToAccountInternalId")
    public void setTransferToAccountInternalId(Integer transferToAccountInternalId) {
        this.transferToAccountInternalId = transferToAccountInternalId;
    }

    @JsonProperty("packageInstId")
    public Integer getPackageInstId() {
        return packageInstId;
    }

    @JsonProperty("packageInstId")
    public void setPackageInstId(Integer packageInstId) {
        this.packageInstId = packageInstId;
    }

    @JsonProperty("serviceOrderId")
    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("isExpanded")
    public Integer getIsExpanded() {
        return isExpanded;
    }

    @JsonProperty("isExpanded")
    public void setIsExpanded(Integer isExpanded) {
        this.isExpanded = isExpanded;
    }

    @JsonProperty("serviceExternalId")
    public String getServiceExternalId() {
        return serviceExternalId;
    }

    @JsonProperty("serviceExternalId")
    public void setServiceExternalId(String serviceExternalId) {
        this.serviceExternalId = serviceExternalId;
    }

    @JsonProperty("waiveUnbilledNrc")
    public Integer getWaiveUnbilledNrc() {
        return waiveUnbilledNrc;
    }

    @JsonProperty("waiveUnbilledNrc")
    public void setWaiveUnbilledNrc(Integer waiveUnbilledNrc) {
        this.waiveUnbilledNrc = waiveUnbilledNrc;
    }

    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    @JsonProperty("wpProcessId")
    public String getWpProcessId() {
        return wpProcessId;
    }

    @JsonProperty("wpProcessId")
    public void setWpProcessId(String wpProcessId) {
        this.wpProcessId = wpProcessId;
    }

    @JsonProperty("workflowEstCompleteDt")
    public String getWorkflowEstCompleteDt() {
        return workflowEstCompleteDt;
    }

    @JsonProperty("workflowEstCompleteDt")
    public void setWorkflowEstCompleteDt(String workflowEstCompleteDt) {
        this.workflowEstCompleteDt = workflowEstCompleteDt;
    }

    @JsonProperty("orderStatusId")
    public OrderStatusId getOrderStatusId() {
        return orderStatusId;
    }

    @JsonProperty("orderStatusId")
    public void setOrderStatusId(OrderStatusId orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @JsonProperty("relatedServiceOrderId")
    public Integer getRelatedServiceOrderId() {
        return relatedServiceOrderId;
    }

    @JsonProperty("relatedServiceOrderId")
    public void setRelatedServiceOrderId(Integer relatedServiceOrderId) {
        this.relatedServiceOrderId = relatedServiceOrderId;
    }

    @JsonProperty("wpJobId")
    public String getWpJobId() {
        return wpJobId;
    }

    @JsonProperty("wpJobId")
    public void setWpJobId(String wpJobId) {
        this.wpJobId = wpJobId;
    }

    @JsonProperty("noRevision")
    public Boolean getNoRevision() {
        return noRevision;
    }

    @JsonProperty("noRevision")
    public void setNoRevision(Boolean noRevision) {
        this.noRevision = noRevision;
    }

    @JsonProperty("waiveRefinanceNrc")
    public Integer getWaiveRefinanceNrc() {
        return waiveRefinanceNrc;
    }

    @JsonProperty("waiveRefinanceNrc")
    public void setWaiveRefinanceNrc(Integer waiveRefinanceNrc) {
        this.waiveRefinanceNrc = waiveRefinanceNrc;
    }

    @JsonProperty("redirectChargesToBalance")
    public Integer getRedirectChargesToBalance() {
        return redirectChargesToBalance;
    }

    @JsonProperty("redirectChargesToBalance")
    public void setRedirectChargesToBalance(Integer redirectChargesToBalance) {
        this.redirectChargesToBalance = redirectChargesToBalance;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("serviceInternalId")
    public Integer getServiceInternalId() {
        return serviceInternalId;
    }

    @JsonProperty("serviceInternalId")
    public void setServiceInternalId(Integer serviceInternalId) {
        this.serviceInternalId = serviceInternalId;
    }

    @JsonProperty("serviceInternalIdResets")
    public Integer getServiceInternalIdResets() {
        return serviceInternalIdResets;
    }

    @JsonProperty("serviceInternalIdResets")
    public void setServiceInternalIdResets(Integer serviceInternalIdResets) {
        this.serviceInternalIdResets = serviceInternalIdResets;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("workflowId")
    public Integer getWorkflowId() {
        return workflowId;
    }

    @JsonProperty("workflowId")
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    @JsonProperty("queueEntryId")
    public Integer getQueueEntryId() {
        return queueEntryId;
    }

    @JsonProperty("queueEntryId")
    public void setQueueEntryId(Integer queueEntryId) {
        this.queueEntryId = queueEntryId;
    }

    @JsonProperty("extendedData")
    public ExtendedData getExtendedData() {
        return extendedData;
    }

    @JsonProperty("extendedData")
    public void setExtendedData(ExtendedData extendedData) {
        this.extendedData = extendedData;
    }

    @JsonProperty("openItemId")
    public OpenItemId getOpenItemId() {
        return openItemId;
    }

    @JsonProperty("openItemId")
    public void setOpenItemId(OpenItemId openItemId) {
        this.openItemId = openItemId;
    }

    @JsonProperty("pivotDate")
    public String getPivotDate() {
        return pivotDate;
    }

    @JsonProperty("pivotDate")
    public void setPivotDate(String pivotDate) {
        this.pivotDate = pivotDate;
    }

    @JsonProperty("primaryOffering")
    public PrimaryOffering getPrimaryOffering() {
        return primaryOffering;
    }

    @JsonProperty("primaryOffering")
    public void setPrimaryOffering(PrimaryOffering primaryOffering) {
        this.primaryOffering = primaryOffering;
    }

    @JsonProperty("batchId")
    public Integer getBatchId() {
        return batchId;
    }

    @JsonProperty("batchId")
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    @JsonProperty("waiveTerminationObligation")
    public Boolean getWaiveTerminationObligation() {
        return waiveTerminationObligation;
    }

    @JsonProperty("waiveTerminationObligation")
    public void setWaiveTerminationObligation(Boolean waiveTerminationObligation) {
        this.waiveTerminationObligation = waiveTerminationObligation;
    }

    @JsonProperty("emfConfigId")
    public EmfConfigId getEmfConfigId() {
        return emfConfigId;
    }

    @JsonProperty("emfConfigId")
    public void setEmfConfigId(EmfConfigId emfConfigId) {
        this.emfConfigId = emfConfigId;
    }

    @JsonProperty("statusReasonId")
    public Integer getStatusReasonId() {
        return statusReasonId;
    }

    @JsonProperty("statusReasonId")
    public void setStatusReasonId(Integer statusReasonId) {
        this.statusReasonId = statusReasonId;
    }

    @JsonProperty("exceptionId")
    public Integer getExceptionId() {
        return exceptionId;
    }

    @JsonProperty("exceptionId")
    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    @JsonProperty("accountInternalId")
    public Integer getAccountInternalId() {
        return accountInternalId;
    }

    @JsonProperty("accountInternalId")
    public void setAccountInternalId(Integer accountInternalId) {
        this.accountInternalId = accountInternalId;
    }

    @JsonProperty("expediteFlag")
    public Integer getExpediteFlag() {
        return expediteFlag;
    }

    @JsonProperty("expediteFlag")
    public void setExpediteFlag(Integer expediteFlag) {
        this.expediteFlag = expediteFlag;
    }

    @JsonProperty("itemTypeId")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    @JsonProperty("itemTypeId")
    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    @JsonProperty("annotation")
    public String getAnnotation() {
        return annotation;
    }

    @JsonProperty("annotation")
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @JsonProperty("inventoryOrderItems")
    public List<InventoryOrderItem> getInventoryOrderItems() {
        return inventoryOrderItems;
    }

    @JsonProperty("inventoryOrderItems")
    public void setInventoryOrderItems(List<InventoryOrderItem> inventoryOrderItems) {
        this.inventoryOrderItems = inventoryOrderItems;
    }

    @JsonProperty("waiveUnmetObligation")
    public Boolean getWaiveUnmetObligation() {
        return waiveUnmetObligation;
    }

    @JsonProperty("waiveUnmetObligation")
    public void setWaiveUnmetObligation(Boolean waiveUnmetObligation) {
        this.waiveUnmetObligation = waiveUnmetObligation;
    }

    @JsonProperty("nestedDisconnect")
    public Boolean getNestedDisconnect() {
        return nestedDisconnect;
    }

    @JsonProperty("nestedDisconnect")
    public void setNestedDisconnect(Boolean nestedDisconnect) {
        this.nestedDisconnect = nestedDisconnect;
    }

    @JsonProperty("parentOrderCreateDt")
    public String getParentOrderCreateDt() {
        return parentOrderCreateDt;
    }

    @JsonProperty("parentOrderCreateDt")
    public void setParentOrderCreateDt(String parentOrderCreateDt) {
        this.parentOrderCreateDt = parentOrderCreateDt;
    }

    @JsonProperty("updateBillingAddress")
    public Boolean getUpdateBillingAddress() {
        return updateBillingAddress;
    }

    @JsonProperty("updateBillingAddress")
    public void setUpdateBillingAddress(Boolean updateBillingAddress) {
        this.updateBillingAddress = updateBillingAddress;
    }

    @JsonProperty("noCancel")
    public Boolean getNoCancel() {
        return noCancel;
    }

    @JsonProperty("noCancel")
    public void setNoCancel(Boolean noCancel) {
        this.noCancel = noCancel;
    }

    @JsonProperty("accountExternalId")
    public String getAccountExternalId() {
        return accountExternalId;
    }

    @JsonProperty("accountExternalId")
    public void setAccountExternalId(String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }

    @JsonProperty("alignStart")
    public Boolean getAlignStart() {
        return alignStart;
    }

    @JsonProperty("alignStart")
    public void setAlignStart(Boolean alignStart) {
        this.alignStart = alignStart;
    }

    @JsonProperty("isSuborder")
    public Boolean getIsSuborder() {
        return isSuborder;
    }

    @JsonProperty("isSuborder")
    public void setIsSuborder(Boolean isSuborder) {
        this.isSuborder = isSuborder;
    }

    @JsonProperty("newBalanceAccountInternalId")
    public Integer getNewBalanceAccountInternalId() {
        return newBalanceAccountInternalId;
    }

    @JsonProperty("newBalanceAccountInternalId")
    public void setNewBalanceAccountInternalId(Integer newBalanceAccountInternalId) {
        this.newBalanceAccountInternalId = newBalanceAccountInternalId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceOrder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originalServiceInternalIdResets");
        sb.append('=');
        sb.append(((this.originalServiceInternalIdResets == null)?"<null>":this.originalServiceInternalIdResets));
        sb.append(',');
        sb.append("orderId");
        sb.append('=');
        sb.append(((this.orderId == null)?"<null>":this.orderId));
        sb.append(',');
        sb.append("transferFromAccountInternalId");
        sb.append('=');
        sb.append(((this.transferFromAccountInternalId == null)?"<null>":this.transferFromAccountInternalId));
        sb.append(',');
        sb.append("createWho");
        sb.append('=');
        sb.append(((this.createWho == null)?"<null>":this.createWho));
        sb.append(',');
        sb.append("workflowStartDt");
        sb.append('=');
        sb.append(((this.workflowStartDt == null)?"<null>":this.workflowStartDt));
        sb.append(',');
        sb.append("newOpenItemId");
        sb.append('=');
        sb.append(((this.newOpenItemId == null)?"<null>":this.newOpenItemId));
        sb.append(',');
        sb.append("newPostpaidAccountInternalId");
        sb.append('=');
        sb.append(((this.newPostpaidAccountInternalId == null)?"<null>":this.newPostpaidAccountInternalId));
        sb.append(',');
        sb.append("completeDt");
        sb.append('=');
        sb.append(((this.completeDt == null)?"<null>":this.completeDt));
        sb.append(',');
        sb.append("generateWorkflow");
        sb.append('=');
        sb.append(((this.generateWorkflow == null)?"<null>":this.generateWorkflow));
        sb.append(',');
        sb.append("packageInstIdServ");
        sb.append('=');
        sb.append(((this.packageInstIdServ == null)?"<null>":this.packageInstIdServ));
        sb.append(',');
        sb.append("waiveInstallmentNrc");
        sb.append('=');
        sb.append(((this.waiveInstallmentNrc == null)?"<null>":this.waiveInstallmentNrc));
        sb.append(',');
        sb.append("redirectChargesBack");
        sb.append('=');
        sb.append(((this.redirectChargesBack == null)?"<null>":this.redirectChargesBack));
        sb.append(',');
        sb.append("updateAlternateAddress");
        sb.append('=');
        sb.append(((this.updateAlternateAddress == null)?"<null>":this.updateAlternateAddress));
        sb.append(',');
        sb.append("isServiceLevel");
        sb.append('=');
        sb.append(((this.isServiceLevel == null)?"<null>":this.isServiceLevel));
        sb.append(',');
        sb.append("originalServiceInternalId");
        sb.append('=');
        sb.append(((this.originalServiceInternalId == null)?"<null>":this.originalServiceInternalId));
        sb.append(',');
        sb.append("serviceOrderTypeId");
        sb.append('=');
        sb.append(((this.serviceOrderTypeId == null)?"<null>":this.serviceOrderTypeId));
        sb.append(',');
        sb.append("transferToAccountInternalId");
        sb.append('=');
        sb.append(((this.transferToAccountInternalId == null)?"<null>":this.transferToAccountInternalId));
        sb.append(',');
        sb.append("packageInstId");
        sb.append('=');
        sb.append(((this.packageInstId == null)?"<null>":this.packageInstId));
        sb.append(',');
        sb.append("serviceOrderId");
        sb.append('=');
        sb.append(((this.serviceOrderId == null)?"<null>":this.serviceOrderId));
        sb.append(',');
        sb.append("isExpanded");
        sb.append('=');
        sb.append(((this.isExpanded == null)?"<null>":this.isExpanded));
        sb.append(',');
        sb.append("serviceExternalId");
        sb.append('=');
        sb.append(((this.serviceExternalId == null)?"<null>":this.serviceExternalId));
        sb.append(',');
        sb.append("waiveUnbilledNrc");
        sb.append('=');
        sb.append(((this.waiveUnbilledNrc == null)?"<null>":this.waiveUnbilledNrc));
        sb.append(',');
        sb.append("createDt");
        sb.append('=');
        sb.append(((this.createDt == null)?"<null>":this.createDt));
        sb.append(',');
        sb.append("wpProcessId");
        sb.append('=');
        sb.append(((this.wpProcessId == null)?"<null>":this.wpProcessId));
        sb.append(',');
        sb.append("workflowEstCompleteDt");
        sb.append('=');
        sb.append(((this.workflowEstCompleteDt == null)?"<null>":this.workflowEstCompleteDt));
        sb.append(',');
        sb.append("orderStatusId");
        sb.append('=');
        sb.append(((this.orderStatusId == null)?"<null>":this.orderStatusId));
        sb.append(',');
        sb.append("relatedServiceOrderId");
        sb.append('=');
        sb.append(((this.relatedServiceOrderId == null)?"<null>":this.relatedServiceOrderId));
        sb.append(',');
        sb.append("wpJobId");
        sb.append('=');
        sb.append(((this.wpJobId == null)?"<null>":this.wpJobId));
        sb.append(',');
        sb.append("noRevision");
        sb.append('=');
        sb.append(((this.noRevision == null)?"<null>":this.noRevision));
        sb.append(',');
        sb.append("waiveRefinanceNrc");
        sb.append('=');
        sb.append(((this.waiveRefinanceNrc == null)?"<null>":this.waiveRefinanceNrc));
        sb.append(',');
        sb.append("redirectChargesToBalance");
        sb.append('=');
        sb.append(((this.redirectChargesToBalance == null)?"<null>":this.redirectChargesToBalance));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("serviceInternalId");
        sb.append('=');
        sb.append(((this.serviceInternalId == null)?"<null>":this.serviceInternalId));
        sb.append(',');
        sb.append("serviceInternalIdResets");
        sb.append('=');
        sb.append(((this.serviceInternalIdResets == null)?"<null>":this.serviceInternalIdResets));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("workflowId");
        sb.append('=');
        sb.append(((this.workflowId == null)?"<null>":this.workflowId));
        sb.append(',');
        sb.append("queueEntryId");
        sb.append('=');
        sb.append(((this.queueEntryId == null)?"<null>":this.queueEntryId));
        sb.append(',');
        sb.append("extendedData");
        sb.append('=');
        sb.append(((this.extendedData == null)?"<null>":this.extendedData));
        sb.append(',');
        sb.append("openItemId");
        sb.append('=');
        sb.append(((this.openItemId == null)?"<null>":this.openItemId));
        sb.append(',');
        sb.append("pivotDate");
        sb.append('=');
        sb.append(((this.pivotDate == null)?"<null>":this.pivotDate));
        sb.append(',');
        sb.append("primaryOffering");
        sb.append('=');
        sb.append(((this.primaryOffering == null)?"<null>":this.primaryOffering));
        sb.append(',');
        sb.append("batchId");
        sb.append('=');
        sb.append(((this.batchId == null)?"<null>":this.batchId));
        sb.append(',');
        sb.append("waiveTerminationObligation");
        sb.append('=');
        sb.append(((this.waiveTerminationObligation == null)?"<null>":this.waiveTerminationObligation));
        sb.append(',');
        sb.append("emfConfigId");
        sb.append('=');
        sb.append(((this.emfConfigId == null)?"<null>":this.emfConfigId));
        sb.append(',');
        sb.append("statusReasonId");
        sb.append('=');
        sb.append(((this.statusReasonId == null)?"<null>":this.statusReasonId));
        sb.append(',');
        sb.append("exceptionId");
        sb.append('=');
        sb.append(((this.exceptionId == null)?"<null>":this.exceptionId));
        sb.append(',');
        sb.append("accountInternalId");
        sb.append('=');
        sb.append(((this.accountInternalId == null)?"<null>":this.accountInternalId));
        sb.append(',');
        sb.append("expediteFlag");
        sb.append('=');
        sb.append(((this.expediteFlag == null)?"<null>":this.expediteFlag));
        sb.append(',');
        sb.append("itemTypeId");
        sb.append('=');
        sb.append(((this.itemTypeId == null)?"<null>":this.itemTypeId));
        sb.append(',');
        sb.append("annotation");
        sb.append('=');
        sb.append(((this.annotation == null)?"<null>":this.annotation));
        sb.append(',');
        sb.append("inventoryOrderItems");
        sb.append('=');
        sb.append(((this.inventoryOrderItems == null)?"<null>":this.inventoryOrderItems));
        sb.append(',');
        sb.append("waiveUnmetObligation");
        sb.append('=');
        sb.append(((this.waiveUnmetObligation == null)?"<null>":this.waiveUnmetObligation));
        sb.append(',');
        sb.append("nestedDisconnect");
        sb.append('=');
        sb.append(((this.nestedDisconnect == null)?"<null>":this.nestedDisconnect));
        sb.append(',');
        sb.append("parentOrderCreateDt");
        sb.append('=');
        sb.append(((this.parentOrderCreateDt == null)?"<null>":this.parentOrderCreateDt));
        sb.append(',');
        sb.append("updateBillingAddress");
        sb.append('=');
        sb.append(((this.updateBillingAddress == null)?"<null>":this.updateBillingAddress));
        sb.append(',');
        sb.append("noCancel");
        sb.append('=');
        sb.append(((this.noCancel == null)?"<null>":this.noCancel));
        sb.append(',');
        sb.append("accountExternalId");
        sb.append('=');
        sb.append(((this.accountExternalId == null)?"<null>":this.accountExternalId));
        sb.append(',');
        sb.append("alignStart");
        sb.append('=');
        sb.append(((this.alignStart == null)?"<null>":this.alignStart));
        sb.append(',');
        sb.append("isSuborder");
        sb.append('=');
        sb.append(((this.isSuborder == null)?"<null>":this.isSuborder));
        sb.append(',');
        sb.append("newBalanceAccountInternalId");
        sb.append('=');
        sb.append(((this.newBalanceAccountInternalId == null)?"<null>":this.newBalanceAccountInternalId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

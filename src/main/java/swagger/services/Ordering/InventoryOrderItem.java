
package swagger.services.Ordering;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceNumber",
    "isCustomerOwned",
    "swapOutInventoryViewId",
    "swapInInvSerialNumber",
    "swapOutInvServiceNumber",
    "swapInInvIsItem",
    "inventoryViewId",
    "swapInInvServiceNumber",
    "revisionFlag",
    "itemActionId",
    "itemTypeId",
    "assignmentAnnotation",
    "swapOutInvIsItem",
    "serviceOrderId",
    "isCancelled",
    "serialNumber",
    "inventoryPlaceholderId",
    "swapOutInvSerialNumber",
    "swapInInvWarrantyExpDt",
    "swapOutInvAssignmentAnnotation",
    "createDt",
    "inventoryIdResets",
    "itemId",
    "warrantyExpDt",
    "swapInInventoryViewId",
    "swapOutInvWarrantyExpDt",
    "inventoryId",
    "isItem",
    "inventoryTypeId",
    "additionalProperties",
    "memberType",
    "workflowId"
})
public class InventoryOrderItem {

    @JsonProperty("serviceNumber")
    private String serviceNumber;
    @JsonProperty("isCustomerOwned")
    private Boolean isCustomerOwned;
    @JsonProperty("swapOutInventoryViewId")
    private Integer swapOutInventoryViewId;
    @JsonProperty("swapInInvSerialNumber")
    private String swapInInvSerialNumber;
    @JsonProperty("swapOutInvServiceNumber")
    private String swapOutInvServiceNumber;
    @JsonProperty("swapInInvIsItem")
    private Boolean swapInInvIsItem;
    @JsonProperty("inventoryViewId")
    private Integer inventoryViewId;
    @JsonProperty("swapInInvServiceNumber")
    private String swapInInvServiceNumber;
    @JsonProperty("revisionFlag")
    private Integer revisionFlag;
    @JsonProperty("itemActionId")
    private ItemActionId__1 itemActionId;
    @JsonProperty("itemTypeId")
    private ItemTypeId itemTypeId;
    @JsonProperty("assignmentAnnotation")
    private String assignmentAnnotation;
    @JsonProperty("swapOutInvIsItem")
    private Boolean swapOutInvIsItem;
    @JsonProperty("serviceOrderId")
    private Integer serviceOrderId;
    @JsonProperty("isCancelled")
    private Boolean isCancelled;
    @JsonProperty("serialNumber")
    private String serialNumber;
    @JsonProperty("inventoryPlaceholderId")
    private Integer inventoryPlaceholderId;
    @JsonProperty("swapOutInvSerialNumber")
    private String swapOutInvSerialNumber;
    @JsonProperty("swapInInvWarrantyExpDt")
    private String swapInInvWarrantyExpDt;
    @JsonProperty("swapOutInvAssignmentAnnotation")
    private String swapOutInvAssignmentAnnotation;
    @JsonProperty("createDt")
    private String createDt;
    @JsonProperty("inventoryIdResets")
    private Integer inventoryIdResets;
    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("warrantyExpDt")
    private String warrantyExpDt;
    @JsonProperty("swapInInventoryViewId")
    private Integer swapInInventoryViewId;
    @JsonProperty("swapOutInvWarrantyExpDt")
    private String swapOutInvWarrantyExpDt;
    @JsonProperty("inventoryId")
    private Integer inventoryId;
    @JsonProperty("isItem")
    private Boolean isItem;
    @JsonProperty("inventoryTypeId")
    private InventoryTypeId inventoryTypeId;
    @JsonProperty("additionalProperties")
    private AdditionalProperties__2 additionalProperties;
    @JsonProperty("memberType")
    private Integer memberType;
    @JsonProperty("workflowId")
    private Integer workflowId;

    @JsonProperty("serviceNumber")
    public String getServiceNumber() {
        return serviceNumber;
    }

    @JsonProperty("serviceNumber")
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    @JsonProperty("isCustomerOwned")
    public Boolean getIsCustomerOwned() {
        return isCustomerOwned;
    }

    @JsonProperty("isCustomerOwned")
    public void setIsCustomerOwned(Boolean isCustomerOwned) {
        this.isCustomerOwned = isCustomerOwned;
    }

    @JsonProperty("swapOutInventoryViewId")
    public Integer getSwapOutInventoryViewId() {
        return swapOutInventoryViewId;
    }

    @JsonProperty("swapOutInventoryViewId")
    public void setSwapOutInventoryViewId(Integer swapOutInventoryViewId) {
        this.swapOutInventoryViewId = swapOutInventoryViewId;
    }

    @JsonProperty("swapInInvSerialNumber")
    public String getSwapInInvSerialNumber() {
        return swapInInvSerialNumber;
    }

    @JsonProperty("swapInInvSerialNumber")
    public void setSwapInInvSerialNumber(String swapInInvSerialNumber) {
        this.swapInInvSerialNumber = swapInInvSerialNumber;
    }

    @JsonProperty("swapOutInvServiceNumber")
    public String getSwapOutInvServiceNumber() {
        return swapOutInvServiceNumber;
    }

    @JsonProperty("swapOutInvServiceNumber")
    public void setSwapOutInvServiceNumber(String swapOutInvServiceNumber) {
        this.swapOutInvServiceNumber = swapOutInvServiceNumber;
    }

    @JsonProperty("swapInInvIsItem")
    public Boolean getSwapInInvIsItem() {
        return swapInInvIsItem;
    }

    @JsonProperty("swapInInvIsItem")
    public void setSwapInInvIsItem(Boolean swapInInvIsItem) {
        this.swapInInvIsItem = swapInInvIsItem;
    }

    @JsonProperty("inventoryViewId")
    public Integer getInventoryViewId() {
        return inventoryViewId;
    }

    @JsonProperty("inventoryViewId")
    public void setInventoryViewId(Integer inventoryViewId) {
        this.inventoryViewId = inventoryViewId;
    }

    @JsonProperty("swapInInvServiceNumber")
    public String getSwapInInvServiceNumber() {
        return swapInInvServiceNumber;
    }

    @JsonProperty("swapInInvServiceNumber")
    public void setSwapInInvServiceNumber(String swapInInvServiceNumber) {
        this.swapInInvServiceNumber = swapInInvServiceNumber;
    }

    @JsonProperty("revisionFlag")
    public Integer getRevisionFlag() {
        return revisionFlag;
    }

    @JsonProperty("revisionFlag")
    public void setRevisionFlag(Integer revisionFlag) {
        this.revisionFlag = revisionFlag;
    }

    @JsonProperty("itemActionId")
    public ItemActionId__1 getItemActionId() {
        return itemActionId;
    }

    @JsonProperty("itemActionId")
    public void setItemActionId(ItemActionId__1 itemActionId) {
        this.itemActionId = itemActionId;
    }

    @JsonProperty("itemTypeId")
    public ItemTypeId getItemTypeId() {
        return itemTypeId;
    }

    @JsonProperty("itemTypeId")
    public void setItemTypeId(ItemTypeId itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    @JsonProperty("assignmentAnnotation")
    public String getAssignmentAnnotation() {
        return assignmentAnnotation;
    }

    @JsonProperty("assignmentAnnotation")
    public void setAssignmentAnnotation(String assignmentAnnotation) {
        this.assignmentAnnotation = assignmentAnnotation;
    }

    @JsonProperty("swapOutInvIsItem")
    public Boolean getSwapOutInvIsItem() {
        return swapOutInvIsItem;
    }

    @JsonProperty("swapOutInvIsItem")
    public void setSwapOutInvIsItem(Boolean swapOutInvIsItem) {
        this.swapOutInvIsItem = swapOutInvIsItem;
    }

    @JsonProperty("serviceOrderId")
    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("isCancelled")
    public Boolean getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("isCancelled")
    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("inventoryPlaceholderId")
    public Integer getInventoryPlaceholderId() {
        return inventoryPlaceholderId;
    }

    @JsonProperty("inventoryPlaceholderId")
    public void setInventoryPlaceholderId(Integer inventoryPlaceholderId) {
        this.inventoryPlaceholderId = inventoryPlaceholderId;
    }

    @JsonProperty("swapOutInvSerialNumber")
    public String getSwapOutInvSerialNumber() {
        return swapOutInvSerialNumber;
    }

    @JsonProperty("swapOutInvSerialNumber")
    public void setSwapOutInvSerialNumber(String swapOutInvSerialNumber) {
        this.swapOutInvSerialNumber = swapOutInvSerialNumber;
    }

    @JsonProperty("swapInInvWarrantyExpDt")
    public String getSwapInInvWarrantyExpDt() {
        return swapInInvWarrantyExpDt;
    }

    @JsonProperty("swapInInvWarrantyExpDt")
    public void setSwapInInvWarrantyExpDt(String swapInInvWarrantyExpDt) {
        this.swapInInvWarrantyExpDt = swapInInvWarrantyExpDt;
    }

    @JsonProperty("swapOutInvAssignmentAnnotation")
    public String getSwapOutInvAssignmentAnnotation() {
        return swapOutInvAssignmentAnnotation;
    }

    @JsonProperty("swapOutInvAssignmentAnnotation")
    public void setSwapOutInvAssignmentAnnotation(String swapOutInvAssignmentAnnotation) {
        this.swapOutInvAssignmentAnnotation = swapOutInvAssignmentAnnotation;
    }

    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    @JsonProperty("inventoryIdResets")
    public Integer getInventoryIdResets() {
        return inventoryIdResets;
    }

    @JsonProperty("inventoryIdResets")
    public void setInventoryIdResets(Integer inventoryIdResets) {
        this.inventoryIdResets = inventoryIdResets;
    }

    @JsonProperty("itemId")
    public Integer getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("warrantyExpDt")
    public String getWarrantyExpDt() {
        return warrantyExpDt;
    }

    @JsonProperty("warrantyExpDt")
    public void setWarrantyExpDt(String warrantyExpDt) {
        this.warrantyExpDt = warrantyExpDt;
    }

    @JsonProperty("swapInInventoryViewId")
    public Integer getSwapInInventoryViewId() {
        return swapInInventoryViewId;
    }

    @JsonProperty("swapInInventoryViewId")
    public void setSwapInInventoryViewId(Integer swapInInventoryViewId) {
        this.swapInInventoryViewId = swapInInventoryViewId;
    }

    @JsonProperty("swapOutInvWarrantyExpDt")
    public String getSwapOutInvWarrantyExpDt() {
        return swapOutInvWarrantyExpDt;
    }

    @JsonProperty("swapOutInvWarrantyExpDt")
    public void setSwapOutInvWarrantyExpDt(String swapOutInvWarrantyExpDt) {
        this.swapOutInvWarrantyExpDt = swapOutInvWarrantyExpDt;
    }

    @JsonProperty("inventoryId")
    public Integer getInventoryId() {
        return inventoryId;
    }

    @JsonProperty("inventoryId")
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @JsonProperty("isItem")
    public Boolean getIsItem() {
        return isItem;
    }

    @JsonProperty("isItem")
    public void setIsItem(Boolean isItem) {
        this.isItem = isItem;
    }

    @JsonProperty("inventoryTypeId")
    public InventoryTypeId getInventoryTypeId() {
        return inventoryTypeId;
    }

    @JsonProperty("inventoryTypeId")
    public void setInventoryTypeId(InventoryTypeId inventoryTypeId) {
        this.inventoryTypeId = inventoryTypeId;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__2 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__2 additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("memberType")
    public Integer getMemberType() {
        return memberType;
    }

    @JsonProperty("memberType")
    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    @JsonProperty("workflowId")
    public Integer getWorkflowId() {
        return workflowId;
    }

    @JsonProperty("workflowId")
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InventoryOrderItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceNumber");
        sb.append('=');
        sb.append(((this.serviceNumber == null)?"<null>":this.serviceNumber));
        sb.append(',');
        sb.append("isCustomerOwned");
        sb.append('=');
        sb.append(((this.isCustomerOwned == null)?"<null>":this.isCustomerOwned));
        sb.append(',');
        sb.append("swapOutInventoryViewId");
        sb.append('=');
        sb.append(((this.swapOutInventoryViewId == null)?"<null>":this.swapOutInventoryViewId));
        sb.append(',');
        sb.append("swapInInvSerialNumber");
        sb.append('=');
        sb.append(((this.swapInInvSerialNumber == null)?"<null>":this.swapInInvSerialNumber));
        sb.append(',');
        sb.append("swapOutInvServiceNumber");
        sb.append('=');
        sb.append(((this.swapOutInvServiceNumber == null)?"<null>":this.swapOutInvServiceNumber));
        sb.append(',');
        sb.append("swapInInvIsItem");
        sb.append('=');
        sb.append(((this.swapInInvIsItem == null)?"<null>":this.swapInInvIsItem));
        sb.append(',');
        sb.append("inventoryViewId");
        sb.append('=');
        sb.append(((this.inventoryViewId == null)?"<null>":this.inventoryViewId));
        sb.append(',');
        sb.append("swapInInvServiceNumber");
        sb.append('=');
        sb.append(((this.swapInInvServiceNumber == null)?"<null>":this.swapInInvServiceNumber));
        sb.append(',');
        sb.append("revisionFlag");
        sb.append('=');
        sb.append(((this.revisionFlag == null)?"<null>":this.revisionFlag));
        sb.append(',');
        sb.append("itemActionId");
        sb.append('=');
        sb.append(((this.itemActionId == null)?"<null>":this.itemActionId));
        sb.append(',');
        sb.append("itemTypeId");
        sb.append('=');
        sb.append(((this.itemTypeId == null)?"<null>":this.itemTypeId));
        sb.append(',');
        sb.append("assignmentAnnotation");
        sb.append('=');
        sb.append(((this.assignmentAnnotation == null)?"<null>":this.assignmentAnnotation));
        sb.append(',');
        sb.append("swapOutInvIsItem");
        sb.append('=');
        sb.append(((this.swapOutInvIsItem == null)?"<null>":this.swapOutInvIsItem));
        sb.append(',');
        sb.append("serviceOrderId");
        sb.append('=');
        sb.append(((this.serviceOrderId == null)?"<null>":this.serviceOrderId));
        sb.append(',');
        sb.append("isCancelled");
        sb.append('=');
        sb.append(((this.isCancelled == null)?"<null>":this.isCancelled));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("inventoryPlaceholderId");
        sb.append('=');
        sb.append(((this.inventoryPlaceholderId == null)?"<null>":this.inventoryPlaceholderId));
        sb.append(',');
        sb.append("swapOutInvSerialNumber");
        sb.append('=');
        sb.append(((this.swapOutInvSerialNumber == null)?"<null>":this.swapOutInvSerialNumber));
        sb.append(',');
        sb.append("swapInInvWarrantyExpDt");
        sb.append('=');
        sb.append(((this.swapInInvWarrantyExpDt == null)?"<null>":this.swapInInvWarrantyExpDt));
        sb.append(',');
        sb.append("swapOutInvAssignmentAnnotation");
        sb.append('=');
        sb.append(((this.swapOutInvAssignmentAnnotation == null)?"<null>":this.swapOutInvAssignmentAnnotation));
        sb.append(',');
        sb.append("createDt");
        sb.append('=');
        sb.append(((this.createDt == null)?"<null>":this.createDt));
        sb.append(',');
        sb.append("inventoryIdResets");
        sb.append('=');
        sb.append(((this.inventoryIdResets == null)?"<null>":this.inventoryIdResets));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("warrantyExpDt");
        sb.append('=');
        sb.append(((this.warrantyExpDt == null)?"<null>":this.warrantyExpDt));
        sb.append(',');
        sb.append("swapInInventoryViewId");
        sb.append('=');
        sb.append(((this.swapInInventoryViewId == null)?"<null>":this.swapInInventoryViewId));
        sb.append(',');
        sb.append("swapOutInvWarrantyExpDt");
        sb.append('=');
        sb.append(((this.swapOutInvWarrantyExpDt == null)?"<null>":this.swapOutInvWarrantyExpDt));
        sb.append(',');
        sb.append("inventoryId");
        sb.append('=');
        sb.append(((this.inventoryId == null)?"<null>":this.inventoryId));
        sb.append(',');
        sb.append("isItem");
        sb.append('=');
        sb.append(((this.isItem == null)?"<null>":this.isItem));
        sb.append(',');
        sb.append("inventoryTypeId");
        sb.append('=');
        sb.append(((this.inventoryTypeId == null)?"<null>":this.inventoryTypeId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("workflowId");
        sb.append('=');
        sb.append(((this.workflowId == null)?"<null>":this.workflowId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountNo",
    "inventoryNumber",
    "invSerialNumber",
    "invPlaceholderId",
    "viewId",
    "orderId",
    "serviceOrderId",
    "effectiveDate",
    "externalIdType",
    "manageVanityCharges",
    "assignmentAnnotation"
})
public class InvElementPlaceholder {

    @JsonProperty("accountNo")
    private Integer accountNo;
    @JsonProperty("inventoryNumber")
    private Integer inventoryNumber;
    @JsonProperty("invSerialNumber")
    private String invSerialNumber;
    @JsonProperty("invPlaceholderId")
    private Integer invPlaceholderId;
    @JsonProperty("viewId")
    private Integer viewId;
    @JsonProperty("orderId")
    private Integer orderId;
    @JsonProperty("serviceOrderId")
    private Integer serviceOrderId;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("externalIdType")
    private Integer externalIdType;
    @JsonProperty("manageVanityCharges")
    private Boolean manageVanityCharges;
    @JsonProperty("assignmentAnnotation")
    private String assignmentAnnotation;

    @JsonProperty("accountNo")
    public Integer getAccountNo() {
        return accountNo;
    }

    @JsonProperty("accountNo")
    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    @JsonProperty("inventoryNumber")
    public Integer getInventoryNumber() {
        return inventoryNumber;
    }

    @JsonProperty("inventoryNumber")
    public void setInventoryNumber(Integer inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    @JsonProperty("invSerialNumber")
    public String getInvSerialNumber() {
        return invSerialNumber;
    }

    @JsonProperty("invSerialNumber")
    public void setInvSerialNumber(String invSerialNumber) {
        this.invSerialNumber = invSerialNumber;
    }

    @JsonProperty("invPlaceholderId")
    public Integer getInvPlaceholderId() {
        return invPlaceholderId;
    }

    @JsonProperty("invPlaceholderId")
    public void setInvPlaceholderId(Integer invPlaceholderId) {
        this.invPlaceholderId = invPlaceholderId;
    }

    @JsonProperty("viewId")
    public Integer getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    @JsonProperty("orderId")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("serviceOrderId")
    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("externalIdType")
    public Integer getExternalIdType() {
        return externalIdType;
    }

    @JsonProperty("externalIdType")
    public void setExternalIdType(Integer externalIdType) {
        this.externalIdType = externalIdType;
    }

    @JsonProperty("manageVanityCharges")
    public Boolean getManageVanityCharges() {
        return manageVanityCharges;
    }

    @JsonProperty("manageVanityCharges")
    public void setManageVanityCharges(Boolean manageVanityCharges) {
        this.manageVanityCharges = manageVanityCharges;
    }

    @JsonProperty("assignmentAnnotation")
    public String getAssignmentAnnotation() {
        return assignmentAnnotation;
    }

    @JsonProperty("assignmentAnnotation")
    public void setAssignmentAnnotation(String assignmentAnnotation) {
        this.assignmentAnnotation = assignmentAnnotation;
    }

}


package swagger.services.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "viewId2",
    "isCancelled",
    "skipExtIdValidation",
    "memberDisplayValue",
    "createDt",
    "itemId",
    "memberInstId",
    "viewId",
    "revisionFlag",
    "itemActionId",
    "additionalProperties",
    "memberType",
    "itemTypeId",
    "workflowId",
    "memberInstId2",
    "serviceOrderId",
    "memberId"
})
public class Item {

    @JsonProperty("viewId2")
    private Integer viewId2;
    @JsonProperty("isCancelled")
    private Boolean isCancelled;
    @JsonProperty("skipExtIdValidation")
    private Integer skipExtIdValidation;
    @JsonProperty("memberDisplayValue")
    private String memberDisplayValue;
    @JsonProperty("createDt")
    private String createDt;
    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("memberInstId")
    private Integer memberInstId;
    @JsonProperty("viewId")
    private Integer viewId;
    @JsonProperty("revisionFlag")
    private Integer revisionFlag;
    @JsonProperty("itemActionId")
    private ItemActionId itemActionId;
    @JsonProperty("additionalProperties")
    private AdditionalProperties__1 additionalProperties;
    @JsonProperty("memberType")
    private Integer memberType;
    @JsonProperty("itemTypeId")
    private Integer itemTypeId;
    @JsonProperty("workflowId")
    private Integer workflowId;
    @JsonProperty("memberInstId2")
    private Integer memberInstId2;
    @JsonProperty("serviceOrderId")
    private Integer serviceOrderId;
    @JsonProperty("memberId")
    private Integer memberId;

    @JsonProperty("viewId2")
    public Integer getViewId2() {
        return viewId2;
    }

    @JsonProperty("viewId2")
    public void setViewId2(Integer viewId2) {
        this.viewId2 = viewId2;
    }

    @JsonProperty("isCancelled")
    public Boolean getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("isCancelled")
    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("skipExtIdValidation")
    public Integer getSkipExtIdValidation() {
        return skipExtIdValidation;
    }

    @JsonProperty("skipExtIdValidation")
    public void setSkipExtIdValidation(Integer skipExtIdValidation) {
        this.skipExtIdValidation = skipExtIdValidation;
    }

    @JsonProperty("memberDisplayValue")
    public String getMemberDisplayValue() {
        return memberDisplayValue;
    }

    @JsonProperty("memberDisplayValue")
    public void setMemberDisplayValue(String memberDisplayValue) {
        this.memberDisplayValue = memberDisplayValue;
    }

    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    @JsonProperty("itemId")
    public Integer getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("memberInstId")
    public Integer getMemberInstId() {
        return memberInstId;
    }

    @JsonProperty("memberInstId")
    public void setMemberInstId(Integer memberInstId) {
        this.memberInstId = memberInstId;
    }

    @JsonProperty("viewId")
    public Integer getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
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
    public ItemActionId getItemActionId() {
        return itemActionId;
    }

    @JsonProperty("itemActionId")
    public void setItemActionId(ItemActionId itemActionId) {
        this.itemActionId = itemActionId;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__1 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__1 additionalProperties) {
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

    @JsonProperty("itemTypeId")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    @JsonProperty("itemTypeId")
    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    @JsonProperty("workflowId")
    public Integer getWorkflowId() {
        return workflowId;
    }

    @JsonProperty("workflowId")
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    @JsonProperty("memberInstId2")
    public Integer getMemberInstId2() {
        return memberInstId2;
    }

    @JsonProperty("memberInstId2")
    public void setMemberInstId2(Integer memberInstId2) {
        this.memberInstId2 = memberInstId2;
    }

    @JsonProperty("serviceOrderId")
    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("memberId")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("viewId2");
        sb.append('=');
        sb.append(((this.viewId2 == null)?"<null>":this.viewId2));
        sb.append(',');
        sb.append("isCancelled");
        sb.append('=');
        sb.append(((this.isCancelled == null)?"<null>":this.isCancelled));
        sb.append(',');
        sb.append("skipExtIdValidation");
        sb.append('=');
        sb.append(((this.skipExtIdValidation == null)?"<null>":this.skipExtIdValidation));
        sb.append(',');
        sb.append("memberDisplayValue");
        sb.append('=');
        sb.append(((this.memberDisplayValue == null)?"<null>":this.memberDisplayValue));
        sb.append(',');
        sb.append("createDt");
        sb.append('=');
        sb.append(((this.createDt == null)?"<null>":this.createDt));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("memberInstId");
        sb.append('=');
        sb.append(((this.memberInstId == null)?"<null>":this.memberInstId));
        sb.append(',');
        sb.append("viewId");
        sb.append('=');
        sb.append(((this.viewId == null)?"<null>":this.viewId));
        sb.append(',');
        sb.append("revisionFlag");
        sb.append('=');
        sb.append(((this.revisionFlag == null)?"<null>":this.revisionFlag));
        sb.append(',');
        sb.append("itemActionId");
        sb.append('=');
        sb.append(((this.itemActionId == null)?"<null>":this.itemActionId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("itemTypeId");
        sb.append('=');
        sb.append(((this.itemTypeId == null)?"<null>":this.itemTypeId));
        sb.append(',');
        sb.append("workflowId");
        sb.append('=');
        sb.append(((this.workflowId == null)?"<null>":this.workflowId));
        sb.append(',');
        sb.append("memberInstId2");
        sb.append('=');
        sb.append(((this.memberInstId2 == null)?"<null>":this.memberInstId2));
        sb.append(',');
        sb.append("serviceOrderId");
        sb.append('=');
        sb.append(((this.serviceOrderId == null)?"<null>":this.serviceOrderId));
        sb.append(',');
        sb.append("memberId");
        sb.append('=');
        sb.append(((this.memberId == null)?"<null>":this.memberId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

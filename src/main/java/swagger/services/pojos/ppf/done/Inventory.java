
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "invTypeId",
    "invLineId",
    "offerId",
    "sourceSystem",
    "sourceSystemInvCode",
    "sourceSystemInvId",
    "assignmentStrategy",
    "isItem",
    "storeId",
    "containerTypeId",
    "reservationCreateDate",
    "sourceSystemInvIdType"
})
public class Inventory {

    @JsonProperty("invTypeId")
    private Integer invTypeId;
    @JsonProperty("invLineId")
    private Integer invLineId;
    @JsonProperty("offerId")
    private Integer offerId;
    @JsonProperty("sourceSystem")
    private Integer sourceSystem;
    @JsonProperty("sourceSystemInvCode")
    private String sourceSystemInvCode;
    @JsonProperty("sourceSystemInvId")
    private String sourceSystemInvId;
    @JsonProperty("assignmentStrategy")
    private Integer assignmentStrategy;
    @JsonProperty("isItem")
    private Boolean isItem;
    @JsonProperty("storeId")
    private String storeId;
    @JsonProperty("containerTypeId")
    private Integer containerTypeId;
    @JsonProperty("reservationCreateDate")
    private String reservationCreateDate;
    @JsonProperty("sourceSystemInvIdType")
    private SourceSystemInvIdType sourceSystemInvIdType;

    @JsonProperty("invTypeId")
    public Integer getInvTypeId() {
        return invTypeId;
    }

    @JsonProperty("invTypeId")
    public void setInvTypeId(Integer invTypeId) {
        this.invTypeId = invTypeId;
    }

    @JsonProperty("invLineId")
    public Integer getInvLineId() {
        return invLineId;
    }

    @JsonProperty("invLineId")
    public void setInvLineId(Integer invLineId) {
        this.invLineId = invLineId;
    }

    @JsonProperty("offerId")
    public Integer getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("sourceSystem")
    public Integer getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("sourceSystem")
    public void setSourceSystem(Integer sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @JsonProperty("sourceSystemInvCode")
    public String getSourceSystemInvCode() {
        return sourceSystemInvCode;
    }

    @JsonProperty("sourceSystemInvCode")
    public void setSourceSystemInvCode(String sourceSystemInvCode) {
        this.sourceSystemInvCode = sourceSystemInvCode;
    }

    @JsonProperty("sourceSystemInvId")
    public String getSourceSystemInvId() {
        return sourceSystemInvId;
    }

    @JsonProperty("sourceSystemInvId")
    public void setSourceSystemInvId(String sourceSystemInvId) {
        this.sourceSystemInvId = sourceSystemInvId;
    }

    @JsonProperty("assignmentStrategy")
    public Integer getAssignmentStrategy() {
        return assignmentStrategy;
    }

    @JsonProperty("assignmentStrategy")
    public void setAssignmentStrategy(Integer assignmentStrategy) {
        this.assignmentStrategy = assignmentStrategy;
    }

    @JsonProperty("isItem")
    public Boolean getIsItem() {
        return isItem;
    }

    @JsonProperty("isItem")
    public void setIsItem(Boolean isItem) {
        this.isItem = isItem;
    }

    @JsonProperty("storeId")
    public String getStoreId() {
        return storeId;
    }

    @JsonProperty("storeId")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("containerTypeId")
    public Integer getContainerTypeId() {
        return containerTypeId;
    }

    @JsonProperty("containerTypeId")
    public void setContainerTypeId(Integer containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    @JsonProperty("reservationCreateDate")
    public String getReservationCreateDate() {
        return reservationCreateDate;
    }

    @JsonProperty("reservationCreateDate")
    public void setReservationCreateDate(String reservationCreateDate) {
        this.reservationCreateDate = reservationCreateDate;
    }

    @JsonProperty("sourceSystemInvIdType")
    public SourceSystemInvIdType getSourceSystemInvIdType() {
        return sourceSystemInvIdType;
    }

    @JsonProperty("sourceSystemInvIdType")
    public void setSourceSystemInvIdType(SourceSystemInvIdType sourceSystemInvIdType) {
        this.sourceSystemInvIdType = sourceSystemInvIdType;
    }

}

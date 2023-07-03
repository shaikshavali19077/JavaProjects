
package swagger.services.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workOrderItemID",
    "itemNo",
    "material",
    "quantity",
    "plant",
    "agentId",
    "deliveryDate",
    "shipToOverride",
    "rejectionReason",
    "workOrderItemId",
    "deliveryBlock",
    "ratePlanCode",
    "transType",
    "brand",
    "specialInstructions",
    "pricing",
    "serials"
})
public class Item {

    @JsonProperty("workOrderItemID")
    private String workOrderItemID;
    @JsonProperty("itemNo")
    private String itemNo;
    @JsonProperty("material")
    private String material;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("plant")
    private String plant;
    @JsonProperty("agentId")
    private String agentId;
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    @JsonProperty("shipToOverride")
    private ShipToOverride shipToOverride;
    @JsonProperty("rejectionReason")
    private String rejectionReason;
    @JsonProperty("workOrderItemId")
    private String workOrderItemId;
    @JsonProperty("deliveryBlock")
    private String deliveryBlock;
    @JsonProperty("ratePlanCode")
    private String ratePlanCode;
    @JsonProperty("transType")
    private String transType;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("specialInstructions")
    private String specialInstructions;
    @JsonProperty("pricing")
    private Pricing pricing;
    @JsonProperty("serials")
    private List<String> serials = new ArrayList<String>();

    @JsonProperty("workOrderItemID")
    public String getWorkOrderItemID() {
        return workOrderItemID;
    }

    @JsonProperty("workOrderItemID")
    public void setWorkOrderItemID(String workOrderItemID) {
        this.workOrderItemID = workOrderItemID;
    }

    @JsonProperty("itemNo")
    public String getItemNo() {
        return itemNo;
    }

    @JsonProperty("itemNo")
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("plant")
    public String getPlant() {
        return plant;
    }

    @JsonProperty("plant")
    public void setPlant(String plant) {
        this.plant = plant;
    }

    @JsonProperty("agentId")
    public String getAgentId() {
        return agentId;
    }

    @JsonProperty("agentId")
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @JsonProperty("deliveryDate")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    @JsonProperty("deliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @JsonProperty("shipToOverride")
    public ShipToOverride getShipToOverride() {
        return shipToOverride;
    }

    @JsonProperty("shipToOverride")
    public void setShipToOverride(ShipToOverride shipToOverride) {
        this.shipToOverride = shipToOverride;
    }

    @JsonProperty("rejectionReason")
    public String getRejectionReason() {
        return rejectionReason;
    }

    @JsonProperty("rejectionReason")
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    @JsonProperty("workOrderItemId")
    public String getWorkOrderItemId() {
        return workOrderItemId;
    }

    @JsonProperty("workOrderItemId")
    public void setWorkOrderItemId(String workOrderItemId) {
        this.workOrderItemId = workOrderItemId;
    }

    @JsonProperty("deliveryBlock")
    public String getDeliveryBlock() {
        return deliveryBlock;
    }

    @JsonProperty("deliveryBlock")
    public void setDeliveryBlock(String deliveryBlock) {
        this.deliveryBlock = deliveryBlock;
    }

    @JsonProperty("ratePlanCode")
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    @JsonProperty("ratePlanCode")
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    @JsonProperty("transType")
    public String getTransType() {
        return transType;
    }

    @JsonProperty("transType")
    public void setTransType(String transType) {
        this.transType = transType;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("specialInstructions")
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    @JsonProperty("specialInstructions")
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    @JsonProperty("pricing")
    public Pricing getPricing() {
        return pricing;
    }

    @JsonProperty("pricing")
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    @JsonProperty("serials")
    public List<String> getSerials() {
        return serials;
    }

    @JsonProperty("serials")
    public void setSerials(List<String> serials) {
        this.serials = serials;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("workOrderItemID");
        sb.append('=');
        sb.append(((this.workOrderItemID == null)?"<null>":this.workOrderItemID));
        sb.append(',');
        sb.append("itemNo");
        sb.append('=');
        sb.append(((this.itemNo == null)?"<null>":this.itemNo));
        sb.append(',');
        sb.append("material");
        sb.append('=');
        sb.append(((this.material == null)?"<null>":this.material));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("plant");
        sb.append('=');
        sb.append(((this.plant == null)?"<null>":this.plant));
        sb.append(',');
        sb.append("agentId");
        sb.append('=');
        sb.append(((this.agentId == null)?"<null>":this.agentId));
        sb.append(',');
        sb.append("deliveryDate");
        sb.append('=');
        sb.append(((this.deliveryDate == null)?"<null>":this.deliveryDate));
        sb.append(',');
        sb.append("shipToOverride");
        sb.append('=');
        sb.append(((this.shipToOverride == null)?"<null>":this.shipToOverride));
        sb.append(',');
        sb.append("rejectionReason");
        sb.append('=');
        sb.append(((this.rejectionReason == null)?"<null>":this.rejectionReason));
        sb.append(',');
        sb.append("workOrderItemId");
        sb.append('=');
        sb.append(((this.workOrderItemId == null)?"<null>":this.workOrderItemId));
        sb.append(',');
        sb.append("deliveryBlock");
        sb.append('=');
        sb.append(((this.deliveryBlock == null)?"<null>":this.deliveryBlock));
        sb.append(',');
        sb.append("ratePlanCode");
        sb.append('=');
        sb.append(((this.ratePlanCode == null)?"<null>":this.ratePlanCode));
        sb.append(',');
        sb.append("transType");
        sb.append('=');
        sb.append(((this.transType == null)?"<null>":this.transType));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("specialInstructions");
        sb.append('=');
        sb.append(((this.specialInstructions == null)?"<null>":this.specialInstructions));
        sb.append(',');
        sb.append("pricing");
        sb.append('=');
        sb.append(((this.pricing == null)?"<null>":this.pricing));
        sb.append(',');
        sb.append("serials");
        sb.append('=');
        sb.append(((this.serials == null)?"<null>":this.serials));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payMethod",
    "clearingHouseId",
    "isTemporary"
})
public class PaymentMethod {

    @JsonProperty("payMethod")
    private PayMethod payMethod;
    @JsonProperty("clearingHouseId")
    private ClearingHouseId clearingHouseId;
    @JsonProperty("isTemporary")
    private Boolean isTemporary;

    @JsonProperty("payMethod")
    public PayMethod getPayMethod() {
        return payMethod;
    }

    @JsonProperty("payMethod")
    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    @JsonProperty("clearingHouseId")
    public ClearingHouseId getClearingHouseId() {
        return clearingHouseId;
    }

    @JsonProperty("clearingHouseId")
    public void setClearingHouseId(ClearingHouseId clearingHouseId) {
        this.clearingHouseId = clearingHouseId;
    }

    @JsonProperty("isTemporary")
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    @JsonProperty("isTemporary")
    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

}

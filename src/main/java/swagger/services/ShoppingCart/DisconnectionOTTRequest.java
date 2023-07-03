
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msisdn",
    "OTTService",
    "reasonCode",
    "accountExternalId",
    "componentId",
    "orderType",
    "brand"
})
public class DisconnectionOTTRequest {

    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("OTTService")
    private String oTTService;
    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("componentId")
    private String componentId;
    @JsonProperty("orderType")
    private String orderType;
    @JsonProperty("brand")
    private String brand;

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("OTTService")
    public String getOTTService() {
        return oTTService;
    }

    @JsonProperty("OTTService")
    public void setOTTService(String oTTService) {
        this.oTTService = oTTService;
    }

    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("accountExternalId")
    public String getAccountExternalId() {
        return accountExternalId;
    }

    @JsonProperty("accountExternalId")
    public void setAccountExternalId(String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }

    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    @JsonProperty("componentId")
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    @JsonProperty("orderType")
    public String getOrderType() {
        return orderType;
    }

    @JsonProperty("orderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DisconnectionOTTRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("oTTService");
        sb.append('=');
        sb.append(((this.oTTService == null)?"<null>":this.oTTService));
        sb.append(',');
        sb.append("reasonCode");
        sb.append('=');
        sb.append(((this.reasonCode == null)?"<null>":this.reasonCode));
        sb.append(',');
        sb.append("accountExternalId");
        sb.append('=');
        sb.append(((this.accountExternalId == null)?"<null>":this.accountExternalId));
        sb.append(',');
        sb.append("componentId");
        sb.append('=');
        sb.append(((this.componentId == null)?"<null>":this.componentId));
        sb.append(',');
        sb.append("orderType");
        sb.append('=');
        sb.append(((this.orderType == null)?"<null>":this.orderType));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

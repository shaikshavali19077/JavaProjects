
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msisdn",
    "OTTService",
    "action",
    "deviceId",
    "OfferId"
})
public class ChangeOfferRequest {

    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("OTTService")
    private String oTTService;
    @JsonProperty("action")
    private String action;
    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("OfferId")
    private String offerId;

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

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("OfferId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("OfferId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeOfferRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("oTTService");
        sb.append('=');
        sb.append(((this.oTTService == null)?"<null>":this.oTTService));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("deviceId");
        sb.append('=');
        sb.append(((this.deviceId == null)?"<null>":this.deviceId));
        sb.append(',');
        sb.append("offerId");
        sb.append('=');
        sb.append(((this.offerId == null)?"<null>":this.offerId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

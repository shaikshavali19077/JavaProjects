
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountExternalId",
    "serviceExternalID",
    "msisdn",
    "deviceId",
    "action",
    "offerId",
    "ottservice"
})
public class OTTValidationRequest {

    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("serviceExternalID")
    private String serviceExternalID;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("action")
    private String action;
    @JsonProperty("offerId")
    private String offerId;
    @JsonProperty("ottservice")
    private String ottservice;

    @JsonProperty("accountExternalId")
    public String getAccountExternalId() {
        return accountExternalId;
    }

    @JsonProperty("accountExternalId")
    public void setAccountExternalId(String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }

    @JsonProperty("serviceExternalID")
    public String getServiceExternalID() {
        return serviceExternalID;
    }

    @JsonProperty("serviceExternalID")
    public void setServiceExternalID(String serviceExternalID) {
        this.serviceExternalID = serviceExternalID;
    }

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("ottservice")
    public String getOttservice() {
        return ottservice;
    }

    @JsonProperty("ottservice")
    public void setOttservice(String ottservice) {
        this.ottservice = ottservice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OTTValidationRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountExternalId");
        sb.append('=');
        sb.append(((this.accountExternalId == null)?"<null>":this.accountExternalId));
        sb.append(',');
        sb.append("serviceExternalID");
        sb.append('=');
        sb.append(((this.serviceExternalID == null)?"<null>":this.serviceExternalID));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("deviceId");
        sb.append('=');
        sb.append(((this.deviceId == null)?"<null>":this.deviceId));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("offerId");
        sb.append('=');
        sb.append(((this.offerId == null)?"<null>":this.offerId));
        sb.append(',');
        sb.append("ottservice");
        sb.append('=');
        sb.append(((this.ottservice == null)?"<null>":this.ottservice));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

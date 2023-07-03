
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "msisdn",
    "OTTService",
    "bundleId",
    "EventType"
})
public class CreateOTTEnrollmentRequest {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("OTTService")
    private String oTTService;
    @JsonProperty("bundleId")
    private String bundleId;
    @JsonProperty("EventType")
    private String eventType;

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

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

    @JsonProperty("bundleId")
    public String getBundleId() {
        return bundleId;
    }

    @JsonProperty("bundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateOTTEnrollmentRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("oTTService");
        sb.append('=');
        sb.append(((this.oTTService == null)?"<null>":this.oTTService));
        sb.append(',');
        sb.append("bundleId");
        sb.append('=');
        sb.append(((this.bundleId == null)?"<null>":this.bundleId));
        sb.append(',');
        sb.append("eventType");
        sb.append('=');
        sb.append(((this.eventType == null)?"<null>":this.eventType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

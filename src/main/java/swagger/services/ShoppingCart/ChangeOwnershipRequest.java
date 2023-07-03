
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "msisdn",
    "ottservice",
    "bundleId"
})
public class ChangeOwnershipRequest {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("ottservice")
    private String ottservice;
    @JsonProperty("bundleId")
    private String bundleId;

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

    @JsonProperty("ottservice")
    public String getOttservice() {
        return ottservice;
    }

    @JsonProperty("ottservice")
    public void setOttservice(String ottservice) {
        this.ottservice = ottservice;
    }

    @JsonProperty("bundleId")
    public String getBundleId() {
        return bundleId;
    }

    @JsonProperty("bundleId")
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeOwnershipRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("ottservice");
        sb.append('=');
        sb.append(((this.ottservice == null)?"<null>":this.ottservice));
        sb.append(',');
        sb.append("bundleId");
        sb.append('=');
        sb.append(((this.bundleId == null)?"<null>":this.bundleId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

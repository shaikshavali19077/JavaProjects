
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partnerRole",
    "partnerCode"
})
public class ShipToParty {

    @JsonProperty("partnerRole")
    private String partnerRole;
    @JsonProperty("partnerCode")
    private String partnerCode;

    @JsonProperty("partnerRole")
    public String getPartnerRole() {
        return partnerRole;
    }

    @JsonProperty("partnerRole")
    public void setPartnerRole(String partnerRole) {
        this.partnerRole = partnerRole;
    }

    @JsonProperty("partnerCode")
    public String getPartnerCode() {
        return partnerCode;
    }

    @JsonProperty("partnerCode")
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partnerRole");
        sb.append('=');
        sb.append(((this.partnerRole == null)?"<null>":this.partnerRole));
        sb.append(',');
        sb.append("partnerCode");
        sb.append('=');
        sb.append(((this.partnerCode == null)?"<null>":this.partnerCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

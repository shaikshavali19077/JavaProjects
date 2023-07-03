
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shipToParty",
    "shipToAddress"
})
public class ShipToOverride {

    @JsonProperty("shipToParty")
    private ShipToParty__1 shipToParty;
    @JsonProperty("shipToAddress")
    private ShipToAddress__1 shipToAddress;

    @JsonProperty("shipToParty")
    public ShipToParty__1 getShipToParty() {
        return shipToParty;
    }

    @JsonProperty("shipToParty")
    public void setShipToParty(ShipToParty__1 shipToParty) {
        this.shipToParty = shipToParty;
    }

    @JsonProperty("shipToAddress")
    public ShipToAddress__1 getShipToAddress() {
        return shipToAddress;
    }

    @JsonProperty("shipToAddress")
    public void setShipToAddress(ShipToAddress__1 shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToOverride.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shipToParty");
        sb.append('=');
        sb.append(((this.shipToParty == null)?"<null>":this.shipToParty));
        sb.append(',');
        sb.append("shipToAddress");
        sb.append('=');
        sb.append(((this.shipToAddress == null)?"<null>":this.shipToAddress));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

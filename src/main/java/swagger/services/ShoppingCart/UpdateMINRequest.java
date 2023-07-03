
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "oldMsisdn",
    "newMsisdn",
    "ottservice"
})
public class UpdateMINRequest {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("oldMsisdn")
    private String oldMsisdn;
    @JsonProperty("newMsisdn")
    private String newMsisdn;
    @JsonProperty("ottservice")
    private String ottservice;

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("oldMsisdn")
    public String getOldMsisdn() {
        return oldMsisdn;
    }

    @JsonProperty("oldMsisdn")
    public void setOldMsisdn(String oldMsisdn) {
        this.oldMsisdn = oldMsisdn;
    }

    @JsonProperty("newMsisdn")
    public String getNewMsisdn() {
        return newMsisdn;
    }

    @JsonProperty("newMsisdn")
    public void setNewMsisdn(String newMsisdn) {
        this.newMsisdn = newMsisdn;
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
        sb.append(UpdateMINRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("oldMsisdn");
        sb.append('=');
        sb.append(((this.oldMsisdn == null)?"<null>":this.oldMsisdn));
        sb.append(',');
        sb.append("newMsisdn");
        sb.append('=');
        sb.append(((this.newMsisdn == null)?"<null>":this.newMsisdn));
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

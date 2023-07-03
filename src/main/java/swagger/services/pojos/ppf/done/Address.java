
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressType",
    "status",
    "address1",
    "city",
    "state",
    "isoCountryCode",
    "postalCode",
    "rfsSpecIds"
})
public class Address {

    @JsonProperty("addressType")
    private AddressType addressType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("isoCountryCode")
    private Integer isoCountryCode;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("rfsSpecIds")
    private String rfsSpecIds;

    @JsonProperty("addressType")
    public AddressType getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("isoCountryCode")
    public Integer getIsoCountryCode() {
        return isoCountryCode;
    }

    @JsonProperty("isoCountryCode")
    public void setIsoCountryCode(Integer isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("rfsSpecIds")
    public String getRfsSpecIds() {
        return rfsSpecIds;
    }

    @JsonProperty("rfsSpecIds")
    public void setRfsSpecIds(String rfsSpecIds) {
        this.rfsSpecIds = rfsSpecIds;
    }

}

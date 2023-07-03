
package swagger.services.pojos.ppf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressAssocId",
    "addressId",
    "ownershipStatus",
    "address"
})
public class AddressAssoc {

    @JsonProperty("addressAssocId")
    private String addressAssocId;
    @JsonProperty("addressId")
    private Integer addressId;
    @JsonProperty("ownershipStatus")
    private Integer ownershipStatus;
    @JsonProperty("address")
    private Address address;

    @JsonProperty("addressAssocId")
    public String getAddressAssocId() {
        return addressAssocId;
    }

    @JsonProperty("addressAssocId")
    public void setAddressAssocId(String addressAssocId) {
        this.addressAssocId = addressAssocId;
    }

    @JsonProperty("addressId")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("ownershipStatus")
    public Integer getOwnershipStatus() {
        return ownershipStatus;
    }

    @JsonProperty("ownershipStatus")
    public void setOwnershipStatus(Integer ownershipStatus) {
        this.ownershipStatus = ownershipStatus;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

}

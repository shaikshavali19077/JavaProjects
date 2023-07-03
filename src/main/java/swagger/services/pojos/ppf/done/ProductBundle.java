
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parentOfferId",
    "packageId",
    "retailPrice",
    "offerId",
    "externalId"
})
public class ProductBundle {

    @JsonProperty("parentOfferId")
    private Integer parentOfferId;
    @JsonProperty("packageId")
    private Integer packageId;
    @JsonProperty("retailPrice")
    private RetailPrice retailPrice;
    @JsonProperty("offerId")
    private Integer offerId;
    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("parentOfferId")
    public Integer getParentOfferId() {
        return parentOfferId;
    }

    @JsonProperty("parentOfferId")
    public void setParentOfferId(Integer parentOfferId) {
        this.parentOfferId = parentOfferId;
    }

    @JsonProperty("packageId")
    public Integer getPackageId() {
        return packageId;
    }

    @JsonProperty("packageId")
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("retailPrice")
    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    @JsonProperty("offerId")
    public Integer getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

}

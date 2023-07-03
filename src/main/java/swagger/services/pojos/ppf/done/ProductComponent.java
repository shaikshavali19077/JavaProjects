
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "packageId",
    "offerId",
    "externalId",
    "parentOfferId",
    "retailPrice",
    "isAdoptive",
    "isCompatible",
    "isUnbundleable",
    "offerName",
    "offerClass",
    "productOfferingCharges"
})
public class ProductComponent {

    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("packageId")
    private Integer packageId;
    @JsonProperty("offerId")
    private Integer offerId;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("parentOfferId")
    private Integer parentOfferId;
    @JsonProperty("retailPrice")
    private RetailPrice__1 retailPrice;
    @JsonProperty("isAdoptive")
    private Boolean isAdoptive;
    @JsonProperty("isCompatible")
    private Boolean isCompatible;
    @JsonProperty("isUnbundleable")
    private Boolean isUnbundleable;
    @JsonProperty("offerName")
    private String offerName;
    @JsonProperty("offerClass")
    private String offerClass;
    @JsonProperty("productOfferingCharges")
    private List<ProductOfferingCharge> productOfferingCharges = new ArrayList<ProductOfferingCharge>();

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("packageId")
    public Integer getPackageId() {
        return packageId;
    }

    @JsonProperty("packageId")
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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

    @JsonProperty("parentOfferId")
    public Integer getParentOfferId() {
        return parentOfferId;
    }

    @JsonProperty("parentOfferId")
    public void setParentOfferId(Integer parentOfferId) {
        this.parentOfferId = parentOfferId;
    }

    @JsonProperty("retailPrice")
    public RetailPrice__1 getRetailPrice() {
        return retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice__1 retailPrice) {
        this.retailPrice = retailPrice;
    }

    @JsonProperty("isAdoptive")
    public Boolean getIsAdoptive() {
        return isAdoptive;
    }

    @JsonProperty("isAdoptive")
    public void setIsAdoptive(Boolean isAdoptive) {
        this.isAdoptive = isAdoptive;
    }

    @JsonProperty("isCompatible")
    public Boolean getIsCompatible() {
        return isCompatible;
    }

    @JsonProperty("isCompatible")
    public void setIsCompatible(Boolean isCompatible) {
        this.isCompatible = isCompatible;
    }

    @JsonProperty("isUnbundleable")
    public Boolean getIsUnbundleable() {
        return isUnbundleable;
    }

    @JsonProperty("isUnbundleable")
    public void setIsUnbundleable(Boolean isUnbundleable) {
        this.isUnbundleable = isUnbundleable;
    }

    @JsonProperty("offerName")
    public String getOfferName() {
        return offerName;
    }

    @JsonProperty("offerName")
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    @JsonProperty("offerClass")
    public String getOfferClass() {
        return offerClass;
    }

    @JsonProperty("offerClass")
    public void setOfferClass(String offerClass) {
        this.offerClass = offerClass;
    }

    @JsonProperty("productOfferingCharges")
    public List<ProductOfferingCharge> getProductOfferingCharges() {
        return productOfferingCharges;
    }

    @JsonProperty("productOfferingCharges")
    public void setProductOfferingCharges(List<ProductOfferingCharge> productOfferingCharges) {
        this.productOfferingCharges = productOfferingCharges;
    }

}

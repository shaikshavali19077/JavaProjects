
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prodOfferingPrice",
    "billingFrequency",
    "elementId"
})
public class ProductOfferingRC {

    @JsonProperty("prodOfferingPrice")
    private List<ProdOfferingPrice> prodOfferingPrice = new ArrayList<ProdOfferingPrice>();
    @JsonProperty("billingFrequency")
    private BillingFrequency billingFrequency;
    @JsonProperty("elementId")
    private Integer elementId;

    @JsonProperty("prodOfferingPrice")
    public List<ProdOfferingPrice> getProdOfferingPrice() {
        return prodOfferingPrice;
    }

    @JsonProperty("prodOfferingPrice")
    public void setProdOfferingPrice(List<ProdOfferingPrice> prodOfferingPrice) {
        this.prodOfferingPrice = prodOfferingPrice;
    }

    @JsonProperty("billingFrequency")
    public BillingFrequency getBillingFrequency() {
        return billingFrequency;
    }

    @JsonProperty("billingFrequency")
    public void setBillingFrequency(BillingFrequency billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    @JsonProperty("elementId")
    public Integer getElementId() {
        return elementId;
    }

    @JsonProperty("elementId")
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

}


package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prodOfferingPrice",
    "nrcTypeId",
    "paymentPolicy",
    "priceEvent"
})
public class ProductOfferingNRC {

    @JsonProperty("prodOfferingPrice")
    private List<ProdOfferingPrice> prodOfferingPrice = new ArrayList<ProdOfferingPrice>();
    @JsonProperty("nrcTypeId")
    private Integer nrcTypeId;
    @JsonProperty("paymentPolicy")
    private String paymentPolicy;
    @JsonProperty("priceEvent")
    private String priceEvent;

    @JsonProperty("prodOfferingPrice")
    public List<ProdOfferingPrice> getProdOfferingPrice() {
        return prodOfferingPrice;
    }

    @JsonProperty("prodOfferingPrice")
    public void setProdOfferingPrice(List<ProdOfferingPrice> prodOfferingPrice) {
        this.prodOfferingPrice = prodOfferingPrice;
    }

    @JsonProperty("nrcTypeId")
    public Integer getNrcTypeId() {
        return nrcTypeId;
    }

    @JsonProperty("nrcTypeId")
    public void setNrcTypeId(Integer nrcTypeId) {
        this.nrcTypeId = nrcTypeId;
    }

    @JsonProperty("paymentPolicy")
    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    @JsonProperty("paymentPolicy")
    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    @JsonProperty("priceEvent")
    public String getPriceEvent() {
        return priceEvent;
    }

    @JsonProperty("priceEvent")
    public void setPriceEvent(String priceEvent) {
        this.priceEvent = priceEvent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProductOfferingNRC.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prodOfferingPrice");
        sb.append('=');
        sb.append(((this.prodOfferingPrice == null)?"<null>":this.prodOfferingPrice));
        sb.append(',');
        sb.append("nrcTypeId");
        sb.append('=');
        sb.append(((this.nrcTypeId == null)?"<null>":this.nrcTypeId));
        sb.append(',');
        sb.append("paymentPolicy");
        sb.append('=');
        sb.append(((this.paymentPolicy == null)?"<null>":this.paymentPolicy));
        sb.append(',');
        sb.append("priceEvent");
        sb.append('=');
        sb.append(((this.priceEvent == null)?"<null>":this.priceEvent));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

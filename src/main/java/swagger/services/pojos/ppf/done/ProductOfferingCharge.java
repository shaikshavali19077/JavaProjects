
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargeId",
    "type",
    "productOfferingRC"
})
public class ProductOfferingCharge {

    @JsonProperty("chargeId")
    private Integer chargeId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("productOfferingRC")
    private ProductOfferingRC productOfferingRC;

    @JsonProperty("chargeId")
    public Integer getChargeId() {
        return chargeId;
    }

    @JsonProperty("chargeId")
    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("productOfferingRC")
    public ProductOfferingRC getProductOfferingRC() {
        return productOfferingRC;
    }

    @JsonProperty("productOfferingRC")
    public void setProductOfferingRC(ProductOfferingRC productOfferingRC) {
        this.productOfferingRC = productOfferingRC;
    }

}

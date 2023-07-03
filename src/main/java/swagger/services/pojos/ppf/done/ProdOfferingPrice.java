
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isTaxInclusive",
    "amount",
    "quotedAmount"
})
public class ProdOfferingPrice {

    @JsonProperty("isTaxInclusive")
    private Boolean isTaxInclusive;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("quotedAmount")
    private Integer quotedAmount;

    @JsonProperty("isTaxInclusive")
    public Boolean getIsTaxInclusive() {
        return isTaxInclusive;
    }

    @JsonProperty("isTaxInclusive")
    public void setIsTaxInclusive(Boolean isTaxInclusive) {
        this.isTaxInclusive = isTaxInclusive;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("quotedAmount")
    public Integer getQuotedAmount() {
        return quotedAmount;
    }

    @JsonProperty("quotedAmount")
    public void setQuotedAmount(Integer quotedAmount) {
        this.quotedAmount = quotedAmount;
    }

}

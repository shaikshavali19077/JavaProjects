
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
public class ProdOfferingPrice__1 {

    @JsonProperty("isTaxInclusive")
    private Boolean isTaxInclusive;
    @JsonProperty("amount")
    private Amount__1 amount;
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
    public Amount__1 getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount__1 amount) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProdOfferingPrice__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isTaxInclusive");
        sb.append('=');
        sb.append(((this.isTaxInclusive == null)?"<null>":this.isTaxInclusive));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("quotedAmount");
        sb.append('=');
        sb.append(((this.quotedAmount == null)?"<null>":this.quotedAmount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

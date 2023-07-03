
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalAmount",
    "totalDiscount",
    "totalTax",
    "totalUnitCredit",
    "currencyCode",
    "upfrontOneTimeCharges",
    "upfrontShippingCharges",
    "upfrontInstallCharges"
})
public class QuoteSummary {

    @JsonProperty("totalAmount")
    private Integer totalAmount;
    @JsonProperty("totalDiscount")
    private Integer totalDiscount;
    @JsonProperty("totalTax")
    private Integer totalTax;
    @JsonProperty("totalUnitCredit")
    private Integer totalUnitCredit;
    @JsonProperty("currencyCode")
    private CurrencyCode__1 currencyCode;
    @JsonProperty("upfrontOneTimeCharges")
    private Integer upfrontOneTimeCharges;
    @JsonProperty("upfrontShippingCharges")
    private Integer upfrontShippingCharges;
    @JsonProperty("upfrontInstallCharges")
    private Integer upfrontInstallCharges;

    @JsonProperty("totalAmount")
    public Integer getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount")
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("totalDiscount")
    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("totalDiscount")
    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @JsonProperty("totalTax")
    public Integer getTotalTax() {
        return totalTax;
    }

    @JsonProperty("totalTax")
    public void setTotalTax(Integer totalTax) {
        this.totalTax = totalTax;
    }

    @JsonProperty("totalUnitCredit")
    public Integer getTotalUnitCredit() {
        return totalUnitCredit;
    }

    @JsonProperty("totalUnitCredit")
    public void setTotalUnitCredit(Integer totalUnitCredit) {
        this.totalUnitCredit = totalUnitCredit;
    }

    @JsonProperty("currencyCode")
    public CurrencyCode__1 getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(CurrencyCode__1 currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("upfrontOneTimeCharges")
    public Integer getUpfrontOneTimeCharges() {
        return upfrontOneTimeCharges;
    }

    @JsonProperty("upfrontOneTimeCharges")
    public void setUpfrontOneTimeCharges(Integer upfrontOneTimeCharges) {
        this.upfrontOneTimeCharges = upfrontOneTimeCharges;
    }

    @JsonProperty("upfrontShippingCharges")
    public Integer getUpfrontShippingCharges() {
        return upfrontShippingCharges;
    }

    @JsonProperty("upfrontShippingCharges")
    public void setUpfrontShippingCharges(Integer upfrontShippingCharges) {
        this.upfrontShippingCharges = upfrontShippingCharges;
    }

    @JsonProperty("upfrontInstallCharges")
    public Integer getUpfrontInstallCharges() {
        return upfrontInstallCharges;
    }

    @JsonProperty("upfrontInstallCharges")
    public void setUpfrontInstallCharges(Integer upfrontInstallCharges) {
        this.upfrontInstallCharges = upfrontInstallCharges;
    }

}

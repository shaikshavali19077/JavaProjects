
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "planMsf",
    "promo",
    "sellingPrice1",
    "sellingPrice2",
    "discountFixAmount",
    "discountPercentage",
    "markUpFixAmount",
    "markUpPercentage",
    "fullSellingPrice"
})
public class Pricing {

    @JsonProperty("planMsf")
    private Integer planMsf;
    @JsonProperty("promo")
    private String promo;
    @JsonProperty("sellingPrice1")
    private Integer sellingPrice1;
    @JsonProperty("sellingPrice2")
    private Integer sellingPrice2;
    @JsonProperty("discountFixAmount")
    private Integer discountFixAmount;
    @JsonProperty("discountPercentage")
    private Integer discountPercentage;
    @JsonProperty("markUpFixAmount")
    private Integer markUpFixAmount;
    @JsonProperty("markUpPercentage")
    private Integer markUpPercentage;
    @JsonProperty("fullSellingPrice")
    private Integer fullSellingPrice;

    @JsonProperty("planMsf")
    public Integer getPlanMsf() {
        return planMsf;
    }

    @JsonProperty("planMsf")
    public void setPlanMsf(Integer planMsf) {
        this.planMsf = planMsf;
    }

    @JsonProperty("promo")
    public String getPromo() {
        return promo;
    }

    @JsonProperty("promo")
    public void setPromo(String promo) {
        this.promo = promo;
    }

    @JsonProperty("sellingPrice1")
    public Integer getSellingPrice1() {
        return sellingPrice1;
    }

    @JsonProperty("sellingPrice1")
    public void setSellingPrice1(Integer sellingPrice1) {
        this.sellingPrice1 = sellingPrice1;
    }

    @JsonProperty("sellingPrice2")
    public Integer getSellingPrice2() {
        return sellingPrice2;
    }

    @JsonProperty("sellingPrice2")
    public void setSellingPrice2(Integer sellingPrice2) {
        this.sellingPrice2 = sellingPrice2;
    }

    @JsonProperty("discountFixAmount")
    public Integer getDiscountFixAmount() {
        return discountFixAmount;
    }

    @JsonProperty("discountFixAmount")
    public void setDiscountFixAmount(Integer discountFixAmount) {
        this.discountFixAmount = discountFixAmount;
    }

    @JsonProperty("discountPercentage")
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    @JsonProperty("discountPercentage")
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @JsonProperty("markUpFixAmount")
    public Integer getMarkUpFixAmount() {
        return markUpFixAmount;
    }

    @JsonProperty("markUpFixAmount")
    public void setMarkUpFixAmount(Integer markUpFixAmount) {
        this.markUpFixAmount = markUpFixAmount;
    }

    @JsonProperty("markUpPercentage")
    public Integer getMarkUpPercentage() {
        return markUpPercentage;
    }

    @JsonProperty("markUpPercentage")
    public void setMarkUpPercentage(Integer markUpPercentage) {
        this.markUpPercentage = markUpPercentage;
    }

    @JsonProperty("fullSellingPrice")
    public Integer getFullSellingPrice() {
        return fullSellingPrice;
    }

    @JsonProperty("fullSellingPrice")
    public void setFullSellingPrice(Integer fullSellingPrice) {
        this.fullSellingPrice = fullSellingPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pricing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("planMsf");
        sb.append('=');
        sb.append(((this.planMsf == null)?"<null>":this.planMsf));
        sb.append(',');
        sb.append("promo");
        sb.append('=');
        sb.append(((this.promo == null)?"<null>":this.promo));
        sb.append(',');
        sb.append("sellingPrice1");
        sb.append('=');
        sb.append(((this.sellingPrice1 == null)?"<null>":this.sellingPrice1));
        sb.append(',');
        sb.append("sellingPrice2");
        sb.append('=');
        sb.append(((this.sellingPrice2 == null)?"<null>":this.sellingPrice2));
        sb.append(',');
        sb.append("discountFixAmount");
        sb.append('=');
        sb.append(((this.discountFixAmount == null)?"<null>":this.discountFixAmount));
        sb.append(',');
        sb.append("discountPercentage");
        sb.append('=');
        sb.append(((this.discountPercentage == null)?"<null>":this.discountPercentage));
        sb.append(',');
        sb.append("markUpFixAmount");
        sb.append('=');
        sb.append(((this.markUpFixAmount == null)?"<null>":this.markUpFixAmount));
        sb.append(',');
        sb.append("markUpPercentage");
        sb.append('=');
        sb.append(((this.markUpPercentage == null)?"<null>":this.markUpPercentage));
        sb.append(',');
        sb.append("fullSellingPrice");
        sb.append('=');
        sb.append(((this.fullSellingPrice == null)?"<null>":this.fullSellingPrice));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reservationSalesNo",
    "refDocCategory",
    "orderType",
    "salesOrg",
    "distribution",
    "division",
    "soldToParty",
    "shipToParty",
    "shipToAddress",
    "optimaOrderNo",
    "transactionDate",
    "sellingStore",
    "salesGrp",
    "paymentTerms",
    "codAmount"
})
public class Header {

    @JsonProperty("reservationSalesNo")
    private String reservationSalesNo;
    @JsonProperty("refDocCategory")
    private String refDocCategory;
    @JsonProperty("orderType")
    private String orderType;
    @JsonProperty("salesOrg")
    private String salesOrg;
    @JsonProperty("distribution")
    private String distribution;
    @JsonProperty("division")
    private String division;
    @JsonProperty("soldToParty")
    private SoldToParty soldToParty;
    @JsonProperty("shipToParty")
    private ShipToParty shipToParty;
    @JsonProperty("shipToAddress")
    private ShipToAddress shipToAddress;
    @JsonProperty("optimaOrderNo")
    private String optimaOrderNo;
    @JsonProperty("transactionDate")
    private String transactionDate;
    @JsonProperty("sellingStore")
    private String sellingStore;
    @JsonProperty("salesGrp")
    private String salesGrp;
    @JsonProperty("paymentTerms")
    private String paymentTerms;
    @JsonProperty("codAmount")
    private String codAmount;

    @JsonProperty("reservationSalesNo")
    public String getReservationSalesNo() {
        return reservationSalesNo;
    }

    @JsonProperty("reservationSalesNo")
    public void setReservationSalesNo(String reservationSalesNo) {
        this.reservationSalesNo = reservationSalesNo;
    }

    @JsonProperty("refDocCategory")
    public String getRefDocCategory() {
        return refDocCategory;
    }

    @JsonProperty("refDocCategory")
    public void setRefDocCategory(String refDocCategory) {
        this.refDocCategory = refDocCategory;
    }

    @JsonProperty("orderType")
    public String getOrderType() {
        return orderType;
    }

    @JsonProperty("orderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("salesOrg")
    public String getSalesOrg() {
        return salesOrg;
    }

    @JsonProperty("salesOrg")
    public void setSalesOrg(String salesOrg) {
        this.salesOrg = salesOrg;
    }

    @JsonProperty("distribution")
    public String getDistribution() {
        return distribution;
    }

    @JsonProperty("distribution")
    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    @JsonProperty("division")
    public String getDivision() {
        return division;
    }

    @JsonProperty("division")
    public void setDivision(String division) {
        this.division = division;
    }

    @JsonProperty("soldToParty")
    public SoldToParty getSoldToParty() {
        return soldToParty;
    }

    @JsonProperty("soldToParty")
    public void setSoldToParty(SoldToParty soldToParty) {
        this.soldToParty = soldToParty;
    }

    @JsonProperty("shipToParty")
    public ShipToParty getShipToParty() {
        return shipToParty;
    }

    @JsonProperty("shipToParty")
    public void setShipToParty(ShipToParty shipToParty) {
        this.shipToParty = shipToParty;
    }

    @JsonProperty("shipToAddress")
    public ShipToAddress getShipToAddress() {
        return shipToAddress;
    }

    @JsonProperty("shipToAddress")
    public void setShipToAddress(ShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    @JsonProperty("optimaOrderNo")
    public String getOptimaOrderNo() {
        return optimaOrderNo;
    }

    @JsonProperty("optimaOrderNo")
    public void setOptimaOrderNo(String optimaOrderNo) {
        this.optimaOrderNo = optimaOrderNo;
    }

    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("sellingStore")
    public String getSellingStore() {
        return sellingStore;
    }

    @JsonProperty("sellingStore")
    public void setSellingStore(String sellingStore) {
        this.sellingStore = sellingStore;
    }

    @JsonProperty("salesGrp")
    public String getSalesGrp() {
        return salesGrp;
    }

    @JsonProperty("salesGrp")
    public void setSalesGrp(String salesGrp) {
        this.salesGrp = salesGrp;
    }

    @JsonProperty("paymentTerms")
    public String getPaymentTerms() {
        return paymentTerms;
    }

    @JsonProperty("paymentTerms")
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    @JsonProperty("codAmount")
    public String getCodAmount() {
        return codAmount;
    }

    @JsonProperty("codAmount")
    public void setCodAmount(String codAmount) {
        this.codAmount = codAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Header.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reservationSalesNo");
        sb.append('=');
        sb.append(((this.reservationSalesNo == null)?"<null>":this.reservationSalesNo));
        sb.append(',');
        sb.append("refDocCategory");
        sb.append('=');
        sb.append(((this.refDocCategory == null)?"<null>":this.refDocCategory));
        sb.append(',');
        sb.append("orderType");
        sb.append('=');
        sb.append(((this.orderType == null)?"<null>":this.orderType));
        sb.append(',');
        sb.append("salesOrg");
        sb.append('=');
        sb.append(((this.salesOrg == null)?"<null>":this.salesOrg));
        sb.append(',');
        sb.append("distribution");
        sb.append('=');
        sb.append(((this.distribution == null)?"<null>":this.distribution));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
        sb.append(',');
        sb.append("soldToParty");
        sb.append('=');
        sb.append(((this.soldToParty == null)?"<null>":this.soldToParty));
        sb.append(',');
        sb.append("shipToParty");
        sb.append('=');
        sb.append(((this.shipToParty == null)?"<null>":this.shipToParty));
        sb.append(',');
        sb.append("shipToAddress");
        sb.append('=');
        sb.append(((this.shipToAddress == null)?"<null>":this.shipToAddress));
        sb.append(',');
        sb.append("optimaOrderNo");
        sb.append('=');
        sb.append(((this.optimaOrderNo == null)?"<null>":this.optimaOrderNo));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("sellingStore");
        sb.append('=');
        sb.append(((this.sellingStore == null)?"<null>":this.sellingStore));
        sb.append(',');
        sb.append("salesGrp");
        sb.append('=');
        sb.append(((this.salesGrp == null)?"<null>":this.salesGrp));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("codAmount");
        sb.append('=');
        sb.append(((this.codAmount == null)?"<null>":this.codAmount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

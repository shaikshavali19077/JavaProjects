
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iccid",
    "imsi",
    "msisdn",
    "billingType",
    "orderDate",
    "expiryDate",
    "distributionChannel",
    "imei",
    "activationDate",
    "soldDate",
    "simStatus",
    "msisdnStatus",
    "provisioningStatus",
    "brandCode",
    "brandName",
    "materialCode",
    "subBrandName",
    "prodCode",
    "cardCode",
    "pin1",
    "pin2",
    "puk1",
    "puk2"
})
public class SimInfoResponse {

    @JsonProperty("iccid")
    private String iccid;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("billingType")
    private String billingType;
    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("expiryDate")
    private String expiryDate;
    @JsonProperty("distributionChannel")
    private String distributionChannel;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("activationDate")
    private String activationDate;
    @JsonProperty("soldDate")
    private String soldDate;
    @JsonProperty("simStatus")
    private String simStatus;
    @JsonProperty("msisdnStatus")
    private String msisdnStatus;
    @JsonProperty("provisioningStatus")
    private String provisioningStatus;
    @JsonProperty("brandCode")
    private String brandCode;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("materialCode")
    private String materialCode;
    @JsonProperty("subBrandName")
    private String subBrandName;
    @JsonProperty("prodCode")
    private String prodCode;
    @JsonProperty("cardCode")
    private String cardCode;
    @JsonProperty("pin1")
    private String pin1;
    @JsonProperty("pin2")
    private String pin2;
    @JsonProperty("puk1")
    private String puk1;
    @JsonProperty("puk2")
    private String puk2;

    @JsonProperty("iccid")
    public String getIccid() {
        return iccid;
    }

    @JsonProperty("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("billingType")
    public String getBillingType() {
        return billingType;
    }

    @JsonProperty("billingType")
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    @JsonProperty("orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("distributionChannel")
    public String getDistributionChannel() {
        return distributionChannel;
    }

    @JsonProperty("distributionChannel")
    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    @JsonProperty("activationDate")
    public String getActivationDate() {
        return activationDate;
    }

    @JsonProperty("activationDate")
    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    @JsonProperty("soldDate")
    public String getSoldDate() {
        return soldDate;
    }

    @JsonProperty("soldDate")
    public void setSoldDate(String soldDate) {
        this.soldDate = soldDate;
    }

    @JsonProperty("simStatus")
    public String getSimStatus() {
        return simStatus;
    }

    @JsonProperty("simStatus")
    public void setSimStatus(String simStatus) {
        this.simStatus = simStatus;
    }

    @JsonProperty("msisdnStatus")
    public String getMsisdnStatus() {
        return msisdnStatus;
    }

    @JsonProperty("msisdnStatus")
    public void setMsisdnStatus(String msisdnStatus) {
        this.msisdnStatus = msisdnStatus;
    }

    @JsonProperty("provisioningStatus")
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    @JsonProperty("provisioningStatus")
    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    @JsonProperty("brandCode")
    public String getBrandCode() {
        return brandCode;
    }

    @JsonProperty("brandCode")
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("materialCode")
    public String getMaterialCode() {
        return materialCode;
    }

    @JsonProperty("materialCode")
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    @JsonProperty("subBrandName")
    public String getSubBrandName() {
        return subBrandName;
    }

    @JsonProperty("subBrandName")
    public void setSubBrandName(String subBrandName) {
        this.subBrandName = subBrandName;
    }

    @JsonProperty("prodCode")
    public String getProdCode() {
        return prodCode;
    }

    @JsonProperty("prodCode")
    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    @JsonProperty("cardCode")
    public String getCardCode() {
        return cardCode;
    }

    @JsonProperty("cardCode")
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    @JsonProperty("pin1")
    public String getPin1() {
        return pin1;
    }

    @JsonProperty("pin1")
    public void setPin1(String pin1) {
        this.pin1 = pin1;
    }

    @JsonProperty("pin2")
    public String getPin2() {
        return pin2;
    }

    @JsonProperty("pin2")
    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    @JsonProperty("puk1")
    public String getPuk1() {
        return puk1;
    }

    @JsonProperty("puk1")
    public void setPuk1(String puk1) {
        this.puk1 = puk1;
    }

    @JsonProperty("puk2")
    public String getPuk2() {
        return puk2;
    }

    @JsonProperty("puk2")
    public void setPuk2(String puk2) {
        this.puk2 = puk2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SimInfoResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iccid");
        sb.append('=');
        sb.append(((this.iccid == null)?"<null>":this.iccid));
        sb.append(',');
        sb.append("imsi");
        sb.append('=');
        sb.append(((this.imsi == null)?"<null>":this.imsi));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("billingType");
        sb.append('=');
        sb.append(((this.billingType == null)?"<null>":this.billingType));
        sb.append(',');
        sb.append("orderDate");
        sb.append('=');
        sb.append(((this.orderDate == null)?"<null>":this.orderDate));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("distributionChannel");
        sb.append('=');
        sb.append(((this.distributionChannel == null)?"<null>":this.distributionChannel));
        sb.append(',');
        sb.append("imei");
        sb.append('=');
        sb.append(((this.imei == null)?"<null>":this.imei));
        sb.append(',');
        sb.append("activationDate");
        sb.append('=');
        sb.append(((this.activationDate == null)?"<null>":this.activationDate));
        sb.append(',');
        sb.append("soldDate");
        sb.append('=');
        sb.append(((this.soldDate == null)?"<null>":this.soldDate));
        sb.append(',');
        sb.append("simStatus");
        sb.append('=');
        sb.append(((this.simStatus == null)?"<null>":this.simStatus));
        sb.append(',');
        sb.append("msisdnStatus");
        sb.append('=');
        sb.append(((this.msisdnStatus == null)?"<null>":this.msisdnStatus));
        sb.append(',');
        sb.append("provisioningStatus");
        sb.append('=');
        sb.append(((this.provisioningStatus == null)?"<null>":this.provisioningStatus));
        sb.append(',');
        sb.append("brandCode");
        sb.append('=');
        sb.append(((this.brandCode == null)?"<null>":this.brandCode));
        sb.append(',');
        sb.append("brandName");
        sb.append('=');
        sb.append(((this.brandName == null)?"<null>":this.brandName));
        sb.append(',');
        sb.append("materialCode");
        sb.append('=');
        sb.append(((this.materialCode == null)?"<null>":this.materialCode));
        sb.append(',');
        sb.append("subBrandName");
        sb.append('=');
        sb.append(((this.subBrandName == null)?"<null>":this.subBrandName));
        sb.append(',');
        sb.append("prodCode");
        sb.append('=');
        sb.append(((this.prodCode == null)?"<null>":this.prodCode));
        sb.append(',');
        sb.append("cardCode");
        sb.append('=');
        sb.append(((this.cardCode == null)?"<null>":this.cardCode));
        sb.append(',');
        sb.append("pin1");
        sb.append('=');
        sb.append(((this.pin1 == null)?"<null>":this.pin1));
        sb.append(',');
        sb.append("pin2");
        sb.append('=');
        sb.append(((this.pin2 == null)?"<null>":this.pin2));
        sb.append(',');
        sb.append("puk1");
        sb.append('=');
        sb.append(((this.puk1 == null)?"<null>":this.puk1));
        sb.append(',');
        sb.append("puk2");
        sb.append('=');
        sb.append(((this.puk2 == null)?"<null>":this.puk2));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

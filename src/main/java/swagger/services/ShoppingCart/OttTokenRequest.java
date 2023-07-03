
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountExternalId",
    "brand",
    "serviceExternalId",
    "packageId",
    "componentId",
    "emailId",
    "cartId",
    "offerId",
    "msisdn",
    "type",
    "OTTService"
})
public class OttTokenRequest {

    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("serviceExternalId")
    private String serviceExternalId;
    @JsonProperty("packageId")
    private String packageId;
    @JsonProperty("componentId")
    private String componentId;
    @JsonProperty("emailId")
    private String emailId;
    @JsonProperty("cartId")
    private String cartId;
    @JsonProperty("offerId")
    private String offerId;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("type")
    private String type;
    @JsonProperty("OTTService")
    private String oTTService;

    @JsonProperty("accountExternalId")
    public String getAccountExternalId() {
        return accountExternalId;
    }

    @JsonProperty("accountExternalId")
    public void setAccountExternalId(String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("serviceExternalId")
    public String getServiceExternalId() {
        return serviceExternalId;
    }

    @JsonProperty("serviceExternalId")
    public void setServiceExternalId(String serviceExternalId) {
        this.serviceExternalId = serviceExternalId;
    }

    @JsonProperty("packageId")
    public String getPackageId() {
        return packageId;
    }

    @JsonProperty("packageId")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    @JsonProperty("componentId")
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }

    @JsonProperty("emailId")
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @JsonProperty("cartId")
    public String getCartId() {
        return cartId;
    }

    @JsonProperty("cartId")
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("OTTService")
    public String getOTTService() {
        return oTTService;
    }

    @JsonProperty("OTTService")
    public void setOTTService(String oTTService) {
        this.oTTService = oTTService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OttTokenRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountExternalId");
        sb.append('=');
        sb.append(((this.accountExternalId == null)?"<null>":this.accountExternalId));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("serviceExternalId");
        sb.append('=');
        sb.append(((this.serviceExternalId == null)?"<null>":this.serviceExternalId));
        sb.append(',');
        sb.append("packageId");
        sb.append('=');
        sb.append(((this.packageId == null)?"<null>":this.packageId));
        sb.append(',');
        sb.append("componentId");
        sb.append('=');
        sb.append(((this.componentId == null)?"<null>":this.componentId));
        sb.append(',');
        sb.append("emailId");
        sb.append('=');
        sb.append(((this.emailId == null)?"<null>":this.emailId));
        sb.append(',');
        sb.append("cartId");
        sb.append('=');
        sb.append(((this.cartId == null)?"<null>":this.cartId));
        sb.append(',');
        sb.append("offerId");
        sb.append('=');
        sb.append(((this.offerId == null)?"<null>":this.offerId));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("oTTService");
        sb.append('=');
        sb.append(((this.oTTService == null)?"<null>":this.oTTService));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

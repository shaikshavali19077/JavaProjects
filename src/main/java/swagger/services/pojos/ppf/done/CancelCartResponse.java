
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cartActions",
    "cartId",
    "customerId",
    "applicationSession",
    "accountInternalId",
    "kenanOrderId",
    "orderType",
    "status",
    "quoteSummary",
    "applicationDate",
    "workOrderItemId",
    "cartAttributes",
    "bulkIndicator",
    "agreementIds"
})
public class CancelCartResponse {

    @JsonProperty("cartActions")
    private List<CartAction> cartActions = new ArrayList<CartAction>();
    @JsonProperty("cartId")
    private Integer cartId;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("applicationSession")
    private ApplicationSession applicationSession;
    @JsonProperty("accountInternalId")
    private Integer accountInternalId;
    @JsonProperty("kenanOrderId")
    private Integer kenanOrderId;
    @JsonProperty("orderType")
    private OrderType orderType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("quoteSummary")
    private QuoteSummary quoteSummary;
    @JsonProperty("applicationDate")
    private String applicationDate;
    @JsonProperty("workOrderItemId")
    private List<Integer> workOrderItemId = new ArrayList<Integer>();
    @JsonProperty("cartAttributes")
    private List<CartAttribute> cartAttributes = new ArrayList<CartAttribute>();
    @JsonProperty("bulkIndicator")
    private Boolean bulkIndicator;
    @JsonProperty("agreementIds")
    private List<Integer> agreementIds = new ArrayList<Integer>();

    @JsonProperty("cartActions")
    public List<CartAction> getCartActions() {
        return cartActions;
    }

    @JsonProperty("cartActions")
    public void setCartActions(List<CartAction> cartActions) {
        this.cartActions = cartActions;
    }

    @JsonProperty("cartId")
    public Integer getCartId() {
        return cartId;
    }

    @JsonProperty("cartId")
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("applicationSession")
    public ApplicationSession getApplicationSession() {
        return applicationSession;
    }

    @JsonProperty("applicationSession")
    public void setApplicationSession(ApplicationSession applicationSession) {
        this.applicationSession = applicationSession;
    }

    @JsonProperty("accountInternalId")
    public Integer getAccountInternalId() {
        return accountInternalId;
    }

    @JsonProperty("accountInternalId")
    public void setAccountInternalId(Integer accountInternalId) {
        this.accountInternalId = accountInternalId;
    }

    @JsonProperty("kenanOrderId")
    public Integer getKenanOrderId() {
        return kenanOrderId;
    }

    @JsonProperty("kenanOrderId")
    public void setKenanOrderId(Integer kenanOrderId) {
        this.kenanOrderId = kenanOrderId;
    }

    @JsonProperty("orderType")
    public OrderType getOrderType() {
        return orderType;
    }

    @JsonProperty("orderType")
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("quoteSummary")
    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }

    @JsonProperty("quoteSummary")
    public void setQuoteSummary(QuoteSummary quoteSummary) {
        this.quoteSummary = quoteSummary;
    }

    @JsonProperty("applicationDate")
    public String getApplicationDate() {
        return applicationDate;
    }

    @JsonProperty("applicationDate")
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    @JsonProperty("workOrderItemId")
    public List<Integer> getWorkOrderItemId() {
        return workOrderItemId;
    }

    @JsonProperty("workOrderItemId")
    public void setWorkOrderItemId(List<Integer> workOrderItemId) {
        this.workOrderItemId = workOrderItemId;
    }

    @JsonProperty("cartAttributes")
    public List<CartAttribute> getCartAttributes() {
        return cartAttributes;
    }

    @JsonProperty("cartAttributes")
    public void setCartAttributes(List<CartAttribute> cartAttributes) {
        this.cartAttributes = cartAttributes;
    }

    @JsonProperty("bulkIndicator")
    public Boolean getBulkIndicator() {
        return bulkIndicator;
    }

    @JsonProperty("bulkIndicator")
    public void setBulkIndicator(Boolean bulkIndicator) {
        this.bulkIndicator = bulkIndicator;
    }

    @JsonProperty("agreementIds")
    public List<Integer> getAgreementIds() {
        return agreementIds;
    }

    @JsonProperty("agreementIds")
    public void setAgreementIds(List<Integer> agreementIds) {
        this.agreementIds = agreementIds;
    }

}

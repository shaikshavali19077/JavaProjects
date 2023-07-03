
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
    "firstName",
    "lastName",
    "accountInternalId",
    "kenanOrderId",
    "orderType",
    "desiredDate",
    "status",
    "quoteSummary",
    "applicationDate",
    "processInstId",
    "workOrderItemId",
    "cartAttributes",
    "bulkIndicator",
    "agreementIds"
})
public class MnpCartAWS {

    @JsonProperty("cartActions")
    private List<CartAction> cartActions = new ArrayList<CartAction>();
    @JsonProperty("cartId")
    private Integer cartId;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("applicationSession")
    private ApplicationSession applicationSession;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("accountInternalId")
    private Integer accountInternalId;
    @JsonProperty("kenanOrderId")
    private Integer kenanOrderId;
    @JsonProperty("orderType")
    private OrderType orderType;
    @JsonProperty("desiredDate")
    private String desiredDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("quoteSummary")
    private QuoteSummary quoteSummary;
    @JsonProperty("applicationDate")
    private String applicationDate;
    @JsonProperty("processInstId")
    private Integer processInstId;
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

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @JsonProperty("desiredDate")
    public String getDesiredDate() {
        return desiredDate;
    }

    @JsonProperty("desiredDate")
    public void setDesiredDate(String desiredDate) {
        this.desiredDate = desiredDate;
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

    @JsonProperty("processInstId")
    public Integer getProcessInstId() {
        return processInstId;
    }

    @JsonProperty("processInstId")
    public void setProcessInstId(Integer processInstId) {
        this.processInstId = processInstId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MnpCartAWS.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cartActions");
        sb.append('=');
        sb.append(((this.cartActions == null)?"<null>":this.cartActions));
        sb.append(',');
        sb.append("cartId");
        sb.append('=');
        sb.append(((this.cartId == null)?"<null>":this.cartId));
        sb.append(',');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("applicationSession");
        sb.append('=');
        sb.append(((this.applicationSession == null)?"<null>":this.applicationSession));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("accountInternalId");
        sb.append('=');
        sb.append(((this.accountInternalId == null)?"<null>":this.accountInternalId));
        sb.append(',');
        sb.append("kenanOrderId");
        sb.append('=');
        sb.append(((this.kenanOrderId == null)?"<null>":this.kenanOrderId));
        sb.append(',');
        sb.append("orderType");
        sb.append('=');
        sb.append(((this.orderType == null)?"<null>":this.orderType));
        sb.append(',');
        sb.append("desiredDate");
        sb.append('=');
        sb.append(((this.desiredDate == null)?"<null>":this.desiredDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("quoteSummary");
        sb.append('=');
        sb.append(((this.quoteSummary == null)?"<null>":this.quoteSummary));
        sb.append(',');
        sb.append("applicationDate");
        sb.append('=');
        sb.append(((this.applicationDate == null)?"<null>":this.applicationDate));
        sb.append(',');
        sb.append("processInstId");
        sb.append('=');
        sb.append(((this.processInstId == null)?"<null>":this.processInstId));
        sb.append(',');
        sb.append("workOrderItemId");
        sb.append('=');
        sb.append(((this.workOrderItemId == null)?"<null>":this.workOrderItemId));
        sb.append(',');
        sb.append("cartAttributes");
        sb.append('=');
        sb.append(((this.cartAttributes == null)?"<null>":this.cartAttributes));
        sb.append(',');
        sb.append("bulkIndicator");
        sb.append('=');
        sb.append(((this.bulkIndicator == null)?"<null>":this.bulkIndicator));
        sb.append(',');
        sb.append("agreementIds");
        sb.append('=');
        sb.append(((this.agreementIds == null)?"<null>":this.agreementIds));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

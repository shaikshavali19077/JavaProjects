
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actionType",
    "orderItemType",
    "actionItemId",
    "owningCfsId",
    "owningBundleId",
    "isOriginal",
    "isEditable",
    "objectId",
    "productBundleAction",
    "serviceOrderId",
    "productComponentAction",
    "owningAccountId",
    "customerFacingServiceAction",
    "attachmentAction",
    "addressAction",
    "contactRoleAction",
    "inventoryAction",
    "linkedId",
    "paymentMethodAction",
    "customerAccountAction"
})
public class CartAction {

    @JsonProperty("actionType")
    private Integer actionType;
    @JsonProperty("orderItemType")
    private String orderItemType;
    @JsonProperty("actionItemId")
    private Integer actionItemId;
    @JsonProperty("owningCfsId")
    private String owningCfsId;
    @JsonProperty("owningBundleId")
    private String owningBundleId;
    @JsonProperty("isOriginal")
    private Boolean isOriginal;
    @JsonProperty("isEditable")
    private Boolean isEditable;
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("productBundleAction")
    private ProductBundleAction productBundleAction;
    @JsonProperty("serviceOrderId")
    private Integer serviceOrderId;
    @JsonProperty("productComponentAction")
    private ProductComponentAction productComponentAction;
    @JsonProperty("owningAccountId")
    private String owningAccountId;
    @JsonProperty("customerFacingServiceAction")
    private CustomerFacingServiceAction customerFacingServiceAction;
    @JsonProperty("attachmentAction")
    private AttachmentAction attachmentAction;
    @JsonProperty("addressAction")
    private AddressAction addressAction;
    @JsonProperty("contactRoleAction")
    private ContactRoleAction contactRoleAction;
    @JsonProperty("inventoryAction")
    private InventoryAction inventoryAction;
    @JsonProperty("linkedId")
    private String linkedId;
    @JsonProperty("paymentMethodAction")
    private PaymentMethodAction paymentMethodAction;
    @JsonProperty("customerAccountAction")
    private CustomerAccountAction customerAccountAction;

    @JsonProperty("actionType")
    public Integer getActionType() {
        return actionType;
    }

    @JsonProperty("actionType")
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    @JsonProperty("orderItemType")
    public String getOrderItemType() {
        return orderItemType;
    }

    @JsonProperty("orderItemType")
    public void setOrderItemType(String orderItemType) {
        this.orderItemType = orderItemType;
    }

    @JsonProperty("actionItemId")
    public Integer getActionItemId() {
        return actionItemId;
    }

    @JsonProperty("actionItemId")
    public void setActionItemId(Integer actionItemId) {
        this.actionItemId = actionItemId;
    }

    @JsonProperty("owningCfsId")
    public String getOwningCfsId() {
        return owningCfsId;
    }

    @JsonProperty("owningCfsId")
    public void setOwningCfsId(String owningCfsId) {
        this.owningCfsId = owningCfsId;
    }

    @JsonProperty("owningBundleId")
    public String getOwningBundleId() {
        return owningBundleId;
    }

    @JsonProperty("owningBundleId")
    public void setOwningBundleId(String owningBundleId) {
        this.owningBundleId = owningBundleId;
    }

    @JsonProperty("isOriginal")
    public Boolean getIsOriginal() {
        return isOriginal;
    }

    @JsonProperty("isOriginal")
    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    @JsonProperty("isEditable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("isEditable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("objectId")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("objectId")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("productBundleAction")
    public ProductBundleAction getProductBundleAction() {
        return productBundleAction;
    }

    @JsonProperty("productBundleAction")
    public void setProductBundleAction(ProductBundleAction productBundleAction) {
        this.productBundleAction = productBundleAction;
    }

    @JsonProperty("serviceOrderId")
    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("productComponentAction")
    public ProductComponentAction getProductComponentAction() {
        return productComponentAction;
    }

    @JsonProperty("productComponentAction")
    public void setProductComponentAction(ProductComponentAction productComponentAction) {
        this.productComponentAction = productComponentAction;
    }

    @JsonProperty("owningAccountId")
    public String getOwningAccountId() {
        return owningAccountId;
    }

    @JsonProperty("owningAccountId")
    public void setOwningAccountId(String owningAccountId) {
        this.owningAccountId = owningAccountId;
    }

    @JsonProperty("customerFacingServiceAction")
    public CustomerFacingServiceAction getCustomerFacingServiceAction() {
        return customerFacingServiceAction;
    }

    @JsonProperty("customerFacingServiceAction")
    public void setCustomerFacingServiceAction(CustomerFacingServiceAction customerFacingServiceAction) {
        this.customerFacingServiceAction = customerFacingServiceAction;
    }

    @JsonProperty("attachmentAction")
    public AttachmentAction getAttachmentAction() {
        return attachmentAction;
    }

    @JsonProperty("attachmentAction")
    public void setAttachmentAction(AttachmentAction attachmentAction) {
        this.attachmentAction = attachmentAction;
    }

    @JsonProperty("addressAction")
    public AddressAction getAddressAction() {
        return addressAction;
    }

    @JsonProperty("addressAction")
    public void setAddressAction(AddressAction addressAction) {
        this.addressAction = addressAction;
    }

    @JsonProperty("contactRoleAction")
    public ContactRoleAction getContactRoleAction() {
        return contactRoleAction;
    }

    @JsonProperty("contactRoleAction")
    public void setContactRoleAction(ContactRoleAction contactRoleAction) {
        this.contactRoleAction = contactRoleAction;
    }

    @JsonProperty("inventoryAction")
    public InventoryAction getInventoryAction() {
        return inventoryAction;
    }

    @JsonProperty("inventoryAction")
    public void setInventoryAction(InventoryAction inventoryAction) {
        this.inventoryAction = inventoryAction;
    }

    @JsonProperty("linkedId")
    public String getLinkedId() {
        return linkedId;
    }

    @JsonProperty("linkedId")
    public void setLinkedId(String linkedId) {
        this.linkedId = linkedId;
    }

    @JsonProperty("paymentMethodAction")
    public PaymentMethodAction getPaymentMethodAction() {
        return paymentMethodAction;
    }

    @JsonProperty("paymentMethodAction")
    public void setPaymentMethodAction(PaymentMethodAction paymentMethodAction) {
        this.paymentMethodAction = paymentMethodAction;
    }

    @JsonProperty("customerAccountAction")
    public CustomerAccountAction getCustomerAccountAction() {
        return customerAccountAction;
    }

    @JsonProperty("customerAccountAction")
    public void setCustomerAccountAction(CustomerAccountAction customerAccountAction) {
        this.customerAccountAction = customerAccountAction;
    }

}

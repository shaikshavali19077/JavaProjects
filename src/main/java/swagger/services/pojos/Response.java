
package swagger.services.pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactPhone2",
    "contactCompany",
    "orderType",
    "orderNumber",
    "orderId",
    "contactPhone1",
    "createWho",
    "serviceOrder",
    "batchId",
    "lockDt",
    "salesChannelInfo",
    "salesChannelId",
    "contactTitle",
    "completeDt",
    "generateWorkflow",
    "isLocked",
    "accountInternalId",
    "contactEmail",
    "contactLname",
    "createDt",
    "orderStatusId",
    "contactFname",
    "additionalProperties",
    "relatedOffering",
    "lockWho",
    "extendedData"
})
public class Response {

    @JsonProperty("contactPhone2")
    private String contactPhone2;
    @JsonProperty("contactCompany")
    private String contactCompany;
    @JsonProperty("orderType")
    private OrderType orderType;
    @JsonProperty("orderNumber")
    private String orderNumber;
    @JsonProperty("orderId")
    private Integer orderId;
    @JsonProperty("contactPhone1")
    private String contactPhone1;
    @JsonProperty("createWho")
    private String createWho;
    @JsonProperty("serviceOrder")
    private List<ServiceOrder> serviceOrder = new ArrayList<ServiceOrder>();
    @JsonProperty("batchId")
    private Integer batchId;
    @JsonProperty("lockDt")
    private String lockDt;
    @JsonProperty("salesChannelInfo")
    private SalesChannelInfo salesChannelInfo;
    @JsonProperty("salesChannelId")
    private SalesChannelId__1 salesChannelId;
    @JsonProperty("contactTitle")
    private String contactTitle;
    @JsonProperty("completeDt")
    private String completeDt;
    @JsonProperty("generateWorkflow")
    private Boolean generateWorkflow;
    @JsonProperty("isLocked")
    private Boolean isLocked;
    @JsonProperty("accountInternalId")
    private Integer accountInternalId;
    @JsonProperty("contactEmail")
    private String contactEmail;
    @JsonProperty("contactLname")
    private String contactLname;
    @JsonProperty("createDt")
    private String createDt;
    @JsonProperty("orderStatusId")
    private OrderStatusId__1 orderStatusId;
    @JsonProperty("contactFname")
    private String contactFname;
    @JsonProperty("additionalProperties")
    private AdditionalProperties__6 additionalProperties;
    @JsonProperty("relatedOffering")
    private String relatedOffering;
    @JsonProperty("lockWho")
    private String lockWho;
    @JsonProperty("extendedData")
    private ExtendedData__1 extendedData;

    @JsonProperty("contactPhone2")
    public String getContactPhone2() {
        return contactPhone2;
    }

    @JsonProperty("contactPhone2")
    public void setContactPhone2(String contactPhone2) {
        this.contactPhone2 = contactPhone2;
    }

    @JsonProperty("contactCompany")
    public String getContactCompany() {
        return contactCompany;
    }

    @JsonProperty("contactCompany")
    public void setContactCompany(String contactCompany) {
        this.contactCompany = contactCompany;
    }

    @JsonProperty("orderType")
    public OrderType getOrderType() {
        return orderType;
    }

    @JsonProperty("orderType")
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("orderId")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("contactPhone1")
    public String getContactPhone1() {
        return contactPhone1;
    }

    @JsonProperty("contactPhone1")
    public void setContactPhone1(String contactPhone1) {
        this.contactPhone1 = contactPhone1;
    }

    @JsonProperty("createWho")
    public String getCreateWho() {
        return createWho;
    }

    @JsonProperty("createWho")
    public void setCreateWho(String createWho) {
        this.createWho = createWho;
    }

    @JsonProperty("serviceOrder")
    public List<ServiceOrder> getServiceOrder() {
        return serviceOrder;
    }

    @JsonProperty("serviceOrder")
    public void setServiceOrder(List<ServiceOrder> serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    @JsonProperty("batchId")
    public Integer getBatchId() {
        return batchId;
    }

    @JsonProperty("batchId")
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    @JsonProperty("lockDt")
    public String getLockDt() {
        return lockDt;
    }

    @JsonProperty("lockDt")
    public void setLockDt(String lockDt) {
        this.lockDt = lockDt;
    }

    @JsonProperty("salesChannelInfo")
    public SalesChannelInfo getSalesChannelInfo() {
        return salesChannelInfo;
    }

    @JsonProperty("salesChannelInfo")
    public void setSalesChannelInfo(SalesChannelInfo salesChannelInfo) {
        this.salesChannelInfo = salesChannelInfo;
    }

    @JsonProperty("salesChannelId")
    public SalesChannelId__1 getSalesChannelId() {
        return salesChannelId;
    }

    @JsonProperty("salesChannelId")
    public void setSalesChannelId(SalesChannelId__1 salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    @JsonProperty("contactTitle")
    public String getContactTitle() {
        return contactTitle;
    }

    @JsonProperty("contactTitle")
    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    @JsonProperty("completeDt")
    public String getCompleteDt() {
        return completeDt;
    }

    @JsonProperty("completeDt")
    public void setCompleteDt(String completeDt) {
        this.completeDt = completeDt;
    }

    @JsonProperty("generateWorkflow")
    public Boolean getGenerateWorkflow() {
        return generateWorkflow;
    }

    @JsonProperty("generateWorkflow")
    public void setGenerateWorkflow(Boolean generateWorkflow) {
        this.generateWorkflow = generateWorkflow;
    }

    @JsonProperty("isLocked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    @JsonProperty("isLocked")
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @JsonProperty("accountInternalId")
    public Integer getAccountInternalId() {
        return accountInternalId;
    }

    @JsonProperty("accountInternalId")
    public void setAccountInternalId(Integer accountInternalId) {
        this.accountInternalId = accountInternalId;
    }

    @JsonProperty("contactEmail")
    public String getContactEmail() {
        return contactEmail;
    }

    @JsonProperty("contactEmail")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonProperty("contactLname")
    public String getContactLname() {
        return contactLname;
    }

    @JsonProperty("contactLname")
    public void setContactLname(String contactLname) {
        this.contactLname = contactLname;
    }

    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    @JsonProperty("orderStatusId")
    public OrderStatusId__1 getOrderStatusId() {
        return orderStatusId;
    }

    @JsonProperty("orderStatusId")
    public void setOrderStatusId(OrderStatusId__1 orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @JsonProperty("contactFname")
    public String getContactFname() {
        return contactFname;
    }

    @JsonProperty("contactFname")
    public void setContactFname(String contactFname) {
        this.contactFname = contactFname;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__6 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__6 additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("relatedOffering")
    public String getRelatedOffering() {
        return relatedOffering;
    }

    @JsonProperty("relatedOffering")
    public void setRelatedOffering(String relatedOffering) {
        this.relatedOffering = relatedOffering;
    }

    @JsonProperty("lockWho")
    public String getLockWho() {
        return lockWho;
    }

    @JsonProperty("lockWho")
    public void setLockWho(String lockWho) {
        this.lockWho = lockWho;
    }

    @JsonProperty("extendedData")
    public ExtendedData__1 getExtendedData() {
        return extendedData;
    }

    @JsonProperty("extendedData")
    public void setExtendedData(ExtendedData__1 extendedData) {
        this.extendedData = extendedData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactPhone2");
        sb.append('=');
        sb.append(((this.contactPhone2 == null)?"<null>":this.contactPhone2));
        sb.append(',');
        sb.append("contactCompany");
        sb.append('=');
        sb.append(((this.contactCompany == null)?"<null>":this.contactCompany));
        sb.append(',');
        sb.append("orderType");
        sb.append('=');
        sb.append(((this.orderType == null)?"<null>":this.orderType));
        sb.append(',');
        sb.append("orderNumber");
        sb.append('=');
        sb.append(((this.orderNumber == null)?"<null>":this.orderNumber));
        sb.append(',');
        sb.append("orderId");
        sb.append('=');
        sb.append(((this.orderId == null)?"<null>":this.orderId));
        sb.append(',');
        sb.append("contactPhone1");
        sb.append('=');
        sb.append(((this.contactPhone1 == null)?"<null>":this.contactPhone1));
        sb.append(',');
        sb.append("createWho");
        sb.append('=');
        sb.append(((this.createWho == null)?"<null>":this.createWho));
        sb.append(',');
        sb.append("serviceOrder");
        sb.append('=');
        sb.append(((this.serviceOrder == null)?"<null>":this.serviceOrder));
        sb.append(',');
        sb.append("batchId");
        sb.append('=');
        sb.append(((this.batchId == null)?"<null>":this.batchId));
        sb.append(',');
        sb.append("lockDt");
        sb.append('=');
        sb.append(((this.lockDt == null)?"<null>":this.lockDt));
        sb.append(',');
        sb.append("salesChannelInfo");
        sb.append('=');
        sb.append(((this.salesChannelInfo == null)?"<null>":this.salesChannelInfo));
        sb.append(',');
        sb.append("salesChannelId");
        sb.append('=');
        sb.append(((this.salesChannelId == null)?"<null>":this.salesChannelId));
        sb.append(',');
        sb.append("contactTitle");
        sb.append('=');
        sb.append(((this.contactTitle == null)?"<null>":this.contactTitle));
        sb.append(',');
        sb.append("completeDt");
        sb.append('=');
        sb.append(((this.completeDt == null)?"<null>":this.completeDt));
        sb.append(',');
        sb.append("generateWorkflow");
        sb.append('=');
        sb.append(((this.generateWorkflow == null)?"<null>":this.generateWorkflow));
        sb.append(',');
        sb.append("isLocked");
        sb.append('=');
        sb.append(((this.isLocked == null)?"<null>":this.isLocked));
        sb.append(',');
        sb.append("accountInternalId");
        sb.append('=');
        sb.append(((this.accountInternalId == null)?"<null>":this.accountInternalId));
        sb.append(',');
        sb.append("contactEmail");
        sb.append('=');
        sb.append(((this.contactEmail == null)?"<null>":this.contactEmail));
        sb.append(',');
        sb.append("contactLname");
        sb.append('=');
        sb.append(((this.contactLname == null)?"<null>":this.contactLname));
        sb.append(',');
        sb.append("createDt");
        sb.append('=');
        sb.append(((this.createDt == null)?"<null>":this.createDt));
        sb.append(',');
        sb.append("orderStatusId");
        sb.append('=');
        sb.append(((this.orderStatusId == null)?"<null>":this.orderStatusId));
        sb.append(',');
        sb.append("contactFname");
        sb.append('=');
        sb.append(((this.contactFname == null)?"<null>":this.contactFname));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("relatedOffering");
        sb.append('=');
        sb.append(((this.relatedOffering == null)?"<null>":this.relatedOffering));
        sb.append(',');
        sb.append("lockWho");
        sb.append('=');
        sb.append(((this.lockWho == null)?"<null>":this.lockWho));
        sb.append(',');
        sb.append("extendedData");
        sb.append('=');
        sb.append(((this.extendedData == null)?"<null>":this.extendedData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

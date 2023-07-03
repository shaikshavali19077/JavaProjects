
package swagger.services.pojos;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personalIds",
    "businessDocuments",
    "desiredPortDates",
    "numbers",
    "numberType",
    "noOfServices",
    "currentNetworkOperator",
    "recipientNetworkOperator",
    "status",
    "transactionDate",
    "statusUrl",
    "id",
    "correlationId",
    "type",
    "serviceOrderId",
    "portInRequestId"
})
public class NPRequestSingleNumber {

    @JsonProperty("personalIds")
    private List<PersonalId> personalIds = new ArrayList<PersonalId>();
    @JsonProperty("businessDocuments")
    private List<BusinessDocument> businessDocuments = new ArrayList<BusinessDocument>();
    @JsonProperty("desiredPortDates")
    private List<DesiredPortDate> desiredPortDates = new ArrayList<DesiredPortDate>();
    @JsonProperty("numbers")
    private List<Number> numbers = new ArrayList<Number>();
    @JsonProperty("numberType")
    private String numberType;
    @JsonProperty("noOfServices")
    private Integer noOfServices;
    @JsonProperty("currentNetworkOperator")
    private String currentNetworkOperator;
    @JsonProperty("recipientNetworkOperator")
    private String recipientNetworkOperator;
    @JsonProperty("status")
    private String status;
    @JsonProperty("transactionDate")
    private String transactionDate;
    @JsonProperty("statusUrl")
    private String statusUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("correlationId")
    private String correlationId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("serviceOrderId")
    private String serviceOrderId;
    @JsonProperty("portInRequestId")
    private String portInRequestId;

    @JsonProperty("personalIds")
    public List<PersonalId> getPersonalIds() {
        return personalIds;
    }

    @JsonProperty("personalIds")
    public void setPersonalIds(List<PersonalId> personalIds) {
        this.personalIds = personalIds;
    }

    @JsonProperty("businessDocuments")
    public List<BusinessDocument> getBusinessDocuments() {
        return businessDocuments;
    }

    @JsonProperty("businessDocuments")
    public void setBusinessDocuments(List<BusinessDocument> businessDocuments) {
        this.businessDocuments = businessDocuments;
    }

    @JsonProperty("desiredPortDates")
    public List<DesiredPortDate> getDesiredPortDates() {
        return desiredPortDates;
    }

    @JsonProperty("desiredPortDates")
    public void setDesiredPortDates(List<DesiredPortDate> desiredPortDates) {
        this.desiredPortDates = desiredPortDates;
    }

    @JsonProperty("numbers")
    public List<Number> getNumbers() {
        return numbers;
    }

    @JsonProperty("numbers")
    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    @JsonProperty("numberType")
    public String getNumberType() {
        return numberType;
    }

    @JsonProperty("numberType")
    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    @JsonProperty("noOfServices")
    public Integer getNoOfServices() {
        return noOfServices;
    }

    @JsonProperty("noOfServices")
    public void setNoOfServices(Integer noOfServices) {
        this.noOfServices = noOfServices;
    }

    @JsonProperty("currentNetworkOperator")
    public String getCurrentNetworkOperator() {
        return currentNetworkOperator;
    }

    @JsonProperty("currentNetworkOperator")
    public void setCurrentNetworkOperator(String currentNetworkOperator) {
        this.currentNetworkOperator = currentNetworkOperator;
    }

    @JsonProperty("recipientNetworkOperator")
    public String getRecipientNetworkOperator() {
        return recipientNetworkOperator;
    }

    @JsonProperty("recipientNetworkOperator")
    public void setRecipientNetworkOperator(String recipientNetworkOperator) {
        this.recipientNetworkOperator = recipientNetworkOperator;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("statusUrl")
    public String getStatusUrl() {
        return statusUrl;
    }

    @JsonProperty("statusUrl")
    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("serviceOrderId")
    public String getServiceOrderId() {
        return serviceOrderId;
    }

    @JsonProperty("serviceOrderId")
    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    @JsonProperty("portInRequestId")
    public String getPortInRequestId() {
        return portInRequestId;
    }

    @JsonProperty("portInRequestId")
    public void setPortInRequestId(String portInRequestId) {
        this.portInRequestId = portInRequestId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NPRequestSingleNumber.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personalIds");
        sb.append('=');
        sb.append(((this.personalIds == null)?"<null>":this.personalIds));
        sb.append(',');
        sb.append("businessDocuments");
        sb.append('=');
        sb.append(((this.businessDocuments == null)?"<null>":this.businessDocuments));
        sb.append(',');
        sb.append("desiredPortDates");
        sb.append('=');
        sb.append(((this.desiredPortDates == null)?"<null>":this.desiredPortDates));
        sb.append(',');
        sb.append("numbers");
        sb.append('=');
        sb.append(((this.numbers == null)?"<null>":this.numbers));
        sb.append(',');
        sb.append("numberType");
        sb.append('=');
        sb.append(((this.numberType == null)?"<null>":this.numberType));
        sb.append(',');
        sb.append("noOfServices");
        sb.append('=');
        sb.append(((this.noOfServices == null)?"<null>":this.noOfServices));
        sb.append(',');
        sb.append("currentNetworkOperator");
        sb.append('=');
        sb.append(((this.currentNetworkOperator == null)?"<null>":this.currentNetworkOperator));
        sb.append(',');
        sb.append("recipientNetworkOperator");
        sb.append('=');
        sb.append(((this.recipientNetworkOperator == null)?"<null>":this.recipientNetworkOperator));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("transactionDate");
        sb.append('=');
        sb.append(((this.transactionDate == null)?"<null>":this.transactionDate));
        sb.append(',');
        sb.append("statusUrl");
        sb.append('=');
        sb.append(((this.statusUrl == null)?"<null>":this.statusUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("correlationId");
        sb.append('=');
        sb.append(((this.correlationId == null)?"<null>":this.correlationId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("serviceOrderId");
        sb.append('=');
        sb.append(((this.serviceOrderId == null)?"<null>":this.serviceOrderId));
        sb.append(',');
        sb.append("portInRequestId");
        sb.append('=');
        sb.append(((this.portInRequestId == null)?"<null>":this.portInRequestId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

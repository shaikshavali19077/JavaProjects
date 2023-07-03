
package swagger.services.pojos.ppf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactMediumId",
    "displayValue",
    "sortOrder",
    "contactMediumSpecId",
    "statusId",
    "verified",
    "phoneNumber"
})
public class TelephoneContact {

    @JsonProperty("contactMediumId")
    private Integer contactMediumId;
    @JsonProperty("displayValue")
    private String displayValue;
    @JsonProperty("sortOrder")
    private Integer sortOrder;
    @JsonProperty("contactMediumSpecId")
    private Integer contactMediumSpecId;
    @JsonProperty("statusId")
    private Integer statusId;
    @JsonProperty("verified")
    private Integer verified;
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("contactMediumId")
    public Integer getContactMediumId() {
        return contactMediumId;
    }

    @JsonProperty("contactMediumId")
    public void setContactMediumId(Integer contactMediumId) {
        this.contactMediumId = contactMediumId;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("sortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("contactMediumSpecId")
    public Integer getContactMediumSpecId() {
        return contactMediumSpecId;
    }

    @JsonProperty("contactMediumSpecId")
    public void setContactMediumSpecId(Integer contactMediumSpecId) {
        this.contactMediumSpecId = contactMediumSpecId;
    }

    @JsonProperty("statusId")
    public Integer getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("verified")
    public Integer getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

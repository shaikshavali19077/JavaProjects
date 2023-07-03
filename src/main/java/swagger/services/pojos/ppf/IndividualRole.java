
package swagger.services.pojos.ppf;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "individualRoleId",
    "activeDate",
    "statusId",
    "statusLastChangedDate",
    "creationDate",
    "roleSpecId",
    "emailContacts",
    "telephoneContacts",
    "userIdentity",
    "userId",
    "createdBy",
    "isDefault",
    "relevantEntityId"
})
public class IndividualRole {

    @JsonProperty("individualRoleId")
    private Integer individualRoleId;
    @JsonProperty("activeDate")
    private String activeDate;
    @JsonProperty("statusId")
    private StatusId__1 statusId;
    @JsonProperty("statusLastChangedDate")
    private String statusLastChangedDate;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("roleSpecId")
    private RoleSpecId roleSpecId;
    @JsonProperty("emailContacts")
    private List<EmailContact> emailContacts = new ArrayList<EmailContact>();
    @JsonProperty("telephoneContacts")
    private List<TelephoneContact> telephoneContacts = new ArrayList<TelephoneContact>();
    @JsonProperty("userIdentity")
    private String userIdentity;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("relevantEntityId")
    private String relevantEntityId;

    @JsonProperty("individualRoleId")
    public Integer getIndividualRoleId() {
        return individualRoleId;
    }

    @JsonProperty("individualRoleId")
    public void setIndividualRoleId(Integer individualRoleId) {
        this.individualRoleId = individualRoleId;
    }

    @JsonProperty("activeDate")
    public String getActiveDate() {
        return activeDate;
    }

    @JsonProperty("activeDate")
    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    @JsonProperty("statusId")
    public StatusId__1 getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(StatusId__1 statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("statusLastChangedDate")
    public String getStatusLastChangedDate() {
        return statusLastChangedDate;
    }

    @JsonProperty("statusLastChangedDate")
    public void setStatusLastChangedDate(String statusLastChangedDate) {
        this.statusLastChangedDate = statusLastChangedDate;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("roleSpecId")
    public RoleSpecId getRoleSpecId() {
        return roleSpecId;
    }

    @JsonProperty("roleSpecId")
    public void setRoleSpecId(RoleSpecId roleSpecId) {
        this.roleSpecId = roleSpecId;
    }

    @JsonProperty("emailContacts")
    public List<EmailContact> getEmailContacts() {
        return emailContacts;
    }

    @JsonProperty("emailContacts")
    public void setEmailContacts(List<EmailContact> emailContacts) {
        this.emailContacts = emailContacts;
    }

    @JsonProperty("telephoneContacts")
    public List<TelephoneContact> getTelephoneContacts() {
        return telephoneContacts;
    }

    @JsonProperty("telephoneContacts")
    public void setTelephoneContacts(List<TelephoneContact> telephoneContacts) {
        this.telephoneContacts = telephoneContacts;
    }

    @JsonProperty("userIdentity")
    public String getUserIdentity() {
        return userIdentity;
    }

    @JsonProperty("userIdentity")
    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("relevantEntityId")
    public String getRelevantEntityId() {
        return relevantEntityId;
    }

    @JsonProperty("relevantEntityId")
    public void setRelevantEntityId(String relevantEntityId) {
        this.relevantEntityId = relevantEntityId;
    }

}

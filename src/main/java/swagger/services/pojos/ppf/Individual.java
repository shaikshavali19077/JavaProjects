
package swagger.services.pojos.ppf;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "individualId",
    "firstName",
    "lastName",
    "dateOfBirth",
    "citizenOf",
    "isVip",
    "statusId",
    "prefix",
    "timeZone",
    "preferredLanguageCode",
    "externalIds",
    "employment",
    "individualRoles",
    "addressAssocs",
    "identityVerification"
})
public class Individual {

    @JsonProperty("individualId")
    private Integer individualId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("citizenOf")
    private CitizenOf citizenOf;
    @JsonProperty("isVip")
    private Boolean isVip;
    @JsonProperty("statusId")
    private StatusId statusId;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("preferredLanguageCode")
    private PreferredLanguageCode preferredLanguageCode;
    @JsonProperty("externalIds")
    private List<ExternalId> externalIds = new ArrayList<ExternalId>();
    @JsonProperty("employment")
    private List<Employment> employment = new ArrayList<Employment>();
    @JsonProperty("individualRoles")
    private List<IndividualRole> individualRoles = new ArrayList<IndividualRole>();
    @JsonProperty("addressAssocs")
    private List<AddressAssoc> addressAssocs = new ArrayList<AddressAssoc>();
    @JsonProperty("identityVerification")
    private IdentityVerification identityVerification;

    @JsonProperty("individualId")
    public Integer getIndividualId() {
        return individualId;
    }

    @JsonProperty("individualId")
    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
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

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("citizenOf")
    public CitizenOf getCitizenOf() {
        return citizenOf;
    }

    @JsonProperty("citizenOf")
    public void setCitizenOf(CitizenOf citizenOf) {
        this.citizenOf = citizenOf;
    }

    @JsonProperty("isVip")
    public Boolean getIsVip() {
        return isVip;
    }

    @JsonProperty("isVip")
    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    @JsonProperty("statusId")
    public StatusId getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(StatusId statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("preferredLanguageCode")
    public PreferredLanguageCode getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    @JsonProperty("preferredLanguageCode")
    public void setPreferredLanguageCode(PreferredLanguageCode preferredLanguageCode) {
        this.preferredLanguageCode = preferredLanguageCode;
    }

    @JsonProperty("externalIds")
    public List<ExternalId> getExternalIds() {
        return externalIds;
    }

    @JsonProperty("externalIds")
    public void setExternalIds(List<ExternalId> externalIds) {
        this.externalIds = externalIds;
    }

    @JsonProperty("employment")
    public List<Employment> getEmployment() {
        return employment;
    }

    @JsonProperty("employment")
    public void setEmployment(List<Employment> employment) {
        this.employment = employment;
    }

    @JsonProperty("individualRoles")
    public List<IndividualRole> getIndividualRoles() {
        return individualRoles;
    }

    @JsonProperty("individualRoles")
    public void setIndividualRoles(List<IndividualRole> individualRoles) {
        this.individualRoles = individualRoles;
    }

    @JsonProperty("addressAssocs")
    public List<AddressAssoc> getAddressAssocs() {
        return addressAssocs;
    }

    @JsonProperty("addressAssocs")
    public void setAddressAssocs(List<AddressAssoc> addressAssocs) {
        this.addressAssocs = addressAssocs;
    }

    @JsonProperty("identityVerification")
    public IdentityVerification getIdentityVerification() {
        return identityVerification;
    }

    @JsonProperty("identityVerification")
    public void setIdentityVerification(IdentityVerification identityVerification) {
        this.identityVerification = identityVerification;
    }

}

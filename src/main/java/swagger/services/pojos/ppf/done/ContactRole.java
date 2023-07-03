
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "roleSpecId",
    "contactId",
    "userId",
    "characteristics",
    "individualRoleConsents"
})
public class ContactRole {

    @JsonProperty("roleSpecId")
    private Integer roleSpecId;
    @JsonProperty("contactId")
    private Integer contactId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("characteristics")
    private List<Object> characteristics = new ArrayList<Object>();
    @JsonProperty("individualRoleConsents")
    private List<IndividualRoleConsent> individualRoleConsents = new ArrayList<IndividualRoleConsent>();

    @JsonProperty("roleSpecId")
    public Integer getRoleSpecId() {
        return roleSpecId;
    }

    @JsonProperty("roleSpecId")
    public void setRoleSpecId(Integer roleSpecId) {
        this.roleSpecId = roleSpecId;
    }

    @JsonProperty("contactId")
    public Integer getContactId() {
        return contactId;
    }

    @JsonProperty("contactId")
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("characteristics")
    public List<Object> getCharacteristics() {
        return characteristics;
    }

    @JsonProperty("characteristics")
    public void setCharacteristics(List<Object> characteristics) {
        this.characteristics = characteristics;
    }

    @JsonProperty("individualRoleConsents")
    public List<IndividualRoleConsent> getIndividualRoleConsents() {
        return individualRoleConsents;
    }

    @JsonProperty("individualRoleConsents")
    public void setIndividualRoleConsents(List<IndividualRoleConsent> individualRoleConsents) {
        this.individualRoleConsents = individualRoleConsents;
    }

}


package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactRole"
})
public class ContactRoleAction {

    @JsonProperty("contactRole")
    private ContactRole contactRole;

    @JsonProperty("contactRole")
    public ContactRole getContactRole() {
        return contactRole;
    }

    @JsonProperty("contactRole")
    public void setContactRole(ContactRole contactRole) {
        this.contactRole = contactRole;
    }

}

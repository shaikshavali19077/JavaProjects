
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "roleConsentTypeId",
    "isAllowed"
})
public class IndividualRoleConsent {

    @JsonProperty("roleConsentTypeId")
    private Integer roleConsentTypeId;
    @JsonProperty("isAllowed")
    private Boolean isAllowed;

    @JsonProperty("roleConsentTypeId")
    public Integer getRoleConsentTypeId() {
        return roleConsentTypeId;
    }

    @JsonProperty("roleConsentTypeId")
    public void setRoleConsentTypeId(Integer roleConsentTypeId) {
        this.roleConsentTypeId = roleConsentTypeId;
    }

    @JsonProperty("isAllowed")
    public Boolean getIsAllowed() {
        return isAllowed;
    }

    @JsonProperty("isAllowed")
    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

}

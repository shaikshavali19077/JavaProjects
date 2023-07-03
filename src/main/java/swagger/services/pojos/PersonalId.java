
package swagger.services.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personalId",
    "personalIdType"
})
public class PersonalId {

    @JsonProperty("personalId")
    private String personalId;
    @JsonProperty("personalIdType")
    private String personalIdType;

    @JsonProperty("personalId")
    public String getPersonalId() {
        return personalId;
    }

    @JsonProperty("personalId")
    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    @JsonProperty("personalIdType")
    public String getPersonalIdType() {
        return personalIdType;
    }

    @JsonProperty("personalIdType")
    public void setPersonalIdType(String personalIdType) {
        this.personalIdType = personalIdType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalId.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personalId");
        sb.append('=');
        sb.append(((this.personalId == null)?"<null>":this.personalId));
        sb.append(',');
        sb.append("personalIdType");
        sb.append('=');
        sb.append(((this.personalIdType == null)?"<null>":this.personalIdType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

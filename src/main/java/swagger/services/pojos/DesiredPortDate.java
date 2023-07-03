
package swagger.services.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "desiredPortDate"
})
public class DesiredPortDate {

    @JsonProperty("desiredPortDate")
    private String desiredPortDate;

    @JsonProperty("desiredPortDate")
    public String getDesiredPortDate() {
        return desiredPortDate;
    }

    @JsonProperty("desiredPortDate")
    public void setDesiredPortDate(String desiredPortDate) {
        this.desiredPortDate = desiredPortDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DesiredPortDate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("desiredPortDate");
        sb.append('=');
        sb.append(((this.desiredPortDate == null)?"<null>":this.desiredPortDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

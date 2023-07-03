
package swagger.services.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startNumber"
})
public class Number {

    @JsonProperty("startNumber")
    private String startNumber;

    @JsonProperty("startNumber")
    public String getStartNumber() {
        return startNumber;
    }

    @JsonProperty("startNumber")
    public void setStartNumber(String startNumber) {
        this.startNumber = startNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Number.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startNumber");
        sb.append('=');
        sb.append(((this.startNumber == null)?"<null>":this.startNumber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

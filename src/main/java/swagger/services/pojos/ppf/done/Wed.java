
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startHour",
    "endHour"
})
public class Wed {

    @JsonProperty("startHour")
    private String startHour;
    @JsonProperty("endHour")
    private String endHour;

    @JsonProperty("startHour")
    public String getStartHour() {
        return startHour;
    }

    @JsonProperty("startHour")
    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @JsonProperty("endHour")
    public String getEndHour() {
        return endHour;
    }

    @JsonProperty("endHour")
    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

}

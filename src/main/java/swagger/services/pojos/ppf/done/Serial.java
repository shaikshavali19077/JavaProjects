
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serialId"
})
public class Serial {

    @JsonProperty("serialId")
    private String serialId;

    @JsonProperty("serialId")
    public String getSerialId() {
        return serialId;
    }

    @JsonProperty("serialId")
    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

}

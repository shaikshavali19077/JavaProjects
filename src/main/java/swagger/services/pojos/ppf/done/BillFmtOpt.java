
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "displayValue"
})
public class BillFmtOpt {

    @JsonProperty("key")
    private String key;
    @JsonProperty("displayValue")
    private String displayValue;

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

}

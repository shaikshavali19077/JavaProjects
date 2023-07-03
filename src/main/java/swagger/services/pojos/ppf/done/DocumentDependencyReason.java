
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "docDependReasonId",
    "displayValue"
})
public class DocumentDependencyReason {

    @JsonProperty("docDependReasonId")
    private Integer docDependReasonId;
    @JsonProperty("displayValue")
    private String displayValue;

    @JsonProperty("docDependReasonId")
    public Integer getDocDependReasonId() {
        return docDependReasonId;
    }

    @JsonProperty("docDependReasonId")
    public void setDocDependReasonId(Integer docDependReasonId) {
        this.docDependReasonId = docDependReasonId;
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

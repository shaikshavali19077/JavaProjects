
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "executionDelayInSecs",
    "errorResponse"
})
public class ChangeOwnershipResponse {

    @JsonProperty("executionDelayInSecs")
    private String executionDelayInSecs;
    @JsonProperty("errorResponse")
    private ErrorResponse errorResponse;

    @JsonProperty("executionDelayInSecs")
    public String getExecutionDelayInSecs() {
        return executionDelayInSecs;
    }

    @JsonProperty("executionDelayInSecs")
    public void setExecutionDelayInSecs(String executionDelayInSecs) {
        this.executionDelayInSecs = executionDelayInSecs;
    }

    @JsonProperty("errorResponse")
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    @JsonProperty("errorResponse")
    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeOwnershipResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executionDelayInSecs");
        sb.append('=');
        sb.append(((this.executionDelayInSecs == null)?"<null>":this.executionDelayInSecs));
        sb.append(',');
        sb.append("errorResponse");
        sb.append('=');
        sb.append(((this.errorResponse == null)?"<null>":this.errorResponse));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

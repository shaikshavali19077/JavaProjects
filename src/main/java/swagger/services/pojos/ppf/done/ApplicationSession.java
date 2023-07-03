
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryIntent",
    "userId"
})
public class ApplicationSession {

    @JsonProperty("primaryIntent")
    private PrimaryIntent primaryIntent;
    @JsonProperty("userId")
    private String userId;

    @JsonProperty("primaryIntent")
    public PrimaryIntent getPrimaryIntent() {
        return primaryIntent;
    }

    @JsonProperty("primaryIntent")
    public void setPrimaryIntent(PrimaryIntent primaryIntent) {
        this.primaryIntent = primaryIntent;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

}

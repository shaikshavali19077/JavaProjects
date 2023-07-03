
package swagger.services.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subscriberInfo"
})
public class OttActivatedSubscribersResponse {

    @JsonProperty("subscriberInfo")
    private List<SubscriberInfo> subscriberInfo = new ArrayList<SubscriberInfo>();

    @JsonProperty("subscriberInfo")
    public List<SubscriberInfo> getSubscriberInfo() {
        return subscriberInfo;
    }

    @JsonProperty("subscriberInfo")
    public void setSubscriberInfo(List<SubscriberInfo> subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OttActivatedSubscribersResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subscriberInfo");
        sb.append('=');
        sb.append(((this.subscriberInfo == null)?"<null>":this.subscriberInfo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

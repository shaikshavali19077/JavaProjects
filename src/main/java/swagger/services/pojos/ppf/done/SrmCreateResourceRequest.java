
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "name",
    "value",
    "resourceStatus",
    "resourceCharacteristic"
})
public class SrmCreateResourceRequest {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("resourceStatus")
    private String resourceStatus;
    @JsonProperty("resourceCharacteristic")
    private List<Object> resourceCharacteristic = new ArrayList<Object>();

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("resourceStatus")
    public String getResourceStatus() {
        return resourceStatus;
    }

    @JsonProperty("resourceStatus")
    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    @JsonProperty("resourceCharacteristic")
    public List<Object> getResourceCharacteristic() {
        return resourceCharacteristic;
    }

    @JsonProperty("resourceCharacteristic")
    public void setResourceCharacteristic(List<Object> resourceCharacteristic) {
        this.resourceCharacteristic = resourceCharacteristic;
    }

}

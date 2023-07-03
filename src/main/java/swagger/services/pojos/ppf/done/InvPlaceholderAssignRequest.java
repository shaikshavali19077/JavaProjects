
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "agentId",
    "plantId",
    "item"
})
public class InvPlaceholderAssignRequest {

    @JsonProperty("agentId")
    private String agentId;
    @JsonProperty("plantId")
    private String plantId;
    @JsonProperty("item")
    private List<Item> item = new ArrayList<Item>();

    @JsonProperty("agentId")
    public String getAgentId() {
        return agentId;
    }

    @JsonProperty("agentId")
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @JsonProperty("plantId")
    public String getPlantId() {
        return plantId;
    }

    @JsonProperty("plantId")
    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    @JsonProperty("item")
    public List<Item> getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

}


package swagger.services.Ordering;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "salesChannelId",
    "collateralAssocs",
    "additionalProperties"
})
public class SalesChannelInfo {

    @JsonProperty("salesChannelId")
    private SalesChannelId salesChannelId;
    @JsonProperty("collateralAssocs")
    private List<CollateralAssoc> collateralAssocs = new ArrayList<CollateralAssoc>();
    @JsonProperty("additionalProperties")
    private AdditionalProperties__5 additionalProperties;

    @JsonProperty("salesChannelId")
    public SalesChannelId getSalesChannelId() {
        return salesChannelId;
    }

    @JsonProperty("salesChannelId")
    public void setSalesChannelId(SalesChannelId salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    @JsonProperty("collateralAssocs")
    public List<CollateralAssoc> getCollateralAssocs() {
        return collateralAssocs;
    }

    @JsonProperty("collateralAssocs")
    public void setCollateralAssocs(List<CollateralAssoc> collateralAssocs) {
        this.collateralAssocs = collateralAssocs;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__5 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__5 additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesChannelInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("salesChannelId");
        sb.append('=');
        sb.append(((this.salesChannelId == null)?"<null>":this.salesChannelId));
        sb.append(',');
        sb.append("collateralAssocs");
        sb.append('=');
        sb.append(((this.collateralAssocs == null)?"<null>":this.collateralAssocs));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

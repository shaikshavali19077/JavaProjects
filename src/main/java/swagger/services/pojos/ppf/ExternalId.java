
package swagger.services.pojos.ppf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "individualExternalId",
    "externalId",
    "externalIdType"
})
public class ExternalId {

    @JsonProperty("individualExternalId")
    private String individualExternalId;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("externalIdType")
    private ExternalIdType externalIdType;

    @JsonProperty("individualExternalId")
    public String getIndividualExternalId() {
        return individualExternalId;
    }

    @JsonProperty("individualExternalId")
    public void setIndividualExternalId(String individualExternalId) {
        this.individualExternalId = individualExternalId;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("externalIdType")
    public ExternalIdType getExternalIdType() {
        return externalIdType;
    }

    @JsonProperty("externalIdType")
    public void setExternalIdType(ExternalIdType externalIdType) {
        this.externalIdType = externalIdType;
    }

}

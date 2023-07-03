
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "isActive",
    "tenantId",
    "configBusinessDaysCalendar"
})
public class BusinessDaysCalendar {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("configBusinessDaysCalendar")
    private ConfigBusinessDaysCalendar configBusinessDaysCalendar;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("isActive")
    public String getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("configBusinessDaysCalendar")
    public ConfigBusinessDaysCalendar getConfigBusinessDaysCalendar() {
        return configBusinessDaysCalendar;
    }

    @JsonProperty("configBusinessDaysCalendar")
    public void setConfigBusinessDaysCalendar(ConfigBusinessDaysCalendar configBusinessDaysCalendar) {
        this.configBusinessDaysCalendar = configBusinessDaysCalendar;
    }

}

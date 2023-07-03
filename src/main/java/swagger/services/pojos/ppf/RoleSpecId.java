
package swagger.services.pojos.ppf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "displayValue",
    "isDefault",
    "isInternal",
    "maxInstances",
    "internal",
    "default",
    "relatedEntity"
})
public class RoleSpecId {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("displayValue")
    private String displayValue;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("isInternal")
    private Boolean isInternal;
    @JsonProperty("maxInstances")
    private Integer maxInstances;
    @JsonProperty("internal")
    private Boolean internal;
    @JsonProperty("default")
    private Boolean _default;
    @JsonProperty("relatedEntity")
    private String relatedEntity;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("isInternal")
    public Boolean getIsInternal() {
        return isInternal;
    }

    @JsonProperty("isInternal")
    public void setIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
    }

    @JsonProperty("maxInstances")
    public Integer getMaxInstances() {
        return maxInstances;
    }

    @JsonProperty("maxInstances")
    public void setMaxInstances(Integer maxInstances) {
        this.maxInstances = maxInstances;
    }

    @JsonProperty("internal")
    public Boolean getInternal() {
        return internal;
    }

    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @JsonProperty("relatedEntity")
    public String getRelatedEntity() {
        return relatedEntity;
    }

    @JsonProperty("relatedEntity")
    public void setRelatedEntity(String relatedEntity) {
        this.relatedEntity = relatedEntity;
    }

}

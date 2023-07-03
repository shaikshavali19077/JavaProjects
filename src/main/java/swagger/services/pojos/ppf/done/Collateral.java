
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isLocateDefault",
    "formFactor",
    "collateralCategory",
    "collateralValue",
    "description",
    "additionalProperties",
    "collateralId",
    "type",
    "priority",
    "languageCode"
})
public class Collateral {

    @JsonProperty("isLocateDefault")
    private Boolean isLocateDefault;
    @JsonProperty("formFactor")
    private Integer formFactor;
    @JsonProperty("collateralCategory")
    private CollateralCategory collateralCategory;
    @JsonProperty("collateralValue")
    private String collateralValue;
    @JsonProperty("description")
    private String description;
    @JsonProperty("additionalProperties")
    private AdditionalProperties__4 additionalProperties;
    @JsonProperty("collateralId")
    private Integer collateralId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("languageCode")
    private Integer languageCode;

    @JsonProperty("isLocateDefault")
    public Boolean getIsLocateDefault() {
        return isLocateDefault;
    }

    @JsonProperty("isLocateDefault")
    public void setIsLocateDefault(Boolean isLocateDefault) {
        this.isLocateDefault = isLocateDefault;
    }

    @JsonProperty("formFactor")
    public Integer getFormFactor() {
        return formFactor;
    }

    @JsonProperty("formFactor")
    public void setFormFactor(Integer formFactor) {
        this.formFactor = formFactor;
    }

    @JsonProperty("collateralCategory")
    public CollateralCategory getCollateralCategory() {
        return collateralCategory;
    }

    @JsonProperty("collateralCategory")
    public void setCollateralCategory(CollateralCategory collateralCategory) {
        this.collateralCategory = collateralCategory;
    }

    @JsonProperty("collateralValue")
    public String getCollateralValue() {
        return collateralValue;
    }

    @JsonProperty("collateralValue")
    public void setCollateralValue(String collateralValue) {
        this.collateralValue = collateralValue;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__4 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__4 additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("collateralId")
    public Integer getCollateralId() {
        return collateralId;
    }

    @JsonProperty("collateralId")
    public void setCollateralId(Integer collateralId) {
        this.collateralId = collateralId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("languageCode")
    public Integer getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Collateral.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isLocateDefault");
        sb.append('=');
        sb.append(((this.isLocateDefault == null)?"<null>":this.isLocateDefault));
        sb.append(',');
        sb.append("formFactor");
        sb.append('=');
        sb.append(((this.formFactor == null)?"<null>":this.formFactor));
        sb.append(',');
        sb.append("collateralCategory");
        sb.append('=');
        sb.append(((this.collateralCategory == null)?"<null>":this.collateralCategory));
        sb.append(',');
        sb.append("collateralValue");
        sb.append('=');
        sb.append(((this.collateralValue == null)?"<null>":this.collateralValue));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("collateralId");
        sb.append('=');
        sb.append(((this.collateralId == null)?"<null>":this.collateralId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

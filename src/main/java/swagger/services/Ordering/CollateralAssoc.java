
package swagger.services.Ordering;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "characteristicDomain",
    "displayValue",
    "collateralAssocId",
    "entityName",
    "valueType",
    "characteristicType",
    "additionalProperties",
    "category",
    "characteristicName",
    "collateral",
    "characteristicId"
})
public class CollateralAssoc {

    @JsonProperty("characteristicDomain")
    private String characteristicDomain;
    @JsonProperty("displayValue")
    private String displayValue;
    @JsonProperty("collateralAssocId")
    private Integer collateralAssocId;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("valueType")
    private String valueType;
    @JsonProperty("characteristicType")
    private String characteristicType;
    @JsonProperty("additionalProperties")
    private AdditionalProperties__3 additionalProperties;
    @JsonProperty("category")
    private String category;
    @JsonProperty("characteristicName")
    private String characteristicName;
    @JsonProperty("collateral")
    private Collateral collateral;
    @JsonProperty("characteristicId")
    private Integer characteristicId;

    @JsonProperty("characteristicDomain")
    public String getCharacteristicDomain() {
        return characteristicDomain;
    }

    @JsonProperty("characteristicDomain")
    public void setCharacteristicDomain(String characteristicDomain) {
        this.characteristicDomain = characteristicDomain;
    }

    @JsonProperty("displayValue")
    public String getDisplayValue() {
        return displayValue;
    }

    @JsonProperty("displayValue")
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @JsonProperty("collateralAssocId")
    public Integer getCollateralAssocId() {
        return collateralAssocId;
    }

    @JsonProperty("collateralAssocId")
    public void setCollateralAssocId(Integer collateralAssocId) {
        this.collateralAssocId = collateralAssocId;
    }

    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @JsonProperty("valueType")
    public String getValueType() {
        return valueType;
    }

    @JsonProperty("valueType")
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @JsonProperty("characteristicType")
    public String getCharacteristicType() {
        return characteristicType;
    }

    @JsonProperty("characteristicType")
    public void setCharacteristicType(String characteristicType) {
        this.characteristicType = characteristicType;
    }

    @JsonProperty("additionalProperties")
    public AdditionalProperties__3 getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(AdditionalProperties__3 additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("characteristicName")
    public String getCharacteristicName() {
        return characteristicName;
    }

    @JsonProperty("characteristicName")
    public void setCharacteristicName(String characteristicName) {
        this.characteristicName = characteristicName;
    }

    @JsonProperty("collateral")
    public Collateral getCollateral() {
        return collateral;
    }

    @JsonProperty("collateral")
    public void setCollateral(Collateral collateral) {
        this.collateral = collateral;
    }

    @JsonProperty("characteristicId")
    public Integer getCharacteristicId() {
        return characteristicId;
    }

    @JsonProperty("characteristicId")
    public void setCharacteristicId(Integer characteristicId) {
        this.characteristicId = characteristicId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollateralAssoc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("characteristicDomain");
        sb.append('=');
        sb.append(((this.characteristicDomain == null)?"<null>":this.characteristicDomain));
        sb.append(',');
        sb.append("displayValue");
        sb.append('=');
        sb.append(((this.displayValue == null)?"<null>":this.displayValue));
        sb.append(',');
        sb.append("collateralAssocId");
        sb.append('=');
        sb.append(((this.collateralAssocId == null)?"<null>":this.collateralAssocId));
        sb.append(',');
        sb.append("entityName");
        sb.append('=');
        sb.append(((this.entityName == null)?"<null>":this.entityName));
        sb.append(',');
        sb.append("valueType");
        sb.append('=');
        sb.append(((this.valueType == null)?"<null>":this.valueType));
        sb.append(',');
        sb.append("characteristicType");
        sb.append('=');
        sb.append(((this.characteristicType == null)?"<null>":this.characteristicType));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("characteristicName");
        sb.append('=');
        sb.append(((this.characteristicName == null)?"<null>":this.characteristicName));
        sb.append(',');
        sb.append("collateral");
        sb.append('=');
        sb.append(((this.collateral == null)?"<null>":this.collateral));
        sb.append(',');
        sb.append("characteristicId");
        sb.append('=');
        sb.append(((this.characteristicId == null)?"<null>":this.characteristicId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

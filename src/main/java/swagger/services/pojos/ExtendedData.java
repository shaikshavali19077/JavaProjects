
package swagger.services.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "viewId",
    "paramName",
    "paramId",
    "paramDatatype",
    "paramValue"
})
public class ExtendedData {

    @JsonProperty("viewId")
    private Integer viewId;
    @JsonProperty("paramName")
    private String paramName;
    @JsonProperty("paramId")
    private Integer paramId;
    @JsonProperty("paramDatatype")
    private Integer paramDatatype;
    @JsonProperty("paramValue")
    private String paramValue;

    @JsonProperty("viewId")
    public Integer getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    @JsonProperty("paramName")
    public String getParamName() {
        return paramName;
    }

    @JsonProperty("paramName")
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @JsonProperty("paramId")
    public Integer getParamId() {
        return paramId;
    }

    @JsonProperty("paramId")
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    @JsonProperty("paramDatatype")
    public Integer getParamDatatype() {
        return paramDatatype;
    }

    @JsonProperty("paramDatatype")
    public void setParamDatatype(Integer paramDatatype) {
        this.paramDatatype = paramDatatype;
    }

    @JsonProperty("paramValue")
    public String getParamValue() {
        return paramValue;
    }

    @JsonProperty("paramValue")
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("viewId");
        sb.append('=');
        sb.append(((this.viewId == null)?"<null>":this.viewId));
        sb.append(',');
        sb.append("paramName");
        sb.append('=');
        sb.append(((this.paramName == null)?"<null>":this.paramName));
        sb.append(',');
        sb.append("paramId");
        sb.append('=');
        sb.append(((this.paramId == null)?"<null>":this.paramId));
        sb.append(',');
        sb.append("paramDatatype");
        sb.append('=');
        sb.append(((this.paramDatatype == null)?"<null>":this.paramDatatype));
        sb.append(',');
        sb.append("paramValue");
        sb.append('=');
        sb.append(((this.paramValue == null)?"<null>":this.paramValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

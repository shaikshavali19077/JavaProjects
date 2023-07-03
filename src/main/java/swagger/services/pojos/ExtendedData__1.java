
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
public class ExtendedData__1 {

    @JsonProperty("viewId")
    private String viewId;
    @JsonProperty("paramName")
    private String paramName;
    @JsonProperty("paramId")
    private String paramId;
    @JsonProperty("paramDatatype")
    private String paramDatatype;
    @JsonProperty("paramValue")
    private String paramValue;

    @JsonProperty("viewId")
    public String getViewId() {
        return viewId;
    }

    @JsonProperty("viewId")
    public void setViewId(String viewId) {
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
    public String getParamId() {
        return paramId;
    }

    @JsonProperty("paramId")
    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    @JsonProperty("paramDatatype")
    public String getParamDatatype() {
        return paramDatatype;
    }

    @JsonProperty("paramDatatype")
    public void setParamDatatype(String paramDatatype) {
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
        sb.append(ExtendedData__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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

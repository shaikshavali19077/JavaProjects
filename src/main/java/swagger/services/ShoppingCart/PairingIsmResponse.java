
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "headerResponseData",
    "imsi",
    "iccid"
})
public class PairingIsmResponse {

    @JsonProperty("headerResponseData")
    private HeaderResponseData headerResponseData;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("iccid")
    private String iccid;

    @JsonProperty("headerResponseData")
    public HeaderResponseData getHeaderResponseData() {
        return headerResponseData;
    }

    @JsonProperty("headerResponseData")
    public void setHeaderResponseData(HeaderResponseData headerResponseData) {
        this.headerResponseData = headerResponseData;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @JsonProperty("iccid")
    public String getIccid() {
        return iccid;
    }

    @JsonProperty("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PairingIsmResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("headerResponseData");
        sb.append('=');
        sb.append(((this.headerResponseData == null)?"<null>":this.headerResponseData));
        sb.append(',');
        sb.append("imsi");
        sb.append('=');
        sb.append(((this.imsi == null)?"<null>":this.imsi));
        sb.append(',');
        sb.append("iccid");
        sb.append('=');
        sb.append(((this.iccid == null)?"<null>":this.iccid));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

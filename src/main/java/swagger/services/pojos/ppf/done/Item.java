
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemNo",
    "matCode",
    "invTypeId",
    "offerId",
    "inventoryNumber",
    "serial"
})
public class Item {

    @JsonProperty("itemNo")
    private String itemNo;
    @JsonProperty("matCode")
    private String matCode;
    @JsonProperty("invTypeId")
    private String invTypeId;
    @JsonProperty("offerId")
    private String offerId;
    @JsonProperty("inventoryNumber")
    private String inventoryNumber;
    @JsonProperty("serial")
    private List<Serial> serial = new ArrayList<Serial>();

    @JsonProperty("itemNo")
    public String getItemNo() {
        return itemNo;
    }

    @JsonProperty("itemNo")
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @JsonProperty("matCode")
    public String getMatCode() {
        return matCode;
    }

    @JsonProperty("matCode")
    public void setMatCode(String matCode) {
        this.matCode = matCode;
    }

    @JsonProperty("invTypeId")
    public String getInvTypeId() {
        return invTypeId;
    }

    @JsonProperty("invTypeId")
    public void setInvTypeId(String invTypeId) {
        this.invTypeId = invTypeId;
    }

    @JsonProperty("offerId")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offerId")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("inventoryNumber")
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    @JsonProperty("inventoryNumber")
    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    @JsonProperty("serial")
    public List<Serial> getSerial() {
        return serial;
    }

    @JsonProperty("serial")
    public void setSerial(List<Serial> serial) {
        this.serial = serial;
    }

}

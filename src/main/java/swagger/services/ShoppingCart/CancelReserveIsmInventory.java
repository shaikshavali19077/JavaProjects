
package swagger.services.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "msisdnReservationId",
    "reservationId",
    "transactionId",
    "remarks"
})
public class CancelReserveIsmInventory {

    @JsonProperty("msisdnReservationId")
    private List<MsisdnReservationId> msisdnReservationId = new ArrayList<MsisdnReservationId>();
    @JsonProperty("reservationId")
    private String reservationId;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("msisdnReservationId")
    public List<MsisdnReservationId> getMsisdnReservationId() {
        return msisdnReservationId;
    }

    @JsonProperty("msisdnReservationId")
    public void setMsisdnReservationId(List<MsisdnReservationId> msisdnReservationId) {
        this.msisdnReservationId = msisdnReservationId;
    }

    @JsonProperty("reservationId")
    public String getReservationId() {
        return reservationId;
    }

    @JsonProperty("reservationId")
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CancelReserveIsmInventory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("msisdnReservationId");
        sb.append('=');
        sb.append(((this.msisdnReservationId == null)?"<null>":this.msisdnReservationId));
        sb.append(',');
        sb.append("reservationId");
        sb.append('=');
        sb.append(((this.reservationId == null)?"<null>":this.reservationId));
        sb.append(',');
        sb.append("transactionId");
        sb.append('=');
        sb.append(((this.transactionId == null)?"<null>":this.transactionId));
        sb.append(',');
        sb.append("remarks");
        sb.append('=');
        sb.append(((this.remarks == null)?"<null>":this.remarks));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "THU",
    "TUE",
    "SAT",
    "WED",
    "FRI",
    "MON",
    "SUN"
})
public class WorkingHours {

    @JsonProperty("THU")
    private Thu thu;
    @JsonProperty("TUE")
    private Tue tue;
    @JsonProperty("SAT")
    private Sat sat;
    @JsonProperty("WED")
    private Wed wed;
    @JsonProperty("FRI")
    private Fri fri;
    @JsonProperty("MON")
    private Mon mon;
    @JsonProperty("SUN")
    private Sun sun;

    @JsonProperty("THU")
    public Thu getThu() {
        return thu;
    }

    @JsonProperty("THU")
    public void setThu(Thu thu) {
        this.thu = thu;
    }

    @JsonProperty("TUE")
    public Tue getTue() {
        return tue;
    }

    @JsonProperty("TUE")
    public void setTue(Tue tue) {
        this.tue = tue;
    }

    @JsonProperty("SAT")
    public Sat getSat() {
        return sat;
    }

    @JsonProperty("SAT")
    public void setSat(Sat sat) {
        this.sat = sat;
    }

    @JsonProperty("WED")
    public Wed getWed() {
        return wed;
    }

    @JsonProperty("WED")
    public void setWed(Wed wed) {
        this.wed = wed;
    }

    @JsonProperty("FRI")
    public Fri getFri() {
        return fri;
    }

    @JsonProperty("FRI")
    public void setFri(Fri fri) {
        this.fri = fri;
    }

    @JsonProperty("MON")
    public Mon getMon() {
        return mon;
    }

    @JsonProperty("MON")
    public void setMon(Mon mon) {
        this.mon = mon;
    }

    @JsonProperty("SUN")
    public Sun getSun() {
        return sun;
    }

    @JsonProperty("SUN")
    public void setSun(Sun sun) {
        this.sun = sun;
    }

}

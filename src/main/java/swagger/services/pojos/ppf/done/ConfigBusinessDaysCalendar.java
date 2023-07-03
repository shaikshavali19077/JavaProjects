
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxBusinessDays",
    "dateFormat",
    "firstDayOfWeek",
    "timezone",
    "weekendDays",
    "holidays",
    "workingHours"
})
public class ConfigBusinessDaysCalendar {

    @JsonProperty("maxBusinessDays")
    private Integer maxBusinessDays;
    @JsonProperty("dateFormat")
    private String dateFormat;
    @JsonProperty("firstDayOfWeek")
    private String firstDayOfWeek;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("weekendDays")
    private List<String> weekendDays = new ArrayList<String>();
    @JsonProperty("holidays")
    private List<Holiday> holidays = new ArrayList<Holiday>();
    @JsonProperty("workingHours")
    private WorkingHours workingHours;

    @JsonProperty("maxBusinessDays")
    public Integer getMaxBusinessDays() {
        return maxBusinessDays;
    }

    @JsonProperty("maxBusinessDays")
    public void setMaxBusinessDays(Integer maxBusinessDays) {
        this.maxBusinessDays = maxBusinessDays;
    }

    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @JsonProperty("firstDayOfWeek")
    public String getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    @JsonProperty("firstDayOfWeek")
    public void setFirstDayOfWeek(String firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("weekendDays")
    public List<String> getWeekendDays() {
        return weekendDays;
    }

    @JsonProperty("weekendDays")
    public void setWeekendDays(List<String> weekendDays) {
        this.weekendDays = weekendDays;
    }

    @JsonProperty("holidays")
    public List<Holiday> getHolidays() {
        return holidays;
    }

    @JsonProperty("holidays")
    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    @JsonProperty("workingHours")
    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    @JsonProperty("workingHours")
    public void setWorkingHours(WorkingHours workingHours) {
        this.workingHours = workingHours;
    }

}

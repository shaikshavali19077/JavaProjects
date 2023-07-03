
package swagger.services.ShoppingCart;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name1",
    "name2",
    "streetHouseNumber",
    "postalCode",
    "city",
    "countryKey",
    "telephone",
    "email",
    "province"
})
public class ShipToAddress {

    @JsonProperty("name1")
    private String name1;
    @JsonProperty("name2")
    private String name2;
    @JsonProperty("streetHouseNumber")
    private String streetHouseNumber;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryKey")
    private String countryKey;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("province")
    private String province;

    @JsonProperty("name1")
    public String getName1() {
        return name1;
    }

    @JsonProperty("name1")
    public void setName1(String name1) {
        this.name1 = name1;
    }

    @JsonProperty("name2")
    public String getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    @JsonProperty("streetHouseNumber")
    public String getStreetHouseNumber() {
        return streetHouseNumber;
    }

    @JsonProperty("streetHouseNumber")
    public void setStreetHouseNumber(String streetHouseNumber) {
        this.streetHouseNumber = streetHouseNumber;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("countryKey")
    public String getCountryKey() {
        return countryKey;
    }

    @JsonProperty("countryKey")
    public void setCountryKey(String countryKey) {
        this.countryKey = countryKey;
    }

    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipToAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name1");
        sb.append('=');
        sb.append(((this.name1 == null)?"<null>":this.name1));
        sb.append(',');
        sb.append("name2");
        sb.append('=');
        sb.append(((this.name2 == null)?"<null>":this.name2));
        sb.append(',');
        sb.append("streetHouseNumber");
        sb.append('=');
        sb.append(((this.streetHouseNumber == null)?"<null>":this.streetHouseNumber));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("countryKey");
        sb.append('=');
        sb.append(((this.countryKey == null)?"<null>":this.countryKey));
        sb.append(',');
        sb.append("telephone");
        sb.append('=');
        sb.append(((this.telephone == null)?"<null>":this.telephone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("province");
        sb.append('=');
        sb.append(((this.province == null)?"<null>":this.province));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

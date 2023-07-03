
package swagger.services.pojos.ppf.done;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contact1Name",
    "accountCategory",
    "currencyCode",
    "billFmtOpt",
    "custState",
    "vipCode",
    "billTitle",
    "statementToEmail",
    "custAddress1",
    "billFname",
    "custCity",
    "billPeriod",
    "custCountryCode",
    "custPhone1",
    "rateClassDefault",
    "custEmail",
    "accountExternalId",
    "billCountryCode",
    "custZip",
    "billLname",
    "acctSegId",
    "invoiceTemplate",
    "invoiceFileFmt",
    "customerAccountModeId"
})
public class Account {

    @JsonProperty("contact1Name")
    private String contact1Name;
    @JsonProperty("accountCategory")
    private AccountCategory accountCategory;
    @JsonProperty("currencyCode")
    private CurrencyCode currencyCode;
    @JsonProperty("billFmtOpt")
    private BillFmtOpt billFmtOpt;
    @JsonProperty("custState")
    private String custState;
    @JsonProperty("vipCode")
    private VipCode vipCode;
    @JsonProperty("billTitle")
    private String billTitle;
    @JsonProperty("statementToEmail")
    private String statementToEmail;
    @JsonProperty("custAddress1")
    private String custAddress1;
    @JsonProperty("billFname")
    private String billFname;
    @JsonProperty("custCity")
    private String custCity;
    @JsonProperty("billPeriod")
    private BillPeriod billPeriod;
    @JsonProperty("custCountryCode")
    private CustCountryCode custCountryCode;
    @JsonProperty("custPhone1")
    private String custPhone1;
    @JsonProperty("rateClassDefault")
    private RateClassDefault rateClassDefault;
    @JsonProperty("custEmail")
    private String custEmail;
    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("billCountryCode")
    private BillCountryCode billCountryCode;
    @JsonProperty("custZip")
    private String custZip;
    @JsonProperty("billLname")
    private String billLname;
    @JsonProperty("acctSegId")
    private AcctSegId acctSegId;
    @JsonProperty("invoiceTemplate")
    private String invoiceTemplate;
    @JsonProperty("invoiceFileFmt")
    private String invoiceFileFmt;
    @JsonProperty("customerAccountModeId")
    private String customerAccountModeId;

    @JsonProperty("contact1Name")
    public String getContact1Name() {
        return contact1Name;
    }

    @JsonProperty("contact1Name")
    public void setContact1Name(String contact1Name) {
        this.contact1Name = contact1Name;
    }

    @JsonProperty("accountCategory")
    public AccountCategory getAccountCategory() {
        return accountCategory;
    }

    @JsonProperty("accountCategory")
    public void setAccountCategory(AccountCategory accountCategory) {
        this.accountCategory = accountCategory;
    }

    @JsonProperty("currencyCode")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("billFmtOpt")
    public BillFmtOpt getBillFmtOpt() {
        return billFmtOpt;
    }

    @JsonProperty("billFmtOpt")
    public void setBillFmtOpt(BillFmtOpt billFmtOpt) {
        this.billFmtOpt = billFmtOpt;
    }

    @JsonProperty("custState")
    public String getCustState() {
        return custState;
    }

    @JsonProperty("custState")
    public void setCustState(String custState) {
        this.custState = custState;
    }

    @JsonProperty("vipCode")
    public VipCode getVipCode() {
        return vipCode;
    }

    @JsonProperty("vipCode")
    public void setVipCode(VipCode vipCode) {
        this.vipCode = vipCode;
    }

    @JsonProperty("billTitle")
    public String getBillTitle() {
        return billTitle;
    }

    @JsonProperty("billTitle")
    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    @JsonProperty("statementToEmail")
    public String getStatementToEmail() {
        return statementToEmail;
    }

    @JsonProperty("statementToEmail")
    public void setStatementToEmail(String statementToEmail) {
        this.statementToEmail = statementToEmail;
    }

    @JsonProperty("custAddress1")
    public String getCustAddress1() {
        return custAddress1;
    }

    @JsonProperty("custAddress1")
    public void setCustAddress1(String custAddress1) {
        this.custAddress1 = custAddress1;
    }

    @JsonProperty("billFname")
    public String getBillFname() {
        return billFname;
    }

    @JsonProperty("billFname")
    public void setBillFname(String billFname) {
        this.billFname = billFname;
    }

    @JsonProperty("custCity")
    public String getCustCity() {
        return custCity;
    }

    @JsonProperty("custCity")
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @JsonProperty("billPeriod")
    public BillPeriod getBillPeriod() {
        return billPeriod;
    }

    @JsonProperty("billPeriod")
    public void setBillPeriod(BillPeriod billPeriod) {
        this.billPeriod = billPeriod;
    }

    @JsonProperty("custCountryCode")
    public CustCountryCode getCustCountryCode() {
        return custCountryCode;
    }

    @JsonProperty("custCountryCode")
    public void setCustCountryCode(CustCountryCode custCountryCode) {
        this.custCountryCode = custCountryCode;
    }

    @JsonProperty("custPhone1")
    public String getCustPhone1() {
        return custPhone1;
    }

    @JsonProperty("custPhone1")
    public void setCustPhone1(String custPhone1) {
        this.custPhone1 = custPhone1;
    }

    @JsonProperty("rateClassDefault")
    public RateClassDefault getRateClassDefault() {
        return rateClassDefault;
    }

    @JsonProperty("rateClassDefault")
    public void setRateClassDefault(RateClassDefault rateClassDefault) {
        this.rateClassDefault = rateClassDefault;
    }

    @JsonProperty("custEmail")
    public String getCustEmail() {
        return custEmail;
    }

    @JsonProperty("custEmail")
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @JsonProperty("accountExternalId")
    public String getAccountExternalId() {
        return accountExternalId;
    }

    @JsonProperty("accountExternalId")
    public void setAccountExternalId(String accountExternalId) {
        this.accountExternalId = accountExternalId;
    }

    @JsonProperty("billCountryCode")
    public BillCountryCode getBillCountryCode() {
        return billCountryCode;
    }

    @JsonProperty("billCountryCode")
    public void setBillCountryCode(BillCountryCode billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    @JsonProperty("custZip")
    public String getCustZip() {
        return custZip;
    }

    @JsonProperty("custZip")
    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    @JsonProperty("billLname")
    public String getBillLname() {
        return billLname;
    }

    @JsonProperty("billLname")
    public void setBillLname(String billLname) {
        this.billLname = billLname;
    }

    @JsonProperty("acctSegId")
    public AcctSegId getAcctSegId() {
        return acctSegId;
    }

    @JsonProperty("acctSegId")
    public void setAcctSegId(AcctSegId acctSegId) {
        this.acctSegId = acctSegId;
    }

    @JsonProperty("invoiceTemplate")
    public String getInvoiceTemplate() {
        return invoiceTemplate;
    }

    @JsonProperty("invoiceTemplate")
    public void setInvoiceTemplate(String invoiceTemplate) {
        this.invoiceTemplate = invoiceTemplate;
    }

    @JsonProperty("invoiceFileFmt")
    public String getInvoiceFileFmt() {
        return invoiceFileFmt;
    }

    @JsonProperty("invoiceFileFmt")
    public void setInvoiceFileFmt(String invoiceFileFmt) {
        this.invoiceFileFmt = invoiceFileFmt;
    }

    @JsonProperty("customerAccountModeId")
    public String getCustomerAccountModeId() {
        return customerAccountModeId;
    }

    @JsonProperty("customerAccountModeId")
    public void setCustomerAccountModeId(String customerAccountModeId) {
        this.customerAccountModeId = customerAccountModeId;
    }

}

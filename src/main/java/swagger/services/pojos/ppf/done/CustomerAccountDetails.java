
package swagger.services.pojos.ppf.done;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isPrepaid",
    "services",
    "hierarchy",
    "externalids",
    "contact1Name",
    "gender",
    "remark",
    "collectionHistory",
    "tieCode",
    "threshold",
    "paymentProfileId",
    "creditRating",
    "custState",
    "dateInactive",
    "nextBillDate",
    "hierarchyId",
    "inUse",
    "custCounty",
    "cyclicalThreshold",
    "billNamePre",
    "contact2Phone",
    "dept",
    "creditThresh",
    "billTitle",
    "altLname",
    "prevBalanceRefResets",
    "planIdDiscount",
    "inactiveDate",
    "parentId",
    "statementToEmail",
    "custAddress3",
    "custAddress4",
    "statementToFaxno",
    "activeDate",
    "custAddress1",
    "custAddress2",
    "chargeThreshold",
    "prevBalanceRefno",
    "billFname",
    "altCompanyName",
    "prevBillDate",
    "billSequenceNum",
    "planIdCredit",
    "childCount",
    "discRcvOpt",
    "purchaseOrder",
    "custGeocode",
    "sdAgencyId",
    "billCompany",
    "salesCode",
    "billNameGeneration",
    "distrChan",
    "dateActive",
    "custCity",
    "billCounty",
    "autoWriteoffStatus",
    "billState",
    "prevCutoffDate",
    "altFname",
    "collectionIndicator",
    "usgAmtLimit",
    "globalContractStatus",
    "credStatus",
    "hierarchyAccountExternalId",
    "billAddress3",
    "billAddress4",
    "billAddress1",
    "billAddress2",
    "contact2Name",
    "codeword",
    "custPhone1",
    "custPhone2",
    "usgUnitsLimit",
    "prevBillRefResets",
    "extendedDataList",
    "accountInternalId",
    "threshRef",
    "dateCreated",
    "accountProcessFlag",
    "billMinit",
    "custFaxno",
    "serverId",
    "contact1Phone",
    "chgDate",
    "billZip",
    "custEmail",
    "accountExternalId",
    "custZip",
    "noBill",
    "billLname",
    "chgWho",
    "billGeocode",
    "title",
    "billCity",
    "converted",
    "ssn",
    "parentAccountExternalId",
    "accountStatusDt",
    "prevBillRefno",
    "serviceCenterList",
    "prepaidCfsCount",
    "postpaidCfsCount",
    "isBusiness",
    "customerOptionalExtDatas",
    "billIsRented",
    "custIsRented"
})
public class CustomerAccountDetails {

    @JsonProperty("isPrepaid")
    private Integer isPrepaid;
    @JsonProperty("services")
    private List<Object> services = new ArrayList<Object>();
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy = new ArrayList<Hierarchy>();
    @JsonProperty("externalids")
    private List<Object> externalids = new ArrayList<Object>();
    @JsonProperty("contact1Name")
    private String contact1Name;
    @JsonProperty("gender")
    private Integer gender;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("collectionHistory")
    private String collectionHistory;
    @JsonProperty("tieCode")
    private Integer tieCode;
    @JsonProperty("threshold")
    private Integer threshold;
    @JsonProperty("paymentProfileId")
    private Integer paymentProfileId;
    @JsonProperty("creditRating")
    private Integer creditRating;
    @JsonProperty("custState")
    private String custState;
    @JsonProperty("dateInactive")
    private String dateInactive;
    @JsonProperty("nextBillDate")
    private String nextBillDate;
    @JsonProperty("hierarchyId")
    private Integer hierarchyId;
    @JsonProperty("inUse")
    private String inUse;
    @JsonProperty("custCounty")
    private String custCounty;
    @JsonProperty("cyclicalThreshold")
    private Integer cyclicalThreshold;
    @JsonProperty("billNamePre")
    private String billNamePre;
    @JsonProperty("contact2Phone")
    private String contact2Phone;
    @JsonProperty("dept")
    private String dept;
    @JsonProperty("creditThresh")
    private Integer creditThresh;
    @JsonProperty("billTitle")
    private String billTitle;
    @JsonProperty("altLname")
    private String altLname;
    @JsonProperty("prevBalanceRefResets")
    private Integer prevBalanceRefResets;
    @JsonProperty("planIdDiscount")
    private Integer planIdDiscount;
    @JsonProperty("inactiveDate")
    private String inactiveDate;
    @JsonProperty("parentId")
    private Integer parentId;
    @JsonProperty("statementToEmail")
    private String statementToEmail;
    @JsonProperty("custAddress3")
    private String custAddress3;
    @JsonProperty("custAddress4")
    private String custAddress4;
    @JsonProperty("statementToFaxno")
    private String statementToFaxno;
    @JsonProperty("activeDate")
    private String activeDate;
    @JsonProperty("custAddress1")
    private String custAddress1;
    @JsonProperty("custAddress2")
    private String custAddress2;
    @JsonProperty("chargeThreshold")
    private Integer chargeThreshold;
    @JsonProperty("prevBalanceRefno")
    private Integer prevBalanceRefno;
    @JsonProperty("billFname")
    private String billFname;
    @JsonProperty("altCompanyName")
    private String altCompanyName;
    @JsonProperty("prevBillDate")
    private String prevBillDate;
    @JsonProperty("billSequenceNum")
    private Integer billSequenceNum;
    @JsonProperty("planIdCredit")
    private Integer planIdCredit;
    @JsonProperty("childCount")
    private Integer childCount;
    @JsonProperty("discRcvOpt")
    private Integer discRcvOpt;
    @JsonProperty("purchaseOrder")
    private String purchaseOrder;
    @JsonProperty("custGeocode")
    private String custGeocode;
    @JsonProperty("sdAgencyId")
    private String sdAgencyId;
    @JsonProperty("billCompany")
    private String billCompany;
    @JsonProperty("salesCode")
    private String salesCode;
    @JsonProperty("billNameGeneration")
    private String billNameGeneration;
    @JsonProperty("distrChan")
    private String distrChan;
    @JsonProperty("dateActive")
    private String dateActive;
    @JsonProperty("custCity")
    private String custCity;
    @JsonProperty("billCounty")
    private String billCounty;
    @JsonProperty("autoWriteoffStatus")
    private Integer autoWriteoffStatus;
    @JsonProperty("billState")
    private String billState;
    @JsonProperty("prevCutoffDate")
    private String prevCutoffDate;
    @JsonProperty("altFname")
    private String altFname;
    @JsonProperty("collectionIndicator")
    private Integer collectionIndicator;
    @JsonProperty("usgAmtLimit")
    private Integer usgAmtLimit;
    @JsonProperty("globalContractStatus")
    private Integer globalContractStatus;
    @JsonProperty("credStatus")
    private Integer credStatus;
    @JsonProperty("hierarchyAccountExternalId")
    private String hierarchyAccountExternalId;
    @JsonProperty("billAddress3")
    private String billAddress3;
    @JsonProperty("billAddress4")
    private String billAddress4;
    @JsonProperty("billAddress1")
    private String billAddress1;
    @JsonProperty("billAddress2")
    private String billAddress2;
    @JsonProperty("contact2Name")
    private String contact2Name;
    @JsonProperty("codeword")
    private String codeword;
    @JsonProperty("custPhone1")
    private String custPhone1;
    @JsonProperty("custPhone2")
    private String custPhone2;
    @JsonProperty("usgUnitsLimit")
    private Integer usgUnitsLimit;
    @JsonProperty("prevBillRefResets")
    private Integer prevBillRefResets;
    @JsonProperty("extendedDataList")
    private List<Object> extendedDataList = new ArrayList<Object>();
    @JsonProperty("accountInternalId")
    private Integer accountInternalId;
    @JsonProperty("threshRef")
    private Integer threshRef;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("accountProcessFlag")
    private Integer accountProcessFlag;
    @JsonProperty("billMinit")
    private String billMinit;
    @JsonProperty("custFaxno")
    private String custFaxno;
    @JsonProperty("serverId")
    private Integer serverId;
    @JsonProperty("contact1Phone")
    private String contact1Phone;
    @JsonProperty("chgDate")
    private String chgDate;
    @JsonProperty("billZip")
    private String billZip;
    @JsonProperty("custEmail")
    private String custEmail;
    @JsonProperty("accountExternalId")
    private String accountExternalId;
    @JsonProperty("custZip")
    private String custZip;
    @JsonProperty("noBill")
    private Boolean noBill;
    @JsonProperty("billLname")
    private String billLname;
    @JsonProperty("chgWho")
    private String chgWho;
    @JsonProperty("billGeocode")
    private String billGeocode;
    @JsonProperty("title")
    private String title;
    @JsonProperty("billCity")
    private String billCity;
    @JsonProperty("converted")
    private Integer converted;
    @JsonProperty("ssn")
    private String ssn;
    @JsonProperty("parentAccountExternalId")
    private String parentAccountExternalId;
    @JsonProperty("accountStatusDt")
    private String accountStatusDt;
    @JsonProperty("prevBillRefno")
    private Integer prevBillRefno;
    @JsonProperty("serviceCenterList")
    private List<Object> serviceCenterList = new ArrayList<Object>();
    @JsonProperty("prepaidCfsCount")
    private Integer prepaidCfsCount;
    @JsonProperty("postpaidCfsCount")
    private Integer postpaidCfsCount;
    @JsonProperty("isBusiness")
    private Boolean isBusiness;
    @JsonProperty("customerOptionalExtDatas")
    private List<Object> customerOptionalExtDatas = new ArrayList<Object>();
    @JsonProperty("billIsRented")
    private Boolean billIsRented;
    @JsonProperty("custIsRented")
    private Boolean custIsRented;

    @JsonProperty("isPrepaid")
    public Integer getIsPrepaid() {
        return isPrepaid;
    }

    @JsonProperty("isPrepaid")
    public void setIsPrepaid(Integer isPrepaid) {
        this.isPrepaid = isPrepaid;
    }

    @JsonProperty("services")
    public List<Object> getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(List<Object> services) {
        this.services = services;
    }

    @JsonProperty("hierarchy")
    public List<Hierarchy> getHierarchy() {
        return hierarchy;
    }

    @JsonProperty("hierarchy")
    public void setHierarchy(List<Hierarchy> hierarchy) {
        this.hierarchy = hierarchy;
    }

    @JsonProperty("externalids")
    public List<Object> getExternalids() {
        return externalids;
    }

    @JsonProperty("externalids")
    public void setExternalids(List<Object> externalids) {
        this.externalids = externalids;
    }

    @JsonProperty("contact1Name")
    public String getContact1Name() {
        return contact1Name;
    }

    @JsonProperty("contact1Name")
    public void setContact1Name(String contact1Name) {
        this.contact1Name = contact1Name;
    }

    @JsonProperty("gender")
    public Integer getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @JsonProperty("collectionHistory")
    public String getCollectionHistory() {
        return collectionHistory;
    }

    @JsonProperty("collectionHistory")
    public void setCollectionHistory(String collectionHistory) {
        this.collectionHistory = collectionHistory;
    }

    @JsonProperty("tieCode")
    public Integer getTieCode() {
        return tieCode;
    }

    @JsonProperty("tieCode")
    public void setTieCode(Integer tieCode) {
        this.tieCode = tieCode;
    }

    @JsonProperty("threshold")
    public Integer getThreshold() {
        return threshold;
    }

    @JsonProperty("threshold")
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @JsonProperty("paymentProfileId")
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    @JsonProperty("paymentProfileId")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    @JsonProperty("creditRating")
    public Integer getCreditRating() {
        return creditRating;
    }

    @JsonProperty("creditRating")
    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    @JsonProperty("custState")
    public String getCustState() {
        return custState;
    }

    @JsonProperty("custState")
    public void setCustState(String custState) {
        this.custState = custState;
    }

    @JsonProperty("dateInactive")
    public String getDateInactive() {
        return dateInactive;
    }

    @JsonProperty("dateInactive")
    public void setDateInactive(String dateInactive) {
        this.dateInactive = dateInactive;
    }

    @JsonProperty("nextBillDate")
    public String getNextBillDate() {
        return nextBillDate;
    }

    @JsonProperty("nextBillDate")
    public void setNextBillDate(String nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    @JsonProperty("hierarchyId")
    public Integer getHierarchyId() {
        return hierarchyId;
    }

    @JsonProperty("hierarchyId")
    public void setHierarchyId(Integer hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    @JsonProperty("inUse")
    public String getInUse() {
        return inUse;
    }

    @JsonProperty("inUse")
    public void setInUse(String inUse) {
        this.inUse = inUse;
    }

    @JsonProperty("custCounty")
    public String getCustCounty() {
        return custCounty;
    }

    @JsonProperty("custCounty")
    public void setCustCounty(String custCounty) {
        this.custCounty = custCounty;
    }

    @JsonProperty("cyclicalThreshold")
    public Integer getCyclicalThreshold() {
        return cyclicalThreshold;
    }

    @JsonProperty("cyclicalThreshold")
    public void setCyclicalThreshold(Integer cyclicalThreshold) {
        this.cyclicalThreshold = cyclicalThreshold;
    }

    @JsonProperty("billNamePre")
    public String getBillNamePre() {
        return billNamePre;
    }

    @JsonProperty("billNamePre")
    public void setBillNamePre(String billNamePre) {
        this.billNamePre = billNamePre;
    }

    @JsonProperty("contact2Phone")
    public String getContact2Phone() {
        return contact2Phone;
    }

    @JsonProperty("contact2Phone")
    public void setContact2Phone(String contact2Phone) {
        this.contact2Phone = contact2Phone;
    }

    @JsonProperty("dept")
    public String getDept() {
        return dept;
    }

    @JsonProperty("dept")
    public void setDept(String dept) {
        this.dept = dept;
    }

    @JsonProperty("creditThresh")
    public Integer getCreditThresh() {
        return creditThresh;
    }

    @JsonProperty("creditThresh")
    public void setCreditThresh(Integer creditThresh) {
        this.creditThresh = creditThresh;
    }

    @JsonProperty("billTitle")
    public String getBillTitle() {
        return billTitle;
    }

    @JsonProperty("billTitle")
    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    @JsonProperty("altLname")
    public String getAltLname() {
        return altLname;
    }

    @JsonProperty("altLname")
    public void setAltLname(String altLname) {
        this.altLname = altLname;
    }

    @JsonProperty("prevBalanceRefResets")
    public Integer getPrevBalanceRefResets() {
        return prevBalanceRefResets;
    }

    @JsonProperty("prevBalanceRefResets")
    public void setPrevBalanceRefResets(Integer prevBalanceRefResets) {
        this.prevBalanceRefResets = prevBalanceRefResets;
    }

    @JsonProperty("planIdDiscount")
    public Integer getPlanIdDiscount() {
        return planIdDiscount;
    }

    @JsonProperty("planIdDiscount")
    public void setPlanIdDiscount(Integer planIdDiscount) {
        this.planIdDiscount = planIdDiscount;
    }

    @JsonProperty("inactiveDate")
    public String getInactiveDate() {
        return inactiveDate;
    }

    @JsonProperty("inactiveDate")
    public void setInactiveDate(String inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    @JsonProperty("parentId")
    public Integer getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("statementToEmail")
    public String getStatementToEmail() {
        return statementToEmail;
    }

    @JsonProperty("statementToEmail")
    public void setStatementToEmail(String statementToEmail) {
        this.statementToEmail = statementToEmail;
    }

    @JsonProperty("custAddress3")
    public String getCustAddress3() {
        return custAddress3;
    }

    @JsonProperty("custAddress3")
    public void setCustAddress3(String custAddress3) {
        this.custAddress3 = custAddress3;
    }

    @JsonProperty("custAddress4")
    public String getCustAddress4() {
        return custAddress4;
    }

    @JsonProperty("custAddress4")
    public void setCustAddress4(String custAddress4) {
        this.custAddress4 = custAddress4;
    }

    @JsonProperty("statementToFaxno")
    public String getStatementToFaxno() {
        return statementToFaxno;
    }

    @JsonProperty("statementToFaxno")
    public void setStatementToFaxno(String statementToFaxno) {
        this.statementToFaxno = statementToFaxno;
    }

    @JsonProperty("activeDate")
    public String getActiveDate() {
        return activeDate;
    }

    @JsonProperty("activeDate")
    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    @JsonProperty("custAddress1")
    public String getCustAddress1() {
        return custAddress1;
    }

    @JsonProperty("custAddress1")
    public void setCustAddress1(String custAddress1) {
        this.custAddress1 = custAddress1;
    }

    @JsonProperty("custAddress2")
    public String getCustAddress2() {
        return custAddress2;
    }

    @JsonProperty("custAddress2")
    public void setCustAddress2(String custAddress2) {
        this.custAddress2 = custAddress2;
    }

    @JsonProperty("chargeThreshold")
    public Integer getChargeThreshold() {
        return chargeThreshold;
    }

    @JsonProperty("chargeThreshold")
    public void setChargeThreshold(Integer chargeThreshold) {
        this.chargeThreshold = chargeThreshold;
    }

    @JsonProperty("prevBalanceRefno")
    public Integer getPrevBalanceRefno() {
        return prevBalanceRefno;
    }

    @JsonProperty("prevBalanceRefno")
    public void setPrevBalanceRefno(Integer prevBalanceRefno) {
        this.prevBalanceRefno = prevBalanceRefno;
    }

    @JsonProperty("billFname")
    public String getBillFname() {
        return billFname;
    }

    @JsonProperty("billFname")
    public void setBillFname(String billFname) {
        this.billFname = billFname;
    }

    @JsonProperty("altCompanyName")
    public String getAltCompanyName() {
        return altCompanyName;
    }

    @JsonProperty("altCompanyName")
    public void setAltCompanyName(String altCompanyName) {
        this.altCompanyName = altCompanyName;
    }

    @JsonProperty("prevBillDate")
    public String getPrevBillDate() {
        return prevBillDate;
    }

    @JsonProperty("prevBillDate")
    public void setPrevBillDate(String prevBillDate) {
        this.prevBillDate = prevBillDate;
    }

    @JsonProperty("billSequenceNum")
    public Integer getBillSequenceNum() {
        return billSequenceNum;
    }

    @JsonProperty("billSequenceNum")
    public void setBillSequenceNum(Integer billSequenceNum) {
        this.billSequenceNum = billSequenceNum;
    }

    @JsonProperty("planIdCredit")
    public Integer getPlanIdCredit() {
        return planIdCredit;
    }

    @JsonProperty("planIdCredit")
    public void setPlanIdCredit(Integer planIdCredit) {
        this.planIdCredit = planIdCredit;
    }

    @JsonProperty("childCount")
    public Integer getChildCount() {
        return childCount;
    }

    @JsonProperty("childCount")
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    @JsonProperty("discRcvOpt")
    public Integer getDiscRcvOpt() {
        return discRcvOpt;
    }

    @JsonProperty("discRcvOpt")
    public void setDiscRcvOpt(Integer discRcvOpt) {
        this.discRcvOpt = discRcvOpt;
    }

    @JsonProperty("purchaseOrder")
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    @JsonProperty("purchaseOrder")
    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @JsonProperty("custGeocode")
    public String getCustGeocode() {
        return custGeocode;
    }

    @JsonProperty("custGeocode")
    public void setCustGeocode(String custGeocode) {
        this.custGeocode = custGeocode;
    }

    @JsonProperty("sdAgencyId")
    public String getSdAgencyId() {
        return sdAgencyId;
    }

    @JsonProperty("sdAgencyId")
    public void setSdAgencyId(String sdAgencyId) {
        this.sdAgencyId = sdAgencyId;
    }

    @JsonProperty("billCompany")
    public String getBillCompany() {
        return billCompany;
    }

    @JsonProperty("billCompany")
    public void setBillCompany(String billCompany) {
        this.billCompany = billCompany;
    }

    @JsonProperty("salesCode")
    public String getSalesCode() {
        return salesCode;
    }

    @JsonProperty("salesCode")
    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    @JsonProperty("billNameGeneration")
    public String getBillNameGeneration() {
        return billNameGeneration;
    }

    @JsonProperty("billNameGeneration")
    public void setBillNameGeneration(String billNameGeneration) {
        this.billNameGeneration = billNameGeneration;
    }

    @JsonProperty("distrChan")
    public String getDistrChan() {
        return distrChan;
    }

    @JsonProperty("distrChan")
    public void setDistrChan(String distrChan) {
        this.distrChan = distrChan;
    }

    @JsonProperty("dateActive")
    public String getDateActive() {
        return dateActive;
    }

    @JsonProperty("dateActive")
    public void setDateActive(String dateActive) {
        this.dateActive = dateActive;
    }

    @JsonProperty("custCity")
    public String getCustCity() {
        return custCity;
    }

    @JsonProperty("custCity")
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @JsonProperty("billCounty")
    public String getBillCounty() {
        return billCounty;
    }

    @JsonProperty("billCounty")
    public void setBillCounty(String billCounty) {
        this.billCounty = billCounty;
    }

    @JsonProperty("autoWriteoffStatus")
    public Integer getAutoWriteoffStatus() {
        return autoWriteoffStatus;
    }

    @JsonProperty("autoWriteoffStatus")
    public void setAutoWriteoffStatus(Integer autoWriteoffStatus) {
        this.autoWriteoffStatus = autoWriteoffStatus;
    }

    @JsonProperty("billState")
    public String getBillState() {
        return billState;
    }

    @JsonProperty("billState")
    public void setBillState(String billState) {
        this.billState = billState;
    }

    @JsonProperty("prevCutoffDate")
    public String getPrevCutoffDate() {
        return prevCutoffDate;
    }

    @JsonProperty("prevCutoffDate")
    public void setPrevCutoffDate(String prevCutoffDate) {
        this.prevCutoffDate = prevCutoffDate;
    }

    @JsonProperty("altFname")
    public String getAltFname() {
        return altFname;
    }

    @JsonProperty("altFname")
    public void setAltFname(String altFname) {
        this.altFname = altFname;
    }

    @JsonProperty("collectionIndicator")
    public Integer getCollectionIndicator() {
        return collectionIndicator;
    }

    @JsonProperty("collectionIndicator")
    public void setCollectionIndicator(Integer collectionIndicator) {
        this.collectionIndicator = collectionIndicator;
    }

    @JsonProperty("usgAmtLimit")
    public Integer getUsgAmtLimit() {
        return usgAmtLimit;
    }

    @JsonProperty("usgAmtLimit")
    public void setUsgAmtLimit(Integer usgAmtLimit) {
        this.usgAmtLimit = usgAmtLimit;
    }

    @JsonProperty("globalContractStatus")
    public Integer getGlobalContractStatus() {
        return globalContractStatus;
    }

    @JsonProperty("globalContractStatus")
    public void setGlobalContractStatus(Integer globalContractStatus) {
        this.globalContractStatus = globalContractStatus;
    }

    @JsonProperty("credStatus")
    public Integer getCredStatus() {
        return credStatus;
    }

    @JsonProperty("credStatus")
    public void setCredStatus(Integer credStatus) {
        this.credStatus = credStatus;
    }

    @JsonProperty("hierarchyAccountExternalId")
    public String getHierarchyAccountExternalId() {
        return hierarchyAccountExternalId;
    }

    @JsonProperty("hierarchyAccountExternalId")
    public void setHierarchyAccountExternalId(String hierarchyAccountExternalId) {
        this.hierarchyAccountExternalId = hierarchyAccountExternalId;
    }

    @JsonProperty("billAddress3")
    public String getBillAddress3() {
        return billAddress3;
    }

    @JsonProperty("billAddress3")
    public void setBillAddress3(String billAddress3) {
        this.billAddress3 = billAddress3;
    }

    @JsonProperty("billAddress4")
    public String getBillAddress4() {
        return billAddress4;
    }

    @JsonProperty("billAddress4")
    public void setBillAddress4(String billAddress4) {
        this.billAddress4 = billAddress4;
    }

    @JsonProperty("billAddress1")
    public String getBillAddress1() {
        return billAddress1;
    }

    @JsonProperty("billAddress1")
    public void setBillAddress1(String billAddress1) {
        this.billAddress1 = billAddress1;
    }

    @JsonProperty("billAddress2")
    public String getBillAddress2() {
        return billAddress2;
    }

    @JsonProperty("billAddress2")
    public void setBillAddress2(String billAddress2) {
        this.billAddress2 = billAddress2;
    }

    @JsonProperty("contact2Name")
    public String getContact2Name() {
        return contact2Name;
    }

    @JsonProperty("contact2Name")
    public void setContact2Name(String contact2Name) {
        this.contact2Name = contact2Name;
    }

    @JsonProperty("codeword")
    public String getCodeword() {
        return codeword;
    }

    @JsonProperty("codeword")
    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }

    @JsonProperty("custPhone1")
    public String getCustPhone1() {
        return custPhone1;
    }

    @JsonProperty("custPhone1")
    public void setCustPhone1(String custPhone1) {
        this.custPhone1 = custPhone1;
    }

    @JsonProperty("custPhone2")
    public String getCustPhone2() {
        return custPhone2;
    }

    @JsonProperty("custPhone2")
    public void setCustPhone2(String custPhone2) {
        this.custPhone2 = custPhone2;
    }

    @JsonProperty("usgUnitsLimit")
    public Integer getUsgUnitsLimit() {
        return usgUnitsLimit;
    }

    @JsonProperty("usgUnitsLimit")
    public void setUsgUnitsLimit(Integer usgUnitsLimit) {
        this.usgUnitsLimit = usgUnitsLimit;
    }

    @JsonProperty("prevBillRefResets")
    public Integer getPrevBillRefResets() {
        return prevBillRefResets;
    }

    @JsonProperty("prevBillRefResets")
    public void setPrevBillRefResets(Integer prevBillRefResets) {
        this.prevBillRefResets = prevBillRefResets;
    }

    @JsonProperty("extendedDataList")
    public List<Object> getExtendedDataList() {
        return extendedDataList;
    }

    @JsonProperty("extendedDataList")
    public void setExtendedDataList(List<Object> extendedDataList) {
        this.extendedDataList = extendedDataList;
    }

    @JsonProperty("accountInternalId")
    public Integer getAccountInternalId() {
        return accountInternalId;
    }

    @JsonProperty("accountInternalId")
    public void setAccountInternalId(Integer accountInternalId) {
        this.accountInternalId = accountInternalId;
    }

    @JsonProperty("threshRef")
    public Integer getThreshRef() {
        return threshRef;
    }

    @JsonProperty("threshRef")
    public void setThreshRef(Integer threshRef) {
        this.threshRef = threshRef;
    }

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("accountProcessFlag")
    public Integer getAccountProcessFlag() {
        return accountProcessFlag;
    }

    @JsonProperty("accountProcessFlag")
    public void setAccountProcessFlag(Integer accountProcessFlag) {
        this.accountProcessFlag = accountProcessFlag;
    }

    @JsonProperty("billMinit")
    public String getBillMinit() {
        return billMinit;
    }

    @JsonProperty("billMinit")
    public void setBillMinit(String billMinit) {
        this.billMinit = billMinit;
    }

    @JsonProperty("custFaxno")
    public String getCustFaxno() {
        return custFaxno;
    }

    @JsonProperty("custFaxno")
    public void setCustFaxno(String custFaxno) {
        this.custFaxno = custFaxno;
    }

    @JsonProperty("serverId")
    public Integer getServerId() {
        return serverId;
    }

    @JsonProperty("serverId")
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @JsonProperty("contact1Phone")
    public String getContact1Phone() {
        return contact1Phone;
    }

    @JsonProperty("contact1Phone")
    public void setContact1Phone(String contact1Phone) {
        this.contact1Phone = contact1Phone;
    }

    @JsonProperty("chgDate")
    public String getChgDate() {
        return chgDate;
    }

    @JsonProperty("chgDate")
    public void setChgDate(String chgDate) {
        this.chgDate = chgDate;
    }

    @JsonProperty("billZip")
    public String getBillZip() {
        return billZip;
    }

    @JsonProperty("billZip")
    public void setBillZip(String billZip) {
        this.billZip = billZip;
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

    @JsonProperty("custZip")
    public String getCustZip() {
        return custZip;
    }

    @JsonProperty("custZip")
    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    @JsonProperty("noBill")
    public Boolean getNoBill() {
        return noBill;
    }

    @JsonProperty("noBill")
    public void setNoBill(Boolean noBill) {
        this.noBill = noBill;
    }

    @JsonProperty("billLname")
    public String getBillLname() {
        return billLname;
    }

    @JsonProperty("billLname")
    public void setBillLname(String billLname) {
        this.billLname = billLname;
    }

    @JsonProperty("chgWho")
    public String getChgWho() {
        return chgWho;
    }

    @JsonProperty("chgWho")
    public void setChgWho(String chgWho) {
        this.chgWho = chgWho;
    }

    @JsonProperty("billGeocode")
    public String getBillGeocode() {
        return billGeocode;
    }

    @JsonProperty("billGeocode")
    public void setBillGeocode(String billGeocode) {
        this.billGeocode = billGeocode;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("billCity")
    public String getBillCity() {
        return billCity;
    }

    @JsonProperty("billCity")
    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    @JsonProperty("converted")
    public Integer getConverted() {
        return converted;
    }

    @JsonProperty("converted")
    public void setConverted(Integer converted) {
        this.converted = converted;
    }

    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @JsonProperty("parentAccountExternalId")
    public String getParentAccountExternalId() {
        return parentAccountExternalId;
    }

    @JsonProperty("parentAccountExternalId")
    public void setParentAccountExternalId(String parentAccountExternalId) {
        this.parentAccountExternalId = parentAccountExternalId;
    }

    @JsonProperty("accountStatusDt")
    public String getAccountStatusDt() {
        return accountStatusDt;
    }

    @JsonProperty("accountStatusDt")
    public void setAccountStatusDt(String accountStatusDt) {
        this.accountStatusDt = accountStatusDt;
    }

    @JsonProperty("prevBillRefno")
    public Integer getPrevBillRefno() {
        return prevBillRefno;
    }

    @JsonProperty("prevBillRefno")
    public void setPrevBillRefno(Integer prevBillRefno) {
        this.prevBillRefno = prevBillRefno;
    }

    @JsonProperty("serviceCenterList")
    public List<Object> getServiceCenterList() {
        return serviceCenterList;
    }

    @JsonProperty("serviceCenterList")
    public void setServiceCenterList(List<Object> serviceCenterList) {
        this.serviceCenterList = serviceCenterList;
    }

    @JsonProperty("prepaidCfsCount")
    public Integer getPrepaidCfsCount() {
        return prepaidCfsCount;
    }

    @JsonProperty("prepaidCfsCount")
    public void setPrepaidCfsCount(Integer prepaidCfsCount) {
        this.prepaidCfsCount = prepaidCfsCount;
    }

    @JsonProperty("postpaidCfsCount")
    public Integer getPostpaidCfsCount() {
        return postpaidCfsCount;
    }

    @JsonProperty("postpaidCfsCount")
    public void setPostpaidCfsCount(Integer postpaidCfsCount) {
        this.postpaidCfsCount = postpaidCfsCount;
    }

    @JsonProperty("isBusiness")
    public Boolean getIsBusiness() {
        return isBusiness;
    }

    @JsonProperty("isBusiness")
    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    @JsonProperty("customerOptionalExtDatas")
    public List<Object> getCustomerOptionalExtDatas() {
        return customerOptionalExtDatas;
    }

    @JsonProperty("customerOptionalExtDatas")
    public void setCustomerOptionalExtDatas(List<Object> customerOptionalExtDatas) {
        this.customerOptionalExtDatas = customerOptionalExtDatas;
    }

    @JsonProperty("billIsRented")
    public Boolean getBillIsRented() {
        return billIsRented;
    }

    @JsonProperty("billIsRented")
    public void setBillIsRented(Boolean billIsRented) {
        this.billIsRented = billIsRented;
    }

    @JsonProperty("custIsRented")
    public Boolean getCustIsRented() {
        return custIsRented;
    }

    @JsonProperty("custIsRented")
    public void setCustIsRented(Boolean custIsRented) {
        this.custIsRented = custIsRented;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerAccountDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isPrepaid");
        sb.append('=');
        sb.append(((this.isPrepaid == null)?"<null>":this.isPrepaid));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("hierarchy");
        sb.append('=');
        sb.append(((this.hierarchy == null)?"<null>":this.hierarchy));
        sb.append(',');
        sb.append("externalids");
        sb.append('=');
        sb.append(((this.externalids == null)?"<null>":this.externalids));
        sb.append(',');
        sb.append("contact1Name");
        sb.append('=');
        sb.append(((this.contact1Name == null)?"<null>":this.contact1Name));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("remark");
        sb.append('=');
        sb.append(((this.remark == null)?"<null>":this.remark));
        sb.append(',');
        sb.append("collectionHistory");
        sb.append('=');
        sb.append(((this.collectionHistory == null)?"<null>":this.collectionHistory));
        sb.append(',');
        sb.append("tieCode");
        sb.append('=');
        sb.append(((this.tieCode == null)?"<null>":this.tieCode));
        sb.append(',');
        sb.append("threshold");
        sb.append('=');
        sb.append(((this.threshold == null)?"<null>":this.threshold));
        sb.append(',');
        sb.append("paymentProfileId");
        sb.append('=');
        sb.append(((this.paymentProfileId == null)?"<null>":this.paymentProfileId));
        sb.append(',');
        sb.append("creditRating");
        sb.append('=');
        sb.append(((this.creditRating == null)?"<null>":this.creditRating));
        sb.append(',');
        sb.append("custState");
        sb.append('=');
        sb.append(((this.custState == null)?"<null>":this.custState));
        sb.append(',');
        sb.append("dateInactive");
        sb.append('=');
        sb.append(((this.dateInactive == null)?"<null>":this.dateInactive));
        sb.append(',');
        sb.append("nextBillDate");
        sb.append('=');
        sb.append(((this.nextBillDate == null)?"<null>":this.nextBillDate));
        sb.append(',');
        sb.append("hierarchyId");
        sb.append('=');
        sb.append(((this.hierarchyId == null)?"<null>":this.hierarchyId));
        sb.append(',');
        sb.append("inUse");
        sb.append('=');
        sb.append(((this.inUse == null)?"<null>":this.inUse));
        sb.append(',');
        sb.append("custCounty");
        sb.append('=');
        sb.append(((this.custCounty == null)?"<null>":this.custCounty));
        sb.append(',');
        sb.append("cyclicalThreshold");
        sb.append('=');
        sb.append(((this.cyclicalThreshold == null)?"<null>":this.cyclicalThreshold));
        sb.append(',');
        sb.append("billNamePre");
        sb.append('=');
        sb.append(((this.billNamePre == null)?"<null>":this.billNamePre));
        sb.append(',');
        sb.append("contact2Phone");
        sb.append('=');
        sb.append(((this.contact2Phone == null)?"<null>":this.contact2Phone));
        sb.append(',');
        sb.append("dept");
        sb.append('=');
        sb.append(((this.dept == null)?"<null>":this.dept));
        sb.append(',');
        sb.append("creditThresh");
        sb.append('=');
        sb.append(((this.creditThresh == null)?"<null>":this.creditThresh));
        sb.append(',');
        sb.append("billTitle");
        sb.append('=');
        sb.append(((this.billTitle == null)?"<null>":this.billTitle));
        sb.append(',');
        sb.append("altLname");
        sb.append('=');
        sb.append(((this.altLname == null)?"<null>":this.altLname));
        sb.append(',');
        sb.append("prevBalanceRefResets");
        sb.append('=');
        sb.append(((this.prevBalanceRefResets == null)?"<null>":this.prevBalanceRefResets));
        sb.append(',');
        sb.append("planIdDiscount");
        sb.append('=');
        sb.append(((this.planIdDiscount == null)?"<null>":this.planIdDiscount));
        sb.append(',');
        sb.append("inactiveDate");
        sb.append('=');
        sb.append(((this.inactiveDate == null)?"<null>":this.inactiveDate));
        sb.append(',');
        sb.append("parentId");
        sb.append('=');
        sb.append(((this.parentId == null)?"<null>":this.parentId));
        sb.append(',');
        sb.append("statementToEmail");
        sb.append('=');
        sb.append(((this.statementToEmail == null)?"<null>":this.statementToEmail));
        sb.append(',');
        sb.append("custAddress3");
        sb.append('=');
        sb.append(((this.custAddress3 == null)?"<null>":this.custAddress3));
        sb.append(',');
        sb.append("custAddress4");
        sb.append('=');
        sb.append(((this.custAddress4 == null)?"<null>":this.custAddress4));
        sb.append(',');
        sb.append("statementToFaxno");
        sb.append('=');
        sb.append(((this.statementToFaxno == null)?"<null>":this.statementToFaxno));
        sb.append(',');
        sb.append("activeDate");
        sb.append('=');
        sb.append(((this.activeDate == null)?"<null>":this.activeDate));
        sb.append(',');
        sb.append("custAddress1");
        sb.append('=');
        sb.append(((this.custAddress1 == null)?"<null>":this.custAddress1));
        sb.append(',');
        sb.append("custAddress2");
        sb.append('=');
        sb.append(((this.custAddress2 == null)?"<null>":this.custAddress2));
        sb.append(',');
        sb.append("chargeThreshold");
        sb.append('=');
        sb.append(((this.chargeThreshold == null)?"<null>":this.chargeThreshold));
        sb.append(',');
        sb.append("prevBalanceRefno");
        sb.append('=');
        sb.append(((this.prevBalanceRefno == null)?"<null>":this.prevBalanceRefno));
        sb.append(',');
        sb.append("billFname");
        sb.append('=');
        sb.append(((this.billFname == null)?"<null>":this.billFname));
        sb.append(',');
        sb.append("altCompanyName");
        sb.append('=');
        sb.append(((this.altCompanyName == null)?"<null>":this.altCompanyName));
        sb.append(',');
        sb.append("prevBillDate");
        sb.append('=');
        sb.append(((this.prevBillDate == null)?"<null>":this.prevBillDate));
        sb.append(',');
        sb.append("billSequenceNum");
        sb.append('=');
        sb.append(((this.billSequenceNum == null)?"<null>":this.billSequenceNum));
        sb.append(',');
        sb.append("planIdCredit");
        sb.append('=');
        sb.append(((this.planIdCredit == null)?"<null>":this.planIdCredit));
        sb.append(',');
        sb.append("childCount");
        sb.append('=');
        sb.append(((this.childCount == null)?"<null>":this.childCount));
        sb.append(',');
        sb.append("discRcvOpt");
        sb.append('=');
        sb.append(((this.discRcvOpt == null)?"<null>":this.discRcvOpt));
        sb.append(',');
        sb.append("purchaseOrder");
        sb.append('=');
        sb.append(((this.purchaseOrder == null)?"<null>":this.purchaseOrder));
        sb.append(',');
        sb.append("custGeocode");
        sb.append('=');
        sb.append(((this.custGeocode == null)?"<null>":this.custGeocode));
        sb.append(',');
        sb.append("sdAgencyId");
        sb.append('=');
        sb.append(((this.sdAgencyId == null)?"<null>":this.sdAgencyId));
        sb.append(',');
        sb.append("billCompany");
        sb.append('=');
        sb.append(((this.billCompany == null)?"<null>":this.billCompany));
        sb.append(',');
        sb.append("salesCode");
        sb.append('=');
        sb.append(((this.salesCode == null)?"<null>":this.salesCode));
        sb.append(',');
        sb.append("billNameGeneration");
        sb.append('=');
        sb.append(((this.billNameGeneration == null)?"<null>":this.billNameGeneration));
        sb.append(',');
        sb.append("distrChan");
        sb.append('=');
        sb.append(((this.distrChan == null)?"<null>":this.distrChan));
        sb.append(',');
        sb.append("dateActive");
        sb.append('=');
        sb.append(((this.dateActive == null)?"<null>":this.dateActive));
        sb.append(',');
        sb.append("custCity");
        sb.append('=');
        sb.append(((this.custCity == null)?"<null>":this.custCity));
        sb.append(',');
        sb.append("billCounty");
        sb.append('=');
        sb.append(((this.billCounty == null)?"<null>":this.billCounty));
        sb.append(',');
        sb.append("autoWriteoffStatus");
        sb.append('=');
        sb.append(((this.autoWriteoffStatus == null)?"<null>":this.autoWriteoffStatus));
        sb.append(',');
        sb.append("billState");
        sb.append('=');
        sb.append(((this.billState == null)?"<null>":this.billState));
        sb.append(',');
        sb.append("prevCutoffDate");
        sb.append('=');
        sb.append(((this.prevCutoffDate == null)?"<null>":this.prevCutoffDate));
        sb.append(',');
        sb.append("altFname");
        sb.append('=');
        sb.append(((this.altFname == null)?"<null>":this.altFname));
        sb.append(',');
        sb.append("collectionIndicator");
        sb.append('=');
        sb.append(((this.collectionIndicator == null)?"<null>":this.collectionIndicator));
        sb.append(',');
        sb.append("usgAmtLimit");
        sb.append('=');
        sb.append(((this.usgAmtLimit == null)?"<null>":this.usgAmtLimit));
        sb.append(',');
        sb.append("globalContractStatus");
        sb.append('=');
        sb.append(((this.globalContractStatus == null)?"<null>":this.globalContractStatus));
        sb.append(',');
        sb.append("credStatus");
        sb.append('=');
        sb.append(((this.credStatus == null)?"<null>":this.credStatus));
        sb.append(',');
        sb.append("hierarchyAccountExternalId");
        sb.append('=');
        sb.append(((this.hierarchyAccountExternalId == null)?"<null>":this.hierarchyAccountExternalId));
        sb.append(',');
        sb.append("billAddress3");
        sb.append('=');
        sb.append(((this.billAddress3 == null)?"<null>":this.billAddress3));
        sb.append(',');
        sb.append("billAddress4");
        sb.append('=');
        sb.append(((this.billAddress4 == null)?"<null>":this.billAddress4));
        sb.append(',');
        sb.append("billAddress1");
        sb.append('=');
        sb.append(((this.billAddress1 == null)?"<null>":this.billAddress1));
        sb.append(',');
        sb.append("billAddress2");
        sb.append('=');
        sb.append(((this.billAddress2 == null)?"<null>":this.billAddress2));
        sb.append(',');
        sb.append("contact2Name");
        sb.append('=');
        sb.append(((this.contact2Name == null)?"<null>":this.contact2Name));
        sb.append(',');
        sb.append("codeword");
        sb.append('=');
        sb.append(((this.codeword == null)?"<null>":this.codeword));
        sb.append(',');
        sb.append("custPhone1");
        sb.append('=');
        sb.append(((this.custPhone1 == null)?"<null>":this.custPhone1));
        sb.append(',');
        sb.append("custPhone2");
        sb.append('=');
        sb.append(((this.custPhone2 == null)?"<null>":this.custPhone2));
        sb.append(',');
        sb.append("usgUnitsLimit");
        sb.append('=');
        sb.append(((this.usgUnitsLimit == null)?"<null>":this.usgUnitsLimit));
        sb.append(',');
        sb.append("prevBillRefResets");
        sb.append('=');
        sb.append(((this.prevBillRefResets == null)?"<null>":this.prevBillRefResets));
        sb.append(',');
        sb.append("extendedDataList");
        sb.append('=');
        sb.append(((this.extendedDataList == null)?"<null>":this.extendedDataList));
        sb.append(',');
        sb.append("accountInternalId");
        sb.append('=');
        sb.append(((this.accountInternalId == null)?"<null>":this.accountInternalId));
        sb.append(',');
        sb.append("threshRef");
        sb.append('=');
        sb.append(((this.threshRef == null)?"<null>":this.threshRef));
        sb.append(',');
        sb.append("dateCreated");
        sb.append('=');
        sb.append(((this.dateCreated == null)?"<null>":this.dateCreated));
        sb.append(',');
        sb.append("accountProcessFlag");
        sb.append('=');
        sb.append(((this.accountProcessFlag == null)?"<null>":this.accountProcessFlag));
        sb.append(',');
        sb.append("billMinit");
        sb.append('=');
        sb.append(((this.billMinit == null)?"<null>":this.billMinit));
        sb.append(',');
        sb.append("custFaxno");
        sb.append('=');
        sb.append(((this.custFaxno == null)?"<null>":this.custFaxno));
        sb.append(',');
        sb.append("serverId");
        sb.append('=');
        sb.append(((this.serverId == null)?"<null>":this.serverId));
        sb.append(',');
        sb.append("contact1Phone");
        sb.append('=');
        sb.append(((this.contact1Phone == null)?"<null>":this.contact1Phone));
        sb.append(',');
        sb.append("chgDate");
        sb.append('=');
        sb.append(((this.chgDate == null)?"<null>":this.chgDate));
        sb.append(',');
        sb.append("billZip");
        sb.append('=');
        sb.append(((this.billZip == null)?"<null>":this.billZip));
        sb.append(',');
        sb.append("custEmail");
        sb.append('=');
        sb.append(((this.custEmail == null)?"<null>":this.custEmail));
        sb.append(',');
        sb.append("accountExternalId");
        sb.append('=');
        sb.append(((this.accountExternalId == null)?"<null>":this.accountExternalId));
        sb.append(',');
        sb.append("custZip");
        sb.append('=');
        sb.append(((this.custZip == null)?"<null>":this.custZip));
        sb.append(',');
        sb.append("noBill");
        sb.append('=');
        sb.append(((this.noBill == null)?"<null>":this.noBill));
        sb.append(',');
        sb.append("billLname");
        sb.append('=');
        sb.append(((this.billLname == null)?"<null>":this.billLname));
        sb.append(',');
        sb.append("chgWho");
        sb.append('=');
        sb.append(((this.chgWho == null)?"<null>":this.chgWho));
        sb.append(',');
        sb.append("billGeocode");
        sb.append('=');
        sb.append(((this.billGeocode == null)?"<null>":this.billGeocode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("billCity");
        sb.append('=');
        sb.append(((this.billCity == null)?"<null>":this.billCity));
        sb.append(',');
        sb.append("converted");
        sb.append('=');
        sb.append(((this.converted == null)?"<null>":this.converted));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("parentAccountExternalId");
        sb.append('=');
        sb.append(((this.parentAccountExternalId == null)?"<null>":this.parentAccountExternalId));
        sb.append(',');
        sb.append("accountStatusDt");
        sb.append('=');
        sb.append(((this.accountStatusDt == null)?"<null>":this.accountStatusDt));
        sb.append(',');
        sb.append("prevBillRefno");
        sb.append('=');
        sb.append(((this.prevBillRefno == null)?"<null>":this.prevBillRefno));
        sb.append(',');
        sb.append("serviceCenterList");
        sb.append('=');
        sb.append(((this.serviceCenterList == null)?"<null>":this.serviceCenterList));
        sb.append(',');
        sb.append("prepaidCfsCount");
        sb.append('=');
        sb.append(((this.prepaidCfsCount == null)?"<null>":this.prepaidCfsCount));
        sb.append(',');
        sb.append("postpaidCfsCount");
        sb.append('=');
        sb.append(((this.postpaidCfsCount == null)?"<null>":this.postpaidCfsCount));
        sb.append(',');
        sb.append("isBusiness");
        sb.append('=');
        sb.append(((this.isBusiness == null)?"<null>":this.isBusiness));
        sb.append(',');
        sb.append("customerOptionalExtDatas");
        sb.append('=');
        sb.append(((this.customerOptionalExtDatas == null)?"<null>":this.customerOptionalExtDatas));
        sb.append(',');
        sb.append("billIsRented");
        sb.append('=');
        sb.append(((this.billIsRented == null)?"<null>":this.billIsRented));
        sb.append(',');
        sb.append("custIsRented");
        sb.append('=');
        sb.append(((this.custIsRented == null)?"<null>":this.custIsRented));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

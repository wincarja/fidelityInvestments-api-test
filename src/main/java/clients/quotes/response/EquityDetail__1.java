
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquityDetail__1 {

    @SerializedName("numEmployees")
    @Expose
    private Integer numEmployees;
    @SerializedName("epsTTM")
    @Expose
    private Double epsTTM;
    @SerializedName("epsTTMAOD")
    @Expose
    private String epsTTMAOD;
    @SerializedName("industry")
    @Expose
    private String industry;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("mktCap")
    @Expose
    private Integer mktCap;
    @SerializedName("isOptionable")
    @Expose
    private String isOptionable;
    @SerializedName("revenueAOD")
    @Expose
    private String revenueAOD;
    @SerializedName("revenueTTM")
    @Expose
    private Integer revenueTTM;
    @SerializedName("companyDesc")
    @Expose
    private String companyDesc;

    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }

    public Double getEpsTTM() {
        return epsTTM;
    }

    public void setEpsTTM(Double epsTTM) {
        this.epsTTM = epsTTM;
    }

    public String getEpsTTMAOD() {
        return epsTTMAOD;
    }

    public void setEpsTTMAOD(String epsTTMAOD) {
        this.epsTTMAOD = epsTTMAOD;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getMktCap() {
        return mktCap;
    }

    public void setMktCap(Integer mktCap) {
        this.mktCap = mktCap;
    }

    public String getIsOptionable() {
        return isOptionable;
    }

    public void setIsOptionable(String isOptionable) {
        this.isOptionable = isOptionable;
    }

    public String getRevenueAOD() {
        return revenueAOD;
    }

    public void setRevenueAOD(String revenueAOD) {
        this.revenueAOD = revenueAOD;
    }

    public Integer getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(Integer revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

}

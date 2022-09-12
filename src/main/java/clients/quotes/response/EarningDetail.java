
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarningDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__8 secDetail;
    @SerializedName("qtrHistDetails")
    @Expose
    private QtrHistDetails qtrHistDetails;
    @SerializedName("annHistDetails")
    @Expose
    private AnnHistDetails annHistDetails;
    @SerializedName("announceDaysSince")
    @Expose
    private Integer announceDaysSince;
    @SerializedName("announceDaysUntil")
    @Expose
    private Integer announceDaysUntil;
    @SerializedName("epsGrowthLast5Yr")
    @Expose
    private Double epsGrowthLast5Yr;
    @SerializedName("epsGrowthTTM")
    @Expose
    private Double epsGrowthTTM;
    @SerializedName("epsPrevQtrVsPrevYrQtr")
    @Expose
    private Integer epsPrevQtrVsPrevYrQtr;
    @SerializedName("projEPSGrowthCurrYrNextYr")
    @Expose
    private Double projEPSGrowthCurrYrNextYr;

    public SecDetail__8 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__8 secDetail) {
        this.secDetail = secDetail;
    }

    public QtrHistDetails getQtrHistDetails() {
        return qtrHistDetails;
    }

    public void setQtrHistDetails(QtrHistDetails qtrHistDetails) {
        this.qtrHistDetails = qtrHistDetails;
    }

    public AnnHistDetails getAnnHistDetails() {
        return annHistDetails;
    }

    public void setAnnHistDetails(AnnHistDetails annHistDetails) {
        this.annHistDetails = annHistDetails;
    }

    public Integer getAnnounceDaysSince() {
        return announceDaysSince;
    }

    public void setAnnounceDaysSince(Integer announceDaysSince) {
        this.announceDaysSince = announceDaysSince;
    }

    public Integer getAnnounceDaysUntil() {
        return announceDaysUntil;
    }

    public void setAnnounceDaysUntil(Integer announceDaysUntil) {
        this.announceDaysUntil = announceDaysUntil;
    }

    public Double getEpsGrowthLast5Yr() {
        return epsGrowthLast5Yr;
    }

    public void setEpsGrowthLast5Yr(Double epsGrowthLast5Yr) {
        this.epsGrowthLast5Yr = epsGrowthLast5Yr;
    }

    public Double getEpsGrowthTTM() {
        return epsGrowthTTM;
    }

    public void setEpsGrowthTTM(Double epsGrowthTTM) {
        this.epsGrowthTTM = epsGrowthTTM;
    }

    public Integer getEpsPrevQtrVsPrevYrQtr() {
        return epsPrevQtrVsPrevYrQtr;
    }

    public void setEpsPrevQtrVsPrevYrQtr(Integer epsPrevQtrVsPrevYrQtr) {
        this.epsPrevQtrVsPrevYrQtr = epsPrevQtrVsPrevYrQtr;
    }

    public Double getProjEPSGrowthCurrYrNextYr() {
        return projEPSGrowthCurrYrNextYr;
    }

    public void setProjEPSGrowthCurrYrNextYr(Double projEPSGrowthCurrYrNextYr) {
        this.projEPSGrowthCurrYrNextYr = projEPSGrowthCurrYrNextYr;
    }

}

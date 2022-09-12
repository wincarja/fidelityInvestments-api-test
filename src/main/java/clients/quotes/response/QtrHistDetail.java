
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QtrHistDetail {

    @SerializedName("fiscalQtr")
    @Expose
    private Integer fiscalQtr;
    @SerializedName("fiscalYr")
    @Expose
    private Integer fiscalYr;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("reportDate")
    @Expose
    private String reportDate;
    @SerializedName("consensusEst")
    @Expose
    private Double consensusEst;
    @SerializedName("highEst")
    @Expose
    private Double highEst;
    @SerializedName("lowEst")
    @Expose
    private Double lowEst;
    @SerializedName("numAnalysts")
    @Expose
    private Integer numAnalysts;
    @SerializedName("gaapEPS")
    @Expose
    private Double gaapEPS;
    @SerializedName("wshReportTime")
    @Expose
    private String wshReportTime;
    @SerializedName("wshTODCode")
    @Expose
    private String wshTODCode;
    @SerializedName("adjustedEPS")
    @Expose
    private Double adjustedEPS;
    @SerializedName("actEPS")
    @Expose
    private Double actEPS;
    @SerializedName("starmineEst")
    @Expose
    private Double starmineEst;
    @SerializedName("earningsResultText")
    @Expose
    private String earningsResultText;
    @SerializedName("reportedEPSNonGAAP")
    @Expose
    private Double reportedEPSNonGAAP;

    public Integer getFiscalQtr() {
        return fiscalQtr;
    }

    public void setFiscalQtr(Integer fiscalQtr) {
        this.fiscalQtr = fiscalQtr;
    }

    public Integer getFiscalYr() {
        return fiscalYr;
    }

    public void setFiscalYr(Integer fiscalYr) {
        this.fiscalYr = fiscalYr;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public Double getConsensusEst() {
        return consensusEst;
    }

    public void setConsensusEst(Double consensusEst) {
        this.consensusEst = consensusEst;
    }

    public Double getHighEst() {
        return highEst;
    }

    public void setHighEst(Double highEst) {
        this.highEst = highEst;
    }

    public Double getLowEst() {
        return lowEst;
    }

    public void setLowEst(Double lowEst) {
        this.lowEst = lowEst;
    }

    public Integer getNumAnalysts() {
        return numAnalysts;
    }

    public void setNumAnalysts(Integer numAnalysts) {
        this.numAnalysts = numAnalysts;
    }

    public Double getGaapEPS() {
        return gaapEPS;
    }

    public void setGaapEPS(Double gaapEPS) {
        this.gaapEPS = gaapEPS;
    }

    public String getWshReportTime() {
        return wshReportTime;
    }

    public void setWshReportTime(String wshReportTime) {
        this.wshReportTime = wshReportTime;
    }

    public String getWshTODCode() {
        return wshTODCode;
    }

    public void setWshTODCode(String wshTODCode) {
        this.wshTODCode = wshTODCode;
    }

    public Double getAdjustedEPS() {
        return adjustedEPS;
    }

    public void setAdjustedEPS(Double adjustedEPS) {
        this.adjustedEPS = adjustedEPS;
    }

    public Double getActEPS() {
        return actEPS;
    }

    public void setActEPS(Double actEPS) {
        this.actEPS = actEPS;
    }

    public Double getStarmineEst() {
        return starmineEst;
    }

    public void setStarmineEst(Double starmineEst) {
        this.starmineEst = starmineEst;
    }

    public String getEarningsResultText() {
        return earningsResultText;
    }

    public void setEarningsResultText(String earningsResultText) {
        this.earningsResultText = earningsResultText;
    }

    public Double getReportedEPSNonGAAP() {
        return reportedEPSNonGAAP;
    }

    public void setReportedEPSNonGAAP(Double reportedEPSNonGAAP) {
        this.reportedEPSNonGAAP = reportedEPSNonGAAP;
    }

}

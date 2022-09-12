
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnnHistDetail {

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
    @SerializedName("fiscalPeriod")
    @Expose
    private String fiscalPeriod;
    @SerializedName("fiscalYr")
    @Expose
    private String fiscalYr;

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

    public String getFiscalPeriod() {
        return fiscalPeriod;
    }

    public void setFiscalPeriod(String fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
    }

    public String getFiscalYr() {
        return fiscalYr;
    }

    public void setFiscalYr(String fiscalYr) {
        this.fiscalYr = fiscalYr;
    }

}

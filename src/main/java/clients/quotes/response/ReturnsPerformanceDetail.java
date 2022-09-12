
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsPerformanceDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__4 secDetail;
    @SerializedName("beta1Yr")
    @Expose
    private Double beta1Yr;
    @SerializedName("beta3Yr")
    @Expose
    private Double beta3Yr;
    @SerializedName("pricePerf12MthAgo")
    @Expose
    private Double pricePerf12MthAgo;
    @SerializedName("pricePerfAOD")
    @Expose
    private String pricePerfAOD;
    @SerializedName("returnOnEquityTTM")
    @Expose
    private Double returnOnEquityTTM;
    @SerializedName("totalReturn1Yr")
    @Expose
    private Double totalReturn1Yr;
    @SerializedName("totalReturn3Yr")
    @Expose
    private Double totalReturn3Yr;
    @SerializedName("totalReturn5Yr")
    @Expose
    private Double totalReturn5Yr;

    public SecDetail__4 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__4 secDetail) {
        this.secDetail = secDetail;
    }

    public Double getBeta1Yr() {
        return beta1Yr;
    }

    public void setBeta1Yr(Double beta1Yr) {
        this.beta1Yr = beta1Yr;
    }

    public Double getBeta3Yr() {
        return beta3Yr;
    }

    public void setBeta3Yr(Double beta3Yr) {
        this.beta3Yr = beta3Yr;
    }

    public Double getPricePerf12MthAgo() {
        return pricePerf12MthAgo;
    }

    public void setPricePerf12MthAgo(Double pricePerf12MthAgo) {
        this.pricePerf12MthAgo = pricePerf12MthAgo;
    }

    public String getPricePerfAOD() {
        return pricePerfAOD;
    }

    public void setPricePerfAOD(String pricePerfAOD) {
        this.pricePerfAOD = pricePerfAOD;
    }

    public Double getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    public void setReturnOnEquityTTM(Double returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    public Double getTotalReturn1Yr() {
        return totalReturn1Yr;
    }

    public void setTotalReturn1Yr(Double totalReturn1Yr) {
        this.totalReturn1Yr = totalReturn1Yr;
    }

    public Double getTotalReturn3Yr() {
        return totalReturn3Yr;
    }

    public void setTotalReturn3Yr(Double totalReturn3Yr) {
        this.totalReturn3Yr = totalReturn3Yr;
    }

    public Double getTotalReturn5Yr() {
        return totalReturn5Yr;
    }

    public void setTotalReturn5Yr(Double totalReturn5Yr) {
        this.totalReturn5Yr = totalReturn5Yr;
    }

}

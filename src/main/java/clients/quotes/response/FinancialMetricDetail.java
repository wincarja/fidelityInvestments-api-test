
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FinancialMetricDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail secDetail;
    @SerializedName("currentRatioTTM")
    @Expose
    private Double currentRatioTTM;
    @SerializedName("debtToTotCapTTM")
    @Expose
    private Double debtToTotCapTTM;
    @SerializedName("intCoverageMRQ")
    @Expose
    private Double intCoverageMRQ;
    @SerializedName("longTermDebtToEquityTTM")
    @Expose
    private Double longTermDebtToEquityTTM;
    @SerializedName("profitMargin")
    @Expose
    private Double profitMargin;

    public SecDetail getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail secDetail) {
        this.secDetail = secDetail;
    }

    public Double getCurrentRatioTTM() {
        return currentRatioTTM;
    }

    public void setCurrentRatioTTM(Double currentRatioTTM) {
        this.currentRatioTTM = currentRatioTTM;
    }

    public Double getDebtToTotCapTTM() {
        return debtToTotCapTTM;
    }

    public void setDebtToTotCapTTM(Double debtToTotCapTTM) {
        this.debtToTotCapTTM = debtToTotCapTTM;
    }

    public Double getIntCoverageMRQ() {
        return intCoverageMRQ;
    }

    public void setIntCoverageMRQ(Double intCoverageMRQ) {
        this.intCoverageMRQ = intCoverageMRQ;
    }

    public Double getLongTermDebtToEquityTTM() {
        return longTermDebtToEquityTTM;
    }

    public void setLongTermDebtToEquityTTM(Double longTermDebtToEquityTTM) {
        this.longTermDebtToEquityTTM = longTermDebtToEquityTTM;
    }

    public Double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(Double profitMargin) {
        this.profitMargin = profitMargin;
    }

}

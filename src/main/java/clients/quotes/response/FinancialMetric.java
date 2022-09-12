
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FinancialMetric {

    @SerializedName("financialMetricDetails")
    @Expose
    private FinancialMetricDetails financialMetricDetails;

    public FinancialMetricDetails getFinancialMetricDetails() {
        return financialMetricDetails;
    }

    public void setFinancialMetricDetails(FinancialMetricDetails financialMetricDetails) {
        this.financialMetricDetails = financialMetricDetails;
    }

}

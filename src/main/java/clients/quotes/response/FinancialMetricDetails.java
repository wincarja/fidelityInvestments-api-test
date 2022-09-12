
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FinancialMetricDetails {

    @SerializedName("financialMetricDetail")
    @Expose
    private List<FinancialMetricDetail> financialMetricDetail = null;

    public List<FinancialMetricDetail> getFinancialMetricDetail() {
        return financialMetricDetail;
    }

    public void setFinancialMetricDetail(List<FinancialMetricDetail> financialMetricDetail) {
        this.financialMetricDetail = financialMetricDetail;
    }

}

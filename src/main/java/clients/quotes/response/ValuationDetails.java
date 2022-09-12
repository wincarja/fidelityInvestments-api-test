
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValuationDetails {

    @SerializedName("valuationDetail")
    @Expose
    private List<ValuationDetail> valuationDetail = null;

    public List<ValuationDetail> getValuationDetail() {
        return valuationDetail;
    }

    public void setValuationDetail(List<ValuationDetail> valuationDetail) {
        this.valuationDetail = valuationDetail;
    }

}

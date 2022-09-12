
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DividendDetails {

    @SerializedName("dividendDetail")
    @Expose
    private List<DividendDetail> dividendDetail = null;

    public List<DividendDetail> getDividendDetail() {
        return dividendDetail;
    }

    public void setDividendDetail(List<DividendDetail> dividendDetail) {
        this.dividendDetail = dividendDetail;
    }

}

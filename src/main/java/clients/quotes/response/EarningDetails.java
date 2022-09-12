
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarningDetails {

    @SerializedName("earningDetail")
    @Expose
    private List<EarningDetail> earningDetail = null;

    public List<EarningDetail> getEarningDetail() {
        return earningDetail;
    }

    public void setEarningDetail(List<EarningDetail> earningDetail) {
        this.earningDetail = earningDetail;
    }

}

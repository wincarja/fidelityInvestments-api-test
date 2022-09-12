
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsPerfDetails {

    @SerializedName("returnsPerformanceDetail")
    @Expose
    private List<ReturnsPerformanceDetail> returnsPerformanceDetail = null;

    public List<ReturnsPerformanceDetail> getReturnsPerformanceDetail() {
        return returnsPerformanceDetail;
    }

    public void setReturnsPerformanceDetail(List<ReturnsPerformanceDetail> returnsPerformanceDetail) {
        this.returnsPerformanceDetail = returnsPerformanceDetail;
    }

}

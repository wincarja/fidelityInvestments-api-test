
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DistributionDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__7 secDetail;

    public SecDetail__7 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__7 secDetail) {
        this.secDetail = secDetail;
    }

}

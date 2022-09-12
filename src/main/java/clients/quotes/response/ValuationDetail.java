
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValuationDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__1 secDetail;
    @SerializedName("equityDetail")
    @Expose
    private EquityDetail equityDetail;

    public SecDetail__1 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__1 secDetail) {
        this.secDetail = secDetail;
    }

    public EquityDetail getEquityDetail() {
        return equityDetail;
    }

    public void setEquityDetail(EquityDetail equityDetail) {
        this.equityDetail = equityDetail;
    }

}

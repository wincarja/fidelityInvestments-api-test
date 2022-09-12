
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DividendDetail {

    @SerializedName("equityDetail")
    @Expose
    private EquityDetail__2 equityDetail;
    @SerializedName("secDetail")
    @Expose
    private SecDetail__6 secDetail;

    public EquityDetail__2 getEquityDetail() {
        return equityDetail;
    }

    public void setEquityDetail(EquityDetail__2 equityDetail) {
        this.equityDetail = equityDetail;
    }

    public SecDetail__6 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__6 secDetail) {
        this.secDetail = secDetail;
    }

}

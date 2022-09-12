
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicFactDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__5 secDetail;
    @SerializedName("equityDetail")
    @Expose
    private EquityDetail__1 equityDetail;

    public SecDetail__5 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__5 secDetail) {
        this.secDetail = secDetail;
    }

    public EquityDetail__1 getEquityDetail() {
        return equityDetail;
    }

    public void setEquityDetail(EquityDetail__1 equityDetail) {
        this.equityDetail = equityDetail;
    }

}

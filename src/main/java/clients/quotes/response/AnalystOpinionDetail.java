
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnalystOpinionDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__2 secDetail;
    @SerializedName("equitySummDetail")
    @Expose
    private EquitySummDetail equitySummDetail;

    public SecDetail__2 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__2 secDetail) {
        this.secDetail = secDetail;
    }

    public EquitySummDetail getEquitySummDetail() {
        return equitySummDetail;
    }

    public void setEquitySummDetail(EquitySummDetail equitySummDetail) {
        this.equitySummDetail = equitySummDetail;
    }

}

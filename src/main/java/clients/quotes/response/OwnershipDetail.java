
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OwnershipDetail {

    @SerializedName("secDetail")
    @Expose
    private SecDetail__3 secDetail;
    @SerializedName("institOwnership")
    @Expose
    private Double institOwnership;
    @SerializedName("sharesOut")
    @Expose
    private Integer sharesOut;
    @SerializedName("vol10dAvg")
    @Expose
    private Integer vol10dAvg;
    @SerializedName("vol90dAvg")
    @Expose
    private Integer vol90dAvg;

    public SecDetail__3 getSecDetail() {
        return secDetail;
    }

    public void setSecDetail(SecDetail__3 secDetail) {
        this.secDetail = secDetail;
    }

    public Double getInstitOwnership() {
        return institOwnership;
    }

    public void setInstitOwnership(Double institOwnership) {
        this.institOwnership = institOwnership;
    }

    public Integer getSharesOut() {
        return sharesOut;
    }

    public void setSharesOut(Integer sharesOut) {
        this.sharesOut = sharesOut;
    }

    public Integer getVol10dAvg() {
        return vol10dAvg;
    }

    public void setVol10dAvg(Integer vol10dAvg) {
        this.vol10dAvg = vol10dAvg;
    }

    public Integer getVol90dAvg() {
        return vol90dAvg;
    }

    public void setVol90dAvg(Integer vol90dAvg) {
        this.vol90dAvg = vol90dAvg;
    }

}

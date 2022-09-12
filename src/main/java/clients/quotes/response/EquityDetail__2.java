
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquityDetail__2 {

    @SerializedName("announceDate")
    @Expose
    private String announceDate;
    @SerializedName("exDivDate")
    @Expose
    private String exDivDate;
    @SerializedName("payoutRatioMRQ")
    @Expose
    private Integer payoutRatioMRQ;
    @SerializedName("divHistDetails")
    @Expose
    private DivHistDetails divHistDetails;
    @SerializedName("statusDate")
    @Expose
    private String statusDate;

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }

    public String getExDivDate() {
        return exDivDate;
    }

    public void setExDivDate(String exDivDate) {
        this.exDivDate = exDivDate;
    }

    public Integer getPayoutRatioMRQ() {
        return payoutRatioMRQ;
    }

    public void setPayoutRatioMRQ(Integer payoutRatioMRQ) {
        this.payoutRatioMRQ = payoutRatioMRQ;
    }

    public DivHistDetails getDivHistDetails() {
        return divHistDetails;
    }

    public void setDivHistDetails(DivHistDetails divHistDetails) {
        this.divHistDetails = divHistDetails;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

}


package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DivHistDetail {

    @SerializedName("announceDate")
    @Expose
    private String announceDate;
    @SerializedName("payDate")
    @Expose
    private String payDate;
    @SerializedName("exDate")
    @Expose
    private String exDate;
    @SerializedName("recordDate")
    @Expose
    private String recordDate;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("exDateCalQtr")
    @Expose
    private String exDateCalQtr;
    @SerializedName("exDateCalYr")
    @Expose
    private Integer exDateCalYr;

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExDateCalQtr() {
        return exDateCalQtr;
    }

    public void setExDateCalQtr(String exDateCalQtr) {
        this.exDateCalQtr = exDateCalQtr;
    }

    public Integer getExDateCalYr() {
        return exDateCalYr;
    }

    public void setExDateCalYr(Integer exDateCalYr) {
        this.exDateCalYr = exDateCalYr;
    }

}

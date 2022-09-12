
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecDetail__4 {

    @SerializedName("requested")
    @Expose
    private String requested;
    @SerializedName("classification")
    @Expose
    private String classification;
    @SerializedName("classificationType")
    @Expose
    private String classificationType;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("CUSIP")
    @Expose
    private String cusip;

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassificationType() {
        return classificationType;
    }

    public void setClassificationType(String classificationType) {
        this.classificationType = classificationType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

}

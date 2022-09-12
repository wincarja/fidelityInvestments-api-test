
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dividend {

    @SerializedName("dividendDetails")
    @Expose
    private DividendDetails dividendDetails;

    public DividendDetails getDividendDetails() {
        return dividendDetails;
    }

    public void setDividendDetails(DividendDetails dividendDetails) {
        this.dividendDetails = dividendDetails;
    }

}

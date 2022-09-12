
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Earning {

    @SerializedName("earningDetails")
    @Expose
    private EarningDetails earningDetails;

    public EarningDetails getEarningDetails() {
        return earningDetails;
    }

    public void setEarningDetails(EarningDetails earningDetails) {
        this.earningDetails = earningDetails;
    }

}

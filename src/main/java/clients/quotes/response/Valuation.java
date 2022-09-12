
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Valuation {

    @SerializedName("valuationDetails")
    @Expose
    private ValuationDetails valuationDetails;

    public ValuationDetails getValuationDetails() {
        return valuationDetails;
    }

    public void setValuationDetails(ValuationDetails valuationDetails) {
        this.valuationDetails = valuationDetails;
    }

}

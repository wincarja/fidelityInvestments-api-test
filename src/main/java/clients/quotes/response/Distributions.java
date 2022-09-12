
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Distributions {

    @SerializedName("distributionDetails")
    @Expose
    private DistributionDetails distributionDetails;

    public DistributionDetails getDistributionDetails() {
        return distributionDetails;
    }

    public void setDistributionDetails(DistributionDetails distributionDetails) {
        this.distributionDetails = distributionDetails;
    }

}

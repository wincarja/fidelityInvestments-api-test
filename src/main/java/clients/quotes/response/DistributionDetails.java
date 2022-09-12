
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DistributionDetails {

    @SerializedName("distributionDetail")
    @Expose
    private List<DistributionDetail> distributionDetail = null;

    public List<DistributionDetail> getDistributionDetail() {
        return distributionDetail;
    }

    public void setDistributionDetail(List<DistributionDetail> distributionDetail) {
        this.distributionDetail = distributionDetail;
    }

}

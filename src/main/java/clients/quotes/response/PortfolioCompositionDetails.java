
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PortfolioCompositionDetails {

    @SerializedName("portfolioCompositionDetail")
    @Expose
    private List<PortfolioCompositionDetail> portfolioCompositionDetail = null;

    public List<PortfolioCompositionDetail> getPortfolioCompositionDetail() {
        return portfolioCompositionDetail;
    }

    public void setPortfolioCompositionDetail(List<PortfolioCompositionDetail> portfolioCompositionDetail) {
        this.portfolioCompositionDetail = portfolioCompositionDetail;
    }

}

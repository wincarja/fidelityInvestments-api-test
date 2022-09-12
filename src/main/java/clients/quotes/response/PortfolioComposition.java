
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PortfolioComposition {

    @SerializedName("portfolioCompositionDetails")
    @Expose
    private PortfolioCompositionDetails portfolioCompositionDetails;

    public PortfolioCompositionDetails getPortfolioCompositionDetails() {
        return portfolioCompositionDetails;
    }

    public void setPortfolioCompositionDetails(PortfolioCompositionDetails portfolioCompositionDetails) {
        this.portfolioCompositionDetails = portfolioCompositionDetails;
    }

}

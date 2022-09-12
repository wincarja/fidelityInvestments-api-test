
package clients.market.orders.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TopTrade {

    @SerializedName("tradeDetails")
    @Expose
    private List<TradeDetail> tradeDetails = null;

    public List<TradeDetail> getTradeDetails() {
        return tradeDetails;
    }

    public void setTradeDetails(List<TradeDetail> tradeDetails) {
        this.tradeDetails = tradeDetails;
    }

}

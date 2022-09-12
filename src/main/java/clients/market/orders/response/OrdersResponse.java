
package clients.market.orders.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OrdersResponse {

    @SerializedName("topTrade")
    @Expose
    private TopTrade topTrade;

    public TopTrade getTopTrade() {
        return topTrade;
    }

    public void setTopTrade(TopTrade topTrade) {
        this.topTrade = topTrade;
    }

}

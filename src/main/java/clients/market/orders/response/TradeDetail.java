
package clients.market.orders.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TradeDetail {

    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("totalOrderQty")
    @Expose
    private Integer totalOrderQty;
    @SerializedName("totalBuyOrderQty")
    @Expose
    private Integer totalBuyOrderQty;
    @SerializedName("buysPct")
    @Expose
    private Double buysPct;
    @SerializedName("sellsPct")
    @Expose
    private Double sellsPct;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("todaysChgPct")
    @Expose
    private Double todaysChgPct;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getTotalOrderQty() {
        return totalOrderQty;
    }

    public void setTotalOrderQty(Integer totalOrderQty) {
        this.totalOrderQty = totalOrderQty;
    }

    public Integer getTotalBuyOrderQty() {
        return totalBuyOrderQty;
    }

    public void setTotalBuyOrderQty(Integer totalBuyOrderQty) {
        this.totalBuyOrderQty = totalBuyOrderQty;
    }

    public Double getBuysPct() {
        return buysPct;
    }

    public void setBuysPct(Double buysPct) {
        this.buysPct = buysPct;
    }

    public Double getSellsPct() {
        return sellsPct;
    }

    public void setSellsPct(Double sellsPct) {
        this.sellsPct = sellsPct;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTodaysChgPct() {
        return todaysChgPct;
    }

    public void setTodaysChgPct(Double todaysChgPct) {
        this.todaysChgPct = todaysChgPct;
    }

}

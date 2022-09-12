
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquityDetail {

    @SerializedName("priceToBookTTM")
    @Expose
    private Double priceToBookTTM;
    @SerializedName("priceToSalesTTM")
    @Expose
    private Double priceToSalesTTM;

    public Double getPriceToBookTTM() {
        return priceToBookTTM;
    }

    public void setPriceToBookTTM(Double priceToBookTTM) {
        this.priceToBookTTM = priceToBookTTM;
    }

    public Double getPriceToSalesTTM() {
        return priceToSalesTTM;
    }

    public void setPriceToSalesTTM(Double priceToSalesTTM) {
        this.priceToSalesTTM = priceToSalesTTM;
    }

}

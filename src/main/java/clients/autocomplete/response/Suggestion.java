
package clients.autocomplete.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("cusip")
    @Expose
    private String cusip;
    @SerializedName("url")
    @Expose
    private String url;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

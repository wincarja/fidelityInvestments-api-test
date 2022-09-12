
package clients.autocomplete.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AutoCompleteResponse {

    @SerializedName("quotes")
    @Expose
    private Quotes quotes;
    @SerializedName("keywords")
    @Expose
    private Keywords keywords;
    @SerializedName("exception")
    @Expose
    private List<Object> exception = null;

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    public List<Object> getException() {
        return exception;
    }

    public void setException(List<Object> exception) {
        this.exception = exception;
    }

}


package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketSentiment {

    @SerializedName("sentimentDetails")
    @Expose
    private List<SentimentDetail> sentimentDetails = null;

    public List<SentimentDetail> getSentimentDetails() {
        return sentimentDetails;
    }

    public void setSentimentDetails(List<SentimentDetail> sentimentDetails) {
        this.sentimentDetails = sentimentDetails;
    }

}


package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsensusHistDetail {

    @SerializedName("numAnalysts")
    @Expose
    private Integer numAnalysts;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("ratingText")
    @Expose
    private String ratingText;
    @SerializedName("startDate")
    @Expose
    private String startDate;

    public Integer getNumAnalysts() {
        return numAnalysts;
    }

    public void setNumAnalysts(Integer numAnalysts) {
        this.numAnalysts = numAnalysts;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}

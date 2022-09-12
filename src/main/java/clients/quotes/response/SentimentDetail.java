
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SentimentDetail {

    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("shortTermDirection")
    @Expose
    private String shortTermDirection;
    @SerializedName("shortTermScore")
    @Expose
    private Integer shortTermScore;
    @SerializedName("intermediateTermDirection")
    @Expose
    private String intermediateTermDirection;
    @SerializedName("intermediateTermScore")
    @Expose
    private Integer intermediateTermScore;
    @SerializedName("longTermDirection")
    @Expose
    private String longTermDirection;
    @SerializedName("longTermScore")
    @Expose
    private Integer longTermScore;
    @SerializedName("addlInfoLink")
    @Expose
    private String addlInfoLink;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getShortTermDirection() {
        return shortTermDirection;
    }

    public void setShortTermDirection(String shortTermDirection) {
        this.shortTermDirection = shortTermDirection;
    }

    public Integer getShortTermScore() {
        return shortTermScore;
    }

    public void setShortTermScore(Integer shortTermScore) {
        this.shortTermScore = shortTermScore;
    }

    public String getIntermediateTermDirection() {
        return intermediateTermDirection;
    }

    public void setIntermediateTermDirection(String intermediateTermDirection) {
        this.intermediateTermDirection = intermediateTermDirection;
    }

    public Integer getIntermediateTermScore() {
        return intermediateTermScore;
    }

    public void setIntermediateTermScore(Integer intermediateTermScore) {
        this.intermediateTermScore = intermediateTermScore;
    }

    public String getLongTermDirection() {
        return longTermDirection;
    }

    public void setLongTermDirection(String longTermDirection) {
        this.longTermDirection = longTermDirection;
    }

    public Integer getLongTermScore() {
        return longTermScore;
    }

    public void setLongTermScore(Integer longTermScore) {
        this.longTermScore = longTermScore;
    }

    public String getAddlInfoLink() {
        return addlInfoLink;
    }

    public void setAddlInfoLink(String addlInfoLink) {
        this.addlInfoLink = addlInfoLink;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

}


package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquitySummDetail {

    @SerializedName("scoreDate")
    @Expose
    private String scoreDate;
    @SerializedName("scoreNumFirms")
    @Expose
    private Integer scoreNumFirms;
    @SerializedName("consensusHistDetails")
    @Expose
    private ConsensusHistDetails consensusHistDetails;
    @SerializedName("priorScoreHistDetails")
    @Expose
    private PriorScoreHistDetails priorScoreHistDetails;

    public String getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(String scoreDate) {
        this.scoreDate = scoreDate;
    }

    public Integer getScoreNumFirms() {
        return scoreNumFirms;
    }

    public void setScoreNumFirms(Integer scoreNumFirms) {
        this.scoreNumFirms = scoreNumFirms;
    }

    public ConsensusHistDetails getConsensusHistDetails() {
        return consensusHistDetails;
    }

    public void setConsensusHistDetails(ConsensusHistDetails consensusHistDetails) {
        this.consensusHistDetails = consensusHistDetails;
    }

    public PriorScoreHistDetails getPriorScoreHistDetails() {
        return priorScoreHistDetails;
    }

    public void setPriorScoreHistDetails(PriorScoreHistDetails priorScoreHistDetails) {
        this.priorScoreHistDetails = priorScoreHistDetails;
    }

}

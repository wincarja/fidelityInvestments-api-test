
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConsensusHistDetails {

    @SerializedName("consensusHistDetail")
    @Expose
    private List<ConsensusHistDetail> consensusHistDetail = null;

    public List<ConsensusHistDetail> getConsensusHistDetail() {
        return consensusHistDetail;
    }

    public void setConsensusHistDetail(List<ConsensusHistDetail> consensusHistDetail) {
        this.consensusHistDetail = consensusHistDetail;
    }

}

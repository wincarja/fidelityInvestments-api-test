
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriorScoreHistDetails {

    @SerializedName("priorScoreHistDetail")
    @Expose
    private List<PriorScoreHistDetail> priorScoreHistDetail = null;

    public List<PriorScoreHistDetail> getPriorScoreHistDetail() {
        return priorScoreHistDetail;
    }

    public void setPriorScoreHistDetail(List<PriorScoreHistDetail> priorScoreHistDetail) {
        this.priorScoreHistDetail = priorScoreHistDetail;
    }

}

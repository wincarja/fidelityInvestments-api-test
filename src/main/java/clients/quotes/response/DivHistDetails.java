
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DivHistDetails {

    @SerializedName("divHistDetail")
    @Expose
    private List<DivHistDetail> divHistDetail = null;

    public List<DivHistDetail> getDivHistDetail() {
        return divHistDetail;
    }

    public void setDivHistDetail(List<DivHistDetail> divHistDetail) {
        this.divHistDetail = divHistDetail;
    }

}


package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnalystOpinionDetails {

    @SerializedName("analystOpinionDetail")
    @Expose
    private List<AnalystOpinionDetail> analystOpinionDetail = null;

    public List<AnalystOpinionDetail> getAnalystOpinionDetail() {
        return analystOpinionDetail;
    }

    public void setAnalystOpinionDetail(List<AnalystOpinionDetail> analystOpinionDetail) {
        this.analystOpinionDetail = analystOpinionDetail;
    }

}


package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QtrHistDetails {

    @SerializedName("qtrHistDetail")
    @Expose
    private List<QtrHistDetail> qtrHistDetail = null;

    public List<QtrHistDetail> getQtrHistDetail() {
        return qtrHistDetail;
    }

    public void setQtrHistDetail(List<QtrHistDetail> qtrHistDetail) {
        this.qtrHistDetail = qtrHistDetail;
    }

}

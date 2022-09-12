
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnnHistDetails {

    @SerializedName("annHistDetail")
    @Expose
    private List<AnnHistDetail> annHistDetail = null;

    public List<AnnHistDetail> getAnnHistDetail() {
        return annHistDetail;
    }

    public void setAnnHistDetail(List<AnnHistDetail> annHistDetail) {
        this.annHistDetail = annHistDetail;
    }

}

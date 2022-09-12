
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicFactDetails {

    @SerializedName("basicFactDetail")
    @Expose
    private List<BasicFactDetail> basicFactDetail = null;

    public List<BasicFactDetail> getBasicFactDetail() {
        return basicFactDetail;
    }

    public void setBasicFactDetail(List<BasicFactDetail> basicFactDetail) {
        this.basicFactDetail = basicFactDetail;
    }

}


package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OwnershipDetails {

    @SerializedName("ownershipDetail")
    @Expose
    private List<OwnershipDetail> ownershipDetail = null;

    public List<OwnershipDetail> getOwnershipDetail() {
        return ownershipDetail;
    }

    public void setOwnershipDetail(List<OwnershipDetail> ownershipDetail) {
        this.ownershipDetail = ownershipDetail;
    }

}

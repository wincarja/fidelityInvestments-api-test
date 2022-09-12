
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsPerformance {

    @SerializedName("returnsPerfDetails")
    @Expose
    private ReturnsPerfDetails returnsPerfDetails;

    public ReturnsPerfDetails getReturnsPerfDetails() {
        return returnsPerfDetails;
    }

    public void setReturnsPerfDetails(ReturnsPerfDetails returnsPerfDetails) {
        this.returnsPerfDetails = returnsPerfDetails;
    }

}

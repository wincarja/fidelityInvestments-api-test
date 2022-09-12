
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ownership {

    @SerializedName("ownershipDetails")
    @Expose
    private OwnershipDetails ownershipDetails;

    public OwnershipDetails getOwnershipDetails() {
        return ownershipDetails;
    }

    public void setOwnershipDetails(OwnershipDetails ownershipDetails) {
        this.ownershipDetails = ownershipDetails;
    }

}

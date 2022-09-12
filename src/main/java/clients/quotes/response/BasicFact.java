
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasicFact {

    @SerializedName("basicFactDetails")
    @Expose
    private BasicFactDetails basicFactDetails;

    public BasicFactDetails getBasicFactDetails() {
        return basicFactDetails;
    }

    public void setBasicFactDetails(BasicFactDetails basicFactDetails) {
        this.basicFactDetails = basicFactDetails;
    }

}


package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AnalystOpinion {

    @SerializedName("analystOpinionDetails")
    @Expose
    private AnalystOpinionDetails analystOpinionDetails;
    @SerializedName("disclosure")
    @Expose
    private String disclosure;

    public AnalystOpinionDetails getAnalystOpinionDetails() {
        return analystOpinionDetails;
    }

    public void setAnalystOpinionDetails(AnalystOpinionDetails analystOpinionDetails) {
        this.analystOpinionDetails = analystOpinionDetails;
    }

    public String getDisclosure() {
        return disclosure;
    }

    public void setDisclosure(String disclosure) {
        this.disclosure = disclosure;
    }

}

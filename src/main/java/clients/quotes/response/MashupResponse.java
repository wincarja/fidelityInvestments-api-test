
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MashupResponse {

    @SerializedName("mashup")
    @Expose
    private Mashup mashup;

    public Mashup getMashup() {
        return mashup;
    }

    public void setMashup(Mashup mashup) {
        this.mashup = mashup;
    }

}

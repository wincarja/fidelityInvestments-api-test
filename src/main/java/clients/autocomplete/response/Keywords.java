
package clients.autocomplete.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Keywords {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("suggestions")
    @Expose
    private List<Object> suggestions = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Object> suggestions) {
        this.suggestions = suggestions;
    }

}

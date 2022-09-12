
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PortfolioCompositionDetail {

    @SerializedName("sysMsgs")
    @Expose
    private SysMsgs sysMsgs;

    public SysMsgs getSysMsgs() {
        return sysMsgs;
    }

    public void setSysMsgs(SysMsgs sysMsgs) {
        this.sysMsgs = sysMsgs;
    }

}

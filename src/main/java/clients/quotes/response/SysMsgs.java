
package clients.quotes.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SysMsgs {

    @SerializedName("sysMsg")
    @Expose
    private List<SysMsg> sysMsg = null;

    public List<SysMsg> getSysMsg() {
        return sysMsg;
    }

    public void setSysMsg(List<SysMsg> sysMsg) {
        this.sysMsg = sysMsg;
    }

}

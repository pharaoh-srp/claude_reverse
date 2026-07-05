package defpackage;

import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface mtc {
    String getBody();

    default boolean hasSources() {
        if (this instanceof itc) {
            if (!((itc) this).c.isEmpty()) {
                return true;
            }
        } else if (this instanceof htc) {
            List list = ((htc) this).d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ToolResultContent) it.next()) instanceof ToolResultKnowledge) {
                        return true;
                    }
                }
            }
        } else if (this instanceof ParsedContentBlock$McpToolInvocation) {
            ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) this;
            if ((parsedContentBlock$McpToolInvocation.getOutputDisplayContent() instanceof RichItemsDisplayContent) || (parsedContentBlock$McpToolInvocation.getOutputDisplayContent() instanceof RichLinkDisplayContent)) {
                return true;
            }
        } else {
            if (!(this instanceof btc)) {
                if ((this instanceof zsc) || (this instanceof ysc) || (this instanceof ParsedContentBlock$Thinking) || (this instanceof atc) || (this instanceof gtc) || (this instanceof ftc) || (this instanceof ctc) || (this instanceof ltc)) {
                    return false;
                }
                wg6.i();
                return false;
            }
            btc btcVar = (btc) this;
            if (!btcVar.a.isEmpty() || !btcVar.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: isComplete */
    default boolean getIsComplete() {
        return true;
    }
}

package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import com.anthropic.claude.types.strings.McpToolKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e05 {
    public static final iqb a = b.v(fqb.E, 96.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput r17, final com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem r18, final boolean r19, final defpackage.bz7 r20, final defpackage.bz7 r21, defpackage.iqb r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e05.a(com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput, com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem, boolean, bz7, bz7, iqb, ld4, int, int):void");
    }

    public static final McpServer b(List list, ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem) {
        Object next;
        list.getClass();
        conwaySuggestConnectorsOutputConnectorsItem.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((McpServer) next).m346getUuidowoRr7k(), conwaySuggestConnectorsOutputConnectorsItem.getInstalledServerId())) {
                break;
            }
        }
        McpServer mcpServer = (McpServer) next;
        return mcpServer == null ? xvk.f(conwaySuggestConnectorsOutputConnectorsItem.getUrl(), list) : mcpServer;
    }

    public static final boolean c(McpServer mcpServer, Map map) {
        mcpServer.getClass();
        map.getClass();
        ArrayList<McpTool> arrayListF = qok.f(mcpServer);
        if (!arrayListF.isEmpty() && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (qok.j((McpTool) it.next())) {
                    if (arrayListF.isEmpty()) {
                        return true;
                    }
                    for (McpTool mcpTool : arrayListF) {
                        if (qok.j(mcpTool)) {
                            String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
                            if (!(strM352getEnabled_keyA4OzCrU != null ? x44.r((Boolean) map.get(McpToolKey.m1043boximpl(McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU).m1050unboximpl())), Boolean.FALSE) : false) && qok.q(mcpTool, map) != z4b.E) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

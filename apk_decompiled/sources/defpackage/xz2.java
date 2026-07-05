package defpackage;

import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpServer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xz2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f03 F;

    public /* synthetic */ xz2(f03 f03Var, int i) {
        this.E = i;
        this.F = f03Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        List<McpPrompt> prompts;
        int i = this.E;
        f03 f03Var = this.F;
        switch (i) {
            case 0:
                List listF = f03Var.k.f();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    McpServer mcpServer = (McpServer) obj;
                    if (x44.r(mcpServer.getConnected(), Boolean.TRUE) && (((prompts = mcpServer.getPrompts()) != null && (!prompts.isEmpty())) || !qok.i(mcpServer).isEmpty())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                lqa lqaVar = new lqa();
                Iterator it = f03Var.x.F.iterator();
                while (((hmg) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((hmg) it).next();
                    lqaVar.put((String) entry.getKey(), ((y2b) entry.getValue()).a());
                }
                return lqaVar.c();
            default:
                return f03Var.P();
        }
    }
}

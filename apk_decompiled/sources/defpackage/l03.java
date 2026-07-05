package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l03 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ McpServer F;

    public /* synthetic */ l03(McpServer mcpServer, int i) {
        this.E = i;
        this.F = mcpServer;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        McpServer mcpServer = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    k4g.a.b(mcpServer.getName(), null, e18Var, 384);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    wtk.d(mcpServer.getIconUrl(), mcpServer.getName(), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 0, 60);
                }
                break;
        }
        return ieiVar;
    }
}

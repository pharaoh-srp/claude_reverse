package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pe implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f03 F;
    public final /* synthetic */ String G;

    public /* synthetic */ pe(f03 f03Var, String str, int i) {
        this.E = i;
        this.F = f03Var;
        this.G = str;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        f03 f03Var = this.F;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                f03 f03Var2 = this.F;
                gb9.D(f03Var2.a, null, null, new d03(f03Var2, this.G, zBooleanValue, null, 0), 3);
                return ieiVar;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                f03 f03Var3 = this.F;
                gb9.D(f03Var3.a, null, null, new d03(f03Var3, this.G, zBooleanValue2, null, 1), 3);
                return ieiVar;
            case 2:
                McpTool mcpTool = (McpTool) obj;
                mcpTool.getClass();
                return f03Var.i.E.k(str, mcpTool);
            case 3:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                String strM346getUuidowoRr7k = mcpServer.m346getUuidowoRr7k();
                strM346getUuidowoRr7k.getClass();
                return Integer.valueOf(f03Var.i.E.f(str, strM346getUuidowoRr7k));
            default:
                McpTool mcpTool2 = (McpTool) obj;
                mcpTool2.getClass();
                return f03Var.i.E.k(str, mcpTool2);
        }
    }
}

package defpackage;

import com.anthropic.claude.api.mcp.McpServer;

/* JADX INFO: loaded from: classes3.dex */
public final class s3b implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ McpServer G;

    public /* synthetic */ s3b(bz7 bz7Var, McpServer mcpServer, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = mcpServer;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        McpServer mcpServer = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(mcpServer);
                break;
            default:
                bz7Var.invoke(mcpServer);
                break;
        }
        return ieiVar;
    }
}

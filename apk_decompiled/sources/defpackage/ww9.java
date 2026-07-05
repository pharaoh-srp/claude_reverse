package defpackage;

import com.anthropic.claude.api.mcp.McpServer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ww9 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;

    public /* synthetic */ ww9(int i, bz7 bz7Var) {
        this.E = 3;
        this.F = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                return (za8) bz7Var.invoke((hx9) obj);
            case 1:
                McpServer mcpServer = (McpServer) obj;
                o3b o3bVar = (o3b) obj2;
                mcpServer.getClass();
                o3bVar.getClass();
                int iOrdinal = o3bVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return dpk.a;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return dpk.b;
                    }
                    wg6.i();
                    return null;
                }
                int iIntValue = ((Number) bz7Var.invoke(mcpServer)).intValue();
                if (iIntValue > 0) {
                    return new ta4(-266867590, true, new gq0(iIntValue, 7, (byte) 0));
                }
                return null;
            case 2:
                ((Integer) obj).getClass();
                McpServer mcpServer2 = (McpServer) obj2;
                mcpServer2.getClass();
                return bz7Var.invoke(mcpServer2);
            default:
                ((Integer) obj2).getClass();
                cjk.h(bz7Var, (ld4) obj, x44.p0(1));
                return iei.a;
        }
    }

    public /* synthetic */ ww9(bz7 bz7Var, int i, byte b) {
        this.E = i;
        this.F = bz7Var;
    }
}

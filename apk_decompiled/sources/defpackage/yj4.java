package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServer;

/* JADX INFO: loaded from: classes2.dex */
public final class yj4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ DirectoryServer G;

    public /* synthetic */ yj4(bz7 bz7Var, DirectoryServer directoryServer, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = directoryServer;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        DirectoryServer directoryServer = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(directoryServer);
                break;
            default:
                bz7Var.invoke(directoryServer);
                break;
        }
        return ieiVar;
    }
}

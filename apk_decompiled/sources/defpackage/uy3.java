package defpackage;

import android.content.Context;
import com.anthropic.claude.api.mcp.DirectoryServer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uy3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uj4 F;
    public final /* synthetic */ hi4 G;
    public final /* synthetic */ Context H;

    public /* synthetic */ uy3(uj4 uj4Var, hi4 hi4Var, Context context, int i) {
        this.E = i;
        this.F = uj4Var;
        this.G = hi4Var;
        this.H = context;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.H;
        hi4 hi4Var = this.G;
        uj4 uj4Var = this.F;
        DirectoryServer directoryServer = (DirectoryServer) obj;
        switch (i) {
            case 0:
                directoryServer.getClass();
                int iOrdinal = uj4Var.O(directoryServer).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                wg6.i();
                                break;
                            }
                        }
                    }
                }
                uj4Var.P(directoryServer, hi4Var, context);
                break;
            default:
                directoryServer.getClass();
                uj4Var.P(directoryServer, hi4Var, context);
                break;
        }
        return ieiVar;
    }
}

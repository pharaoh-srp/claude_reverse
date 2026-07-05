package defpackage;

import io.sentry.g;
import io.sentry.h6;
import io.sentry.n0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kmf implements h6 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lmf F;

    public /* synthetic */ kmf(lmf lmfVar, int i) {
        this.E = i;
        this.F = lmfVar;
    }

    @Override // io.sentry.h6
    public final g i(g gVar, n0 n0Var) {
        int i = this.E;
        lmf lmfVar = this.F;
        switch (i) {
            case 0:
                gVar.getClass();
                if (lmfVar.a.get()) {
                    return gVar;
                }
                return null;
            default:
                gVar.getClass();
                g gVarI = lmfVar.d.i(gVar, n0Var);
                if (gVarI == null) {
                    return null;
                }
                qmf.E.i(gVarI, n0Var);
                return gVarI;
        }
    }
}

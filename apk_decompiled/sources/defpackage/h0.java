package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i0 F;

    public /* synthetic */ h0(i0 i0Var, int i) {
        this.E = i;
        this.F = i0Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        i0 i0Var = this.F;
        switch (i) {
            case 0:
                fab fabVarL0 = i0Var.l0();
                g0 g0Var = new g0(0, this);
                ku6 ku6Var = fbi.a;
                if (nu6.f(i0Var)) {
                    return nu6.c(mu6.UNABLE_TO_SUBSTITUTE_TYPE, i0Var.toString());
                }
                u9i u9iVarP = i0Var.p();
                if (u9iVarP == null) {
                    fbi.a(12);
                    throw null;
                }
                if (fabVarL0 == null) {
                    fbi.a(13);
                    throw null;
                }
                List listD = fbi.d(u9iVarP.getParameters());
                r9i.F.getClass();
                return yfd.e0(r9i.G, u9iVarP, listD, false, fabVarL0, g0Var);
            case 1:
                return new x39(i0Var.l0());
            default:
                return new mw9(i0Var);
        }
    }
}

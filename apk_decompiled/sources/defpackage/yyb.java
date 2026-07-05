package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yyb implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nf6 F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ yyb(nf6 nf6Var, boolean z, int i) {
        this.E = i;
        this.F = nf6Var;
        this.G = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z = this.G;
        nf6 nf6Var = this.F;
        xre xreVar = (xre) obj;
        switch (i) {
            case 0:
                float f2 = gzb.f(xreVar, nf6Var);
                xreVar.l(f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 1.0f : gzb.g(xreVar, nf6Var) / f2);
                xreVar.u(yb5.e(z ? 0.0f : 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier));
                break;
            default:
                xreVar.l(gzb.f(xreVar, nf6Var));
                xreVar.m(gzb.g(xreVar, nf6Var));
                if (z) {
                    f = 1.0f;
                }
                xreVar.u(yb5.e(f, 0.5f));
                break;
        }
        return ieiVar;
    }
}

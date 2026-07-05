package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xyb implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ to7 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;

    public /* synthetic */ xyb(to7 to7Var, float f, boolean z, int i) {
        this.E = i;
        this.F = to7Var;
        this.G = f;
        this.H = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z = this.H;
        float f2 = this.G;
        to7 to7Var = this.F;
        xre xreVar = (xre) obj;
        switch (i) {
            case 0:
                float fA = to7Var.a();
                xreVar.l(fA > MTTypesetterKt.kLineSkipLimitMultiplier ? 1.0f / ((fA / f2) + 1.0f) : 1.0f);
                xreVar.u(yb5.e(z ? 0.0f : 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier));
                break;
            default:
                float fA2 = to7Var.a();
                xreVar.l(fA2 > MTTypesetterKt.kLineSkipLimitMultiplier ? (fA2 / f2) + 1.0f : 1.0f);
                if (!z) {
                    f = 1.0f;
                }
                xreVar.u(yb5.e(f, 0.5f));
                break;
        }
        return ieiVar;
    }
}

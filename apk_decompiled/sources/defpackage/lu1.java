package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class lu1 implements bz7 {
    public final /* synthetic */ l9e E;
    public final /* synthetic */ elc F;
    public final /* synthetic */ eeg G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ c40 J;

    public lu1(l9e l9eVar, elc elcVar, eeg eegVar, float f, float f2, c40 c40Var) {
        this.E = l9eVar;
        this.F = elcVar;
        this.G = eegVar;
        this.H = f;
        this.I = f2;
        this.J = c40Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        eeg eegVar = this.G;
        xd6 xd6Var = (xd6) obj;
        float f = this.I;
        elc elcVar = this.F;
        l9e l9eVar = this.E;
        float f2 = -l9eVar.a;
        float f3 = -l9eVar.b;
        ((efe) xd6Var.B0().E).G(f2, f3);
        try {
            xd6.Y0(xd6Var, elcVar.k, eegVar, MTTypesetterKt.kLineSkipLimitMultiplier, new ksg((this.H + f) * 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), null, 0, 52);
            xd6.Y0(xd6Var, elcVar.k, eegVar, MTTypesetterKt.kLineSkipLimitMultiplier, new ksg(f * 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), null, 0, 20);
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (xd6Var.g() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (xd6Var.g() >> 32));
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L));
            long jP0 = xd6Var.P0();
            fj0 fj0VarB0 = xd6Var.B0();
            long jW = fj0VarB0.w();
            fj0VarB0.p().g();
            try {
                ((efe) fj0VarB0.E).C(jP0, fIntBitsToFloat, fIntBitsToFloat2);
                xd6.Y0(xd6Var, this.J, eegVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 28);
                ((efe) xd6Var.B0().E).G(-f2, -f3);
                return iei.a;
            } finally {
                fj0VarB0.p().p();
                fj0VarB0.N(jW);
            }
        } catch (Throwable th) {
            ((efe) xd6Var.B0().E).G(-f2, -f3);
            throw th;
        }
    }
}

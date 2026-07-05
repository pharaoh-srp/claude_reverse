package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class uma implements wlg {
    public final lsc E;
    public final lsc F;
    public final lsc G;
    public final lsc H;
    public final lsc I;
    public final lsc J;
    public final lsc K;
    public final wz5 L;
    public final lsc M;
    public final lsc N;
    public final lsc O;
    public final lsc P;
    public final wz5 Q;
    public final fxb R;

    public uma() {
        Boolean bool = Boolean.FALSE;
        this.E = mpk.P(bool);
        this.F = mpk.P(1);
        this.G = mpk.P(1);
        this.H = mpk.P(bool);
        this.I = mpk.P(null);
        this.J = mpk.P(Float.valueOf(1.0f));
        this.K = mpk.P(bool);
        this.L = mpk.w(new sma(this, 1));
        this.M = mpk.P(null);
        Float fValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.N = mpk.P(fValueOf);
        this.O = mpk.P(fValueOf);
        this.P = mpk.P(Long.MIN_VALUE);
        this.Q = mpk.w(new sma(this, 0));
        mpk.w(new sma(this, 2));
        this.R = new fxb();
    }

    public static final boolean a(uma umaVar, int i, long j) {
        lsc lscVar = umaVar.M;
        lsc lscVar2 = umaVar.N;
        lsc lscVar3 = umaVar.I;
        wz5 wz5Var = umaVar.L;
        lsc lscVar4 = umaVar.P;
        bna bnaVar = (bna) lscVar.getValue();
        if (bnaVar == null) {
            return true;
        }
        long jLongValue = ((Number) lscVar4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) lscVar4.getValue()).longValue();
        lscVar4.setValue(Long.valueOf(j));
        ana anaVar = (ana) lscVar3.getValue();
        float f = anaVar != null ? anaVar.a : 0.0f;
        ana anaVar2 = (ana) lscVar3.getValue();
        float f2 = anaVar2 != null ? anaVar2.b : 1.0f;
        float fFloatValue = ((Number) wz5Var.getValue()).floatValue() * ((jLongValue / 1000000) / bnaVar.b());
        float fFloatValue2 = ((Number) wz5Var.getValue()).floatValue() < MTTypesetterKt.kLineSkipLimitMultiplier ? f - (((Number) lscVar2.getValue()).floatValue() + fFloatValue) : (((Number) lscVar2.getValue()).floatValue() + fFloatValue) - f2;
        if (f == f2) {
            umaVar.i(f);
            return false;
        }
        if (fFloatValue2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            umaVar.i(wd6.d0(((Number) lscVar2.getValue()).floatValue(), f, f2) + fFloatValue);
            return true;
        }
        float f3 = f2 - f;
        int i2 = (int) (fFloatValue2 / f3);
        int i3 = i2 + 1;
        if (umaVar.f() + i3 > i) {
            umaVar.i(umaVar.e());
            umaVar.h(i);
            return false;
        }
        umaVar.h(umaVar.f() + i3);
        float f4 = fFloatValue2 - (i2 * f3);
        umaVar.i(((Number) wz5Var.getValue()).floatValue() < MTTypesetterKt.kLineSkipLimitMultiplier ? f2 - f4 : f + f4);
        return true;
    }

    public static final void d(uma umaVar, boolean z) {
        umaVar.E.setValue(Boolean.valueOf(z));
    }

    public final float e() {
        return ((Number) this.Q.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.F.getValue()).intValue();
    }

    public final float g() {
        return ((Number) this.O.getValue()).floatValue();
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(int i) {
        this.F.setValue(Integer.valueOf(i));
    }

    public final void i(float f) {
        bna bnaVar;
        this.N.setValue(Float.valueOf(f));
        if (((Boolean) this.K.getValue()).booleanValue() && (bnaVar = (bna) this.M.getValue()) != null) {
            f -= f % (1.0f / bnaVar.n);
        }
        this.O.setValue(Float.valueOf(f));
    }
}

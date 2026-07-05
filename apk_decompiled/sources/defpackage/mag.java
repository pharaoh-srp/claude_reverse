package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mag implements pd6 {
    public final int a;
    public zy7 b;
    public final fq3 c;
    public final hsc d;
    public bz7 e;
    public final boolean f = true;
    public final float[] g;
    public final isc h;
    public final isc i;
    public boolean j;
    public final isc k;
    public final isc l;
    public final ukc m;
    public final lsc n;
    public final pza o;
    public final hsc p;
    public final hsc q;
    public final wq5 r;
    public final fxb s;

    public mag(float f, int i, zy7 zy7Var, fq3 fq3Var) {
        float[] fArr;
        this.a = i;
        this.b = zy7Var;
        this.c = fq3Var;
        this.d = new hsc(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = new isc(0);
        this.i = new isc(0);
        this.k = new isc(0);
        this.l = new isc(0);
        this.m = ukc.F;
        this.n = mpk.P(Boolean.FALSE);
        this.o = new pza(24, this);
        fq3 fq3Var2 = this.c;
        float fFloatValue = Float.valueOf(fq3Var2.E).floatValue();
        float fFloatValue2 = Float.valueOf(fq3Var2.F).floatValue() - fFloatValue;
        this.p = new hsc(d4c.W(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, wd6.d0(fFloatValue2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : (f - fFloatValue) / fFloatValue2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f)));
        this.q = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.r = new wq5(this, 1);
        this.s = new fxb();
    }

    @Override // defpackage.pd6
    public final Object a(t74 t74Var, sc6 sc6Var) {
        Object objN = fd9.N(new o6e(this, t74Var, null, 21), sc6Var);
        return objN == m45.E ? objN : iei.a;
    }

    public final void b(float f) {
        float fMax;
        float fMin;
        if (this.m == ukc.E) {
            float fH = this.i.h();
            isc iscVar = this.l;
            fMax = Math.max(fH - (iscVar.h() / 2.0f), MTTypesetterKt.kLineSkipLimitMultiplier);
            fMin = Math.min(iscVar.h() / 2.0f, fMax);
        } else {
            float fH2 = this.h.h();
            isc iscVar2 = this.k;
            fMax = Math.max(fH2 - (iscVar2.h() / 2.0f), MTTypesetterKt.kLineSkipLimitMultiplier);
            fMin = Math.min(iscVar2.h() / 2.0f, fMax);
        }
        hsc hscVar = this.p;
        float fH3 = hscVar.h() + f;
        hsc hscVar2 = this.q;
        hscVar.i(hscVar2.h() + fH3);
        hscVar2.i(MTTypesetterKt.kLineSkipLimitMultiplier);
        float f2 = lag.f(hscVar.h(), this.g, fMin, fMax);
        fq3 fq3Var = this.c;
        float f3 = fMax - fMin;
        float fW = d4c.W(Float.valueOf(fq3Var.E).floatValue(), Float.valueOf(fq3Var.F).floatValue(), wd6.d0(f3 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : (f2 - fMin) / f3, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
        if (fW == this.d.h()) {
            return;
        }
        bz7 bz7Var = this.e;
        if (bz7Var != null) {
            bz7Var.invoke(Float.valueOf(fW));
        } else {
            d(fW);
        }
    }

    public final float c() {
        fq3 fq3Var = this.c;
        float f = fq3Var.E;
        float fFloatValue = Float.valueOf(f).floatValue();
        float f2 = fq3Var.F;
        float fFloatValue2 = Float.valueOf(f2).floatValue() - fFloatValue;
        return wd6.d0(fFloatValue2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : (wd6.d0(this.d.h(), Float.valueOf(f).floatValue(), Float.valueOf(f2).floatValue()) - fFloatValue) / fFloatValue2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
    }

    public final void d(float f) {
        if (this.f) {
            fq3 fq3Var = this.c;
            float f2 = fq3Var.F;
            float f3 = fq3Var.E;
            f = lag.f(wd6.d0(f, Float.valueOf(f3).floatValue(), Float.valueOf(f2).floatValue()), this.g, Float.valueOf(f3).floatValue(), Float.valueOf(f2).floatValue());
        }
        this.d.i(f);
    }
}

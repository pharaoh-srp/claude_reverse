package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class gkj {
    public final zn5 a;
    public final a80 b;
    public final a80 c;
    public final a80 d;
    public long e;
    public long f;
    public final fnf g;

    public gkj(zn5 zn5Var) {
        this.a = zn5Var;
        a80 a80VarA = zh4.a(1.0f);
        a80VarA.i(Float.valueOf(0.9f), Float.valueOf(5.0f));
        this.b = a80VarA;
        this.c = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.d = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.e = 0L;
        this.f = 0L;
        this.g = new fnf(10);
    }

    public static final l9e a(gkj gkjVar, float f) {
        long jG = k8g.g(f, gkjVar.f);
        float fMax = Float.max(k8g.e(jG) - k8g.e(gkjVar.e), MTTypesetterKt.kLineSkipLimitMultiplier) * 0.5f;
        float fMax2 = Float.max(k8g.c(jG) - k8g.c(gkjVar.e), MTTypesetterKt.kLineSkipLimitMultiplier) * 0.5f;
        return new l9e(-fMax, -fMax2, fMax, fMax2);
    }

    public static final long b(gkj gkjVar, float f, long j, long j2) {
        long jG = k8g.g(gkjVar.c(), gkjVar.f);
        long jG2 = k8g.g(f, gkjVar.f);
        float fE = k8g.e(jG2) - k8g.e(jG);
        float fC = k8g.c(jG2) - k8g.c(jG);
        float f2 = fcc.f(j);
        a80 a80Var = gkjVar.c;
        float fE2 = ((k8g.e(jG) - k8g.e(gkjVar.e)) * 0.5f) + (f2 - ((Number) a80Var.e()).floatValue());
        float fG = fcc.g(j);
        a80 a80Var2 = gkjVar.d;
        float fC2 = ((k8g.c(jG) - k8g.c(gkjVar.e)) * 0.5f) + (fG - ((Number) a80Var2.e()).floatValue());
        float fE3 = (fE * 0.5f) - ((fE * fE2) / k8g.e(jG));
        float fC3 = (0.5f * fC) - ((fC * fC2) / k8g.c(jG));
        return hvk.b(fcc.f(j2) + ((Number) a80Var.e()).floatValue() + fE3, fcc.g(j2) + ((Number) a80Var2.e()).floatValue() + fC3);
    }

    public final float c() {
        return ((Number) this.b.e()).floatValue();
    }

    public final void d(long j) {
        this.e = j;
        if (k8g.b(j, 0L)) {
            this.f = 0L;
            return;
        }
        if (k8g.b(0L, 0L)) {
            this.f = this.e;
            return;
        }
        float fE = k8g.e(0L) / k8g.c(0L);
        float fE2 = k8g.e(this.e) / k8g.c(this.e);
        long j2 = this.e;
        this.f = fE > fE2 ? k8g.g(k8g.e(j2) / k8g.e(0L), 0L) : k8g.g(k8g.c(j2) / k8g.c(0L), 0L);
    }
}

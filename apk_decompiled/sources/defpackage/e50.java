package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e50 {
    public final a80 a;
    public final wz5 b;
    public final a80 c;
    public final wz5 d;
    public final a80 e;
    public final wz5 f;
    public final lsc g;

    public e50(za1 za1Var) {
        za1Var.getClass();
        float f = za1Var.a;
        this.a = zh4.a(f < 0.05f ? f : 1.0f);
        this.b = mpk.w(new w40(this, 0));
        this.c = zh4.a(f < 0.05f ? 0.0f : d4c.W(0.4f, 1.0f, (f - 0.05f) / 0.95f));
        this.d = mpk.w(new w40(this, 1));
        this.e = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.f = mpk.w(new w40(this, 2));
        this.g = mpk.P(za1Var.b);
    }

    public static Object a(pz7[] pz7VarArr, xzg xzgVar) {
        Object objN = fd9.N(new z40(pz7VarArr, null, 0), xzgVar);
        return objN == m45.E ? objN : iei.a;
    }

    public final float b() {
        return ((Number) this.b.getValue()).floatValue();
    }
}

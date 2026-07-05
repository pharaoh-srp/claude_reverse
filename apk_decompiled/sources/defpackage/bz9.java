package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class bz9 {
    public final l45 a;
    public final ga8 b;
    public final dg8 c;
    public kl7 d;
    public kl7 e;
    public kl7 f;
    public boolean g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public long l;
    public long m;
    public ja8 n;
    public final a80 o;
    public final a80 p;
    public final lsc q;
    public long r;

    public bz9(l45 l45Var, ga8 ga8Var, dg8 dg8Var) {
        this.a = l45Var;
        this.b = ga8Var;
        this.c = dg8Var;
        Boolean bool = Boolean.FALSE;
        this.h = mpk.P(bool);
        this.i = mpk.P(bool);
        this.j = mpk.P(bool);
        this.k = mpk.P(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = ga8Var != null ? ga8Var.c() : null;
        this.o = new a80(new y69(0L), dgj.l, null, 12);
        this.p = new a80(Float.valueOf(1.0f), dgj.f, null, 12);
        this.q = mpk.P(new y69(0L));
        this.r = 9223372034707292159L;
    }

    public final void a() {
        ja8 ja8Var = this.n;
        kl7 kl7Var = this.d;
        boolean zBooleanValue = ((Boolean) this.i.getValue()).booleanValue();
        l45 l45Var = this.a;
        tp4 tp4Var = null;
        if (zBooleanValue || kl7Var == null || ja8Var == null) {
            if (b()) {
                if (ja8Var != null) {
                    ja8Var.g(1.0f);
                }
                gb9.D(l45Var, null, null, new zy9(this, tp4Var, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            ja8Var.g(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        gb9.D(l45Var, null, null, new eq(z, this, kl7Var, ja8Var, (tp4) null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        ga8 ga8Var;
        boolean zBooleanValue = ((Boolean) this.h.getValue()).booleanValue();
        int i = 3;
        l45 l45Var = this.a;
        tp4 tp4Var = null;
        if (zBooleanValue) {
            f(false);
            gb9.D(l45Var, null, null, new zy9(this, tp4Var, 2), 3);
        }
        if (((Boolean) this.i.getValue()).booleanValue()) {
            d(false);
            gb9.D(l45Var, null, null, new zy9(this, tp4Var, i), 3);
        }
        if (b()) {
            e(false);
            gb9.D(l45Var, null, null, new zy9(this, tp4Var, 4), 3);
        }
        this.g = false;
        g(0L);
        this.l = 9223372034707292159L;
        ja8 ja8Var = this.n;
        if (ja8Var != null && (ga8Var = this.b) != null) {
            ga8Var.a(ja8Var);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.q.setValue(new y69(j));
    }
}

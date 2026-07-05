package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class m2a {
    public final lsc A;
    public final lsc B;
    public seh a;
    public final r7e b;
    public final beg c;
    public final epk d;
    public njh e;
    public final lsc f;
    public final lsc g;
    public cu9 h;
    public final lsc i;
    public zb0 j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public boolean p;
    public final lsc q;
    public final jp9 r;
    public final lsc s;
    public final lsc t;
    public bz7 u;
    public final u25 v;
    public final u25 w;
    public final u25 x;
    public final v30 y;
    public long z;

    public m2a(seh sehVar, r7e r7eVar, beg begVar) {
        this.a = sehVar;
        this.b = r7eVar;
        this.c = begVar;
        epk epkVar = new epk();
        zb0 zb0Var = ac0.a;
        long j = kkh.b;
        cjh cjhVar = new cjh(zb0Var, j, (kkh) null);
        epkVar.E = cjhVar;
        epkVar.F = new lj6(zb0Var, cjhVar.b);
        this.d = epkVar;
        Boolean bool = Boolean.FALSE;
        this.f = mpk.P(bool);
        this.g = mpk.P(new va6(MTTypesetterKt.kLineSkipLimitMultiplier));
        this.i = mpk.P(null);
        this.k = mpk.P(we8.E);
        this.l = mpk.P(bool);
        this.m = mpk.P(bool);
        this.n = mpk.P(bool);
        this.o = mpk.P(bool);
        this.p = true;
        this.q = mpk.P(Boolean.TRUE);
        this.r = new jp9(begVar);
        this.s = mpk.P(bool);
        this.t = mpk.P(bool);
        this.u = new fg7(27);
        this.v = new u25(this, 1);
        this.w = new u25(this, 2);
        this.x = new u25(this, 3);
        this.y = dch.j();
        this.z = d54.h;
        this.A = mpk.P(new kkh(j));
        this.B = mpk.P(new kkh(j));
    }

    public final we8 a() {
        return (we8) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final cu9 c() {
        cu9 cu9Var = this.h;
        if (cu9Var == null || !cu9Var.n()) {
            return null;
        }
        return cu9Var;
    }

    public final zjh d() {
        return (zjh) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new kkh(j));
    }

    public final void f(long j) {
        this.A.setValue(new kkh(j));
    }
}

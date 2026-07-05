package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h6i extends rcg {
    public final rcg e;
    public final boolean f;
    public final boolean g;
    public bz7 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6i(rcg rcgVar, bz7 bz7Var, boolean z, boolean z2) {
        bz7 bz7VarE;
        super(0L, wcg.I);
        a6f a6fVar = ycg.a;
        this.e = rcgVar;
        this.f = z;
        this.g = z2;
        this.h = ycg.k(bz7Var, (rcgVar == null || (bz7VarE = rcgVar.e()) == null) ? ycg.j.e : bz7VarE, z);
        this.i = zni.q();
    }

    @Override // defpackage.rcg
    public final void c() {
        rcg rcgVar;
        this.c = true;
        if (!this.g || (rcgVar = this.e) == null) {
            return;
        }
        rcgVar.c();
    }

    @Override // defpackage.rcg
    public final wcg d() {
        return v().d();
    }

    @Override // defpackage.rcg
    public final bz7 e() {
        return this.h;
    }

    @Override // defpackage.rcg
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.rcg
    public final long g() {
        return v().g();
    }

    @Override // defpackage.rcg
    public final bz7 i() {
        return null;
    }

    @Override // defpackage.rcg
    public final void k() {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.rcg
    public final void l() {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.rcg
    public final void m() {
        v().m();
    }

    @Override // defpackage.rcg
    public final void n(img imgVar) {
        v().n(imgVar);
    }

    @Override // defpackage.rcg
    public final rcg u(bz7 bz7Var) {
        bz7 bz7VarK = ycg.k(bz7Var, this.h, true);
        return !this.f ? ycg.g(v().u(null), bz7VarK, true) : v().u(bz7VarK);
    }

    public final rcg v() {
        rcg rcgVar = this.e;
        return rcgVar == null ? ycg.j : rcgVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g6i extends kwb {
    public final kwb o;
    public final boolean p;
    public final boolean q;
    public bz7 r;
    public bz7 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public g6i(kwb kwbVar, bz7 bz7Var, bz7 bz7Var2, boolean z, boolean z2) {
        bz7 bz7VarI;
        bz7 bz7VarY;
        a6f a6fVar = ycg.a;
        super(0L, wcg.I, ycg.k(bz7Var, (kwbVar == null || (bz7VarY = kwbVar.e()) == null) ? ycg.j.e : bz7VarY, z), ycg.l(bz7Var2, (kwbVar == null || (bz7VarI = kwbVar.i()) == null) ? ycg.j.f : bz7VarI));
        this.o = kwbVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = zni.q();
    }

    @Override // defpackage.kwb
    public final void B(fwb fwbVar) {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.kwb
    public final kwb C(bz7 bz7Var, bz7 bz7Var2) {
        bz7 bz7VarK = ycg.k(bz7Var, this.r, true);
        bz7 bz7VarL = ycg.l(bz7Var2, this.s);
        return !this.p ? new g6i(D().C(null, bz7VarL), bz7VarK, bz7VarL, false, true) : D().C(bz7VarK, bz7VarL);
    }

    public final kwb D() {
        kwb kwbVar = this.o;
        return kwbVar == null ? ycg.j : kwbVar;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void c() {
        kwb kwbVar;
        this.c = true;
        if (!this.q || (kwbVar = this.o) == null) {
            return;
        }
        kwbVar.c();
    }

    @Override // defpackage.rcg
    public final wcg d() {
        return D().d();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final bz7 e() {
        return this.r;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.rcg
    public final long g() {
        return D().g();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final int h() {
        return D().h();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final bz7 i() {
        return this.s;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void k() {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void l() {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void m() {
        D().m();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void n(img imgVar) {
        D().n(imgVar);
    }

    @Override // defpackage.rcg
    public final void r(wcg wcgVar) {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.rcg
    public final void s(long j) {
        gb9.b0();
        throw null;
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final rcg u(bz7 bz7Var) {
        bz7 bz7VarK = ycg.k(bz7Var, this.r, true);
        return !this.p ? ycg.g(D().u(null), bz7VarK, true) : D().u(bz7VarK);
    }

    @Override // defpackage.kwb
    public final iuj w() {
        return D().w();
    }

    @Override // defpackage.kwb
    public final fwb x() {
        return D().x();
    }

    @Override // defpackage.kwb
    /* JADX INFO: renamed from: y */
    public final bz7 e() {
        return this.r;
    }
}

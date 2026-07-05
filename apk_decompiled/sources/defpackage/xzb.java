package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xzb extends rcg {
    public final bz7 e;
    public final rcg f;

    public xzb(long j, wcg wcgVar, bz7 bz7Var, rcg rcgVar) {
        super(j, wcgVar);
        this.e = bz7Var;
        this.f = rcgVar;
        rcgVar.k();
    }

    @Override // defpackage.rcg
    public final void c() {
        rcg rcgVar = this.f;
        if (this.c) {
            return;
        }
        if (this.b != rcgVar.g()) {
            a();
        }
        rcgVar.l();
        this.c = true;
        synchronized (ycg.c) {
            o();
        }
    }

    @Override // defpackage.rcg
    public final bz7 e() {
        return this.e;
    }

    @Override // defpackage.rcg
    public final boolean f() {
        return true;
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
    }

    @Override // defpackage.rcg
    public final void n(img imgVar) {
        a6f a6fVar = ycg.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.rcg
    public final rcg u(bz7 bz7Var) {
        return new xzb(this.b, this.a, ycg.k(bz7Var, this.e, true), this.f);
    }
}

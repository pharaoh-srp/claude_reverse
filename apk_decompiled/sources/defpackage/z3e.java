package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3e extends rcg {
    public final bz7 e;
    public int f;

    public z3e(long j, wcg wcgVar, bz7 bz7Var) {
        super(j, wcgVar);
        this.e = bz7Var;
        this.f = 1;
    }

    @Override // defpackage.rcg
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.rcg
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
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
        ycg.c(this);
        return new xzb(this.b, this.a, ycg.k(bz7Var, this.e, true), this);
    }
}

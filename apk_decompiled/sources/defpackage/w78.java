package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w78 extends kwb {
    @Override // defpackage.kwb
    public final kwb C(bz7 bz7Var, bz7 bz7Var2) {
        return (kwb) ((rcg) ycg.e(new da3(4, new y73(bz7Var, 3, bz7Var2))));
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final void c() {
        synchronized (ycg.c) {
            o();
        }
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
        ycg.a();
    }

    @Override // defpackage.kwb, defpackage.rcg
    public final rcg u(bz7 bz7Var) {
        return (z3e) ((rcg) ycg.e(new da3(4, new v78(0, bz7Var))));
    }

    @Override // defpackage.kwb
    public final iuj w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}

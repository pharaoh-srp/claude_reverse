package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od6 extends tc6 {
    public pd6 n0;
    public ukc o0;
    public boolean p0;
    public rz7 q0;
    public rz7 r0;
    public boolean s0;

    @Override // defpackage.tc6
    public final void B1(long j) {
        if (!this.R || x44.r(this.q0, nd6.a)) {
            return;
        }
        gb9.D(d1(), null, o45.H, new e9(this, j, (tp4) null), 1);
    }

    @Override // defpackage.tc6
    public final void C1(cc6 cc6Var) {
        if (!this.R || x44.r(this.r0, nd6.b)) {
            return;
        }
        gb9.D(d1(), null, o45.H, new t74(this, cc6Var, (tp4) null, 20), 1);
    }

    @Override // defpackage.tc6
    public final boolean H1() {
        return this.p0;
    }

    @Override // defpackage.tc6
    public final Object w1(sc6 sc6Var, sc6 sc6Var2) {
        Object objA = this.n0.a(new t74(sc6Var, this, (tp4) null, 19), sc6Var2);
        return objA == m45.E ? objA : iei.a;
    }
}

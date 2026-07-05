package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class le3 extends nf9 {
    public final ua2 L;

    public le3(ua2 ua2Var) {
        this.L = ua2Var;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return true;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        vf9 vf9VarQ = q();
        ua2 ua2Var = this.L;
        Throwable thN = ua2Var.n(vf9VarQ);
        if (!ua2Var.z() ? false : ((z76) ua2Var.H).m(thN)) {
            return;
        }
        ua2Var.q(thN);
        if (ua2Var.z()) {
            return;
        }
        ua2Var.l();
    }
}

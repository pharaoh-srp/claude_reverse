package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lre extends nf9 {
    public final pf9 L;

    public lre(pf9 pf9Var) {
        this.L = pf9Var;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return false;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        Object objU = q().U();
        boolean z = objU instanceof e94;
        pf9 pf9Var = this.L;
        if (z) {
            pf9Var.resumeWith(sf5.u(((e94) objU).a));
        } else {
            pf9Var.resumeWith(wf9.a(objU));
        }
    }
}

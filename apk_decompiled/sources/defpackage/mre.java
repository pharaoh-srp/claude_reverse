package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mre extends nf9 {
    public final ua2 L;

    public mre(ua2 ua2Var) {
        this.L = ua2Var;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return false;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        this.L.resumeWith(iei.a);
    }
}

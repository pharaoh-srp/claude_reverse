package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sf9 extends nf9 {
    public final agf L;
    public final /* synthetic */ vf9 M;

    public sf9(vf9 vf9Var, agf agfVar) {
        this.M = vf9Var;
        this.L = agfVar;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return false;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        vf9 vf9Var = this.M;
        Object objU = vf9Var.U();
        if (!(objU instanceof e94)) {
            objU = wf9.a(objU);
        }
        ((zff) this.L).k(vf9Var, objU);
    }
}

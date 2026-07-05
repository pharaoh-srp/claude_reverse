package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q94 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ ba4 F;

    public /* synthetic */ q94(ba4 ba4Var, int i) {
        this.E = i;
        this.F = ba4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        ba4 ba4Var = this.F;
        switch (i) {
            case 0:
                ba4.k(ba4Var);
                break;
            default:
                ba4Var.invalidateOptionsMenu();
                break;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oa5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ u38 G;

    public /* synthetic */ oa5(m95 m95Var, u38 u38Var, int i) {
        this.E = i;
        this.F = m95Var;
        this.G = u38Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                this.F.onResult(this.G);
                break;
            default:
                this.F.onResult(this.G);
                break;
        }
    }
}

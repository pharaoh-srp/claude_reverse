package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ l65 G;

    public /* synthetic */ v75(m95 m95Var, l65 l65Var, int i) {
        this.E = i;
        this.F = m95Var;
        this.G = l65Var;
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

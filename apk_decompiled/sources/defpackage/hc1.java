package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hc1 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ ig0 F;
    public final /* synthetic */ Object G;

    public /* synthetic */ hc1(ig0 ig0Var, Object obj, int i) {
        this.E = i;
        this.F = ig0Var;
        this.G = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.G;
        ig0 ig0Var = this.F;
        switch (i) {
            case 0:
                if (ig0Var.E == 0) {
                    ig0Var.u(obj);
                }
                break;
            default:
                int i2 = ig0Var.E - 1;
                ig0Var.E = i2;
                if (i2 == 0) {
                    ig0Var.u(obj);
                }
                break;
        }
    }
}

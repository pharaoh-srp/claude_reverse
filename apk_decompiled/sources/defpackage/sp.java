package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sp implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ sp(boolean z, zy7 zy7Var, int i) {
        this.E = i;
        this.F = z;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                if (z) {
                    zy7Var.a();
                }
                break;
            case 1:
                if (!z) {
                    zy7Var.a();
                }
                break;
            case 2:
                if (z) {
                    zy7Var.a();
                }
                break;
            default:
                if (!z) {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}

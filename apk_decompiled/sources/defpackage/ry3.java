package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ry3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ String H;

    public /* synthetic */ ry3(boolean z, bz7 bz7Var, String str, int i) {
        this.E = i;
        this.F = z;
        this.G = bz7Var;
        this.H = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        bz7 bz7Var = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                if (z) {
                    bz7Var.invoke(str);
                }
                break;
            default:
                if (z) {
                    bz7Var.invoke(str);
                }
                break;
        }
        return ieiVar;
    }
}

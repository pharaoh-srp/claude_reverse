package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kx5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jx5 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ kx5(jx5 jx5Var, zy7 zy7Var, int i) {
        this.E = i;
        this.F = jx5Var;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        ox5 ox5Var = ox5.a;
        zy7 zy7Var = this.G;
        jx5 jx5Var = this.F;
        switch (i) {
            case 0:
                if (!((Boolean) jx5Var.e.getValue()).booleanValue()) {
                    jx5Var.O(ox5Var);
                    zy7Var.a();
                }
                break;
            default:
                jx5Var.O(ox5Var);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}

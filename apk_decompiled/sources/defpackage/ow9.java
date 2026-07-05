package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow9 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ii7 F;
    public final /* synthetic */ int G;

    public /* synthetic */ ow9(ii7 ii7Var, int i, int i2) {
        this.E = i2;
        this.F = ii7Var;
        this.G = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        ii7 ii7Var = this.F;
        switch (i) {
            case 0:
                gb9.D(ii7Var.d, null, null, new hi7(ii7Var, i2, null, 1), 3);
                break;
            case 1:
                gb9.D(ii7Var.d, null, null, new hi7(ii7Var, i2 - 1, null, 1), 3);
                break;
            case 2:
                gb9.D(ii7Var.d, null, null, new hi7(ii7Var, i2, null, 2), 3);
                break;
            default:
                gb9.D(ii7Var.d, null, null, new hi7(ii7Var, i2, null, 0), 3);
                break;
        }
        return ieiVar;
    }
}

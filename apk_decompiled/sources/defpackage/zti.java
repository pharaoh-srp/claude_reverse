package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zti implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z09 F;
    public final /* synthetic */ int G;

    public /* synthetic */ zti(z09 z09Var, int i, int i2) {
        this.E = i2;
        this.F = z09Var;
        this.G = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        z09 z09Var = this.F;
        switch (i) {
            case 0:
                us7 us7Var = (us7) obj;
                us7Var.getClass();
                us7Var.d(new zti(z09Var, i2, 1));
                break;
            default:
                qa2 qa2Var = (qa2) obj;
                qa2Var.getClass();
                z09Var.a(qa2Var.a, i2, sf5.f0(Integer.valueOf(i2)));
                break;
        }
        return ieiVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class py2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hj6 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ py2(hj6 hj6Var, boolean z, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = hj6Var;
        this.G = z;
        this.H = zy7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        zy7 zy7Var = this.H;
        boolean z = this.G;
        hj6 hj6Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hj6Var.d(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
            default:
                hj6Var.p(x44.p0(i2 | 1), ld4Var, zy7Var, z);
                break;
        }
        return ieiVar;
    }
}

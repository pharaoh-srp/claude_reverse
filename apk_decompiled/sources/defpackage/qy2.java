package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qy2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hj6 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;

    public /* synthetic */ qy2(hj6 hj6Var, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = hj6Var;
        this.G = zy7Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        zy7 zy7Var = this.G;
        hj6 hj6Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hj6Var.j(zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                hj6Var.f(zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                hj6Var.k(zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                hj6Var.c(zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}

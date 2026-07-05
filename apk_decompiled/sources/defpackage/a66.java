package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a66 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ int H;

    public /* synthetic */ a66(int i, int i2, zy7 zy7Var, zy7 zy7Var2) {
        this.E = i2;
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        zy7 zy7Var = this.G;
        zy7 zy7Var2 = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h66.b(zy7Var2, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                etj.b(zy7Var2, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}

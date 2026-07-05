package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t2b implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ t2b(String str, zy7 zy7Var, zy7 zy7Var2, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        zy7 zy7Var = this.H;
        zy7 zy7Var2 = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                uok.e(str, zy7Var2, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                num.intValue();
                ulk.a(str, zy7Var2, zy7Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cte F;
    public final /* synthetic */ ta4 G;
    public final /* synthetic */ int H;

    public /* synthetic */ sr1(int i, int i2, ta4 ta4Var, cte cteVar) {
        this.E = i2;
        this.F = cteVar;
        this.G = ta4Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        ta4 ta4Var = this.G;
        cte cteVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ur1.a(cteVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                xq3.a(cteVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}

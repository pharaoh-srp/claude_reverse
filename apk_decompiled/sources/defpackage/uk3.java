package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk3 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ xk3 H;
    public final /* synthetic */ of6 I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ kqc K;
    public final /* synthetic */ swe L;

    public /* synthetic */ uk3(zqc zqcVar, rwe rweVar, xk3 xk3Var, of6 of6Var, zy7 zy7Var, kqc kqcVar, swe sweVar) {
        this.F = zqcVar;
        this.G = rweVar;
        this.H = xk3Var;
        this.I = of6Var;
        this.J = zy7Var;
        this.K = kqcVar;
        this.L = sweVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    i8a.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, e18Var, 12583424);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i8a.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, x44.p0(12583425));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uk3(zqc zqcVar, rwe rweVar, xk3 xk3Var, of6 of6Var, zy7 zy7Var, kqc kqcVar, swe sweVar, int i) {
        this.F = zqcVar;
        this.G = rweVar;
        this.H = xk3Var;
        this.I = of6Var;
        this.J = zy7Var;
        this.K = kqcVar;
        this.L = sweVar;
    }
}

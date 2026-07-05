package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class thf implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ tif F;
    public final /* synthetic */ ta4 G;
    public final /* synthetic */ mif H;

    public /* synthetic */ thf(mif mifVar, tif tifVar, ta4 ta4Var) {
        this.H = mifVar;
        this.F = tifVar;
        this.G = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        mif mifVar = this.H;
        ta4 ta4Var = this.G;
        tif tifVar = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    yfd.b(mifVar, fd9.q0(-284825865, new thf(tifVar, ta4Var, mifVar), e18Var), e18Var, 48);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    j8.c(uif.a.a(tifVar), fd9.q0(610483127, new s74(ta4Var, mifVar), e18Var2), e18Var2, 56);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ thf(tif tifVar, ta4 ta4Var, mif mifVar) {
        this.F = tifVar;
        this.G = ta4Var;
        this.H = mifVar;
    }
}

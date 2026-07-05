package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h03 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ f03 F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ t4g H;

    public /* synthetic */ h03(f03 f03Var, t53 t53Var, t4g t4gVar) {
        this.F = f03Var;
        this.G = t53Var;
        this.H = t4gVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    ovk.c(this.G, this.F, this.H, i4gVar, e18Var, 64 | ((iIntValue << 9) & 7168));
                }
                break;
            default:
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    rvk.f(this.F, this.G.H0(), this.H, i4gVar2, e18Var2, 8 | ((iIntValue2 << 9) & 7168));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ h03(t53 t53Var, f03 f03Var, t4g t4gVar) {
        this.G = t53Var;
        this.F = f03Var;
        this.H = t4gVar;
    }
}

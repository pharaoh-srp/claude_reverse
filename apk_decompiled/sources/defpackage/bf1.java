package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bf1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z3g F;
    public final /* synthetic */ r4g G;

    public /* synthetic */ bf1(z3g z3gVar, r4g r4gVar, int i) {
        this.E = i;
        this.F = z3gVar;
        this.G = r4gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        r4g r4gVar = this.G;
        z3g z3gVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tqh tqhVar = tqh.T;
                    wu8 wu8VarI = ntj.i(z3gVar, e18Var);
                    boolean zH = e18Var.h(r4gVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new ef1(r4gVar, 0);
                        e18Var.k0(objN);
                    }
                    tqhVar.w(null, wu8VarI, (zy7) objN, e18Var, 3072, 1);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tqh tqhVar2 = tqh.T;
                    wu8 wu8VarI2 = ntj.i(z3gVar, e18Var2);
                    boolean zH2 = e18Var2.h(r4gVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new ef1(r4gVar, 3);
                        e18Var2.k0(objN2);
                    }
                    tqhVar2.w(null, wu8VarI2, (zy7) objN2, e18Var2, 3072, 1);
                }
                break;
        }
        return ieiVar;
    }
}

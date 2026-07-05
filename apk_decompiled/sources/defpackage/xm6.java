package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ tkh G;

    public /* synthetic */ xm6(String str, tkh tkhVar, int i) {
        this.E = i;
        this.F = str;
        this.G = tkhVar;
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
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.G, e18Var, 0, 0, 131070);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    Object objN = e18Var2.N();
                    if (objN == jd4.a) {
                        objN = new kac(13);
                        e18Var2.k0(objN);
                    }
                    tjh.b(this.F, tjf.a(fqb.E, (bz7) objN), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.G, e18Var2, 0, 0, 131068);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.G, e18Var3, 0, 0, 131070);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, this.G, e18Var4, 0, 24960, 110590);
                }
                break;
        }
        return ieiVar;
    }
}

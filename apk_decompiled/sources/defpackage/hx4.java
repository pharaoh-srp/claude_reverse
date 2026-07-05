package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hx4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ hx4(bz7 bz7Var, String str, nwb nwbVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = str;
        this.H = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.H;
        String str = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(bz7Var) | e18Var.f(str) | e18Var.f(nwbVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new ix4(bz7Var, str, nwbVar, 0);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, ijk.a, e18Var, 805306368, 510);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zF2 = e18Var2.f(bz7Var) | e18Var2.f(str) | e18Var2.f(nwbVar);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new ix4(bz7Var, str, nwbVar, 1);
                        e18Var2.k0(objN2);
                    }
                    csg.j((zy7) objN2, null, false, null, null, null, null, yjk.a, e18Var2, 805306368, 510);
                }
                break;
        }
        return ieiVar;
    }
}

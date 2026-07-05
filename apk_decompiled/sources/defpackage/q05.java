package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q05 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ q05(zy7 zy7Var, nwb nwbVar) {
        this.F = zy7Var;
        this.G = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(nwbVar);
                    zy7 zy7Var = this.F;
                    boolean zF2 = zF | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zF2 || objN == lz1Var) {
                        objN = new pn(zy7Var, nwbVar, 15);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, wjk.i, e18Var, 805306368, 510);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    Object objN2 = e18Var2.N();
                    if (objN2 == lz1Var) {
                        objN2 = new k3c(19, nwbVar);
                        e18Var2.k0(objN2);
                    }
                    zy7 zy7Var2 = (zy7) objN2;
                    Object objN3 = e18Var2.N();
                    if (objN3 == lz1Var) {
                        objN3 = new k3c(20, nwbVar);
                        e18Var2.k0(objN3);
                    }
                    b1e.d(this.F, zy7Var2, (zy7) objN3, fqb.E, e18Var2, 3456);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ q05(nwb nwbVar, zy7 zy7Var) {
        this.G = nwbVar;
        this.F = zy7Var;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vv4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ vv4(nwb nwbVar, zy7 zy7Var, zy7 zy7Var2) {
        this.E = 0;
        this.H = nwbVar;
        this.F = zy7Var;
        this.G = zy7Var2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        zy7 zy7Var = this.G;
        zy7 zy7Var2 = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(nwbVar) | e18Var.f(zy7Var2);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new pn(zy7Var2, nwbVar, 13);
                        e18Var.k0(objN);
                    }
                    t30.b(gjk.m, (zy7) objN, null, gjk.n, null, false, null, null, e18Var, 3078, 500);
                    boolean zF2 = e18Var.f(nwbVar) | e18Var.f(zy7Var);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new pn(zy7Var, nwbVar, 14);
                        e18Var.k0(objN2);
                    }
                    t30.b(gjk.o, (zy7) objN2, null, gjk.p, null, false, null, null, e18Var, 3078, 500);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    boolean zF3 = e18Var2.f(zy7Var2);
                    Object objN3 = e18Var2.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new pn(zy7Var2, nwbVar, 17);
                        e18Var2.k0(objN3);
                    }
                    t30.b(cmk.a, (zy7) objN3, null, null, null, false, null, null, e18Var2, 6, 508);
                    boolean zF4 = e18Var2.f(zy7Var);
                    Object objN4 = e18Var2.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new pn(zy7Var, nwbVar, 18);
                        e18Var2.k0(objN4);
                    }
                    t30.b(cmk.b, (zy7) objN4, null, null, null, false, null, null, e18Var2, 6, 508);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zy7) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    rkj.a(((Boolean) nwbVar.getValue()).booleanValue(), zy7Var2, zy7Var, e18Var3, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vv4(zy7 zy7Var, zy7 zy7Var2, nwb nwbVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = nwbVar;
    }
}

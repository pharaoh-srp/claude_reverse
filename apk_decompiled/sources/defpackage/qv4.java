package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qv4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ p05 F;

    public /* synthetic */ qv4(p05 p05Var, int i) {
        this.E = i;
        this.F = p05Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        p05 p05Var = this.F;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    p05 p05Var2 = this.F;
                    boolean zF = e18Var.f(p05Var2);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        y14 y14Var = new y14(0, p05Var2, p05.class, "dismissInstall", "dismissInstall()V", 0, 15);
                        e18Var.k0(y14Var);
                        objN = y14Var;
                    }
                    csg.j((zy7) ((jm9) objN), null, false, null, null, null, null, gjk.b, e18Var, 805306368, 510);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    p05 p05Var3 = this.F;
                    boolean zF2 = e18Var2.f(p05Var3);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        y14 y14Var2 = new y14(0, p05Var3, p05.class, "dismissOverwrite", "dismissOverwrite()V", 0, 17);
                        e18Var2.k0(y14Var2);
                        objN2 = y14Var2;
                    }
                    csg.j((zy7) ((jm9) objN2), null, false, null, null, null, null, gjk.e, e18Var2, 805306368, 510);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    boolean zF3 = e18Var3.f(p05Var);
                    Object objN3 = e18Var3.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new sv4(p05Var, 0);
                        e18Var3.k0(objN3);
                    }
                    csg.j((zy7) objN3, null, false, null, null, null, null, gjk.j, e18Var3, 805306368, 510);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    boolean zF4 = e18Var4.f(p05Var);
                    Object objN4 = e18Var4.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new sv4(p05Var, 4);
                        e18Var4.k0(objN4);
                    }
                    csg.j((zy7) objN4, null, false, null, null, null, null, wjk.e, e18Var4, 805306368, 510);
                }
                break;
            default:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    boolean zF5 = e18Var5.f(p05Var);
                    Object objN5 = e18Var5.N();
                    if (zF5 || objN5 == lz1Var) {
                        objN5 = new sv4(p05Var, 3);
                        e18Var5.k0(objN5);
                    }
                    csg.j((zy7) objN5, null, false, null, null, null, null, wjk.c, e18Var5, 805306368, 510);
                }
                break;
        }
        return ieiVar;
    }
}

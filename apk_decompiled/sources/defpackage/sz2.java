package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sz2 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rz7 F;
    public final /* synthetic */ mnc G;

    public /* synthetic */ sz2(rz7 rz7Var, mnc mncVar, int i) {
        this.E = i;
        this.F = rz7Var;
        this.G = mncVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        mnc mncVar = this.G;
        rz7 rz7Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    if (rz7Var == null) {
                        e18Var.a0(1902211640);
                    } else {
                        e18Var.a0(-769922327);
                        rz7Var.invoke(mncVar, e18Var, 0);
                    }
                    e18Var.p(false);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    rz7Var.invoke(mncVar, e18Var2, 0);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    rz7Var.invoke(mncVar, e18Var3, 0);
                }
                break;
        }
        return ieiVar;
    }
}

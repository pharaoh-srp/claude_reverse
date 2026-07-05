package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8a implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;

    public /* synthetic */ k8a(ta4 ta4Var, int i) {
        this.E = i;
        this.F = ta4Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        int i2 = 3;
        int i3 = 2;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.F;
        switch (i) {
            case 0:
                ia0 ia0Var = (ia0) obj;
                ie3 ie3Var = (ie3) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ia0Var.getClass();
                ie3Var.getClass();
                d4c.y(ia0Var, ie3Var, fd9.q0(-851003461, new k8a(ta4Var, i3), ld4Var), ld4Var, (iIntValue & 112) | (iIntValue & 14) | 384);
                break;
            case 1:
                ia0 ia0Var2 = (ia0) obj;
                ie3 ie3Var2 = (ie3) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ia0Var2.getClass();
                ie3Var2.getClass();
                d4c.y(ia0Var2, ie3Var2, fd9.q0(-1949255879, new xw9(ta4Var, i2), ld4Var2), ld4Var2, (iIntValue2 & 112) | (iIntValue2 & 14) | 384);
                break;
            case 2:
                ia0 ia0Var3 = (ia0) obj;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ia0Var3.getClass();
                obj2.getClass();
                int i4 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? ((e18) ld4Var3).f(ia0Var3) : ((e18) ld4Var3).h(ia0Var3) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i4 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var3).f(obj2) : ((e18) ld4Var3).h(obj2) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var3;
                if (!e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var.T();
                } else {
                    ta4Var.i(ia0Var3, obj2, e18Var, Integer.valueOf(i4 & 126));
                }
                break;
            case 3:
                ia0 ia0Var4 = (ia0) obj;
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ia0Var4.getClass();
                obj2.getClass();
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var4) : ((e18) ld4Var4).h(ia0Var4) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj2) : ((e18) ld4Var4).h(obj2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var4;
                if (!e18Var2.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    ta4Var.i(ia0Var4, obj2, e18Var2, Integer.valueOf(i5 & 126));
                }
                break;
            default:
                g7g g7gVar = (g7g) obj;
                ie3 ie3Var3 = (ie3) obj2;
                ld4 ld4Var5 = (ld4) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                g7gVar.getClass();
                ie3Var3.getClass();
                d4c.y(g7gVar, ie3Var3, fd9.q0(-673763254, new k8a(ta4Var, i2), ld4Var5), ld4Var5, (iIntValue5 & 112) | (iIntValue5 & 14) | 384);
                break;
        }
        return ieiVar;
    }
}

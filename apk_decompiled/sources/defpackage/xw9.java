package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xw9 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;

    public /* synthetic */ xw9(ta4 ta4Var, int i) {
        this.E = i;
        this.F = ta4Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        int i2 = 2;
        int i3 = 1;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.F;
        switch (i) {
            case 0:
                ax9 ax9Var = (ax9) obj;
                ((Integer) obj2).getClass();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(ax9Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 131) != 130)) {
                    e18Var.T();
                } else {
                    ta4Var.invoke(ax9Var, e18Var, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 1:
                ia0 ia0Var = (ia0) obj;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ia0Var.getClass();
                obj2.getClass();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((e18) ld4Var2).f(ia0Var) : ((e18) ld4Var2).h(ia0Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var2).f(obj2) : ((e18) ld4Var2).h(obj2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    ta4Var.i(ia0Var, obj2, e18Var2, Integer.valueOf(i4 & 126));
                }
                break;
            case 2:
                ia0 ia0Var2 = (ia0) obj;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ia0Var2.getClass();
                obj2.getClass();
                int i5 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? ((e18) ld4Var3).f(ia0Var2) : ((e18) ld4Var3).h(ia0Var2) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i5 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var3).f(obj2) : ((e18) ld4Var3).h(obj2) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    ta4Var.i(ia0Var2, obj2, e18Var3, Integer.valueOf(i5 & 126));
                }
                break;
            case 3:
                ia0 ia0Var3 = (ia0) obj;
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ia0Var3.getClass();
                obj2.getClass();
                int i6 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var3) : ((e18) ld4Var4).h(ia0Var3) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i6 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj2) : ((e18) ld4Var4).h(obj2) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(i6 & 1, (i6 & 147) != 146)) {
                    e18Var4.T();
                } else {
                    ta4Var.i(ia0Var3, obj2, e18Var4, Integer.valueOf(i6 & 126));
                }
                break;
            case 4:
                g7g g7gVar = (g7g) obj;
                ie3 ie3Var = (ie3) obj2;
                int iIntValue5 = ((Integer) obj4).intValue();
                g7gVar.getClass();
                ie3Var.getClass();
                ta4Var.i(g7gVar, ie3Var, (ld4) obj3, Integer.valueOf(iIntValue5 & 126));
                break;
            case 5:
                ia0 ia0Var4 = (ia0) obj;
                ie3 ie3Var2 = (ie3) obj2;
                ld4 ld4Var5 = (ld4) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ia0Var4.getClass();
                ie3Var2.getClass();
                d4c.y(ia0Var4, ie3Var2, fd9.q0(1744527083, new xw9(ta4Var, i2), ld4Var5), ld4Var5, (iIntValue6 & 112) | (iIntValue6 & 14) | 384);
                break;
            case 6:
                ia0 ia0Var5 = (ia0) obj;
                ie3 ie3Var3 = (ie3) obj2;
                ld4 ld4Var6 = (ld4) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ia0Var5.getClass();
                ie3Var3.getClass();
                d4c.y(ia0Var5, ie3Var3, fd9.q0(736313678, new xw9(ta4Var, i3), ld4Var6), ld4Var6, (iIntValue7 & 112) | (iIntValue7 & 14) | 384);
                break;
            default:
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var7 = (ld4) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                mw1Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var7).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var7;
                if (!e18Var5.Q(iIntValue8 & 1, (iIntValue8 & 131) != 130)) {
                    e18Var5.T();
                } else {
                    ta4Var.invoke(mw1Var, e18Var5, Integer.valueOf(iIntValue8 & 14));
                }
                break;
        }
        return ieiVar;
    }
}

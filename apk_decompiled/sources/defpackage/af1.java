package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class af1 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jz0 F;

    public /* synthetic */ af1(jz0 jz0Var, int i) {
        this.E = i;
        this.F = jz0Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 14;
        switch (i) {
            case 0:
                cte cteVar = (cte) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                cteVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(cteVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    wvk.o(cteVar, this.F, e18Var, iIntValue & 14);
                }
                break;
            case 1:
                cte cteVar2 = (cte) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                cteVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(cteVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    Object objN = e18Var2.N();
                    if (objN == jd4.a) {
                        objN = new zv(i2);
                        e18Var2.k0(objN);
                    }
                    flk.d(cteVar2, this.F, tjf.b(fqb.E, false, (bz7) objN), e18Var2, iIntValue2 & 14, 0);
                }
                break;
            case 2:
                cte cteVar3 = (cte) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                cteVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(cteVar3) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    wvk.a(cteVar3, this.F, wi4.b, null, null, null, null, e18Var3, iIntValue3 & 14, 60);
                }
                break;
            case 3:
                cte cteVar4 = (cte) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                cteVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(cteVar4) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    flk.d(cteVar4, this.F, null, e18Var4, iIntValue4 & 14, 2);
                }
                break;
            default:
                cte cteVar5 = (cte) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                cteVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).f(cteVar5) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e18Var5.T();
                } else {
                    flk.d(cteVar5, this.F, null, e18Var5, iIntValue5 & 14, 2);
                }
                break;
        }
        return ieiVar;
    }
}

package defpackage;

import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qg4 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ List G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ qg4(cte cteVar, oaa oaaVar, int i, ta4 ta4Var, List list) {
        this.H = cteVar;
        this.I = oaaVar;
        this.F = i;
        this.J = ta4Var;
        this.G = list;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        final List list = this.G;
        Object obj4 = this.J;
        final int i2 = this.F;
        Object obj5 = this.I;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                wlg wlgVar = (wlg) obj4;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    ug4.c(str, e18Var, 0);
                    fqb fqbVar = fqb.E;
                    iqb iqbVarA = dxeVar.a(fqbVar, 1.0f, true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    tjh.b(str2, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 24960, 110586);
                    tjh.b(d4c.f0(R.plurals.connected_apps_card_tools_count, list.size(), new Object[]{Integer.valueOf(i2), Integer.valueOf(list.size())}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110586);
                    e18Var.p(true);
                    iv1.b(ud0.B, null, ysk.f(fqbVar, ((Number) wlgVar.getValue()).floatValue()), ef2.F, gm3.a(e18Var).N, e18Var, 3120, 0);
                }
                break;
            default:
                cte cteVar = (cte) obj6;
                oaa oaaVar = (oaa) obj5;
                final ta4 ta4Var = (ta4) obj4;
                final int iIntValue2 = ((Integer) obj).intValue();
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var2).d(iIntValue2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    ote oteVarB = pte.b(cteVar, e18Var2);
                    xvk.a(null, new ote(oaaVar.c, oteVarB.b, oteVarB.c, oteVarB.d, oteVarB.e, oteVarB.f, oteVarB.g, oteVarB.h), fd9.q0(-238497641, new rz7() { // from class: mw7
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            cte cteVar2 = (cte) obj7;
                            ld4 ld4Var3 = (ld4) obj8;
                            int iIntValue4 = ((Integer) obj9).intValue();
                            cteVar2.getClass();
                            if ((iIntValue4 & 6) == 0) {
                                iIntValue4 |= ((e18) ld4Var3).f(cteVar2) ? 4 : 2;
                            }
                            e18 e18Var3 = (e18) ld4Var3;
                            if (e18Var3.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                j8.c(rw7.f.a(Integer.valueOf(i2 + 1)), fd9.q0(2046080343, new v76(ta4Var, iIntValue2, cteVar2, list, 5), e18Var3), e18Var3, 56);
                            } else {
                                e18Var3.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), e18Var2, 3072, 5);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qg4(String str, String str2, List list, int i, wlg wlgVar) {
        this.H = str;
        this.I = str2;
        this.G = list;
        this.F = i;
        this.J = wlgVar;
    }
}

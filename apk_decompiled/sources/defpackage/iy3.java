package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.i;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iy3 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ iy3(i iVar, int i) {
        this.E = i;
        this.F = iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        i iVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    a.j(iVar, e18Var, 0);
                }
                break;
            case 1:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    a.u((String) iVar.P1.getValue(), i4gVar, e18Var2, (iIntValue2 << 3) & 112);
                }
                break;
            default:
                String str = (String) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(str) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var3, 6);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, fqb.E);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    tjh.b("/".concat(str), null, gm3.a(e18Var3).j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var3).e.F).c, e18Var3, 0, 0, 131066);
                    String str2 = (String) ((Map) iVar.H0.getValue()).get(str);
                    if (str2 == null) {
                        e18Var3.a0(-1112898453);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-1112898452);
                        tjh.b(str2, null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 24960, 110586);
                        e18Var3.p(false);
                    }
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }
}

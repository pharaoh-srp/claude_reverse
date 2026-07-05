package defpackage;

import androidx.compose.foundation.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kxc implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ eli F;

    public /* synthetic */ kxc(eli eliVar, int i) {
        this.E = i;
        this.F = eliVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        eli eliVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var, 6);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
                    tjh.b(d4c.j0(R.string.ccr_auto_mode_optin_body, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131070);
                    String strJ0 = d4c.j0(R.string.ccr_auto_mode_optin_learn_more, e18Var);
                    tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
                    long j = gm3.a(e18Var).c;
                    boolean zH = e18Var.h(eliVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new mp1(eliVar, 4);
                        e18Var.k0(objN);
                    }
                    tjh.b(strJ0, b.c(fqbVar, false, null, null, null, (zy7) objN, 15), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
                    e18Var.p(true);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    q64 q64VarA2 = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var2, 6);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarE2 = kxk.E(e18Var2, fqbVar2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA2);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    tjh.b(d4c.j0(R.string.ccr_auto_default_notice_body, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131070);
                    String strJ02 = d4c.j0(R.string.ccr_auto_mode_optin_learn_more, e18Var2);
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).g;
                    long j2 = gm3.a(e18Var2).c;
                    boolean zH2 = e18Var2.h(eliVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new mp1(eliVar, 3);
                        e18Var2.k0(objN2);
                    }
                    tjh.b(strJ02, b.c(fqbVar2, false, null, null, null, (zy7) objN2, 15), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var2, 0, 0, 131064);
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }
}

package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cy5 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ by5 G;

    public /* synthetic */ cy5(by5 by5Var, String str) {
        this.G = by5Var;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    by5 by5Var = this.G;
                    boolean zD = by5Var.D();
                    boolean zH = e18Var.h(by5Var);
                    Object objN = e18Var.N();
                    if (zH || objN == jd4.a) {
                        mx5 mx5Var = new mx5(0, by5Var, by5.class, "submitDelete", "submitDelete()V", 0, 1);
                        e18Var.k0(mx5Var);
                        objN = mx5Var;
                    }
                    oe5.a(0, 0, e18Var, (zy7) ((jm9) objN), this.F, zD);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262142);
                    if (this.G.s()) {
                        sq6.A(6.0f, 1287700553, e18Var2, e18Var2, fqbVar);
                        tjh.b(d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var2), null, gm3.a(e18Var2).y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262138);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1287970594);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cy5(String str, by5 by5Var) {
        this.F = str;
        this.G = by5Var;
    }
}

package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zu1 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ zu1(zy7 zy7Var, iqb iqbVar, bpc bpcVar, boolean z, String str, float f, tkh tkhVar, wz2 wz2Var, int i) {
        this.F = zy7Var;
        this.I = iqbVar;
        this.J = bpcVar;
        this.G = z;
        this.K = str;
        this.H = f;
        this.L = tkhVar;
        this.M = wz2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ?? r4;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        switch (i) {
            case 0:
                pz7 pz7Var = (pz7) obj7;
                v4g v4gVar = (v4g) obj5;
                pz7 pz7Var2 = (pz7) obj6;
                l45 l45Var = (l45) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarI0 = xn5.i0(knk.M(b.c(fqbVar, 1.0f), (wbj) pz7Var.invoke(e18Var, 0)), new r80(1, this.H));
                    float f = q4g.a;
                    iqb iqbVarI02 = xn5.i0(iqbVarI0, new yu1(v4gVar, i2));
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI02);
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
                    if (pz7Var2 != null) {
                        e18Var.a0(-444181086);
                        String strE = dch.E(R.string.m3c_bottom_sheet_collapse_description, e18Var);
                        String strE2 = dch.E(R.string.m3c_bottom_sheet_dismiss_description, e18Var);
                        String strE3 = dch.E(R.string.m3c_bottom_sheet_expand_description, e18Var);
                        boolean zF = e18Var.f(v4gVar);
                        zy7 zy7Var = this.F;
                        boolean zF2 = zF | e18Var.f(zy7Var) | e18Var.h(l45Var);
                        Object objN = e18Var.N();
                        Object obj8 = jd4.a;
                        if (zF2 || objN == obj8) {
                            objN = new vu1(l45Var, zy7Var, v4gVar);
                            e18Var.k0(objN);
                        }
                        iqb iqbVarC = androidx.compose.foundation.b.c(fqbVar, false, null, null, null, (zy7) objN, 15);
                        boolean z2 = this.G;
                        boolean zG = e18Var.g(z2) | e18Var.f(v4gVar) | e18Var.f(strE2) | e18Var.f(zy7Var) | e18Var.f(strE3) | e18Var.h(l45Var) | e18Var.f(strE);
                        Object objN2 = e18Var.N();
                        if (zG || objN2 == obj8) {
                            r4 = 0;
                            z = true;
                            objN2 = new bv1(z2, v4gVar, strE2, strE3, strE, zy7Var, l45Var);
                            e18Var.k0(objN2);
                        } else {
                            r4 = 0;
                            z = true;
                        }
                        q4g.a(tjf.b(iqbVarC, z, (bz7) objN2), pz7Var2, e18Var, r4);
                        e18Var.p(r4);
                    } else {
                        z = true;
                        e18Var.a0(-441815104);
                        e18Var.p(false);
                    }
                    ta4Var.invoke(s64.a, e18Var, 6);
                    e18Var.p(z);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ijk.a(this.F, (iqb) obj7, (bpc) obj6, this.G, (String) obj5, this.H, (tkh) obj4, (wz2) obj3, (ld4) obj, x44.p0(513));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ zu1(pz7 pz7Var, float f, v4g v4gVar, pz7 pz7Var2, zy7 zy7Var, l45 l45Var, boolean z, ta4 ta4Var) {
        this.I = pz7Var;
        this.H = f;
        this.K = v4gVar;
        this.J = pz7Var2;
        this.F = zy7Var;
        this.L = l45Var;
        this.G = z;
        this.M = ta4Var;
    }
}

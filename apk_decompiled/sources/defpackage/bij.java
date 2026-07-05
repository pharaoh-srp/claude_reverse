package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bij {
    public static final vve a = xve.b(2.0f);

    public static final void a(List list, boolean z, ld4 ld4Var, int i) {
        cpc cpcVar;
        iqb iqbVarP;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1616155097);
        int i2 = 2;
        int i3 = 4;
        int i4 = (e18Var.f(list) ? 4 : 2) | i | (e18Var.g(z) ? 32 : 16);
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            jl3 jl3VarA = gm3.a(e18Var);
            cxe cxeVarA = axe.a(new ho0(3.0f, true, new sz6(1)), lja.P, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(1410834751);
            Iterator it = w44.j1(list, 24).iterator();
            while (it.hasNext()) {
                shj shjVarK = gmk.k((whj) it.next());
                if (z && (shjVarK == shj.F || shjVarK == shj.G)) {
                    shjVarK = shj.E;
                }
                int iOrdinal = shjVarK.ordinal();
                if (iOrdinal == 0) {
                    cpcVar = new cpc(new d54(jl3VarA.O), null);
                } else if (iOrdinal == 1 || iOrdinal == i2) {
                    cpcVar = new cpc(new d54(jl3VarA.c), null);
                } else if (iOrdinal == 3) {
                    cpcVar = new cpc(new d54(jl3VarA.y), null);
                } else {
                    if (iOrdinal != i3) {
                        wg6.i();
                        return;
                    }
                    cpcVar = new cpc(null, new d54(jl3VarA.u));
                }
                d54 d54Var = (d54) cpcVar.E;
                d54 d54Var2 = (d54) cpcVar.F;
                iqb iqbVarO = b.o(fqbVar, 8.0f);
                vve vveVar = a;
                if (d54Var2 != null) {
                    iqbVarP = ez1.t(fqbVar, 1.0f, d54Var2.a, vveVar);
                } else {
                    d54Var.getClass();
                    iqbVarP = yfd.p(fqbVar, d54Var.a, vveVar);
                }
                dw1.a(iqbVarO.B(iqbVarP), e18Var, 0);
                i2 = 2;
                i3 = 4;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xb2(i, 13, list, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [lm6] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.rvh r36, defpackage.dc1 r37, defpackage.zy7 r38, defpackage.iqb r39, defpackage.ld4 r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bij.b(rvh, dc1, zy7, iqb, ld4, int):void");
    }
}

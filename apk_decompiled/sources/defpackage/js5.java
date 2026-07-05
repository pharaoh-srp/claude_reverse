package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class js5 implements kwa {
    public static final js5 a = new js5();

    @Override // defpackage.kwa
    public final void a(String str, ld4 ld4Var, int i) {
        int i2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1915930856);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xb0 xb0Var = new xb0(16);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ete eteVar = ete.d;
            int iL = xb0Var.l(lte.b, "code");
            xb0Var.h(str);
            xb0Var.j(iL);
            tpk.a(cte.a, new mte(xb0Var.n(), sta.q0(linkedHashMap)), null, null, false, 0, 0, e18Var, 6, 62);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(this, str, i, 20);
        }
    }

    @Override // defpackage.kwa
    public final void c(int i, ld4 ld4Var, String str, boolean z) {
        int i2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(107921993);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xq3.b(cte.a, str, e18Var, ((i2 << 3) & 112) | 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(this, str, z, i, 6);
        }
    }
}

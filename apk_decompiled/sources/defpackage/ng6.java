package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ng6 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ Set F;
    public final /* synthetic */ Map G;
    public final /* synthetic */ ag6 H;
    public final /* synthetic */ List I;
    public final /* synthetic */ che J;
    public final /* synthetic */ m63 K;
    public final /* synthetic */ dg8 L;
    public final /* synthetic */ ow1 M;

    public ng6(List list, Set set, Map map, ag6 ag6Var, List list2, che cheVar, m63 m63Var, dg8 dg8Var, ow1 ow1Var) {
        this.E = list;
        this.F = set;
        this.G = map;
        this.H = ag6Var;
        this.I = list2;
        this.J = cheVar;
        this.K = m63Var;
        this.L = dg8Var;
        this.M = ow1Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            rf6 rf6Var = (rf6) this.E.get(iIntValue);
            e18Var.a0(-1263539951);
            boolean zContains = this.F.contains(ho8.d(rf6Var.a));
            zy7 zy7Var = (zy7) this.G.get(rf6Var.a);
            if (zy7Var == null) {
                zy7Var = dgj.b;
            }
            ag6 ag6Var = ag6.G;
            ag6 ag6Var2 = this.H;
            dgj.f(px9Var, rf6Var, zContains, zy7Var, ag6Var2, false, ag6Var2 == ag6Var ? new sf6(iIntValue, this.I.size()) : null, this.J, this.K, this.L, this.M, null, e18Var, (i & 14) | 196608);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m3g extends ts9 implements sz7 {
    public final /* synthetic */ ta4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3g(ta4 ta4Var) {
        super(4);
        this.F = ta4Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k3g k3gVar = (k3g) obj;
        iqb iqbVar = (iqb) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).f(k3gVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).f(iqbVar) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.V(e18Var, Integer.valueOf(iHashCode), cd4.g);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            this.F.invoke(k3gVar, e18Var, Integer.valueOf(i & 14));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}

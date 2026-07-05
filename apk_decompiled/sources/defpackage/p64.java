package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p64 {
    public static final q64 a = new q64(ko0.c, lja.S);

    public static final q64 a(jo0 jo0Var, vo1 vo1Var, ld4 ld4Var, int i) {
        if (jo0Var.equals(ko0.c) && vo1Var.equals(lja.S)) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-1446604504);
            e18Var.p(false);
            return a;
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && e18Var2.f(jo0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !e18Var2.f(vo1Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objN = e18Var2.N();
        if (z3 || objN == jd4.a) {
            objN = new q64(jo0Var, vo1Var);
            e18Var2.k0(objN);
        }
        q64 q64Var = (q64) objN;
        e18Var2.p(false);
        return q64Var;
    }
}

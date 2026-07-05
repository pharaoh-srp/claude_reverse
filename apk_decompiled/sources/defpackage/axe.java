package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class axe {
    public static final cxe a = new cxe(ko0.a, lja.P);

    public static final cxe a(go0 go0Var, wo1 wo1Var, ld4 ld4Var, int i) {
        if (x44.r(go0Var, ko0.a) && x44.r(wo1Var, lja.P)) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-1073830487);
            e18Var.p(false);
            return a;
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && e18Var2.f(go0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !e18Var2.f(wo1Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objN = e18Var2.N();
        if (z3 || objN == jd4.a) {
            objN = new cxe(go0Var, wo1Var);
            e18Var2.k0(objN);
        }
        cxe cxeVar = (cxe) objN;
        e18Var2.p(false);
        return cxeVar;
    }
}

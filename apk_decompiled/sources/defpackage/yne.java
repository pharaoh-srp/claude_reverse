package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yne {
    public static xne a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1808039825);
        eea eeaVarA = b5d.a.r().a();
        boolean zF = v40.F(e18Var);
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        boolean zF2 = e18Var.f(eeaVarA) | e18Var.g(zF) | e18Var.f(cz5Var);
        Object objN = e18Var.N();
        if (zF2 || objN == jd4.a) {
            at9 at9Var = new at9(eeaVarA.a.getLanguage());
            mde mdeVar = new mde(eeaVarA.a.getCountry());
            plh.E.getClass();
            plh plhVar = zF ? plh.G : plh.F;
            float density = cz5Var.getDensity();
            gz5.F.getClass();
            double d = density;
            objN = new xne(at9Var, mdeVar, plhVar, d <= 0.75d ? gz5.G : d <= 1.0d ? gz5.H : d <= 1.5d ? gz5.I : d <= 2.0d ? gz5.J : d <= 3.0d ? gz5.K : gz5.L);
            e18Var.k0(objN);
        }
        xne xneVar = (xne) objN;
        e18Var.p(false);
        return xneVar;
    }
}

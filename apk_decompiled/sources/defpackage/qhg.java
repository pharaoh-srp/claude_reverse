package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qhg {
    public static final long a;

    static {
        lz1 lz1Var = uh6.F;
        a = v40.Q(3, zh6.SECONDS);
    }

    public static final phg a(wsg wsgVar, ld4 ld4Var, int i) {
        wsgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.h(wsgVar)) || (i & 6) == 4) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new e6f(wsgVar, 2, m7fVar);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (phg) fd9.r0(kceVar.b(phg.class), oq5.B(kceVar.b(phg.class)), (bz7) objN, e18Var);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c2i {
    public static final float a;

    static {
        mpk.d(16.0f, 8.0f);
        a = 200.0f;
    }

    public static j2i a(ld4 ld4Var) {
        qnc qncVar = e2i.a;
        e18 e18Var = (e18) ld4Var;
        int iM0 = ((cz5) e18Var.j(ve4.h)).M0(4.0f);
        long jA = ((y1a) ((sbj) e18Var.j(ve4.v))).a();
        boolean zD = e18Var.d(iM0) | e18Var.e(jA);
        Object objN = e18Var.N();
        if (zD || objN == jd4.a) {
            objN = new j2i(iM0, jA);
            e18Var.k0(objN);
        }
        return (j2i) objN;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jmc {
    public static final xe4 a = new xe4(new f9c(8));

    public static final b20 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(282942128);
        c20 c20Var = (c20) e18Var.j(a);
        if (c20Var == null) {
            e18Var.p(false);
            return null;
        }
        boolean zF = e18Var.f(c20Var);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            b20 b20Var = new b20(c20Var.a, c20Var.b, c20Var.c, c20Var.d);
            e18Var.k0(b20Var);
            objN = b20Var;
        }
        b20 b20Var2 = (b20) objN;
        e18Var.p(false);
        return b20Var2;
    }
}

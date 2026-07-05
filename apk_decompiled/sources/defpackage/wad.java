package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wad {
    public static final /* synthetic */ int a = 0;

    static {
        new umg(new oob(29));
    }

    public static final void a(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(442516910);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            e18Var.a0(1766838549);
            e18Var.p(false);
            e18Var.a0(1767392772);
            ta4Var.invoke(e18Var, 6);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tu2(ta4Var, i, 7);
        }
    }
}

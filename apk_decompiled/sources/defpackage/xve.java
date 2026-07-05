package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xve {
    public static final vve a = a(50);

    public static final vve a(int i) {
        vwc vwcVar = new vwc(i);
        return new vve(vwcVar, vwcVar, vwcVar, vwcVar);
    }

    public static final vve b(float f) {
        wa6 wa6Var = new wa6(f);
        return new vve(wa6Var, wa6Var, wa6Var, wa6Var);
    }

    public static final vve c(float f, float f2, float f3, float f4) {
        return new vve(new wa6(f), new wa6(f2), new wa6(f3), new wa6(f4));
    }

    public static vve d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return c(f, f2, f3, f4);
    }
}

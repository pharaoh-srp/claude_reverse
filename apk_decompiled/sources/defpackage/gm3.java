package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gm3 {
    public static final b9g a = b9g.a;
    public static final ul3 b = ul3.a;

    public static jl3 a(ld4 ld4Var) {
        return (jl3) ((e18) ld4Var).j(olh.a);
    }

    public static cm3 b(ld4 ld4Var) {
        return (cm3) ((e18) ld4Var).j(olh.d);
    }

    public static km3 c(ld4 ld4Var) {
        Object objJ = ((e18) ld4Var).j(olh.c);
        if (objJ != null) {
            return (km3) objJ;
        }
        sz6.p("Type not initialized yet");
        return null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g39 {
    public static final /* synthetic */ int a = 0;

    static {
        gh3.j(new ww7("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(bo5 bo5Var) {
        bo5Var.getClass();
        return (bo5Var instanceof qqb) && (((qqb) bo5Var).o0() instanceof f39);
    }

    public static final boolean b(yr9 yr9Var) {
        yr9Var.getClass();
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA != null) {
            return a(xh3VarA);
        }
        return false;
    }

    public static final boolean c(iri iriVar) {
        if (iriVar.S() != null) {
            return false;
        }
        bo5 bo5VarH = iriVar.h();
        sxb sxbVar = null;
        qqb qqbVar = bo5VarH instanceof qqb ? (qqb) bo5VarH : null;
        if (qqbVar != null) {
            int i = o06.a;
            sqi sqiVarO0 = qqbVar.o0();
            f39 f39Var = sqiVarO0 instanceof f39 ? (f39) sqiVarO0 : null;
            if (f39Var != null) {
                sxbVar = f39Var.a;
            }
        }
        return x44.r(sxbVar, iriVar.getName());
    }

    public static final j7g d(yr9 yr9Var) {
        yr9Var.getClass();
        xh3 xh3VarA = yr9Var.O().a();
        qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
        if (qqbVar != null) {
            int i = o06.a;
            sqi sqiVarO0 = qqbVar.o0();
            f39 f39Var = sqiVarO0 instanceof f39 ? (f39) sqiVarO0 : null;
            if (f39Var != null) {
                return (j7g) f39Var.b;
            }
        }
        return null;
    }
}

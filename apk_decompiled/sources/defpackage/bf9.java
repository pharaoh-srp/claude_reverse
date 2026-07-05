package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf9 {
    public static final bf9 c;
    public final kj9 a;
    public final boolean b;

    static {
        ww7 ww7Var = he9.a;
        gs9 gs9Var = gs9.I;
        gs9Var.getClass();
        ie9 ie9Var = he9.d;
        gs9 gs9Var2 = ie9Var.b;
        iie iieVar = (gs9Var2 == null || gs9Var2.H - gs9Var.H > 0) ? ie9Var.a : ie9Var.c;
        iieVar.getClass();
        kj9 kj9Var = new kj9(iieVar, iieVar == iie.WARN ? null : iieVar);
        af9 af9Var = af9.E;
        c = new bf9(kj9Var);
    }

    public bf9(kj9 kj9Var) {
        af9 af9Var = af9.E;
        this.a = kj9Var;
        this.b = kj9Var.d || af9Var.invoke(he9.a) == iie.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + af9.E + ')';
    }
}

package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'J' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class e08 {
    public static final k2e G;
    public static final e08 H;
    public static final e08 I;
    public static final e08 J;
    public static final e08 K;
    public static final /* synthetic */ e08[] L;
    public final ww7 E;
    public final String F;

    static {
        e08 e08Var = new e08("Function", 0, pkg.j, "Function");
        H = e08Var;
        e08 e08Var2 = new e08("SuspendFunction", 1, pkg.e, "SuspendFunction");
        I = e08Var2;
        ww7 ww7Var = pkg.h;
        e08 e08Var3 = new e08("KFunction", 2, ww7Var, "KFunction");
        J = e08Var3;
        e08 e08Var4 = new e08("KSuspendFunction", 3, ww7Var, "KSuspendFunction");
        K = e08Var4;
        L = new e08[]{e08Var, e08Var2, e08Var3, e08Var4};
        G = new k2e(19);
    }

    public e08(String str, int i, ww7 ww7Var, String str2) {
        this.E = ww7Var;
        this.F = str2;
    }

    public static e08 valueOf(String str) {
        return (e08) Enum.valueOf(e08.class, str);
    }

    public static e08[] values() {
        return (e08[]) L.clone();
    }

    public final sxb a(int i) {
        return sxb.e(this.F + i);
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 {
    public static final a5 F;
    public static final dk0 G;
    public static final dk0 H;
    public static final /* synthetic */ dk0[] I;
    public static final /* synthetic */ gq6 J;
    public final String E;

    static {
        dk0 dk0Var = new dk0("DEFAULT", 0, "default");
        G = dk0Var;
        dk0 dk0Var2 = new dk0("SYSTEM", 1, "system");
        H = dk0Var2;
        dk0[] dk0VarArr = {dk0Var, dk0Var2};
        I = dk0VarArr;
        J = new gq6(dk0VarArr);
        F = new a5(13);
    }

    public dk0(String str, int i, String str2) {
        this.E = str2;
    }

    public static dk0 valueOf(String str) {
        return (dk0) Enum.valueOf(dk0.class, str);
    }

    public static dk0[] values() {
        return (dk0[]) I.clone();
    }
}

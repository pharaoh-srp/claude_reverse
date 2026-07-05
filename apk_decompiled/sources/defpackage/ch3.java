package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ch3 {
    public static final ch3 E;
    public static final ch3 F;
    public static final ch3 G;
    public static final /* synthetic */ ch3[] H;

    static {
        ch3 ch3Var = new ch3("NONE", 0);
        E = ch3Var;
        ch3 ch3Var2 = new ch3("ALL_JSON_OBJECTS", 1);
        F = ch3Var2;
        ch3 ch3Var3 = new ch3("POLYMORPHIC", 2);
        G = ch3Var3;
        H = new ch3[]{ch3Var, ch3Var2, ch3Var3};
    }

    public static ch3 valueOf(String str) {
        return (ch3) Enum.valueOf(ch3.class, str);
    }

    public static ch3[] values() {
        return (ch3[]) H.clone();
    }
}

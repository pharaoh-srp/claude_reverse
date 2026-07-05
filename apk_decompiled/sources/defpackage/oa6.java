package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oa6 {
    public static final oa6 E;
    public static final oa6 F;
    public static final oa6 G;
    public static final oa6 H;
    public static final /* synthetic */ oa6[] I;

    static {
        oa6 oa6Var = new oa6("Up", 0);
        E = oa6Var;
        oa6 oa6Var2 = new oa6("Drag", 1);
        F = oa6Var2;
        oa6 oa6Var3 = new oa6("Timeout", 2);
        G = oa6Var3;
        oa6 oa6Var4 = new oa6("Cancel", 3);
        H = oa6Var4;
        I = new oa6[]{oa6Var, oa6Var2, oa6Var3, oa6Var4};
    }

    public static oa6 valueOf(String str) {
        return (oa6) Enum.valueOf(oa6.class, str);
    }

    public static oa6[] values() {
        return (oa6[]) I.clone();
    }
}

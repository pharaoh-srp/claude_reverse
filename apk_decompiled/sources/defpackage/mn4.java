package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mn4 {
    public static final mn4 E;
    public static final mn4 F;
    public static final /* synthetic */ mn4[] G;

    static {
        mn4 mn4Var = new mn4("VIEW_APPEAR", 0);
        E = mn4Var;
        mn4 mn4Var2 = new mn4("VIEW_DISAPPEAR", 1);
        F = mn4Var2;
        G = new mn4[]{mn4Var, mn4Var2};
    }

    public static mn4 valueOf(String str) {
        return (mn4) Enum.valueOf(mn4.class, str);
    }

    public static mn4[] values() {
        return (mn4[]) G.clone();
    }
}

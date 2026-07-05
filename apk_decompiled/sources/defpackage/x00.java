package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x00 {
    public static final x00 E;
    public static final x00 F;
    public static final /* synthetic */ x00[] G;

    static {
        x00 x00Var = new x00("SHOW_ORIGINAL", 0);
        E = x00Var;
        x00 x00Var2 = new x00("SHOW_TRANSLATED", 1);
        F = x00Var2;
        G = new x00[]{x00Var, x00Var2};
    }

    public static x00 valueOf(String str) {
        return (x00) Enum.valueOf(x00.class, str);
    }

    public static x00[] values() {
        return (x00[]) G.clone();
    }
}

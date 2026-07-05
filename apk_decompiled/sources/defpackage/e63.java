package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e63 {
    public static final e63 E;
    public static final e63 F;
    public static final /* synthetic */ e63[] G;

    static {
        e63 e63Var = new e63("ERROR", 0);
        E = e63Var;
        e63 e63Var2 = new e63("USER_CANCELLED", 1);
        F = e63Var2;
        G = new e63[]{e63Var, e63Var2};
    }

    public static e63 valueOf(String str) {
        return (e63) Enum.valueOf(e63.class, str);
    }

    public static e63[] values() {
        return (e63[]) G.clone();
    }
}

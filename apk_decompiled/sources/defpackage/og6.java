package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class og6 {
    public static final og6 E;
    public static final og6 F;
    public static final /* synthetic */ og6[] G;

    static {
        og6 og6Var = new og6("Closed", 0);
        E = og6Var;
        og6 og6Var2 = new og6("Open", 1);
        F = og6Var2;
        G = new og6[]{og6Var, og6Var2};
    }

    public static og6 valueOf(String str) {
        return (og6) Enum.valueOf(og6.class, str);
    }

    public static og6[] values() {
        return (og6[]) G.clone();
    }
}

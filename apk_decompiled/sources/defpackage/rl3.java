package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rl3 {
    public static final rl3 E;
    public static final rl3 F;
    public static final /* synthetic */ rl3[] G;

    static {
        rl3 rl3Var = new rl3("INCREASED_LIMITS_5X", 0);
        E = rl3Var;
        rl3 rl3Var2 = new rl3("INCREASED_LIMITS_20X", 1);
        F = rl3Var2;
        G = new rl3[]{rl3Var, rl3Var2};
    }

    public static rl3 valueOf(String str) {
        return (rl3) Enum.valueOf(rl3.class, str);
    }

    public static rl3[] values() {
        return (rl3[]) G.clone();
    }
}

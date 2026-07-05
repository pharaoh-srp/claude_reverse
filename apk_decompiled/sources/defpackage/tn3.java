package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tn3 {
    public static final tn3 E;
    public static final tn3 F;
    public static final /* synthetic */ tn3[] G;

    static {
        tn3 tn3Var = new tn3("Jumping", 0);
        E = tn3Var;
        tn3 tn3Var2 = new tn3("Dancing", 1);
        F = tn3Var2;
        G = new tn3[]{tn3Var, tn3Var2};
    }

    public static tn3 valueOf(String str) {
        return (tn3) Enum.valueOf(tn3.class, str);
    }

    public static tn3[] values() {
        return (tn3[]) G.clone();
    }
}

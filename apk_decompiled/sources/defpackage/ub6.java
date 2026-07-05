package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ub6 {
    public static final ub6 E;
    public static final ub6 F;
    public static final ub6 G;
    public static final /* synthetic */ ub6[] H;

    static {
        ub6 ub6Var = new ub6("Yes", 0);
        E = ub6Var;
        ub6 ub6Var2 = new ub6("No", 1);
        F = ub6Var2;
        ub6 ub6Var3 = new ub6("NotInitialized", 2);
        G = ub6Var3;
        H = new ub6[]{ub6Var, ub6Var2, ub6Var3};
    }

    public static ub6 valueOf(String str) {
        return (ub6) Enum.valueOf(ub6.class, str);
    }

    public static ub6[] values() {
        return (ub6[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ub9 {
    public static final ub9 E;
    public static final ub9 F;
    public static final ub9 G;
    public static final ub9 H;
    public static final /* synthetic */ ub9[] I;

    static {
        ub9 ub9Var = new ub9("IGNORED", 0);
        E = ub9Var;
        ub9 ub9Var2 = new ub9("SCHEDULED", 1);
        F = ub9Var2;
        ub9 ub9Var3 = new ub9("DEFERRED", 2);
        G = ub9Var3;
        ub9 ub9Var4 = new ub9("IMMINENT", 3);
        H = ub9Var4;
        I = new ub9[]{ub9Var, ub9Var2, ub9Var3, ub9Var4};
    }

    public static ub9 valueOf(String str) {
        return (ub9) Enum.valueOf(ub9.class, str);
    }

    public static ub9[] values() {
        return (ub9[]) I.clone();
    }
}

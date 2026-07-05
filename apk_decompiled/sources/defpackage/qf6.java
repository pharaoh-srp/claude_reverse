package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qf6 {
    public static final qf6 E;
    public static final qf6 F;
    public static final /* synthetic */ qf6[] G;

    static {
        qf6 qf6Var = new qf6("NONE", 0);
        E = qf6Var;
        qf6 qf6Var2 = new qf6("NEW_FEATURE", 1);
        F = qf6Var2;
        G = new qf6[]{qf6Var, qf6Var2};
    }

    public static qf6 valueOf(String str) {
        return (qf6) Enum.valueOf(qf6.class, str);
    }

    public static qf6[] values() {
        return (qf6[]) G.clone();
    }
}

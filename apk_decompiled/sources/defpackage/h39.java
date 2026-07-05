package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h39 {
    public static final h39 E;
    public static final h39 F;
    public static final /* synthetic */ h39[] G;

    static {
        h39 h39Var = new h39("Connected", 0);
        E = h39Var;
        h39 h39Var2 = new h39("Warning", 1);
        F = h39Var2;
        G = new h39[]{h39Var, h39Var2};
    }

    public static h39 valueOf(String str) {
        return (h39) Enum.valueOf(h39.class, str);
    }

    public static h39[] values() {
        return (h39[]) G.clone();
    }
}

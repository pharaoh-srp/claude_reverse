package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public static final hb0 E;
    public static final hb0 F;
    public static final /* synthetic */ hb0[] G;

    static {
        hb0 hb0Var = new hb0("BoundReached", 0);
        E = hb0Var;
        hb0 hb0Var2 = new hb0("Finished", 1);
        F = hb0Var2;
        G = new hb0[]{hb0Var, hb0Var2};
    }

    public static hb0 valueOf(String str) {
        return (hb0) Enum.valueOf(hb0.class, str);
    }

    public static hb0[] values() {
        return (hb0[]) G.clone();
    }
}

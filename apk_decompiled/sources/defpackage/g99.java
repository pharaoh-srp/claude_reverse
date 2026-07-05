package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g99 {
    public static final g99 E;
    public static final g99 F;
    public static final g99 G;
    public static final /* synthetic */ g99[] H;

    static {
        g99 g99Var = new g99("USER", 0);
        E = g99Var;
        g99 g99Var2 = new g99("MAINTAINER", 1);
        F = g99Var2;
        g99 g99Var3 = new g99("TELEMETRY", 2);
        G = g99Var3;
        H = new g99[]{g99Var, g99Var2, g99Var3};
    }

    public static g99 valueOf(String str) {
        return (g99) Enum.valueOf(g99.class, str);
    }

    public static g99[] values() {
        return (g99[]) H.clone();
    }
}

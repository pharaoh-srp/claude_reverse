package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ag6 {
    public static final ag6 E;
    public static final ag6 F;
    public static final ag6 G;
    public static final /* synthetic */ ag6[] H;

    static {
        ag6 ag6Var = new ag6("COLLAPSED", 0);
        E = ag6Var;
        ag6 ag6Var2 = new ag6("EXPANDED", 1);
        F = ag6Var2;
        ag6 ag6Var3 = new ag6("EDITING", 2);
        G = ag6Var3;
        H = new ag6[]{ag6Var, ag6Var2, ag6Var3};
    }

    public static ag6 valueOf(String str) {
        return (ag6) Enum.valueOf(ag6.class, str);
    }

    public static ag6[] values() {
        return (ag6[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hc5 {
    public static final hc5 E;
    public static final hc5 F;
    public static final hc5 G;
    public static final /* synthetic */ hc5[] H;

    static {
        hc5 hc5Var = new hc5("CROSSED", 0);
        E = hc5Var;
        hc5 hc5Var2 = new hc5("NOT_CROSSED", 1);
        F = hc5Var2;
        hc5 hc5Var3 = new hc5("COLLAPSED", 2);
        G = hc5Var3;
        H = new hc5[]{hc5Var, hc5Var2, hc5Var3};
    }

    public static hc5 valueOf(String str) {
        return (hc5) Enum.valueOf(hc5.class, str);
    }

    public static hc5[] values() {
        return (hc5[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hm3 {
    public static final hm3 E;
    public static final hm3 F;
    public static final hm3 G;
    public static final /* synthetic */ hm3[] H;

    static {
        hm3 hm3Var = new hm3("NONE", 0);
        E = hm3Var;
        hm3 hm3Var2 = new hm3("MENU", 1);
        F = hm3Var2;
        hm3 hm3Var3 = new hm3("BACK", 2);
        G = hm3Var3;
        H = new hm3[]{hm3Var, hm3Var2, hm3Var3};
    }

    public static hm3 valueOf(String str) {
        return (hm3) Enum.valueOf(hm3.class, str);
    }

    public static hm3[] values() {
        return (hm3[]) H.clone();
    }
}

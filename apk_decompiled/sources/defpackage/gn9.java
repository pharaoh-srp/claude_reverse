package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gn9 {
    public static final gn9 E;
    public static final gn9 F;
    public static final gn9 G;
    public static final /* synthetic */ gn9[] H;

    static {
        gn9 gn9Var = new gn9("INSTANCE", 0);
        E = gn9Var;
        gn9 gn9Var2 = new gn9("CONTEXT", 1);
        gn9 gn9Var3 = new gn9("EXTENSION_RECEIVER", 2);
        F = gn9Var3;
        gn9 gn9Var4 = new gn9("VALUE", 3);
        G = gn9Var4;
        H = new gn9[]{gn9Var, gn9Var2, gn9Var3, gn9Var4};
    }

    public static gn9 valueOf(String str) {
        return (gn9) Enum.valueOf(gn9.class, str);
    }

    public static gn9[] values() {
        return (gn9[]) H.clone();
    }
}

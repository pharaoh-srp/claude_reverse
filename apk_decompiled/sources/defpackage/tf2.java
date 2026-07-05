package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tf2 {
    public static final hj6 E;
    public static final tf2 F;
    public static final tf2 G;
    public static final tf2 H;
    public static final tf2 I;
    public static final /* synthetic */ tf2[] J;

    static {
        tf2 tf2Var = new tf2("Single", 0);
        F = tf2Var;
        tf2 tf2Var2 = new tf2("First", 1);
        G = tf2Var2;
        tf2 tf2Var3 = new tf2("Middle", 2);
        H = tf2Var3;
        tf2 tf2Var4 = new tf2("Last", 3);
        I = tf2Var4;
        J = new tf2[]{tf2Var, tf2Var2, tf2Var3, tf2Var4};
        E = new hj6(28);
    }

    public static tf2 valueOf(String str) {
        return (tf2) Enum.valueOf(tf2.class, str);
    }

    public static tf2[] values() {
        return (tf2[]) J.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v7 {
    public static final v7 E;
    public static final v7 F;
    public static final v7 G;
    public static final /* synthetic */ v7[] H;

    static {
        v7 v7Var = new v7("SAME_ACCOUNT", 0);
        E = v7Var;
        v7 v7Var2 = new v7("SWITCHED_ACCOUNT", 1);
        F = v7Var2;
        v7 v7Var3 = new v7("DISMISSED", 2);
        G = v7Var3;
        H = new v7[]{v7Var, v7Var2, v7Var3};
    }

    public static v7 valueOf(String str) {
        return (v7) Enum.valueOf(v7.class, str);
    }

    public static v7[] values() {
        return (v7[]) H.clone();
    }
}

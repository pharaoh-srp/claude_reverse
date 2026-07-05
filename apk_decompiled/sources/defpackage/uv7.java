package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uv7 {
    public static final uv7 E;
    public static final uv7 F;
    public static final uv7 G;
    public static final uv7 H;
    public static final uv7 I;
    public static final uv7 J;
    public static final uv7 K;
    public static final /* synthetic */ uv7[] L;

    static {
        uv7 uv7Var = new uv7("SHOW_DISCLAIMER", 0);
        E = uv7Var;
        uv7 uv7Var2 = new uv7("SHOW_WORKING_TEXT", 1);
        F = uv7Var2;
        uv7 uv7Var3 = new uv7("SHOW_POLLING_TEXT", 2);
        G = uv7Var3;
        uv7 uv7Var4 = new uv7("SHOW_POLLING_OFFLINE", 3);
        H = uv7Var4;
        uv7 uv7Var5 = new uv7("SHOW_RETRYING_TEXT", 4);
        I = uv7Var5;
        uv7 uv7Var6 = new uv7("SHOW_WAITING_FOR_NETWORK", 5);
        J = uv7Var6;
        uv7 uv7Var7 = new uv7("NONE", 6);
        K = uv7Var7;
        L = new uv7[]{uv7Var, uv7Var2, uv7Var3, uv7Var4, uv7Var5, uv7Var6, uv7Var7};
    }

    public static uv7 valueOf(String str) {
        return (uv7) Enum.valueOf(uv7.class, str);
    }

    public static uv7[] values() {
        return (uv7[]) L.clone();
    }
}

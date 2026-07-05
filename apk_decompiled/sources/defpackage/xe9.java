package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xe9 {
    public static final xe9 E;
    public static final xe9 F;
    public static final xe9 G;
    public static final xe9 H;
    public static final xe9 I;
    public static final xe9 J;
    public static final xe9 K;
    public static final xe9 L;
    public static final xe9 M;
    public static final xe9 N;
    public static final /* synthetic */ xe9[] O;

    static {
        xe9 xe9Var = new xe9("VOID", 0);
        E = xe9Var;
        xe9 xe9Var2 = new xe9("INT", 1);
        F = xe9Var2;
        xe9 xe9Var3 = new xe9("LONG", 2);
        G = xe9Var3;
        xe9 xe9Var4 = new xe9("FLOAT", 3);
        H = xe9Var4;
        xe9 xe9Var5 = new xe9("DOUBLE", 4);
        I = xe9Var5;
        xe9 xe9Var6 = new xe9("BOOLEAN", 5);
        J = xe9Var6;
        xe9 xe9Var7 = new xe9("STRING", 6);
        K = xe9Var7;
        g22 g22Var = k22.F;
        xe9 xe9Var8 = new xe9("BYTE_STRING", 7);
        L = xe9Var8;
        xe9 xe9Var9 = new xe9("ENUM", 8);
        M = xe9Var9;
        xe9 xe9Var10 = new xe9("MESSAGE", 9);
        N = xe9Var10;
        O = new xe9[]{xe9Var, xe9Var2, xe9Var3, xe9Var4, xe9Var5, xe9Var6, xe9Var7, xe9Var8, xe9Var9, xe9Var10};
    }

    public static xe9 valueOf(String str) {
        return (xe9) Enum.valueOf(xe9.class, str);
    }

    public static xe9[] values() {
        return (xe9[]) O.clone();
    }
}

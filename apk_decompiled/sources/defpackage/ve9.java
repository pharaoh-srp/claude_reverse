package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ve9 {
    public static final ve9 E;
    public static final ve9 F;
    public static final ve9 G;
    public static final ve9 H;
    public static final ve9 I;
    public static final ve9 J;
    public static final ve9 K;
    public static final ve9 L;
    public static final ve9 M;
    public static final ve9 N;
    public static final /* synthetic */ ve9[] O;

    static {
        ve9 ve9Var = new ve9("VOID", 0);
        E = ve9Var;
        ve9 ve9Var2 = new ve9("INT", 1);
        F = ve9Var2;
        ve9 ve9Var3 = new ve9("LONG", 2);
        G = ve9Var3;
        ve9 ve9Var4 = new ve9("FLOAT", 3);
        H = ve9Var4;
        ve9 ve9Var5 = new ve9("DOUBLE", 4);
        I = ve9Var5;
        ve9 ve9Var6 = new ve9("BOOLEAN", 5);
        J = ve9Var6;
        ve9 ve9Var7 = new ve9("STRING", 6);
        K = ve9Var7;
        e22 e22Var = e22.G;
        ve9 ve9Var8 = new ve9("BYTE_STRING", 7);
        L = ve9Var8;
        ve9 ve9Var9 = new ve9("ENUM", 8);
        M = ve9Var9;
        ve9 ve9Var10 = new ve9("MESSAGE", 9);
        N = ve9Var10;
        O = new ve9[]{ve9Var, ve9Var2, ve9Var3, ve9Var4, ve9Var5, ve9Var6, ve9Var7, ve9Var8, ve9Var9, ve9Var10};
    }

    public static ve9 valueOf(String str) {
        return (ve9) Enum.valueOf(ve9.class, str);
    }

    public static ve9[] values() {
        return (ve9[]) O.clone();
    }
}

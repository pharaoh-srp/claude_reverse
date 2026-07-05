package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class we9 {
    public static final we9 E;
    public static final we9 F;
    public static final we9 G;
    public static final we9 H;
    public static final we9 I;
    public static final we9 J;
    public static final we9 K;
    public static final we9 L;
    public static final we9 M;
    public static final we9 N;
    public static final /* synthetic */ we9[] O;

    static {
        we9 we9Var = new we9("VOID", 0);
        E = we9Var;
        we9 we9Var2 = new we9("INT", 1);
        F = we9Var2;
        we9 we9Var3 = new we9("LONG", 2);
        G = we9Var3;
        we9 we9Var4 = new we9("FLOAT", 3);
        H = we9Var4;
        we9 we9Var5 = new we9("DOUBLE", 4);
        I = we9Var5;
        we9 we9Var6 = new we9("BOOLEAN", 5);
        J = we9Var6;
        we9 we9Var7 = new we9("STRING", 6);
        K = we9Var7;
        f22 f22Var = f22.G;
        we9 we9Var8 = new we9("BYTE_STRING", 7);
        L = we9Var8;
        we9 we9Var9 = new we9("ENUM", 8);
        M = we9Var9;
        we9 we9Var10 = new we9("MESSAGE", 9);
        N = we9Var10;
        O = new we9[]{we9Var, we9Var2, we9Var3, we9Var4, we9Var5, we9Var6, we9Var7, we9Var8, we9Var9, we9Var10};
    }

    public static we9 valueOf(String str) {
        return (we9) Enum.valueOf(we9.class, str);
    }

    public static we9[] values() {
        return (we9[]) O.clone();
    }
}

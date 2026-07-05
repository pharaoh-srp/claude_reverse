package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ye9 {
    public static final ye9 E;
    public static final ye9 F;
    public static final ye9 G;
    public static final ye9 H;
    public static final ye9 I;
    public static final ye9 J;
    public static final ye9 K;
    public static final ye9 L;
    public static final ye9 M;
    public static final ye9 N;
    public static final /* synthetic */ ye9[] O;

    static {
        ye9 ye9Var = new ye9("VOID", 0);
        E = ye9Var;
        ye9 ye9Var2 = new ye9("INT", 1);
        F = ye9Var2;
        ye9 ye9Var3 = new ye9("LONG", 2);
        G = ye9Var3;
        ye9 ye9Var4 = new ye9("FLOAT", 3);
        H = ye9Var4;
        ye9 ye9Var5 = new ye9("DOUBLE", 4);
        I = ye9Var5;
        ye9 ye9Var6 = new ye9("BOOLEAN", 5);
        J = ye9Var6;
        ye9 ye9Var7 = new ye9("STRING", 6);
        K = ye9Var7;
        i22 i22Var = i22.G;
        ye9 ye9Var8 = new ye9("BYTE_STRING", 7);
        L = ye9Var8;
        ye9 ye9Var9 = new ye9("ENUM", 8);
        M = ye9Var9;
        ye9 ye9Var10 = new ye9("MESSAGE", 9);
        N = ye9Var10;
        O = new ye9[]{ye9Var, ye9Var2, ye9Var3, ye9Var4, ye9Var5, ye9Var6, ye9Var7, ye9Var8, ye9Var9, ye9Var10};
    }

    public static ye9 valueOf(String str) {
        return (ye9) Enum.valueOf(ye9.class, str);
    }

    public static ye9[] values() {
        return (ye9[]) O.clone();
    }
}

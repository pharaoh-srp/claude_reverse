package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bi9 {
    public static final bi9 E;
    public static final bi9 F;
    public static final bi9 G;
    public static final bi9 H;
    public static final bi9 I;
    public static final bi9 J;
    public static final bi9 K;
    public static final bi9 L;
    public static final bi9 M;
    public static final bi9 N;
    public static final /* synthetic */ bi9[] O;

    static {
        bi9 bi9Var = new bi9("BEGIN_ARRAY", 0);
        E = bi9Var;
        bi9 bi9Var2 = new bi9("END_ARRAY", 1);
        F = bi9Var2;
        bi9 bi9Var3 = new bi9("BEGIN_OBJECT", 2);
        G = bi9Var3;
        bi9 bi9Var4 = new bi9("END_OBJECT", 3);
        H = bi9Var4;
        bi9 bi9Var5 = new bi9("NAME", 4);
        I = bi9Var5;
        bi9 bi9Var6 = new bi9("STRING", 5);
        J = bi9Var6;
        bi9 bi9Var7 = new bi9("NUMBER", 6);
        K = bi9Var7;
        bi9 bi9Var8 = new bi9("BOOLEAN", 7);
        L = bi9Var8;
        bi9 bi9Var9 = new bi9("NULL", 8);
        M = bi9Var9;
        bi9 bi9Var10 = new bi9("END_DOCUMENT", 9);
        N = bi9Var10;
        O = new bi9[]{bi9Var, bi9Var2, bi9Var3, bi9Var4, bi9Var5, bi9Var6, bi9Var7, bi9Var8, bi9Var9, bi9Var10};
    }

    public static bi9 valueOf(String str) {
        return (bi9) Enum.valueOf(bi9.class, str);
    }

    public static bi9[] values() {
        return (bi9[]) O.clone();
    }
}

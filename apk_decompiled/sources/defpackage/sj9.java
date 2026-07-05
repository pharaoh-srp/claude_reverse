package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sj9 {
    public static final sj9 E;
    public static final sj9 F;
    public static final sj9 G;
    public static final sj9 H;
    public static final /* synthetic */ sj9[] I;

    static {
        sj9 sj9Var = new sj9("HIDDEN", 0);
        E = sj9Var;
        sj9 sj9Var2 = new sj9("VISIBLE", 1);
        F = sj9Var2;
        sj9 sj9Var3 = new sj9("NOT_CONSIDERED", 2);
        G = sj9Var3;
        sj9 sj9Var4 = new sj9("DROP", 3);
        H = sj9Var4;
        I = new sj9[]{sj9Var, sj9Var2, sj9Var3, sj9Var4};
    }

    public static sj9 valueOf(String str) {
        return (sj9) Enum.valueOf(sj9.class, str);
    }

    public static sj9[] values() {
        return (sj9[]) I.clone();
    }
}

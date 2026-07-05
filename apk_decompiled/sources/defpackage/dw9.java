package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dw9 {
    public static final dw9 E;
    public static final dw9 F;
    public static final dw9 G;
    public static final dw9 H;
    public static final /* synthetic */ dw9[] I;

    static {
        dw9 dw9Var = new dw9("Wrap", 0);
        E = dw9Var;
        dw9 dw9Var2 = new dw9("Fixed", 1);
        F = dw9Var2;
        dw9 dw9Var3 = new dw9("Expand", 2);
        G = dw9Var3;
        dw9 dw9Var4 = new dw9("MatchParent", 3);
        H = dw9Var4;
        I = new dw9[]{dw9Var, dw9Var2, dw9Var3, dw9Var4};
    }

    public static dw9 valueOf(String str) {
        return (dw9) Enum.valueOf(dw9.class, str);
    }

    public static dw9[] values() {
        return (dw9[]) I.clone();
    }
}

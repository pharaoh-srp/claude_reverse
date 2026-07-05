package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bs0 {
    public static final bs0 E;
    public static final bs0 F;
    public static final bs0 G;
    public static final bs0 H;
    public static final bs0 I;
    public static final /* synthetic */ bs0[] J;

    static {
        bs0 bs0Var = new bs0("CODE", 0);
        E = bs0Var;
        bs0 bs0Var2 = new bs0("INTERACTIVE", 1);
        F = bs0Var2;
        bs0 bs0Var3 = new bs0("IMAGE", 2);
        G = bs0Var3;
        bs0 bs0Var4 = new bs0("DOCUMENT", 3);
        H = bs0Var4;
        bs0 bs0Var5 = new bs0("DIAGRAM", 4);
        I = bs0Var5;
        J = new bs0[]{bs0Var, bs0Var2, bs0Var3, bs0Var4, bs0Var5};
    }

    public static bs0 valueOf(String str) {
        return (bs0) Enum.valueOf(bs0.class, str);
    }

    public static bs0[] values() {
        return (bs0[]) J.clone();
    }
}

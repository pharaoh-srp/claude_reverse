package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l29 {
    public static final l29 E;
    public static final l29 F;
    public static final l29 G;
    public static final l29 H;
    public static final l29 I;
    public static final /* synthetic */ l29[] J;

    static {
        l29 l29Var = new l29("PENDING", 0);
        E = l29Var;
        l29 l29Var2 = new l29("RUNNING", 1);
        F = l29Var2;
        l29 l29Var3 = new l29("COMPLETED", 2);
        G = l29Var3;
        l29 l29Var4 = new l29("FAILED", 3);
        H = l29Var4;
        l29 l29Var5 = new l29("SKIPPED", 4);
        I = l29Var5;
        J = new l29[]{l29Var, l29Var2, l29Var3, l29Var4, l29Var5};
    }

    public static l29 valueOf(String str) {
        return (l29) Enum.valueOf(l29.class, str);
    }

    public static l29[] values() {
        return (l29[]) J.clone();
    }
}

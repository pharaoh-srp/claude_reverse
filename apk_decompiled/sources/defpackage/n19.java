package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n19 {
    public static final n19 E;
    public static final n19 F;
    public static final n19 G;
    public static final /* synthetic */ n19[] H;

    static {
        n19 n19Var = new n19("Yes", 0);
        E = n19Var;
        n19 n19Var2 = new n19("No", 1);
        F = n19Var2;
        n19 n19Var3 = new n19("NotInitialized", 2);
        G = n19Var3;
        H = new n19[]{n19Var, n19Var2, n19Var3};
    }

    public static n19 valueOf(String str) {
        return (n19) Enum.valueOf(n19.class, str);
    }

    public static n19[] values() {
        return (n19[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rg5 {
    public static final rg5 E;
    public static final rg5 F;
    public static final rg5 G;
    public static final rg5 H;
    public static final /* synthetic */ rg5[] I;

    static {
        rg5 rg5Var = new rg5("MEMORY_CACHE", 0);
        E = rg5Var;
        rg5 rg5Var2 = new rg5("MEMORY", 1);
        F = rg5Var2;
        rg5 rg5Var3 = new rg5("DISK", 2);
        G = rg5Var3;
        rg5 rg5Var4 = new rg5("NETWORK", 3);
        H = rg5Var4;
        I = new rg5[]{rg5Var, rg5Var2, rg5Var3, rg5Var4};
    }

    public static rg5 valueOf(String str) {
        return (rg5) Enum.valueOf(rg5.class, str);
    }

    public static rg5[] values() {
        return (rg5[]) I.clone();
    }
}

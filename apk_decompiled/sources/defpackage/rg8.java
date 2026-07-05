package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rg8 {
    public static final rg8 E;
    public static final rg8 F;
    public static final /* synthetic */ rg8[] G;

    static {
        rg8 rg8Var = new rg8("Effect", 0);
        E = rg8Var;
        rg8 rg8Var2 = new rg8("Source", 1);
        F = rg8Var2;
        G = new rg8[]{rg8Var, rg8Var2};
    }

    public static rg8 valueOf(String str) {
        return (rg8) Enum.valueOf(rg8.class, str);
    }

    public static rg8[] values() {
        return (rg8[]) G.clone();
    }
}

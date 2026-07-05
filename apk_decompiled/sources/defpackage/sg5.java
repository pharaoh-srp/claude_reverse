package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sg5 {
    public static final sg5 E;
    public static final sg5 F;
    public static final sg5 G;
    public static final sg5 H;
    public static final /* synthetic */ sg5[] I;

    static {
        sg5 sg5Var = new sg5("MEMORY_CACHE", 0);
        E = sg5Var;
        sg5 sg5Var2 = new sg5("MEMORY", 1);
        F = sg5Var2;
        sg5 sg5Var3 = new sg5("DISK", 2);
        G = sg5Var3;
        sg5 sg5Var4 = new sg5("NETWORK", 3);
        H = sg5Var4;
        I = new sg5[]{sg5Var, sg5Var2, sg5Var3, sg5Var4};
    }

    public static sg5 valueOf(String str) {
        return (sg5) Enum.valueOf(sg5.class, str);
    }

    public static sg5[] values() {
        return (sg5[]) I.clone();
    }
}

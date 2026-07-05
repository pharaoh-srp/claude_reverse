package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ub5 {
    public static final ub5 E;
    public static final ub5 F;
    public static final ub5 G;
    public static final ub5 H;
    public static final ub5 I;
    public static final /* synthetic */ ub5[] J;

    static {
        ub5 ub5Var = new ub5("CRONET_SOURCE_UNSPECIFIED", 0);
        E = ub5Var;
        ub5 ub5Var2 = new ub5("CRONET_SOURCE_STATICALLY_LINKED", 1);
        F = ub5Var2;
        ub5 ub5Var3 = new ub5("CRONET_SOURCE_PLAY_SERVICES", 2);
        G = ub5Var3;
        ub5 ub5Var4 = new ub5("CRONET_SOURCE_FALLBACK", 3);
        H = ub5Var4;
        ub5 ub5Var5 = new ub5("CRONET_SOURCE_PLATFORM", 4);
        I = ub5Var5;
        J = new ub5[]{ub5Var, ub5Var2, ub5Var3, ub5Var4, ub5Var5, new ub5("CRONET_SOURCE_FAKE", 5)};
    }

    public static ub5 valueOf(String str) {
        return (ub5) Enum.valueOf(ub5.class, str);
    }

    public static ub5[] values() {
        return (ub5[]) J.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ek4 {
    public static final ek4 E;
    public static final ek4 F;
    public static final ek4 G;
    public static final ek4 H;
    public static final /* synthetic */ ek4[] I;

    static {
        ek4 ek4Var = new ek4("NotInstalled", 0);
        E = ek4Var;
        ek4 ek4Var2 = new ek4("Connected", 1);
        F = ek4Var2;
        ek4 ek4Var3 = new ek4("NeedsReconnect", 2);
        G = ek4Var3;
        ek4 ek4Var4 = new ek4("Restricted", 3);
        H = ek4Var4;
        I = new ek4[]{ek4Var, ek4Var2, ek4Var3, ek4Var4};
    }

    public static ek4 valueOf(String str) {
        return (ek4) Enum.valueOf(ek4.class, str);
    }

    public static ek4[] values() {
        return (ek4[]) I.clone();
    }
}

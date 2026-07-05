package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ms4 {
    public static final ms4 E;
    public static final ms4 F;
    public static final ms4 G;
    public static final ms4 H;
    public static final ms4 I;
    public static final /* synthetic */ ms4[] J;

    static {
        ms4 ms4Var = new ms4("NotInstalled", 0);
        E = ms4Var;
        ms4 ms4Var2 = new ms4("ConnectedAllowed", 1);
        F = ms4Var2;
        ms4 ms4Var3 = new ms4("ConnectedNeedsAllow", 2);
        G = ms4Var3;
        ms4 ms4Var4 = new ms4("NeedsReconnect", 3);
        H = ms4Var4;
        ms4 ms4Var5 = new ms4("Restricted", 4);
        I = ms4Var5;
        J = new ms4[]{ms4Var, ms4Var2, ms4Var3, ms4Var4, ms4Var5};
    }

    public static ms4 valueOf(String str) {
        return (ms4) Enum.valueOf(ms4.class, str);
    }

    public static ms4[] values() {
        return (ms4[]) J.clone();
    }
}

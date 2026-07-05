package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c49 {
    public static final c49 E;
    public static final c49 F;
    public static final c49 G;
    public static final c49 H;
    public static final c49 I;
    public static final c49 J;
    public static final /* synthetic */ c49[] K;

    static {
        c49 c49Var = new c49("Idle", 0);
        E = c49Var;
        c49 c49Var2 = new c49("Microphone", 1);
        F = c49Var2;
        c49 c49Var3 = new c49("Ready", 2);
        G = c49Var3;
        c49 c49Var4 = new c49("Sending", 3);
        H = c49Var4;
        c49 c49Var5 = new c49("Receiving", 4);
        I = c49Var5;
        c49 c49Var6 = new c49("Interrupting", 5);
        J = c49Var6;
        K = new c49[]{c49Var, c49Var2, c49Var3, c49Var4, c49Var5, c49Var6};
    }

    public static c49 valueOf(String str) {
        return (c49) Enum.valueOf(c49.class, str);
    }

    public static c49[] values() {
        return (c49[]) K.clone();
    }
}

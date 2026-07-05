package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dk4 {
    public static final dk4 E;
    public static final dk4 F;
    public static final dk4 G;
    public static final dk4 H;
    public static final /* synthetic */ dk4[] I;

    static {
        dk4 dk4Var = new dk4("Prompting", 0);
        E = dk4Var;
        dk4 dk4Var2 = new dk4("SavingTurnOn", 1);
        F = dk4Var2;
        dk4 dk4Var3 = new dk4("SavingNotNow", 2);
        G = dk4Var3;
        dk4 dk4Var4 = new dk4("Declined", 3);
        H = dk4Var4;
        I = new dk4[]{dk4Var, dk4Var2, dk4Var3, dk4Var4};
    }

    public static dk4 valueOf(String str) {
        return (dk4) Enum.valueOf(dk4.class, str);
    }

    public static dk4[] values() {
        return (dk4[]) I.clone();
    }
}

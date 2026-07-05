package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qd4 {
    public static final qd4 E;
    public static final qd4 F;
    public static final qd4 G;
    public static final /* synthetic */ qd4[] H;

    static {
        qd4 qd4Var = new qd4("Toolbar", 0);
        E = qd4Var;
        qd4 qd4Var2 = new qd4("TapDictation", 1);
        F = qd4Var2;
        qd4 qd4Var3 = new qd4("HoldDictation", 2);
        G = qd4Var3;
        H = new qd4[]{qd4Var, qd4Var2, qd4Var3};
    }

    public static qd4 valueOf(String str) {
        return (qd4) Enum.valueOf(qd4.class, str);
    }

    public static qd4[] values() {
        return (qd4[]) H.clone();
    }
}

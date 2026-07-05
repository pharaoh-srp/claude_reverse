package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qn8 {
    public static final qn8 E;
    public static final qn8 F;
    public static final /* synthetic */ qn8[] G;

    static {
        qn8 qn8Var = new qn8("SEND", 0);
        E = qn8Var;
        qn8 qn8Var2 = new qn8("CANCEL", 1);
        F = qn8Var2;
        G = new qn8[]{qn8Var, qn8Var2};
    }

    public static qn8 valueOf(String str) {
        return (qn8) Enum.valueOf(qn8.class, str);
    }

    public static qn8[] values() {
        return (qn8[]) G.clone();
    }
}

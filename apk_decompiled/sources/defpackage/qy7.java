package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qy7 {
    public static final qy7 E;
    public static final qy7 F;
    public static final qy7 G;
    public static final qy7 H;
    public static final qy7 I;
    public static final /* synthetic */ qy7[] J;

    static {
        qy7 qy7Var = new qy7("ON_CONFIGURE", 0);
        E = qy7Var;
        qy7 qy7Var2 = new qy7("ON_CREATE", 1);
        F = qy7Var2;
        qy7 qy7Var3 = new qy7("ON_UPGRADE", 2);
        G = qy7Var3;
        qy7 qy7Var4 = new qy7("ON_DOWNGRADE", 3);
        H = qy7Var4;
        qy7 qy7Var5 = new qy7("ON_OPEN", 4);
        I = qy7Var5;
        J = new qy7[]{qy7Var, qy7Var2, qy7Var3, qy7Var4, qy7Var5};
    }

    public static qy7 valueOf(String str) {
        return (qy7) Enum.valueOf(qy7.class, str);
    }

    public static qy7[] values() {
        return (qy7[]) J.clone();
    }
}

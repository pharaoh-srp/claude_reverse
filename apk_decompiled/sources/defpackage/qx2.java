package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qx2 {
    public static final qx2 E;
    public static final qx2 F;
    public static final /* synthetic */ qx2[] G;

    static {
        qx2 qx2Var = new qx2("Rename", 0);
        E = qx2Var;
        qx2 qx2Var2 = new qx2("Delete", 1);
        F = qx2Var2;
        G = new qx2[]{qx2Var, qx2Var2};
    }

    public static qx2 valueOf(String str) {
        return (qx2) Enum.valueOf(qx2.class, str);
    }

    public static qx2[] values() {
        return (qx2[]) G.clone();
    }
}

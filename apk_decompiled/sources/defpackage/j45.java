package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j45 {
    public static final j45 E;
    public static final j45 F;
    public static final j45 G;
    public static final j45 H;
    public static final j45 I;
    public static final /* synthetic */ j45[] J;

    static {
        j45 j45Var = new j45("CPU_ACQUIRED", 0);
        E = j45Var;
        j45 j45Var2 = new j45("BLOCKING", 1);
        F = j45Var2;
        j45 j45Var3 = new j45("PARKING", 2);
        G = j45Var3;
        j45 j45Var4 = new j45("DORMANT", 3);
        H = j45Var4;
        j45 j45Var5 = new j45("TERMINATED", 4);
        I = j45Var5;
        J = new j45[]{j45Var, j45Var2, j45Var3, j45Var4, j45Var5};
    }

    public static j45 valueOf(String str) {
        return (j45) Enum.valueOf(j45.class, str);
    }

    public static j45[] values() {
        return (j45[]) J.clone();
    }
}

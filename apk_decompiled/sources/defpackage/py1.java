package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class py1 {
    public static final py1 E;
    public static final py1 F;
    public static final py1 G;
    public static final /* synthetic */ py1[] H;

    static {
        py1 py1Var = new py1("SUSPEND", 0);
        E = py1Var;
        py1 py1Var2 = new py1("DROP_OLDEST", 1);
        F = py1Var2;
        py1 py1Var3 = new py1("DROP_LATEST", 2);
        G = py1Var3;
        H = new py1[]{py1Var, py1Var2, py1Var3};
    }

    public static py1 valueOf(String str) {
        return (py1) Enum.valueOf(py1.class, str);
    }

    public static py1[] values() {
        return (py1[]) H.clone();
    }
}

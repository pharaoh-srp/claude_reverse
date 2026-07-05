package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ye3 {
    public static final ye3 E;
    public static final ye3 F;
    public static final ye3 G;
    public static final /* synthetic */ ye3[] H;

    static {
        ye3 ye3Var = new ye3("SINGLE", 0);
        E = ye3Var;
        ye3 ye3Var2 = new ye3("DUAL", 1);
        F = ye3Var2;
        ye3 ye3Var3 = new ye3("TRIPLE", 2);
        G = ye3Var3;
        H = new ye3[]{ye3Var, ye3Var2, ye3Var3};
    }

    public static ye3 valueOf(String str) {
        return (ye3) Enum.valueOf(ye3.class, str);
    }

    public static ye3[] values() {
        return (ye3[]) H.clone();
    }
}

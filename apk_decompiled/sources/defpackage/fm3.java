package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fm3 {
    public static final fm3 E;
    public static final fm3 F;
    public static final fm3 G;
    public static final fm3 H;
    public static final /* synthetic */ fm3[] I;

    static {
        fm3 fm3Var = new fm3("PAUSED", 0);
        E = fm3Var;
        fm3 fm3Var2 = new fm3("THINKING", 1);
        F = fm3Var2;
        fm3 fm3Var3 = new fm3("WRITING", 2);
        G = fm3Var3;
        fm3 fm3Var4 = new fm3("SHIMMER", 3);
        H = fm3Var4;
        I = new fm3[]{fm3Var, fm3Var2, fm3Var3, fm3Var4};
    }

    public static fm3 valueOf(String str) {
        return (fm3) Enum.valueOf(fm3.class, str);
    }

    public static fm3[] values() {
        return (fm3[]) I.clone();
    }
}

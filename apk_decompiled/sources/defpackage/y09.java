package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y09 {
    public static final y09 E;
    public static final y09 F;
    public static final y09 G;
    public static final y09 H;
    public static final /* synthetic */ y09[] I;

    static {
        y09 y09Var = new y09("Untransformed", 0);
        E = y09Var;
        y09 y09Var2 = new y09("Insertion", 1);
        F = y09Var2;
        y09 y09Var3 = new y09("Replacement", 2);
        G = y09Var3;
        y09 y09Var4 = new y09("Deletion", 3);
        H = y09Var4;
        I = new y09[]{y09Var, y09Var2, y09Var3, y09Var4};
    }

    public static y09 valueOf(String str) {
        return (y09) Enum.valueOf(y09.class, str);
    }

    public static y09[] values() {
        return (y09[]) I.clone();
    }
}

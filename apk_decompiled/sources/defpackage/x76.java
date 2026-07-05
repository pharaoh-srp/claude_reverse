package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x76 {
    public static final x76 E;
    public static final x76 F;
    public static final x76 G;
    public static final /* synthetic */ x76[] H;
    public static final /* synthetic */ gq6 I;

    static {
        x76 x76Var = new x76("Dispatch", 0);
        E = x76Var;
        x76 x76Var2 = new x76("Cowork", 1);
        F = x76Var2;
        x76 x76Var3 = new x76("Code", 2);
        G = x76Var3;
        x76[] x76VarArr = {x76Var, x76Var2, x76Var3};
        H = x76VarArr;
        I = new gq6(x76VarArr);
    }

    public static x76 valueOf(String str) {
        return (x76) Enum.valueOf(x76.class, str);
    }

    public static x76[] values() {
        return (x76[]) H.clone();
    }
}

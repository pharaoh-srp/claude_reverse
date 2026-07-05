package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o45 {
    public static final o45 E;
    public static final o45 F;
    public static final o45 G;
    public static final o45 H;
    public static final /* synthetic */ o45[] I;

    static {
        o45 o45Var = new o45("DEFAULT", 0);
        E = o45Var;
        o45 o45Var2 = new o45("LAZY", 1);
        F = o45Var2;
        o45 o45Var3 = new o45("ATOMIC", 2);
        G = o45Var3;
        o45 o45Var4 = new o45("UNDISPATCHED", 3);
        H = o45Var4;
        I = new o45[]{o45Var, o45Var2, o45Var3, o45Var4};
    }

    public static o45 valueOf(String str) {
        return (o45) Enum.valueOf(o45.class, str);
    }

    public static o45[] values() {
        return (o45[]) I.clone();
    }
}

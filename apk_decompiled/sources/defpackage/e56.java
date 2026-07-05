package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e56 {
    public static final e56 E;
    public static final e56 F;
    public static final e56 G;
    public static final /* synthetic */ e56[] H;

    static {
        e56 e56Var = new e56("Vertical", 0);
        E = e56Var;
        e56 e56Var2 = new e56("Horizontal", 1);
        F = e56Var2;
        e56 e56Var3 = new e56("Both", 2);
        G = e56Var3;
        H = new e56[]{e56Var, e56Var2, e56Var3};
    }

    public static e56 valueOf(String str) {
        return (e56) Enum.valueOf(e56.class, str);
    }

    public static e56[] values() {
        return (e56[]) H.clone();
    }
}

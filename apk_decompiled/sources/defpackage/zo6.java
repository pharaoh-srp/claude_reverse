package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zo6 {
    public static final zo6 E;
    public static final zo6 F;
    public static final zo6 G;
    public static final /* synthetic */ zo6[] H;

    static {
        zo6 zo6Var = new zo6("PreEnter", 0);
        E = zo6Var;
        zo6 zo6Var2 = new zo6("Visible", 1);
        F = zo6Var2;
        zo6 zo6Var3 = new zo6("PostExit", 2);
        G = zo6Var3;
        H = new zo6[]{zo6Var, zo6Var2, zo6Var3};
    }

    public static zo6 valueOf(String str) {
        return (zo6) Enum.valueOf(zo6.class, str);
    }

    public static zo6[] values() {
        return (zo6[]) H.clone();
    }
}

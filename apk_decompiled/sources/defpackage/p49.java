package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p49 {
    public static final p49 E;
    public static final p49 F;
    public static final p49 G;
    public static final /* synthetic */ p49[] H;

    static {
        p49 p49Var = new p49("Focused", 0);
        E = p49Var;
        p49 p49Var2 = new p49("UnfocusedEmpty", 1);
        F = p49Var2;
        p49 p49Var3 = new p49("UnfocusedNotEmpty", 2);
        G = p49Var3;
        H = new p49[]{p49Var, p49Var2, p49Var3};
    }

    public static p49 valueOf(String str) {
        return (p49) Enum.valueOf(p49.class, str);
    }

    public static p49[] values() {
        return (p49[]) H.clone();
    }
}

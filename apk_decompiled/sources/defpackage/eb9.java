package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eb9 {
    public static final eb9 E;
    public static final eb9 F;
    public static final /* synthetic */ eb9[] G;

    static {
        eb9 eb9Var = new eb9("Width", 0);
        E = eb9Var;
        eb9 eb9Var2 = new eb9("Height", 1);
        F = eb9Var2;
        G = new eb9[]{eb9Var, eb9Var2};
    }

    public static eb9 valueOf(String str) {
        return (eb9) Enum.valueOf(eb9.class, str);
    }

    public static eb9[] values() {
        return (eb9[]) G.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ya1 {
    public static final ya1 E;
    public static final ya1 F;
    public static final ya1 G;
    public static final /* synthetic */ ya1[] H;

    static {
        ya1 ya1Var = new ya1("UNKNOWN", 0);
        E = ya1Var;
        ya1 ya1Var2 = new ya1("LEFT", 1);
        F = ya1Var2;
        ya1 ya1Var3 = new ya1("RIGHT", 2);
        G = ya1Var3;
        H = new ya1[]{ya1Var, ya1Var2, ya1Var3};
    }

    public static ya1 valueOf(String str) {
        return (ya1) Enum.valueOf(ya1.class, str);
    }

    public static ya1[] values() {
        return (ya1[]) H.clone();
    }
}

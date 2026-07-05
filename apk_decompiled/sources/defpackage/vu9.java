package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vu9 {
    public static final vu9 E;
    public static final vu9 F;
    public static final vu9 G;
    public static final vu9 H;
    public static final vu9 I;
    public static final /* synthetic */ vu9[] J;

    static {
        vu9 vu9Var = new vu9("Measuring", 0);
        E = vu9Var;
        vu9 vu9Var2 = new vu9("LookaheadMeasuring", 1);
        F = vu9Var2;
        vu9 vu9Var3 = new vu9("LayingOut", 2);
        G = vu9Var3;
        vu9 vu9Var4 = new vu9("LookaheadLayingOut", 3);
        H = vu9Var4;
        vu9 vu9Var5 = new vu9("Idle", 4);
        I = vu9Var5;
        J = new vu9[]{vu9Var, vu9Var2, vu9Var3, vu9Var4, vu9Var5};
    }

    public static vu9 valueOf(String str) {
        return (vu9) Enum.valueOf(vu9.class, str);
    }

    public static vu9[] values() {
        return (vu9[]) J.clone();
    }
}

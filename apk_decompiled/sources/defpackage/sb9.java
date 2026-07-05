package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sb9 {
    public static final sb9 E;
    public static final sb9 F;
    public static final sb9 G;
    public static final sb9 H;
    public static final /* synthetic */ sb9[] I;

    static {
        sb9 sb9Var = new sb9("LookaheadMeasurement", 0);
        E = sb9Var;
        sb9 sb9Var2 = new sb9("LookaheadPlacement", 1);
        F = sb9Var2;
        sb9 sb9Var3 = new sb9("Measurement", 2);
        G = sb9Var3;
        sb9 sb9Var4 = new sb9("Placement", 3);
        H = sb9Var4;
        I = new sb9[]{sb9Var, sb9Var2, sb9Var3, sb9Var4};
    }

    public static sb9 valueOf(String str) {
        return (sb9) Enum.valueOf(sb9.class, str);
    }

    public static sb9[] values() {
        return (sb9[]) I.clone();
    }
}

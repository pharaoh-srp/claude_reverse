package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xu9 {
    public static final xu9 E;
    public static final xu9 F;
    public static final xu9 G;
    public static final /* synthetic */ xu9[] H;

    static {
        xu9 xu9Var = new xu9("InMeasureBlock", 0);
        E = xu9Var;
        xu9 xu9Var2 = new xu9("InLayoutBlock", 1);
        F = xu9Var2;
        xu9 xu9Var3 = new xu9("NotUsed", 2);
        G = xu9Var3;
        H = new xu9[]{xu9Var, xu9Var2, xu9Var3};
    }

    public static xu9 valueOf(String str) {
        return (xu9) Enum.valueOf(xu9.class, str);
    }

    public static xu9[] values() {
        return (xu9[]) H.clone();
    }
}

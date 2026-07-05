package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fu9 {
    public static final fu9 E;
    public static final fu9 F;
    public static final /* synthetic */ fu9[] G;

    static {
        fu9 fu9Var = new fu9("Ltr", 0);
        E = fu9Var;
        fu9 fu9Var2 = new fu9("Rtl", 1);
        F = fu9Var2;
        G = new fu9[]{fu9Var, fu9Var2};
    }

    public static fu9 valueOf(String str) {
        return (fu9) Enum.valueOf(fu9.class, str);
    }

    public static fu9[] values() {
        return (fu9[]) G.clone();
    }
}

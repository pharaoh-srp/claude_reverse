package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ya9 {
    public static final ya9 E;
    public static final ya9 F;
    public static final /* synthetic */ ya9[] G;

    static {
        ya9 ya9Var = new ya9("Min", 0);
        E = ya9Var;
        ya9 ya9Var2 = new ya9("Max", 1);
        F = ya9Var2;
        G = new ya9[]{ya9Var, ya9Var2};
    }

    public static ya9 valueOf(String str) {
        return (ya9) Enum.valueOf(ya9.class, str);
    }

    public static ya9[] values() {
        return (ya9[]) G.clone();
    }
}

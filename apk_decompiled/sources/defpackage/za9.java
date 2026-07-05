package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class za9 {
    public static final za9 E;
    public static final za9 F;
    public static final /* synthetic */ za9[] G;

    static {
        za9 za9Var = new za9("Min", 0);
        E = za9Var;
        za9 za9Var2 = new za9("Max", 1);
        F = za9Var2;
        G = new za9[]{za9Var, za9Var2};
    }

    public static za9 valueOf(String str) {
        return (za9) Enum.valueOf(za9.class, str);
    }

    public static za9[] values() {
        return (za9[]) G.clone();
    }
}

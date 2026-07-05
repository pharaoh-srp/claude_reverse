package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ss9 {
    public static final ss9 E;
    public static final ss9 F;
    public static final ss9 G;
    public static final /* synthetic */ ss9[] H;

    static {
        ss9 ss9Var = new ss9("TODO", 0);
        E = ss9Var;
        ss9 ss9Var2 = new ss9("DOING", 1);
        F = ss9Var2;
        ss9 ss9Var3 = new ss9("DONE", 2);
        G = ss9Var3;
        H = new ss9[]{ss9Var, ss9Var2, ss9Var3};
    }

    public static ss9 valueOf(String str) {
        return (ss9) Enum.valueOf(ss9.class, str);
    }

    public static ss9[] values() {
        return (ss9[]) H.clone();
    }
}

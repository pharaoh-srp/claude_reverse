package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class te8 {
    public static final te8 E;
    public static final te8 F;
    public static final te8 G;
    public static final /* synthetic */ te8[] H;

    static {
        te8 te8Var = new te8("Cursor", 0);
        E = te8Var;
        te8 te8Var2 = new te8("SelectionStart", 1);
        F = te8Var2;
        te8 te8Var3 = new te8("SelectionEnd", 2);
        G = te8Var3;
        H = new te8[]{te8Var, te8Var2, te8Var3};
    }

    public static te8 valueOf(String str) {
        return (te8) Enum.valueOf(te8.class, str);
    }

    public static te8[] values() {
        return (te8[]) H.clone();
    }
}

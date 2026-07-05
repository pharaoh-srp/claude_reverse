package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dv8 {
    public static final dv8 E;
    public static final dv8 F;
    public static final /* synthetic */ dv8[] G;

    static {
        dv8 dv8Var = new dv8("Start", 0);
        E = dv8Var;
        dv8 dv8Var2 = new dv8("End", 1);
        F = dv8Var2;
        G = new dv8[]{dv8Var, dv8Var2};
    }

    public static dv8 valueOf(String str) {
        return (dv8) Enum.valueOf(dv8.class, str);
    }

    public static dv8[] values() {
        return (dv8[]) G.clone();
    }
}

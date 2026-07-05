package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a12 {
    public static final tqh E;
    public static final a12 F;
    public static final a12 G;
    public static final a12 H;
    public static final /* synthetic */ a12[] I;

    static {
        a12 a12Var = new a12("Resting", 0);
        F = a12Var;
        a12 a12Var2 = new a12("Active", 1);
        G = a12Var2;
        a12 a12Var3 = new a12("Disabled", 2);
        H = a12Var3;
        I = new a12[]{a12Var, a12Var2, a12Var3};
        E = new tqh(25);
    }

    public static a12 valueOf(String str) {
        return (a12) Enum.valueOf(a12.class, str);
    }

    public static a12[] values() {
        return (a12[]) I.clone();
    }
}

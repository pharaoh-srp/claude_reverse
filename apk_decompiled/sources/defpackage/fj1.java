package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fj1 {
    public static final fj1 E;
    public static final fj1 F;
    public static final fj1 G;
    public static final fj1 H;
    public static final fj1 I;
    public static final /* synthetic */ fj1[] J;

    static {
        fj1 fj1Var = new fj1("CONNECTING", 0);
        E = fj1Var;
        fj1 fj1Var2 = new fj1("CONNECTED", 1);
        F = fj1Var2;
        fj1 fj1Var3 = new fj1("RECONNECTING", 2);
        G = fj1Var3;
        fj1 fj1Var4 = new fj1("DISCONNECTED", 3);
        H = fj1Var4;
        fj1 fj1Var5 = new fj1("PARKED", 4);
        I = fj1Var5;
        J = new fj1[]{fj1Var, fj1Var2, fj1Var3, fj1Var4, fj1Var5};
    }

    public static fj1 valueOf(String str) {
        return (fj1) Enum.valueOf(fj1.class, str);
    }

    public static fj1[] values() {
        return (fj1[]) J.clone();
    }
}

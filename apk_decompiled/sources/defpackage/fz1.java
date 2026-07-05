package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fz1 {
    public static final fz1 E;
    public static final fz1 F;
    public static final /* synthetic */ fz1[] G;

    static {
        fz1 fz1Var = new fz1("Real", 0);
        E = fz1Var;
        fz1 fz1Var2 = new fz1("Virtual", 1);
        F = fz1Var2;
        G = new fz1[]{fz1Var, fz1Var2};
    }

    public static fz1 valueOf(String str) {
        return (fz1) Enum.valueOf(fz1.class, str);
    }

    public static fz1[] values() {
        return (fz1[]) G.clone();
    }
}

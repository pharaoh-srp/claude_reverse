package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fj7 {
    public static final fj7 E;
    public static final fj7 F;
    public static final fj7 G;
    public static final /* synthetic */ fj7[] H;

    static {
        fj7 fj7Var = new fj7("None", 0);
        E = fj7Var;
        fj7 fj7Var2 = new fj7("Loading", 1);
        F = fj7Var2;
        fj7 fj7Var3 = new fj7("Error", 2);
        G = fj7Var3;
        H = new fj7[]{fj7Var, fj7Var2, fj7Var3};
    }

    public static fj7 valueOf(String str) {
        return (fj7) Enum.valueOf(fj7.class, str);
    }

    public static fj7[] values() {
        return (fj7[]) H.clone();
    }
}

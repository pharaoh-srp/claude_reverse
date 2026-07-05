package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r36 {
    public static final r36 E;
    public static final r36 F;
    public static final r36 G;
    public static final /* synthetic */ r36[] H;

    static {
        r36 r36Var = new r36("CONTEXT", 0);
        E = r36Var;
        r36 r36Var2 = new r36("ADDITION", 1);
        F = r36Var2;
        r36 r36Var3 = new r36("DELETION", 2);
        G = r36Var3;
        H = new r36[]{r36Var, r36Var2, r36Var3};
    }

    public static r36 valueOf(String str) {
        return (r36) Enum.valueOf(r36.class, str);
    }

    public static r36[] values() {
        return (r36[]) H.clone();
    }
}

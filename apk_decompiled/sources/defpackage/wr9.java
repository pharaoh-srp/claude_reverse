package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wr9 {
    public static final wr9 E;
    public static final wr9 F;
    public static final wr9 G;
    public static final /* synthetic */ wr9[] H;

    static {
        wr9 wr9Var = new wr9("RUNTIME", 0);
        E = wr9Var;
        wr9 wr9Var2 = new wr9("BINARY", 1);
        F = wr9Var2;
        wr9 wr9Var3 = new wr9("SOURCE", 2);
        G = wr9Var3;
        H = new wr9[]{wr9Var, wr9Var2, wr9Var3};
    }

    public static wr9 valueOf(String str) {
        return (wr9) Enum.valueOf(wr9.class, str);
    }

    public static wr9[] values() {
        return (wr9[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lo9 {
    public static final lo9 E;
    public static final lo9 F;
    public static final lo9 G;
    public static final /* synthetic */ lo9[] H;

    static {
        lo9 lo9Var = new lo9("INVARIANT", 0);
        E = lo9Var;
        lo9 lo9Var2 = new lo9("IN", 1);
        F = lo9Var2;
        lo9 lo9Var3 = new lo9("OUT", 2);
        G = lo9Var3;
        H = new lo9[]{lo9Var, lo9Var2, lo9Var3};
    }

    public static lo9 valueOf(String str) {
        return (lo9) Enum.valueOf(lo9.class, str);
    }

    public static lo9[] values() {
        return (lo9[]) H.clone();
    }
}

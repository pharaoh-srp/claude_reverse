package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xd5 {
    public static final xd5 E;
    public static final xd5 F;
    public static final xd5 G;
    public static final /* synthetic */ xd5[] H;

    static {
        xd5 xd5Var = new xd5("None", 0);
        E = xd5Var;
        xd5 xd5Var2 = new xd5("Cancelled", 1);
        F = xd5Var2;
        xd5 xd5Var3 = new xd5("Redirected", 2);
        G = xd5Var3;
        H = new xd5[]{xd5Var, xd5Var2, xd5Var3, new xd5("RedirectCancelled", 3)};
    }

    public static xd5 valueOf(String str) {
        return (xd5) Enum.valueOf(xd5.class, str);
    }

    public static xd5[] values() {
        return (xd5[]) H.clone();
    }
}

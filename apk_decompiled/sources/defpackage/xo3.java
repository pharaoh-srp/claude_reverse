package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xo3 {
    public static final xo3 E;
    public static final /* synthetic */ xo3[] F;

    /* JADX INFO: Fake field, exist only in values array */
    xo3 EF0;

    static {
        xo3 xo3Var = new xo3("UNKNOWN", 0);
        xo3 xo3Var2 = new xo3("ANDROID_FIREBASE", 1);
        E = xo3Var2;
        F = new xo3[]{xo3Var, xo3Var2};
    }

    public static xo3 valueOf(String str) {
        return (xo3) Enum.valueOf(xo3.class, str);
    }

    public static xo3[] values() {
        return (xo3[]) F.clone();
    }
}

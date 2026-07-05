package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ek6 {
    public static final ek6 E;
    public static final ek6 F;
    public static final ek6 G;
    public static final /* synthetic */ ek6[] H;

    static {
        ek6 ek6Var = new ek6("RETRY", 0);
        E = ek6Var;
        ek6 ek6Var2 = new ek6("DIALOG_WILL_HANDLE", 1);
        F = ek6Var2;
        ek6 ek6Var3 = new ek6("SURFACE_ERROR", 2);
        G = ek6Var3;
        H = new ek6[]{ek6Var, ek6Var2, ek6Var3};
    }

    public static ek6 valueOf(String str) {
        return (ek6) Enum.valueOf(ek6.class, str);
    }

    public static ek6[] values() {
        return (ek6[]) H.clone();
    }
}

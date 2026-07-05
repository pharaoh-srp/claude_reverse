package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dd6 {
    public static final dd6 E;
    public static final dd6 F;
    public static final dd6 G;
    public static final /* synthetic */ dd6[] H;

    static {
        dd6 dd6Var = new dd6("START", 0);
        E = dd6Var;
        dd6 dd6Var2 = new dd6("DRAG", 1);
        F = dd6Var2;
        dd6 dd6Var3 = new dd6("END", 2);
        G = dd6Var3;
        H = new dd6[]{dd6Var, dd6Var2, dd6Var3};
    }

    public static dd6 valueOf(String str) {
        return (dd6) Enum.valueOf(dd6.class, str);
    }

    public static dd6[] values() {
        return (dd6[]) H.clone();
    }
}

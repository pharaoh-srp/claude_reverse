package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vw2 {
    public static final vw2 E;
    public static final vw2 F;
    public static final /* synthetic */ vw2[] G;

    static {
        vw2 vw2Var = new vw2("NON_RETRYABLE", 0);
        E = vw2Var;
        vw2 vw2Var2 = new vw2("RETRYABLE", 1);
        F = vw2Var2;
        G = new vw2[]{vw2Var, vw2Var2};
    }

    public static vw2 valueOf(String str) {
        return (vw2) Enum.valueOf(vw2.class, str);
    }

    public static vw2[] values() {
        return (vw2[]) G.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oq0 {
    public static final oq0 E;
    public static final oq0 F;
    public static final /* synthetic */ oq0[] G;

    static {
        oq0 oq0Var = new oq0("Prod", 0);
        E = oq0Var;
        oq0 oq0Var2 = new oq0("Staging", 1);
        F = oq0Var2;
        G = new oq0[]{oq0Var, oq0Var2};
    }

    public static oq0 valueOf(String str) {
        return (oq0) Enum.valueOf(oq0.class, str);
    }

    public static oq0[] values() {
        return (oq0[]) G.clone();
    }
}

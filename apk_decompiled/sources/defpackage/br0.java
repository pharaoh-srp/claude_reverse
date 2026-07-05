package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class br0 {
    public static final br0 E;
    public static final br0 F;
    public static final br0 G;
    public static final /* synthetic */ br0[] H;

    static {
        br0 br0Var = new br0("NULL_STATE", 0);
        E = br0Var;
        br0 br0Var2 = new br0("ITEM", 1);
        F = br0Var2;
        br0 br0Var3 = new br0("LOADING_INDICATOR", 2);
        G = br0Var3;
        H = new br0[]{br0Var, br0Var2, br0Var3};
    }

    public static br0 valueOf(String str) {
        return (br0) Enum.valueOf(br0.class, str);
    }

    public static br0[] values() {
        return (br0[]) H.clone();
    }
}

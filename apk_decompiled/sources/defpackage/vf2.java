package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vf2 {
    public static final vf2 G;
    public static final vf2 H;
    public static final vf2 I;
    public static final vf2 J;
    public static final /* synthetic */ vf2[] K;
    public static final /* synthetic */ gq6 L;
    public final float E;
    public final float F;

    static {
        vf2 vf2Var = new vf2("XSmall", 0, 18.0f, 2.0f);
        G = vf2Var;
        vf2 vf2Var2 = new vf2("Small", 1, 24.0f, 2.0f);
        H = vf2Var2;
        vf2 vf2Var3 = new vf2("Medium", 2, 32.0f, 3.0f);
        I = vf2Var3;
        vf2 vf2Var4 = new vf2("Large", 3, 48.0f, 4.0f);
        J = vf2Var4;
        vf2[] vf2VarArr = {vf2Var, vf2Var2, vf2Var3, vf2Var4};
        K = vf2VarArr;
        L = new gq6(vf2VarArr);
    }

    public vf2(String str, int i, float f, float f2) {
        this.E = f;
        this.F = f2;
    }

    public static vf2 valueOf(String str) {
        return (vf2) Enum.valueOf(vf2.class, str);
    }

    public static vf2[] values() {
        return (vf2[]) K.clone();
    }
}

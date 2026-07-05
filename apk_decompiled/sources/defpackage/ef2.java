package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ef2 {
    public static final ef2 F;
    public static final ef2 G;
    public static final ef2 H;
    public static final /* synthetic */ ef2[] I;
    public static final /* synthetic */ gq6 J;
    public final float E;

    static {
        ef2 ef2Var = new ef2("Small", 0, 16.0f);
        F = ef2Var;
        ef2 ef2Var2 = new ef2("Default", 1, 24.0f);
        G = ef2Var2;
        ef2 ef2Var3 = new ef2("Large", 2, 32.0f);
        H = ef2Var3;
        ef2[] ef2VarArr = {ef2Var, ef2Var2, ef2Var3};
        I = ef2VarArr;
        J = new gq6(ef2VarArr);
    }

    public ef2(String str, int i, float f) {
        this.E = f;
    }

    public static ef2 valueOf(String str) {
        return (ef2) Enum.valueOf(ef2.class, str);
    }

    public static ef2[] values() {
        return (ef2[]) I.clone();
    }
}

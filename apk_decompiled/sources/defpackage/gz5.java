package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gz5 implements szd {
    public static final lja F;
    public static final gz5 G;
    public static final gz5 H;
    public static final gz5 I;
    public static final gz5 J;
    public static final gz5 K;
    public static final gz5 L;
    public static final /* synthetic */ gz5[] M;
    public static final /* synthetic */ gq6 N;
    public final int E;

    static {
        gz5 gz5Var = new gz5("LDPI", 0, 120);
        G = gz5Var;
        gz5 gz5Var2 = new gz5("MDPI", 1, 160);
        H = gz5Var2;
        gz5 gz5Var3 = new gz5("HDPI", 2, 240);
        I = gz5Var3;
        gz5 gz5Var4 = new gz5("XHDPI", 3, 320);
        J = gz5Var4;
        gz5 gz5Var5 = new gz5("XXHDPI", 4, 480);
        K = gz5Var5;
        gz5 gz5Var6 = new gz5("XXXHDPI", 5, 640);
        L = gz5Var6;
        gz5[] gz5VarArr = {gz5Var, gz5Var2, gz5Var3, gz5Var4, gz5Var5, gz5Var6};
        M = gz5VarArr;
        N = new gq6(gz5VarArr);
        F = new lja(17);
    }

    public gz5(String str, int i, int i2) {
        this.E = i2;
    }

    public static gz5 valueOf(String str) {
        return (gz5) Enum.valueOf(gz5.class, str);
    }

    public static gz5[] values() {
        return (gz5[]) M.clone();
    }
}

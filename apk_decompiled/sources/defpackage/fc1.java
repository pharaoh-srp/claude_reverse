package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fc1 {
    public static final hj6 E;
    public static final fc1 F;
    public static final fc1 G;
    public static final fc1 H;
    public static final fc1 I;
    public static final /* synthetic */ fc1[] J;

    static {
        fc1 fc1Var = new fc1("Running", 0);
        F = fc1Var;
        fc1 fc1Var2 = new fc1("Completed", 1);
        G = fc1Var2;
        fc1 fc1Var3 = new fc1("Failed", 2);
        H = fc1Var3;
        fc1 fc1Var4 = new fc1("Stopped", 3);
        I = fc1Var4;
        J = new fc1[]{fc1Var, fc1Var2, fc1Var3, fc1Var4};
        E = new hj6(24);
    }

    public static fc1 valueOf(String str) {
        return (fc1) Enum.valueOf(fc1.class, str);
    }

    public static fc1[] values() {
        return (fc1[]) J.clone();
    }

    public final boolean a() {
        return this != F;
    }
}

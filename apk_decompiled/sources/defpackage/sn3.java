package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sn3 {
    public static final sn3 E;
    public static final sn3 F;
    public static final sn3 G;
    public static final sn3 H;
    public static final /* synthetic */ sn3[] I;

    static {
        sn3 sn3Var = new sn3("Pulling", 0);
        E = sn3Var;
        sn3 sn3Var2 = new sn3("Landing", 1);
        F = sn3Var2;
        sn3 sn3Var3 = new sn3("Swaying", 2);
        G = sn3Var3;
        sn3 sn3Var4 = new sn3("Collapsing", 3);
        H = sn3Var4;
        I = new sn3[]{sn3Var, sn3Var2, sn3Var3, sn3Var4};
    }

    public static sn3 valueOf(String str) {
        return (sn3) Enum.valueOf(sn3.class, str);
    }

    public static sn3[] values() {
        return (sn3[]) I.clone();
    }
}

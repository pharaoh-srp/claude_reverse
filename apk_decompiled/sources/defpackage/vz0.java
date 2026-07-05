package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vz0 {
    public static final vz0 E;
    public static final vz0 F;
    public static final vz0 G;
    public static final /* synthetic */ vz0[] H;

    static {
        vz0 vz0Var = new vz0("LEFT", 0);
        E = vz0Var;
        vz0 vz0Var2 = new vz0("CENTER", 1);
        F = vz0Var2;
        vz0 vz0Var3 = new vz0("RIGHT", 2);
        G = vz0Var3;
        H = new vz0[]{vz0Var, vz0Var2, vz0Var3};
    }

    public static vz0 valueOf(String str) {
        return (vz0) Enum.valueOf(vz0.class, str);
    }

    public static vz0[] values() {
        return (vz0[]) H.clone();
    }
}

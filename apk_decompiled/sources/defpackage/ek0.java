package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 {
    public static final zp3 F;
    public static final ek0 G;
    public static final /* synthetic */ ek0[] H;
    public static final /* synthetic */ gq6 I;
    public final String E;

    static {
        ek0 ek0Var = new ek0("SYSTEM", 0, "system");
        G = ek0Var;
        ek0[] ek0VarArr = {ek0Var, new ek0("LIGHT", 1, "light"), new ek0("DARK", 2, "dark")};
        H = ek0VarArr;
        I = new gq6(ek0VarArr);
        F = new zp3(13);
    }

    public ek0(String str, int i, String str2) {
        this.E = str2;
    }

    public static ek0 valueOf(String str) {
        return (ek0) Enum.valueOf(ek0.class, str);
    }

    public static ek0[] values() {
        return (ek0[]) H.clone();
    }
}

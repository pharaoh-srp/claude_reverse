package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j29 {
    public static final am4 F;
    public static final j29 G;
    public static final j29 H;
    public static final /* synthetic */ j29[] I;
    public static final /* synthetic */ gq6 J;
    public final String E;

    static {
        j29 j29Var = new j29("NEW", 0, "new");
        j29 j29Var2 = new j29("RESUME", 1, "resume");
        G = j29Var2;
        j29 j29Var3 = new j29("RESUME_CACHED", 2, "resume-cached");
        H = j29Var3;
        j29[] j29VarArr = {j29Var, j29Var2, j29Var3, new j29("SETUP_ONLY", 3, "setup-only")};
        I = j29VarArr;
        J = new gq6(j29VarArr);
        F = new am4(9);
    }

    public j29(String str, int i, String str2) {
        this.E = str2;
    }

    public static j29 valueOf(String str) {
        return (j29) Enum.valueOf(j29.class, str);
    }

    public static j29[] values() {
        return (j29[]) I.clone();
    }
}

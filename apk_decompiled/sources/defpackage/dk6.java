package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dk6 {
    public static final zl4 F;
    public static final dk6 G;
    public static final dk6 H;
    public static final /* synthetic */ dk6[] I;
    public static final /* synthetic */ gq6 J;
    public final String E;

    static {
        dk6 dk6Var = new dk6("UNTRUSTED_DEVICE", 0, "untrusted_device");
        G = dk6Var;
        dk6 dk6Var2 = new dk6("SESSION_STALE_RELOGIN", 1, "session_stale_relogin");
        H = dk6Var2;
        dk6[] dk6VarArr = {dk6Var, dk6Var2};
        I = dk6VarArr;
        J = new gq6(dk6VarArr);
        F = new zl4(4);
    }

    public dk6(String str, int i, String str2) {
        this.E = str2;
    }

    public static dk6 valueOf(String str) {
        return (dk6) Enum.valueOf(dk6.class, str);
    }

    public static dk6[] values() {
        return (dk6[]) I.clone();
    }
}

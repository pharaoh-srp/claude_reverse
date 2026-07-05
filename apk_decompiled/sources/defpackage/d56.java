package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d56 {
    public static final d56 E;
    public static final d56 F;
    public static final d56 G;
    public static final d56 H;
    public static final /* synthetic */ d56[] I;

    static {
        d56 d56Var = new d56("ENTER_FRONT", 0);
        E = d56Var;
        d56 d56Var2 = new d56("EXIT_FRONT", 1);
        F = d56Var2;
        d56 d56Var3 = new d56("ENTER_BACK", 2);
        G = d56Var3;
        d56 d56Var4 = new d56("EXIT_BACK", 3);
        H = d56Var4;
        I = new d56[]{d56Var, d56Var2, d56Var3, d56Var4};
    }

    public static d56 valueOf(String str) {
        return (d56) Enum.valueOf(d56.class, str);
    }

    public static d56[] values() {
        return (d56[]) I.clone();
    }
}

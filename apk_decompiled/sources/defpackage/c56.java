package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c56 {
    public static final c56 E;
    public static final c56 F;
    public static final c56 G;
    public static final /* synthetic */ c56[] H;

    static {
        c56 c56Var = new c56("BEFORE", 0);
        E = c56Var;
        c56 c56Var2 = new c56("ON", 1);
        F = c56Var2;
        c56 c56Var3 = new c56("AFTER", 2);
        G = c56Var3;
        H = new c56[]{c56Var, c56Var2, c56Var3};
    }

    public static c56 valueOf(String str) {
        return (c56) Enum.valueOf(c56.class, str);
    }

    public static c56[] values() {
        return (c56[]) H.clone();
    }
}

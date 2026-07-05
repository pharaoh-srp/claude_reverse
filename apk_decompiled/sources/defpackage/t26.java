package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t26 {
    public static final t26 E;
    public static final t26 F;
    public static final t26 G;
    public static final t26 H;
    public static final /* synthetic */ t26[] I;

    static {
        t26 t26Var = new t26("MOBILE", 0);
        E = t26Var;
        t26 t26Var2 = new t26("TABLET", 1);
        F = t26Var2;
        t26 t26Var3 = new t26("TV", 2);
        G = t26Var3;
        t26 t26Var4 = new t26("DESKTOP", 3);
        t26 t26Var5 = new t26("GAMING_CONSOLE", 4);
        t26 t26Var6 = new t26("BOT", 5);
        t26 t26Var7 = new t26("OTHER", 6);
        H = t26Var7;
        I = new t26[]{t26Var, t26Var2, t26Var3, t26Var4, t26Var5, t26Var6, t26Var7};
    }

    public static t26 valueOf(String str) {
        return (t26) Enum.valueOf(t26.class, str);
    }

    public static t26[] values() {
        return (t26[]) I.clone();
    }
}

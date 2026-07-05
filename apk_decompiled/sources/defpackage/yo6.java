package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yo6 {
    public static final yo6 E;
    public static final yo6 F;
    public static final yo6 G;
    public static final /* synthetic */ yo6[] H;

    static {
        yo6 yo6Var = new yo6("NEEDS_RELOGIN_UNTRUSTED", 0);
        E = yo6Var;
        yo6 yo6Var2 = new yo6("NEEDS_RELOGIN_STALE", 1);
        F = yo6Var2;
        yo6 yo6Var3 = new yo6("DEVICE_LIMIT_REACHED", 2);
        G = yo6Var3;
        H = new yo6[]{yo6Var, yo6Var2, yo6Var3};
    }

    public static yo6 valueOf(String str) {
        return (yo6) Enum.valueOf(yo6.class, str);
    }

    public static yo6[] values() {
        return (yo6[]) H.clone();
    }
}

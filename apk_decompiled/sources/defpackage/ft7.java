package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ft7 {
    public static final ft7 E;
    public static final ft7 F;
    public static final ft7 G;
    public static final /* synthetic */ ft7[] H;

    static {
        ft7 ft7Var = new ft7("Active", 0);
        E = ft7Var;
        ft7 ft7Var2 = new ft7("ActiveParent", 1);
        F = ft7Var2;
        ft7 ft7Var3 = new ft7("Captured", 2);
        ft7 ft7Var4 = new ft7("Inactive", 3);
        G = ft7Var4;
        H = new ft7[]{ft7Var, ft7Var2, ft7Var3, ft7Var4};
    }

    public static ft7 valueOf(String str) {
        return (ft7) Enum.valueOf(ft7.class, str);
    }

    public static ft7[] values() {
        return (ft7[]) H.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        mr9.b();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                mr9.b();
                return false;
            }
        }
        return true;
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class we8 {
    public static final we8 E;
    public static final we8 F;
    public static final we8 G;
    public static final /* synthetic */ we8[] H;

    static {
        we8 we8Var = new we8("None", 0);
        E = we8Var;
        we8 we8Var2 = new we8("Selection", 1);
        F = we8Var2;
        we8 we8Var3 = new we8("Cursor", 2);
        G = we8Var3;
        H = new we8[]{we8Var, we8Var2, we8Var3};
    }

    public static we8 valueOf(String str) {
        return (we8) Enum.valueOf(we8.class, str);
    }

    public static we8[] values() {
        return (we8[]) H.clone();
    }
}

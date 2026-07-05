package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class st6 {
    public static final st6 E;
    public static final st6 F;
    public static final st6 G;
    public static final /* synthetic */ st6[] H;

    static {
        st6 st6Var = new st6("Error", 0);
        E = st6Var;
        st6 st6Var2 = new st6("Success", 1);
        F = st6Var2;
        st6 st6Var3 = new st6("Info", 2);
        G = st6Var3;
        H = new st6[]{st6Var, st6Var2, st6Var3};
    }

    public static st6 valueOf(String str) {
        return (st6) Enum.valueOf(st6.class, str);
    }

    public static st6[] values() {
        return (st6[]) H.clone();
    }
}

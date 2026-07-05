package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nj6 {
    public static final nj6 E;
    public static final nj6 F;
    public static final nj6 G;
    public static final /* synthetic */ nj6[] H;

    static {
        nj6 nj6Var = new nj6("User", 0);
        E = nj6Var;
        nj6 nj6Var2 = new nj6("Assistant", 1);
        F = nj6Var2;
        nj6 nj6Var3 = new nj6("Channel", 2);
        G = nj6Var3;
        H = new nj6[]{nj6Var, nj6Var2, nj6Var3};
    }

    public static nj6 valueOf(String str) {
        return (nj6) Enum.valueOf(nj6.class, str);
    }

    public static nj6[] values() {
        return (nj6[]) H.clone();
    }
}

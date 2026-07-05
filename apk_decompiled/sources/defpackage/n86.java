package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n86 {
    public static final n86 E;
    public static final n86 F;
    public static final /* synthetic */ n86[] G;

    static {
        n86 n86Var = new n86("ROUTE", 0);
        E = n86Var;
        n86 n86Var2 = new n86("MARKERS", 1);
        F = n86Var2;
        G = new n86[]{n86Var, n86Var2};
    }

    public static n86 valueOf(String str) {
        return (n86) Enum.valueOf(n86.class, str);
    }

    public static n86[] values() {
        return (n86[]) G.clone();
    }
}

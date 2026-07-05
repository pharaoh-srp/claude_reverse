package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p7d {
    public static final bm4 E;
    public static final /* synthetic */ p7d[] F;
    public static final /* synthetic */ gq6 G;

    static {
        p7d[] p7dVarArr = {new p7d("ZERO", 0), new p7d("ONE", 1), new p7d("TWO", 2), new p7d("FEW", 3), new p7d("MANY", 4), new p7d("OTHER", 5)};
        F = p7dVarArr;
        G = new gq6(p7dVarArr);
        E = new bm4();
    }

    public static p7d valueOf(String str) {
        return (p7d) Enum.valueOf(p7d.class, str);
    }

    public static p7d[] values() {
        return (p7d[]) F.clone();
    }
}

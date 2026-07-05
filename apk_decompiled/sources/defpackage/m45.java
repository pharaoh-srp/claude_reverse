package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m45 {
    public static final m45 E;
    public static final m45 F;
    public static final m45 G;
    public static final /* synthetic */ m45[] H;

    static {
        m45 m45Var = new m45("COROUTINE_SUSPENDED", 0);
        E = m45Var;
        m45 m45Var2 = new m45("UNDECIDED", 1);
        F = m45Var2;
        m45 m45Var3 = new m45("RESUMED", 2);
        G = m45Var3;
        H = new m45[]{m45Var, m45Var2, m45Var3};
    }

    public static m45 valueOf(String str) {
        return (m45) Enum.valueOf(m45.class, str);
    }

    public static m45[] values() {
        return (m45[]) H.clone();
    }
}

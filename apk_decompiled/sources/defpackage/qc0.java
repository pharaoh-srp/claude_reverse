package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qc0 {
    public static final qc0 E;
    public static final qc0 F;
    public static final qc0 G;
    public static final qc0 H;
    public static final qc0 I;
    public static final qc0 J;
    public static final qc0 K;
    public static final /* synthetic */ qc0[] L;

    static {
        qc0 qc0Var = new qc0("Paragraph", 0);
        E = qc0Var;
        qc0 qc0Var2 = new qc0("Span", 1);
        F = qc0Var2;
        qc0 qc0Var3 = new qc0("VerbatimTts", 2);
        G = qc0Var3;
        qc0 qc0Var4 = new qc0("Url", 3);
        H = qc0Var4;
        qc0 qc0Var5 = new qc0("Link", 4);
        I = qc0Var5;
        qc0 qc0Var6 = new qc0("Clickable", 5);
        J = qc0Var6;
        qc0 qc0Var7 = new qc0("String", 6);
        K = qc0Var7;
        L = new qc0[]{qc0Var, qc0Var2, qc0Var3, qc0Var4, qc0Var5, qc0Var6, qc0Var7};
    }

    public static qc0 valueOf(String str) {
        return (qc0) Enum.valueOf(qc0.class, str);
    }

    public static qc0[] values() {
        return (qc0[]) L.clone();
    }
}

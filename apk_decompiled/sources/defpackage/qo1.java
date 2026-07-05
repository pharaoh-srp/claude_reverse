package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 {
    public static final pyk F;
    public static final qo1 G;
    public static final qo1 H;
    public static final qo1 I;
    public static final qo1 J;
    public static final qo1 K;
    public static final /* synthetic */ qo1[] L;
    public static final /* synthetic */ gq6 M;
    public final String E;

    static {
        qo1 qo1Var = new qo1("WEB_SEARCH", 0, "web_search");
        G = qo1Var;
        qo1 qo1Var2 = new qo1("RESEARCH", 1, "research");
        H = qo1Var2;
        qo1 qo1Var3 = new qo1("AI_ARTIFACTS", 2, "ai_artifacts");
        I = qo1Var3;
        qo1 qo1Var4 = new qo1("WIGGLE", 3, "wiggle");
        J = qo1Var4;
        qo1 qo1Var5 = new qo1("HEALTH", 4, "ha");
        K = qo1Var5;
        qo1[] qo1VarArr = {qo1Var, qo1Var2, qo1Var3, qo1Var4, qo1Var5};
        L = qo1VarArr;
        M = new gq6(qo1VarArr);
        F = new pyk(24);
    }

    public qo1(String str, int i, String str2) {
        this.E = str2;
    }

    public static qo1 valueOf(String str) {
        return (qo1) Enum.valueOf(qo1.class, str);
    }

    public static qo1[] values() {
        return (qo1[]) L.clone();
    }
}

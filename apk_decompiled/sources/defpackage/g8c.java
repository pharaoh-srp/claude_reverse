package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g8c {
    public static final cm4 G;
    public static final g8c H;
    public static final g8c I;
    public static final g8c J;
    public static final /* synthetic */ g8c[] K;
    public static final /* synthetic */ gq6 L;
    public final String E;
    public final c7c F;

    static {
        g8c g8cVar = new g8c("COMPLETION", 0, "completion", c7c.COMPLETION);
        g8c g8cVar2 = new g8c("RESEARCH", 1, "compass", c7c.RESEARCH);
        c7c c7cVar = c7c.CODE;
        g8c g8cVar3 = new g8c("CODE", 2, "bogosort", c7cVar);
        g8c g8cVar4 = new g8c("CODE_REQUIRES_ACTION", 3, "code_requires_action", c7cVar);
        g8c g8cVar5 = new g8c("HEARTH_SESSION_MENTIONED", 4, "hearth_session_mentioned", c7cVar);
        H = g8cVar5;
        g8c g8cVar6 = new g8c("DISPATCH", 5, "dispatch", c7c.DISPATCH);
        g8c g8cVar7 = new g8c("ASSIST", 6, "assist", c7c.ASSIST);
        g8c g8cVar8 = new g8c("CONWAY", 7, "conway", c7c.CONWAY);
        I = g8cVar8;
        g8c g8cVar9 = new g8c("MARKETING", 8, "marketing", c7c.MARKETING);
        J = g8cVar9;
        g8c[] g8cVarArr = {g8cVar, g8cVar2, g8cVar3, g8cVar4, g8cVar5, g8cVar6, g8cVar7, g8cVar8, g8cVar9};
        K = g8cVarArr;
        L = new gq6(g8cVarArr);
        G = new cm4();
    }

    public g8c(String str, int i, String str2, c7c c7cVar) {
        this.E = str2;
        this.F = c7cVar;
    }

    public static g8c valueOf(String str) {
        return (g8c) Enum.valueOf(g8c.class, str);
    }

    public static g8c[] values() {
        return (g8c[]) K.clone();
    }
}

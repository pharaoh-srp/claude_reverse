package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g9c {
    public static final g9c G;
    public static final g9c H;
    public static final g9c I;
    public static final g9c J;
    public static final g9c K;
    public static final g9c L;
    public static final /* synthetic */ g9c[] M;
    public static final /* synthetic */ gq6 N;
    public final bz7 E;
    public final pz7 F;

    static {
        g9c g9cVar = new g9c("COMPLETION", 0, new xga(27), new y1c(6));
        G = g9cVar;
        g9c g9cVar2 = new g9c("COMPASS", 1, new f9c(2), new y1c(7));
        H = g9cVar2;
        g9c g9cVar3 = new g9c("CODE", 2, new f9c(3), new y1c(8));
        I = g9cVar3;
        g9c g9cVar4 = new g9c("CODE_REQUIRES_ACTION", 3, new xga(28), new y1c(2));
        J = g9cVar4;
        g9c g9cVar5 = new g9c("HEARTH_SESSION_MENTIONED", 4, new xga(29), new y1c(3));
        g9c g9cVar6 = new g9c("DISPATCH", 5, new f9c(0), new y1c(4));
        K = g9cVar6;
        g9c g9cVar7 = new g9c("MARKETING", 6, new f9c(1), new y1c(5));
        L = g9cVar7;
        g9c[] g9cVarArr = {g9cVar, g9cVar2, g9cVar3, g9cVar4, g9cVar5, g9cVar6, g9cVar7};
        M = g9cVarArr;
        N = new gq6(g9cVarArr);
    }

    public g9c(String str, int i, bz7 bz7Var, pz7 pz7Var) {
        this.E = bz7Var;
        this.F = pz7Var;
    }

    public static g9c valueOf(String str) {
        return (g9c) Enum.valueOf(g9c.class, str);
    }

    public static g9c[] values() {
        return (g9c[]) M.clone();
    }
}

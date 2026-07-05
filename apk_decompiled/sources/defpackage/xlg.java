package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xlg {
    public static final xlg E;
    public static final xlg F;
    public static final xlg G;
    public static final /* synthetic */ xlg[] H;

    static {
        xlg xlgVar = new xlg("NoRequest", 0);
        E = xlgVar;
        xlg xlgVar2 = new xlg("MatchFound", 1);
        F = xlgVar2;
        xlg xlgVar3 = new xlg("VisibleContentAbsentDuringTransition", 2);
        G = xlgVar3;
        H = new xlg[]{xlgVar, xlgVar2, xlgVar3, new xlg("NoMatchFound", 3)};
    }

    public static xlg valueOf(String str) {
        return (xlg) Enum.valueOf(xlg.class, str);
    }

    public static xlg[] values() {
        return (xlg[]) H.clone();
    }
}

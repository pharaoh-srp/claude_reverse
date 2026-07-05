package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xhj {
    public static final bm4 E;
    public static final xhj F;
    public static final xhj G;
    public static final xhj H;
    public static final xhj I;
    public static final /* synthetic */ xhj[] J;

    static {
        xhj xhjVar = new xhj("Start", 0);
        F = xhjVar;
        xhj xhjVar2 = new xhj("Progress", 1);
        G = xhjVar2;
        xhj xhjVar3 = new xhj("Done", 2);
        H = xhjVar3;
        xhj xhjVar4 = new xhj("Error", 3);
        I = xhjVar4;
        J = new xhj[]{xhjVar, xhjVar2, xhjVar3, xhjVar4};
        E = new bm4();
    }

    public static xhj valueOf(String str) {
        return (xhj) Enum.valueOf(xhj.class, str);
    }

    public static xhj[] values() {
        return (xhj[]) J.clone();
    }
}

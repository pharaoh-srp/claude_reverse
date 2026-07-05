package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xkc {
    public static final xkc E;
    public static final xkc F;
    public static final /* synthetic */ xkc[] G;

    static {
        xkc xkcVar = new xkc("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        E = xkcVar;
        xkc xkcVar2 = new xkc("DROP_WORK_REQUEST", 1);
        F = xkcVar2;
        G = new xkc[]{xkcVar, xkcVar2};
    }

    public static xkc valueOf(String str) {
        return (xkc) Enum.valueOf(xkc.class, str);
    }

    public static xkc[] values() {
        return (xkc[]) G.clone();
    }
}

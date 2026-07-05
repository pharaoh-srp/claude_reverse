package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xzc {
    public static final xzc E;
    public static final xzc F;
    public static final xzc G;
    public static final xzc H;
    public static final /* synthetic */ xzc[] I;

    static {
        xzc xzcVar = new xzc("MORNING", 0);
        E = xzcVar;
        xzc xzcVar2 = new xzc("AFTERNOON", 1);
        F = xzcVar2;
        xzc xzcVar3 = new xzc("EVENING", 2);
        G = xzcVar3;
        xzc xzcVar4 = new xzc("LATE_NIGHT", 3);
        H = xzcVar4;
        I = new xzc[]{xzcVar, xzcVar2, xzcVar3, xzcVar4};
    }

    public static xzc valueOf(String str) {
        return (xzc) Enum.valueOf(xzc.class, str);
    }

    public static xzc[] values() {
        return (xzc[]) I.clone();
    }
}

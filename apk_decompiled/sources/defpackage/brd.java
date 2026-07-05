package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class brd {
    public static final brd E;
    public static final brd F;
    public static final int G;
    public static final /* synthetic */ brd[] H;

    static {
        brd brdVar = new brd("DATADOG", 0);
        E = brdVar;
        brd brdVar2 = new brd("W3C", 1);
        F = brdVar2;
        H = new brd[]{brdVar, brdVar2};
        G = values().length;
    }

    public static brd valueOf(String str) {
        return (brd) Enum.valueOf(brd.class, str);
    }

    public static brd[] values() {
        return (brd[]) H.clone();
    }
}

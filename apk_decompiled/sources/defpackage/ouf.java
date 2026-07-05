package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ouf {
    public static final ouf E;
    public static final ouf F;
    public static final ouf G;
    public static final /* synthetic */ ouf[] H;

    static {
        ouf oufVar = new ouf("Connect", 0);
        E = oufVar;
        ouf oufVar2 = new ouf("HistoryPrepend", 1);
        F = oufVar2;
        ouf oufVar3 = new ouf("CacheSeed", 2);
        G = oufVar3;
        H = new ouf[]{oufVar, oufVar2, oufVar3};
    }

    public static ouf valueOf(String str) {
        return (ouf) Enum.valueOf(ouf.class, str);
    }

    public static ouf[] values() {
        return (ouf[]) H.clone();
    }
}

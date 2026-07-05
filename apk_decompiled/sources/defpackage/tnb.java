package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tnb {
    public static final bm4 E;
    public static final tnb F;
    public static final tnb G;
    public static final /* synthetic */ tnb[] H;

    static {
        tnb tnbVar = new tnb("OPUS", 0);
        F = tnbVar;
        tnb tnbVar2 = new tnb("SONNET", 1);
        G = tnbVar2;
        H = new tnb[]{tnbVar, tnbVar2, new tnb("OTHER", 2)};
        E = new bm4();
    }

    public static tnb valueOf(String str) {
        return (tnb) Enum.valueOf(tnb.class, str);
    }

    public static tnb[] values() {
        return (tnb[]) H.clone();
    }
}

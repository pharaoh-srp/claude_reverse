package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class buf {
    public static final buf E;
    public static final buf F;
    public static final /* synthetic */ buf[] G;

    static {
        buf bufVar = new buf("Idle", 0);
        E = bufVar;
        buf bufVar2 = new buf("InProgress", 1);
        F = bufVar2;
        G = new buf[]{bufVar, bufVar2, new buf("PrDraft", 2), new buf("PrCreated", 3), new buf("PrMerged", 4), new buf("PrClosed", 5)};
    }

    public static buf valueOf(String str) {
        return (buf) Enum.valueOf(buf.class, str);
    }

    public static buf[] values() {
        return (buf[]) G.clone();
    }
}

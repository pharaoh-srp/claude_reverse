package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ied {
    public static final ied E;
    public static final ied F;
    public static final /* synthetic */ ied[] G;

    static {
        ied iedVar = new ied("DownloadStarted", 0);
        E = iedVar;
        ied iedVar2 = new ied("DownloadFailed", 1);
        F = iedVar2;
        G = new ied[]{iedVar, iedVar2};
    }

    public static ied valueOf(String str) {
        return (ied) Enum.valueOf(ied.class, str);
    }

    public static ied[] values() {
        return (ied[]) G.clone();
    }
}

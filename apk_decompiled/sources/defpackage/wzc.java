package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wzc {
    public static final wzc E;
    public static final wzc F;
    public static final wzc G;
    public static final /* synthetic */ wzc[] H;

    static {
        wzc wzcVar = new wzc("REQUIRED", 0);
        E = wzcVar;
        wzc wzcVar2 = new wzc("EXCLUDED", 1);
        F = wzcVar2;
        wzc wzcVar3 = new wzc("ANY", 2);
        G = wzcVar3;
        H = new wzc[]{wzcVar, wzcVar2, wzcVar3};
    }

    public static wzc valueOf(String str) {
        return (wzc) Enum.valueOf(wzc.class, str);
    }

    public static wzc[] values() {
        return (wzc[]) H.clone();
    }
}

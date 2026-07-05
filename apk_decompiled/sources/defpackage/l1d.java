package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l1d {
    public static final l1d E;
    public static final l1d F;
    public static final l1d G;
    public static final l1d H;
    public static final l1d I;
    public static final /* synthetic */ l1d[] J;

    static {
        l1d l1dVar = new l1d("Initiating", 0);
        E = l1dVar;
        l1d l1dVar2 = new l1d("Failed", 1);
        F = l1dVar2;
        l1d l1dVar3 = new l1d("Connecting", 2);
        G = l1dVar3;
        l1d l1dVar4 = new l1d("Live", 3);
        H = l1dVar4;
        l1d l1dVar5 = new l1d("Ended", 4);
        I = l1dVar5;
        J = new l1d[]{l1dVar, l1dVar2, l1dVar3, l1dVar4, l1dVar5};
    }

    public static l1d valueOf(String str) {
        return (l1d) Enum.valueOf(l1d.class, str);
    }

    public static l1d[] values() {
        return (l1d[]) J.clone();
    }
}

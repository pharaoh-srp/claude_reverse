package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y9d {
    public static final y9d E;
    public static final y9d F;
    public static final y9d G;
    public static final /* synthetic */ y9d[] H;

    static {
        y9d y9dVar = new y9d("Top", 0);
        E = y9dVar;
        y9d y9dVar2 = new y9d("Center", 1);
        F = y9dVar2;
        y9d y9dVar3 = new y9d("Bottom", 2);
        G = y9dVar3;
        H = new y9d[]{y9dVar, y9dVar2, y9dVar3};
    }

    public static y9d valueOf(String str) {
        return (y9d) Enum.valueOf(y9d.class, str);
    }

    public static y9d[] values() {
        return (y9d[]) H.clone();
    }
}

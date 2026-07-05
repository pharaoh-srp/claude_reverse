package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x9d {
    public static final x9d E;
    public static final x9d F;
    public static final x9d G;
    public static final /* synthetic */ x9d[] H;

    static {
        x9d x9dVar = new x9d("Start", 0);
        E = x9dVar;
        x9d x9dVar2 = new x9d("Center", 1);
        F = x9dVar2;
        x9d x9dVar3 = new x9d("End", 2);
        G = x9dVar3;
        H = new x9d[]{x9dVar, x9dVar2, x9dVar3};
    }

    public static x9d valueOf(String str) {
        return (x9d) Enum.valueOf(x9d.class, str);
    }

    public static x9d[] values() {
        return (x9d[]) H.clone();
    }
}

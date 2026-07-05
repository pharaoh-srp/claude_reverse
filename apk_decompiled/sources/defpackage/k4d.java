package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k4d {
    public static final k4d E;
    public static final k4d F;
    public static final /* synthetic */ k4d[] G;

    static {
        k4d k4dVar = new k4d("Loading", 0);
        E = k4dVar;
        k4d k4dVar2 = new k4d("Unavailable", 1);
        F = k4dVar2;
        G = new k4d[]{k4dVar, k4dVar2};
    }

    public static k4d valueOf(String str) {
        return (k4d) Enum.valueOf(k4d.class, str);
    }

    public static k4d[] values() {
        return (k4d[]) G.clone();
    }
}

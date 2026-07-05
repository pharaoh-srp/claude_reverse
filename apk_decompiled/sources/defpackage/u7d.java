package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u7d {
    public static final u7d E;
    public static final u7d F;
    public static final u7d G;
    public static final /* synthetic */ u7d[] H;

    static {
        u7d u7dVar = new u7d("Initial", 0);
        E = u7dVar;
        u7d u7dVar2 = new u7d("Main", 1);
        F = u7dVar2;
        u7d u7dVar3 = new u7d("Final", 2);
        G = u7dVar3;
        H = new u7d[]{u7dVar, u7dVar2, u7dVar3};
    }

    public static u7d valueOf(String str) {
        return (u7d) Enum.valueOf(u7d.class, str);
    }

    public static u7d[] values() {
        return (u7d[]) H.clone();
    }
}

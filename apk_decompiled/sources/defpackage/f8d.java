package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f8d {
    public static final f8d E;
    public static final f8d F;
    public static final f8d G;
    public static final /* synthetic */ f8d[] H;

    static {
        f8d f8dVar = new f8d("Unknown", 0);
        E = f8dVar;
        f8d f8dVar2 = new f8d("Dispatching", 1);
        F = f8dVar2;
        f8d f8dVar3 = new f8d("NotDispatching", 2);
        G = f8dVar3;
        H = new f8d[]{f8dVar, f8dVar2, f8dVar3};
    }

    public static f8d valueOf(String str) {
        return (f8d) Enum.valueOf(f8d.class, str);
    }

    public static f8d[] values() {
        return (f8d[]) H.clone();
    }
}

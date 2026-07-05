package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z1d {
    public static final z1d E;
    public static final z1d F;
    public static final /* synthetic */ z1d[] G;

    static {
        z1d z1dVar = new z1d("Input", 0);
        E = z1dVar;
        z1d z1dVar2 = new z1d("Code", 1);
        F = z1dVar2;
        G = new z1d[]{z1dVar, z1dVar2};
    }

    public static z1d valueOf(String str) {
        return (z1d) Enum.valueOf(z1d.class, str);
    }

    public static z1d[] values() {
        return (z1d[]) G.clone();
    }
}

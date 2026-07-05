package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z5b {
    public static final z5b E;
    public static final z5b F;
    public static final /* synthetic */ z5b[] G;

    static {
        z5b z5bVar = new z5b("Min", 0);
        E = z5bVar;
        z5b z5bVar2 = new z5b("Max", 1);
        F = z5bVar2;
        G = new z5b[]{z5bVar, z5bVar2};
    }

    public static z5b valueOf(String str) {
        return (z5b) Enum.valueOf(z5b.class, str);
    }

    public static z5b[] values() {
        return (z5b[]) G.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d9f {
    public static final d9f E;
    public static final d9f F;
    public static final /* synthetic */ d9f[] G;

    static {
        d9f d9fVar = new d9f("ContentEdge", 0);
        E = d9fVar;
        d9f d9fVar2 = new d9f("NotZoomed", 1);
        F = d9fVar2;
        G = new d9f[]{d9fVar, d9fVar2};
    }

    public static d9f valueOf(String str) {
        return (d9f) Enum.valueOf(d9f.class, str);
    }

    public static d9f[] values() {
        return (d9f[]) G.clone();
    }
}

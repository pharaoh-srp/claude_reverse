package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k6f {
    public static final k6f E;
    public static final k6f F;
    public static final /* synthetic */ k6f[] G;

    static {
        k6f k6fVar = new k6f("FILL", 0);
        E = k6fVar;
        k6f k6fVar2 = new k6f("FIT", 1);
        F = k6fVar2;
        G = new k6f[]{k6fVar, k6fVar2};
    }

    public static k6f valueOf(String str) {
        return (k6f) Enum.valueOf(k6f.class, str);
    }

    public static k6f[] values() {
        return (k6f[]) G.clone();
    }
}

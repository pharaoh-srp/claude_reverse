package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j6f {
    public static final j6f E;
    public static final j6f F;
    public static final /* synthetic */ j6f[] G;

    static {
        j6f j6fVar = new j6f("FILL", 0);
        E = j6fVar;
        j6f j6fVar2 = new j6f("FIT", 1);
        F = j6fVar2;
        G = new j6f[]{j6fVar, j6fVar2};
    }

    public static j6f valueOf(String str) {
        return (j6f) Enum.valueOf(j6f.class, str);
    }

    public static j6f[] values() {
        return (j6f[]) G.clone();
    }
}

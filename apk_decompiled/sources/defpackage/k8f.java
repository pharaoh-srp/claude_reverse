package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k8f {
    public static final k8f E;
    public static final k8f F;
    public static final /* synthetic */ k8f[] G;

    static {
        k8f k8fVar = new k8f("Static", 0);
        E = k8fVar;
        k8f k8fVar2 = new k8f("Cycling", 1);
        F = k8fVar2;
        G = new k8f[]{k8fVar, k8fVar2};
    }

    public static k8f valueOf(String str) {
        return (k8f) Enum.valueOf(k8f.class, str);
    }

    public static k8f[] values() {
        return (k8f[]) G.clone();
    }
}

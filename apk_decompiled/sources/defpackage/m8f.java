package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m8f {
    public static final m8f E;
    public static final m8f F;
    public static final /* synthetic */ m8f[] G;

    static {
        m8f m8fVar = new m8f("Zigzag", 0);
        E = m8fVar;
        m8f m8fVar2 = new m8f("Coil", 1);
        F = m8fVar2;
        G = new m8f[]{m8fVar, m8fVar2};
    }

    public static m8f valueOf(String str) {
        return (m8f) Enum.valueOf(m8f.class, str);
    }

    public static m8f[] values() {
        return (m8f[]) G.clone();
    }
}

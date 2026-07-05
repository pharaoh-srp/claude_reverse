package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m0c {
    public static final m0c E;
    public static final m0c F;
    public static final m0c G;
    public static final /* synthetic */ m0c[] H;

    static {
        m0c m0cVar = new m0c("TRUSTED", 0);
        E = m0cVar;
        m0c m0cVar2 = new m0c("NONE", 1);
        F = m0cVar2;
        m0c m0cVar3 = new m0c("FULL", 2);
        G = m0cVar3;
        H = new m0c[]{m0cVar, m0cVar2, m0cVar3};
    }

    public static m0c valueOf(String str) {
        return (m0c) Enum.valueOf(m0c.class, str);
    }

    public static m0c[] values() {
        return (m0c[]) H.clone();
    }
}

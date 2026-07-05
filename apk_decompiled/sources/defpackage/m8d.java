package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m8d {
    public static final m8d E;
    public static final m8d F;
    public static final m8d G;
    public static final /* synthetic */ m8d[] H;

    static {
        m8d m8dVar = new m8d("Success", 0);
        E = m8dVar;
        m8d m8dVar2 = new m8d("NotReady", 1);
        F = m8dVar2;
        m8d m8dVar3 = new m8d("FetchFailed", 2);
        G = m8dVar3;
        H = new m8d[]{m8dVar, m8dVar2, m8dVar3};
    }

    public static m8d valueOf(String str) {
        return (m8d) Enum.valueOf(m8d.class, str);
    }

    public static m8d[] values() {
        return (m8d[]) H.clone();
    }
}

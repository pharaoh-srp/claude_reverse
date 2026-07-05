package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m7d {
    public static final m7d E;
    public static final m7d F;
    public static final m7d G;
    public static final m7d H;
    public static final m7d I;
    public static final /* synthetic */ m7d[] J;

    static {
        m7d m7dVar = new m7d("Before", 0);
        E = m7dVar;
        m7d m7dVar2 = new m7d("Enrichment", 1);
        F = m7dVar2;
        m7d m7dVar3 = new m7d("Destination", 2);
        G = m7dVar3;
        m7d m7dVar4 = new m7d("After", 3);
        H = m7dVar4;
        m7d m7dVar5 = new m7d("Utility", 4);
        I = m7dVar5;
        J = new m7d[]{m7dVar, m7dVar2, m7dVar3, m7dVar4, m7dVar5};
    }

    public static m7d valueOf(String str) {
        return (m7d) Enum.valueOf(m7d.class, str);
    }

    public static m7d[] values() {
        return (m7d[]) J.clone();
    }
}

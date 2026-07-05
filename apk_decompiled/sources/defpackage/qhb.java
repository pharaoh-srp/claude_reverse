package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qhb {
    public static final qhb E;
    public static final qhb F;
    public static final qhb G;
    public static final /* synthetic */ qhb[] H;

    static {
        qhb qhbVar = new qhb("EMAIL", 0);
        E = qhbVar;
        qhb qhbVar2 = new qhb("TEXT_MESSAGE", 1);
        F = qhbVar2;
        qhb qhbVar3 = new qhb("OTHER", 2);
        G = qhbVar3;
        H = new qhb[]{qhbVar, qhbVar2, qhbVar3};
    }

    public static qhb valueOf(String str) {
        return (qhb) Enum.valueOf(qhb.class, str);
    }

    public static qhb[] values() {
        return (qhb[]) H.clone();
    }
}

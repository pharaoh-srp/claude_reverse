package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qrd {
    public static final qrd E;
    public static final qrd F;
    public static final /* synthetic */ qrd[] G;

    static {
        qrd qrdVar = new qrd("Start", 0);
        E = qrdVar;
        qrd qrdVar2 = new qrd("Reject", 1);
        F = qrdVar2;
        G = new qrd[]{qrdVar, qrdVar2};
    }

    public static qrd valueOf(String str) {
        return (qrd) Enum.valueOf(qrd.class, str);
    }

    public static qrd[] values() {
        return (qrd[]) G.clone();
    }
}

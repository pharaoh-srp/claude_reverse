package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ecg {
    public static final ecg E;
    public static final ecg F;
    public static final /* synthetic */ ecg[] G;

    static {
        ecg ecgVar = new ecg("Dismissed", 0);
        E = ecgVar;
        ecg ecgVar2 = new ecg("ActionPerformed", 1);
        F = ecgVar2;
        G = new ecg[]{ecgVar, ecgVar2};
    }

    public static ecg valueOf(String str) {
        return (ecg) Enum.valueOf(ecg.class, str);
    }

    public static ecg[] values() {
        return (ecg[]) G.clone();
    }
}

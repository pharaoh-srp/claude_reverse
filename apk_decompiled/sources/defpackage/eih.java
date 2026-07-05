package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eih {
    public static final eih E;
    public static final eih F;
    public static final eih G;
    public static final /* synthetic */ eih[] H;

    static {
        eih eihVar = new eih("None", 0);
        E = eihVar;
        eih eihVar2 = new eih("Touch", 1);
        F = eihVar2;
        eih eihVar3 = new eih("Mouse", 2);
        G = eihVar3;
        H = new eih[]{eihVar, eihVar2, eihVar3};
    }

    public static eih valueOf(String str) {
        return (eih) Enum.valueOf(eih.class, str);
    }

    public static eih[] values() {
        return (eih[]) H.clone();
    }
}

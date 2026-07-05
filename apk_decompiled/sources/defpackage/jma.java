package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jma {
    public static final jma E;
    public static final jma F;
    public static final jma G;
    public static final /* synthetic */ jma[] H;

    static {
        jma jmaVar = new jma("IsPlacedInLookahead", 0);
        E = jmaVar;
        jma jmaVar2 = new jma("IsPlacedInApproach", 1);
        F = jmaVar2;
        jma jmaVar3 = new jma("IsNotPlaced", 2);
        G = jmaVar3;
        H = new jma[]{jmaVar, jmaVar2, jmaVar3};
    }

    public static jma valueOf(String str) {
        return (jma) Enum.valueOf(jma.class, str);
    }

    public static jma[] values() {
        return (jma[]) H.clone();
    }
}

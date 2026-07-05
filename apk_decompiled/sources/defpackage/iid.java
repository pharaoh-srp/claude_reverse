package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iid {
    public static final iid E;
    public static final iid F;
    public static final iid G;
    public static final iid H;
    public static final /* synthetic */ iid[] I;

    static {
        iid iidVar = new iid("MONTHLY", 0);
        E = iidVar;
        iid iidVar2 = new iid("ANNUAL", 1);
        F = iidVar2;
        iid iidVar3 = new iid("ONE_MONTH_ACCESS", 2);
        G = iidVar3;
        iid iidVar4 = new iid("ONE_YEAR_ACCESS", 3);
        H = iidVar4;
        I = new iid[]{iidVar, iidVar2, iidVar3, iidVar4};
    }

    public static iid valueOf(String str) {
        return (iid) Enum.valueOf(iid.class, str);
    }

    public static iid[] values() {
        return (iid[]) I.clone();
    }
}

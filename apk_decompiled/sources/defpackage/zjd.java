package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zjd {
    public static final zjd E;
    public static final zjd F;
    public static final zjd G;
    public static final /* synthetic */ zjd[] H;

    static {
        zjd zjdVar = new zjd("PASS_THROUGH", 0);
        E = zjdVar;
        zjd zjdVar2 = new zjd("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        F = zjdVar2;
        zjd zjdVar3 = new zjd("DISCARDING", 2);
        G = zjdVar3;
        H = new zjd[]{zjdVar, zjdVar2, zjdVar3};
    }

    public static zjd valueOf(String str) {
        return (zjd) Enum.valueOf(zjd.class, str);
    }

    public static zjd[] values() {
        return (zjd[]) H.clone();
    }
}

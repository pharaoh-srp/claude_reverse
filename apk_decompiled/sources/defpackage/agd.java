package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class agd {
    public static final agd E;
    public static final agd F;
    public static final agd G;
    public static final /* synthetic */ agd[] H;

    static {
        agd agdVar = new agd("DEFAULT", 0);
        E = agdVar;
        agd agdVar2 = new agd("VERY_LOW", 1);
        F = agdVar2;
        agd agdVar3 = new agd("HIGHEST", 2);
        G = agdVar3;
        H = new agd[]{agdVar, agdVar2, agdVar3};
    }

    public static agd valueOf(String str) {
        return (agd) Enum.valueOf(agd.class, str);
    }

    public static agd[] values() {
        return (agd[]) H.clone();
    }
}

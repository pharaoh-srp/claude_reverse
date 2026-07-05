package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rrg {
    public static final rrg E;
    public static final rrg F;
    public static final rrg G;
    public static final /* synthetic */ rrg[] H;

    static {
        rrg rrgVar = new rrg("KEY", 0);
        E = rrgVar;
        rrg rrgVar2 = new rrg("VALUE", 1);
        F = rrgVar2;
        rrg rrgVar3 = new rrg("PROSE", 2);
        G = rrgVar3;
        H = new rrg[]{rrgVar, rrgVar2, rrgVar3};
    }

    public static rrg valueOf(String str) {
        return (rrg) Enum.valueOf(rrg.class, str);
    }

    public static rrg[] values() {
        return (rrg[]) H.clone();
    }
}

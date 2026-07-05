package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class efg {
    public static final efg E;
    public static final efg F;
    public static final /* synthetic */ efg[] G;

    static {
        efg efgVar = new efg("CitationsHeader", 0);
        E = efgVar;
        efg efgVar2 = new efg("MoreHeader", 1);
        F = efgVar2;
        G = new efg[]{efgVar, efgVar2};
    }

    public static efg valueOf(String str) {
        return (efg) Enum.valueOf(efg.class, str);
    }

    public static efg[] values() {
        return (efg[]) G.clone();
    }
}

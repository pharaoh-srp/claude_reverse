package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tad {
    public static final tad E;
    public static final tad F;
    public static final /* synthetic */ tad[] G;

    static {
        tad tadVar = new tad("EXACT", 0);
        E = tadVar;
        tad tadVar2 = new tad("INEXACT", 1);
        F = tadVar2;
        G = new tad[]{tadVar, tadVar2};
    }

    public static tad valueOf(String str) {
        return (tad) Enum.valueOf(tad.class, str);
    }

    public static tad[] values() {
        return (tad[]) G.clone();
    }
}

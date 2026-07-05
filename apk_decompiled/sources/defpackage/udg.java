package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class udg {
    public static final udg E;
    public static final udg F;
    public static final udg G;
    public static final /* synthetic */ udg[] H;

    static {
        udg udgVar = new udg("IDLE", 0);
        E = udgVar;
        udg udgVar2 = new udg("SYNCING", 1);
        F = udgVar2;
        udg udgVar3 = new udg("STOPPED", 2);
        G = udgVar3;
        H = new udg[]{udgVar, udgVar2, udgVar3};
    }

    public static udg valueOf(String str) {
        return (udg) Enum.valueOf(udg.class, str);
    }

    public static udg[] values() {
        return (udg[]) H.clone();
    }
}

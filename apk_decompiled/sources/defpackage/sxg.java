package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sxg {
    public static final sxg E;
    public static final sxg F;
    public static final sxg G;
    public static final sxg H;
    public static final /* synthetic */ sxg[] I;

    static {
        sxg sxgVar = new sxg("NotInstalled", 0);
        E = sxgVar;
        sxg sxgVar2 = new sxg("Connected", 1);
        F = sxgVar2;
        sxg sxgVar3 = new sxg("NeedsReconnect", 2);
        G = sxgVar3;
        sxg sxgVar4 = new sxg("Restricted", 3);
        H = sxgVar4;
        I = new sxg[]{sxgVar, sxgVar2, sxgVar3, sxgVar4};
    }

    public static sxg valueOf(String str) {
        return (sxg) Enum.valueOf(sxg.class, str);
    }

    public static sxg[] values() {
        return (sxg[]) I.clone();
    }
}

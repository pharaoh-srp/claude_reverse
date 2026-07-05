package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class shj {
    public static final shj E;
    public static final shj F;
    public static final shj G;
    public static final shj H;
    public static final shj I;
    public static final /* synthetic */ shj[] J;

    static {
        shj shjVar = new shj("Done", 0);
        E = shjVar;
        shj shjVar2 = new shj("Running", 1);
        F = shjVar2;
        shj shjVar3 = new shj("Stalled", 2);
        G = shjVar3;
        shj shjVar4 = new shj("Error", 3);
        H = shjVar4;
        shj shjVar5 = new shj("Pending", 4);
        I = shjVar5;
        J = new shj[]{shjVar, shjVar2, shjVar3, shjVar4, shjVar5};
    }

    public static shj valueOf(String str) {
        return (shj) Enum.valueOf(shj.class, str);
    }

    public static shj[] values() {
        return (shj[]) J.clone();
    }
}

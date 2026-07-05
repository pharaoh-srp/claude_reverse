package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uhj {
    public static final uhj E;
    public static final uhj F;
    public static final uhj G;
    public static final uhj H;
    public static final /* synthetic */ uhj[] I;

    static {
        uhj uhjVar = new uhj("Pending", 0);
        E = uhjVar;
        uhj uhjVar2 = new uhj("Running", 1);
        F = uhjVar2;
        uhj uhjVar3 = new uhj("Done", 2);
        G = uhjVar3;
        uhj uhjVar4 = new uhj("Error", 3);
        H = uhjVar4;
        I = new uhj[]{uhjVar, uhjVar2, uhjVar3, uhjVar4};
    }

    public static uhj valueOf(String str) {
        return (uhj) Enum.valueOf(uhj.class, str);
    }

    public static uhj[] values() {
        return (uhj[]) I.clone();
    }
}

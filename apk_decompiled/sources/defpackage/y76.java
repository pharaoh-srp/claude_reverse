package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y76 {
    public static final y76 E;
    public static final y76 F;
    public static final y76 G;
    public static final y76 H;
    public static final y76 I;
    public static final y76 J;
    public static final y76 K;
    public static final /* synthetic */ y76[] L;

    static {
        y76 y76Var = new y76("Awaiting", 0);
        E = y76Var;
        y76 y76Var2 = new y76("AwaitingQuestion", 1);
        F = y76Var2;
        y76 y76Var3 = new y76("Running", 2);
        G = y76Var3;
        y76 y76Var4 = new y76("NeedsReview", 3);
        H = y76Var4;
        y76 y76Var5 = new y76("Ready", 4);
        I = y76Var5;
        y76 y76Var6 = new y76("Error", 5);
        J = y76Var6;
        y76 y76Var7 = new y76("Idle", 6);
        K = y76Var7;
        L = new y76[]{y76Var, y76Var2, y76Var3, y76Var4, y76Var5, y76Var6, y76Var7, new y76("PrMerged", 7), new y76("PrOpen", 8), new y76("PrClosed", 9), new y76("PrDraft", 10)};
    }

    public static y76 valueOf(String str) {
        return (y76) Enum.valueOf(y76.class, str);
    }

    public static y76[] values() {
        return (y76[]) L.clone();
    }
}

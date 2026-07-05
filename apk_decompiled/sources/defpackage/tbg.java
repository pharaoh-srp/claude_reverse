package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tbg {
    public static final tbg E;
    public static final tbg F;
    public static final tbg G;
    public static final /* synthetic */ tbg[] H;

    static {
        tbg tbgVar = new tbg("Short", 0);
        E = tbgVar;
        tbg tbgVar2 = new tbg("Long", 1);
        F = tbgVar2;
        tbg tbgVar3 = new tbg("Indefinite", 2);
        G = tbgVar3;
        H = new tbg[]{tbgVar, tbgVar2, tbgVar3};
    }

    public static tbg valueOf(String str) {
        return (tbg) Enum.valueOf(tbg.class, str);
    }

    public static tbg[] values() {
        return (tbg[]) H.clone();
    }
}

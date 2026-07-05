package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ls {
    public static final ls E;
    public static final ls F;
    public static final ls G;
    public static final ls H;
    public static final ls I;
    public static final ls J;
    public static final /* synthetic */ ls[] K;

    static {
        ls lsVar = new ls("SUM", 0);
        E = lsVar;
        ls lsVar2 = new ls("AVERAGE", 1);
        F = lsVar2;
        ls lsVar3 = new ls("MIN", 2);
        G = lsVar3;
        ls lsVar4 = new ls("MAX", 3);
        H = lsVar4;
        ls lsVar5 = new ls("COUNT", 4);
        I = lsVar5;
        ls lsVar6 = new ls("DURATION", 5);
        J = lsVar6;
        K = new ls[]{lsVar, lsVar2, lsVar3, lsVar4, lsVar5, lsVar6};
    }

    public static ls valueOf(String str) {
        return (ls) Enum.valueOf(ls.class, str);
    }

    public static ls[] values() {
        return (ls[]) K.clone();
    }
}

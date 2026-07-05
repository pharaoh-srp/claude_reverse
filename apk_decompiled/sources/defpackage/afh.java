package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class afh {
    public static final afh E;
    public static final afh F;
    public static final afh G;
    public static final /* synthetic */ afh[] H;

    static {
        afh afhVar = new afh("Insert", 0);
        E = afhVar;
        afh afhVar2 = new afh("Delete", 1);
        F = afhVar2;
        afh afhVar3 = new afh("Replace", 2);
        G = afhVar3;
        H = new afh[]{afhVar, afhVar2, afhVar3};
    }

    public static afh valueOf(String str) {
        return (afh) Enum.valueOf(afh.class, str);
    }

    public static afh[] values() {
        return (afh[]) H.clone();
    }
}

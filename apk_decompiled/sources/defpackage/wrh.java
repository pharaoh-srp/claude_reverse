package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wrh {
    public static final wrh E;
    public static final wrh F;
    public static final wrh G;
    public static final /* synthetic */ wrh[] H;

    static {
        wrh wrhVar = new wrh("On", 0);
        E = wrhVar;
        wrh wrhVar2 = new wrh("Off", 1);
        F = wrhVar2;
        wrh wrhVar3 = new wrh("Indeterminate", 2);
        G = wrhVar3;
        H = new wrh[]{wrhVar, wrhVar2, wrhVar3};
    }

    public static wrh valueOf(String str) {
        return (wrh) Enum.valueOf(wrh.class, str);
    }

    public static wrh[] values() {
        return (wrh[]) H.clone();
    }
}

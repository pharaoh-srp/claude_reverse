package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class plh implements szd {
    public static final unb E;
    public static final plh F;
    public static final plh G;
    public static final /* synthetic */ plh[] H;

    static {
        plh plhVar = new plh("LIGHT", 0);
        F = plhVar;
        plh plhVar2 = new plh("DARK", 1);
        G = plhVar2;
        H = new plh[]{plhVar, plhVar2};
        E = new unb(29);
    }

    public static plh valueOf(String str) {
        return (plh) Enum.valueOf(plh.class, str);
    }

    public static plh[] values() {
        return (plh[]) H.clone();
    }
}

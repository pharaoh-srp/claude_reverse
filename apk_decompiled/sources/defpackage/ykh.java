package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ykh {
    public static final ykh E;
    public static final ykh F;
    public static final ykh G;
    public static final /* synthetic */ ykh[] H;

    static {
        ykh ykhVar = new ykh("None", 0);
        E = ykhVar;
        ykh ykhVar2 = new ykh("Cursor", 1);
        F = ykhVar2;
        ykh ykhVar3 = new ykh("Selection", 2);
        G = ykhVar3;
        H = new ykh[]{ykhVar, ykhVar2, ykhVar3};
    }

    public static ykh valueOf(String str) {
        return (ykh) Enum.valueOf(ykh.class, str);
    }

    public static ykh[] values() {
        return (ykh[]) H.clone();
    }
}

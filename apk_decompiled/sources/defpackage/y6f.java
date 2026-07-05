package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y6f {
    public static final y6f E;
    public static final y6f F;
    public static final y6f G;
    public static final /* synthetic */ y6f[] H;

    static {
        y6f y6fVar = new y6f("NETWORK_UNMETERED", 0);
        E = y6fVar;
        y6f y6fVar2 = new y6f("DEVICE_IDLE", 1);
        F = y6fVar2;
        y6f y6fVar3 = new y6f("DEVICE_CHARGING", 2);
        G = y6fVar3;
        H = new y6f[]{y6fVar, y6fVar2, y6fVar3};
    }

    public static y6f valueOf(String str) {
        return (y6f) Enum.valueOf(y6f.class, str);
    }

    public static y6f[] values() {
        return (y6f[]) H.clone();
    }
}

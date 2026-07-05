package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bve {
    public static final bve E;
    public static final bve F;
    public static final bve G;
    public static final /* synthetic */ bve[] H;

    static {
        bve bveVar = new bve("AUTOMATIC", 0);
        E = bveVar;
        bve bveVar2 = new bve("TRUNCATE", 1);
        F = bveVar2;
        bve bveVar3 = new bve("WRITE_AHEAD_LOGGING", 2);
        G = bveVar3;
        H = new bve[]{bveVar, bveVar2, bveVar3};
    }

    public static bve valueOf(String str) {
        return (bve) Enum.valueOf(bve.class, str);
    }

    public static bve[] values() {
        return (bve[]) H.clone();
    }
}

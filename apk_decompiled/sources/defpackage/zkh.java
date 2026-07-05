package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zkh {
    public static final zkh E;
    public static final zkh F;
    public static final /* synthetic */ zkh[] G;

    static {
        zkh zkhVar = new zkh("Shown", 0);
        E = zkhVar;
        zkh zkhVar2 = new zkh("Hidden", 1);
        F = zkhVar2;
        G = new zkh[]{zkhVar, zkhVar2};
    }

    public static zkh valueOf(String str) {
        return (zkh) Enum.valueOf(zkh.class, str);
    }

    public static zkh[] values() {
        return (zkh[]) G.clone();
    }
}

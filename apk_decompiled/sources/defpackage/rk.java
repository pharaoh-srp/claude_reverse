package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rk {
    public static final rk E;
    public static final rk F;
    public static final rk G;
    public static final /* synthetic */ rk[] H;

    static {
        rk rkVar = new rk("CONNECTING", 0);
        E = rkVar;
        rk rkVar2 = new rk("CONNECTED", 1);
        F = rkVar2;
        rk rkVar3 = new rk("RECONNECTING", 2);
        G = rkVar3;
        H = new rk[]{rkVar, rkVar2, rkVar3};
    }

    public static rk valueOf(String str) {
        return (rk) Enum.valueOf(rk.class, str);
    }

    public static rk[] values() {
        return (rk[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rqh {
    public static final rqh E;
    public static final rqh F;
    public static final /* synthetic */ rqh[] G;

    static {
        rqh rqhVar = new rqh("Solid", 0);
        E = rqhVar;
        rqh rqhVar2 = new rqh("Gradient", 1);
        F = rqhVar2;
        G = new rqh[]{rqhVar, rqhVar2};
    }

    public static rqh valueOf(String str) {
        return (rqh) Enum.valueOf(rqh.class, str);
    }

    public static rqh[] values() {
        return (rqh[]) G.clone();
    }
}

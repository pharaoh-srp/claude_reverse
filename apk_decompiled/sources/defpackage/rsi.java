package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rsi {
    public static final rsi E;
    public static final rsi F;
    public static final /* synthetic */ rsi[] G;

    static {
        rsi rsiVar = new rsi("Lsq2", 0);
        E = rsiVar;
        rsi rsiVar2 = new rsi("Impulse", 1);
        F = rsiVar2;
        G = new rsi[]{rsiVar, rsiVar2};
    }

    public static rsi valueOf(String str) {
        return (rsi) Enum.valueOf(rsi.class, str);
    }

    public static rsi[] values() {
        return (rsi[]) G.clone();
    }
}

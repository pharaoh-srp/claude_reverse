package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xm {
    public static final xm E;
    public static final xm F;
    public static final /* synthetic */ xm[] G;

    static {
        xm xmVar = new xm("USER", 0);
        E = xmVar;
        xm xmVar2 = new xm("AGENT", 1);
        F = xmVar2;
        G = new xm[]{xmVar, xmVar2};
    }

    public static xm valueOf(String str) {
        return (xm) Enum.valueOf(xm.class, str);
    }

    public static xm[] values() {
        return (xm[]) G.clone();
    }
}

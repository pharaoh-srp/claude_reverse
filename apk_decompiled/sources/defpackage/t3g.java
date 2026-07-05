package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t3g {
    public static final t3g E;
    public static final t3g F;
    public static final t3g G;
    public static final /* synthetic */ t3g[] H;

    static {
        t3g t3gVar = new t3g("START", 0);
        E = t3gVar;
        t3g t3gVar2 = new t3g("STOP", 1);
        F = t3gVar2;
        t3g t3gVar3 = new t3g("STOP_AND_RESET_REPLAY_CACHE", 2);
        G = t3gVar3;
        H = new t3g[]{t3gVar, t3gVar2, t3gVar3};
    }

    public static t3g valueOf(String str) {
        return (t3g) Enum.valueOf(t3g.class, str);
    }

    public static t3g[] values() {
        return (t3g[]) H.clone();
    }
}

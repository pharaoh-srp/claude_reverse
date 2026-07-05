package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iji {
    public static final iji E;
    public static final iji F;
    public static final /* synthetic */ iji[] G;

    static {
        iji ijiVar = new iji("SUCCESS", 0);
        E = ijiVar;
        iji ijiVar2 = new iji("END_OF_BODY", 1);
        F = ijiVar2;
        G = new iji[]{ijiVar, ijiVar2};
    }

    public static iji valueOf(String str) {
        return (iji) Enum.valueOf(iji.class, str);
    }

    public static iji[] values() {
        return (iji[]) G.clone();
    }
}

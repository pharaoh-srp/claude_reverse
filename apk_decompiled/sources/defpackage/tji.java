package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tji {
    public static final tji E;
    public static final tji F;
    public static final /* synthetic */ tji[] G;

    static {
        tji tjiVar = new tji("UPLOAD", 0);
        E = tjiVar;
        tji tjiVar2 = new tji("CUSTOM_INSTRUCTION", 1);
        F = tjiVar2;
        G = new tji[]{tjiVar, tjiVar2};
    }

    public static tji valueOf(String str) {
        return (tji) Enum.valueOf(tji.class, str);
    }

    public static tji[] values() {
        return (tji[]) G.clone();
    }
}

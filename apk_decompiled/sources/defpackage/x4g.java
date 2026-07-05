package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x4g {
    public static final x4g E;
    public static final x4g F;
    public static final /* synthetic */ x4g[] G;

    static {
        x4g x4gVar = new x4g("Collapsed", 0);
        E = x4gVar;
        x4g x4gVar2 = new x4g("Expanded", 1);
        F = x4gVar2;
        G = new x4g[]{x4gVar, x4gVar2};
    }

    public static x4g valueOf(String str) {
        return (x4g) Enum.valueOf(x4g.class, str);
    }

    public static x4g[] values() {
        return (x4g[]) G.clone();
    }
}

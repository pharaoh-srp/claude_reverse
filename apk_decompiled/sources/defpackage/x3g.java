package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x3g {
    public static final x3g E;
    public static final x3g F;
    public static final x3g G;
    public static final /* synthetic */ x3g[] H;

    static {
        x3g x3gVar = new x3g("UNKNOWN", 0);
        E = x3gVar;
        x3g x3gVar2 = new x3g("SHARED", 1);
        F = x3gVar2;
        x3g x3gVar3 = new x3g("PRIVATE", 2);
        G = x3gVar3;
        H = new x3g[]{x3gVar, x3gVar2, x3gVar3};
    }

    public static x3g valueOf(String str) {
        return (x3g) Enum.valueOf(x3g.class, str);
    }

    public static x3g[] values() {
        return (x3g[]) H.clone();
    }
}

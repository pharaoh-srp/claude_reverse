package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b5g {
    public static final b5g E;
    public static final b5g F;
    public static final b5g G;
    public static final /* synthetic */ b5g[] H;

    static {
        b5g b5gVar = new b5g("Hidden", 0);
        E = b5gVar;
        b5g b5gVar2 = new b5g("Expanded", 1);
        F = b5gVar2;
        b5g b5gVar3 = new b5g("PartiallyExpanded", 2);
        G = b5gVar3;
        H = new b5g[]{b5gVar, b5gVar2, b5gVar3};
    }

    public static b5g valueOf(String str) {
        return (b5g) Enum.valueOf(b5g.class, str);
    }

    public static b5g[] values() {
        return (b5g[]) H.clone();
    }
}

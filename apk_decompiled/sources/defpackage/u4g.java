package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u4g {
    public static final u4g E;
    public static final u4g F;
    public static final u4g G;
    public static final u4g H;
    public static final /* synthetic */ u4g[] I;

    static {
        u4g u4gVar = new u4g("MediumResizable", 0);
        E = u4gVar;
        u4g u4gVar2 = new u4g("LargeResizable", 1);
        F = u4gVar2;
        u4g u4gVar3 = new u4g("LargeFixed", 2);
        G = u4gVar3;
        u4g u4gVar4 = new u4g("Intrinsic", 3);
        H = u4gVar4;
        I = new u4g[]{u4gVar, u4gVar2, u4gVar3, u4gVar4};
    }

    public static u4g valueOf(String str) {
        return (u4g) Enum.valueOf(u4g.class, str);
    }

    public static u4g[] values() {
        return (u4g[]) I.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xrc {
    public static final xrc E;
    public static final xrc F;
    public static final xrc G;
    public static final /* synthetic */ xrc[] H;

    static {
        xrc xrcVar = new xrc("ALL", 0);
        E = xrcVar;
        xrc xrcVar2 = new xrc("ONLY_NON_SYNTHESIZED", 1);
        F = xrcVar2;
        xrc xrcVar3 = new xrc("NONE", 2);
        G = xrcVar3;
        H = new xrc[]{xrcVar, xrcVar2, xrcVar3};
    }

    public static xrc valueOf(String str) {
        return (xrc) Enum.valueOf(xrc.class, str);
    }

    public static xrc[] values() {
        return (xrc[]) H.clone();
    }
}

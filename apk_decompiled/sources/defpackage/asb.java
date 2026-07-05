package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class asb {
    public static final asb E;
    public static final asb F;
    public static final asb G;
    public static final asb H;
    public static final asb I;
    public static final /* synthetic */ asb[] J;

    static {
        asb asbVar = new asb("DefaultSpatial", 0);
        E = asbVar;
        asb asbVar2 = new asb("FastSpatial", 1);
        F = asbVar2;
        asb asbVar3 = new asb("SlowSpatial", 2);
        asb asbVar4 = new asb("DefaultEffects", 3);
        G = asbVar4;
        asb asbVar5 = new asb("FastEffects", 4);
        H = asbVar5;
        asb asbVar6 = new asb("SlowEffects", 5);
        I = asbVar6;
        J = new asb[]{asbVar, asbVar2, asbVar3, asbVar4, asbVar5, asbVar6};
    }

    public static asb valueOf(String str) {
        return (asb) Enum.valueOf(asb.class, str);
    }

    public static asb[] values() {
        return (asb[]) J.clone();
    }
}

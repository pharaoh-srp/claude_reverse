package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ooh {
    public static final ooh E;
    public static final ooh F;
    public static final ooh G;
    public static final /* synthetic */ ooh[] H;

    static {
        ooh oohVar = new ooh("Primary", 0);
        E = oohVar;
        ooh oohVar2 = new ooh("Secondary", 1);
        F = oohVar2;
        ooh oohVar3 = new ooh("Tertiary", 2);
        G = oohVar3;
        H = new ooh[]{oohVar, oohVar2, oohVar3};
    }

    public static ooh valueOf(String str) {
        return (ooh) Enum.valueOf(ooh.class, str);
    }

    public static ooh[] values() {
        return (ooh[]) H.clone();
    }
}

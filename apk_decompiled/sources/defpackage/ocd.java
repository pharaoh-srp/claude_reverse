package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ocd {
    public static final ocd E;
    public static final ocd F;
    public static final ocd G;
    public static final /* synthetic */ ocd[] H;

    static {
        ocd ocdVar = new ocd("Fetch", 0);
        E = ocdVar;
        ocd ocdVar2 = new ocd("SeedEmpty", 1);
        F = ocdVar2;
        ocd ocdVar3 = new ocd("None", 2);
        G = ocdVar3;
        H = new ocd[]{ocdVar, ocdVar2, ocdVar3};
    }

    public static ocd valueOf(String str) {
        return (ocd) Enum.valueOf(ocd.class, str);
    }

    public static ocd[] values() {
        return (ocd[]) H.clone();
    }
}

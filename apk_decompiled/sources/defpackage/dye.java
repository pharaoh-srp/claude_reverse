package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dye {
    public static final dye E;
    public static final dye F;
    public static final dye G;
    public static final /* synthetic */ dye[] H;

    static {
        dye dyeVar = new dye("FLUTTER_BUILD_TIME", 0);
        E = dyeVar;
        dye dyeVar2 = new dye("FLUTTER_RASTER_TIME", 1);
        F = dyeVar2;
        dye dyeVar3 = new dye("JS_FRAME_TIME", 2);
        G = dyeVar3;
        H = new dye[]{dyeVar, dyeVar2, dyeVar3};
    }

    public static dye valueOf(String str) {
        return (dye) Enum.valueOf(dye.class, str);
    }

    public static dye[] values() {
        return (dye[]) H.clone();
    }
}

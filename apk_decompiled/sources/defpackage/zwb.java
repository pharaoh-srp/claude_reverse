package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zwb {
    public static final zwb E;
    public static final zwb F;
    public static final zwb G;
    public static final /* synthetic */ zwb[] H;

    static {
        zwb zwbVar = new zwb("Default", 0);
        E = zwbVar;
        zwb zwbVar2 = new zwb("UserInput", 1);
        F = zwbVar2;
        zwb zwbVar3 = new zwb("PreventUserInput", 2);
        G = zwbVar3;
        H = new zwb[]{zwbVar, zwbVar2, zwbVar3};
    }

    public static zwb valueOf(String str) {
        return (zwb) Enum.valueOf(zwb.class, str);
    }

    public static zwb[] values() {
        return (zwb[]) H.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nad {
    public static final nad E;
    public static final nad F;
    public static final nad G;
    public static final nad H;
    public static final /* synthetic */ nad[] I;

    static {
        nad nadVar = new nad("Draft", 0);
        E = nadVar;
        nad nadVar2 = new nad("Open", 1);
        F = nadVar2;
        nad nadVar3 = new nad("Closed", 2);
        G = nadVar3;
        nad nadVar4 = new nad("Merged", 3);
        H = nadVar4;
        I = new nad[]{nadVar, nadVar2, nadVar3, nadVar4};
    }

    public static nad valueOf(String str) {
        return (nad) Enum.valueOf(nad.class, str);
    }

    public static nad[] values() {
        return (nad[]) I.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oxe {
    public static final oxe E;
    public static final oxe F;
    public static final oxe G;
    public static final oxe H;
    public static final oxe I;
    public static final oxe J;
    public static final /* synthetic */ oxe[] K;

    static {
        oxe oxeVar = new oxe("TAP", 0);
        E = oxeVar;
        oxe oxeVar2 = new oxe("SCROLL", 1);
        F = oxeVar2;
        oxe oxeVar3 = new oxe("SWIPE", 2);
        G = oxeVar3;
        oxe oxeVar4 = new oxe("CLICK", 3);
        H = oxeVar4;
        oxe oxeVar5 = new oxe("BACK", 4);
        I = oxeVar5;
        oxe oxeVar6 = new oxe("CUSTOM", 5);
        J = oxeVar6;
        K = new oxe[]{oxeVar, oxeVar2, oxeVar3, oxeVar4, oxeVar5, oxeVar6};
    }

    public static oxe valueOf(String str) {
        return (oxe) Enum.valueOf(oxe.class, str);
    }

    public static oxe[] values() {
        return (oxe[]) K.clone();
    }
}

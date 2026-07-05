package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w1a {
    public static final w1a E;
    public static final w1a F;
    public static final w1a G;
    public static final /* synthetic */ w1a[] H;

    static {
        w1a w1aVar = new w1a("SYNCHRONIZED", 0);
        E = w1aVar;
        w1a w1aVar2 = new w1a("PUBLICATION", 1);
        F = w1aVar2;
        w1a w1aVar3 = new w1a("NONE", 2);
        G = w1aVar3;
        H = new w1a[]{w1aVar, w1aVar2, w1aVar3};
    }

    public static w1a valueOf(String str) {
        return (w1a) Enum.valueOf(w1a.class, str);
    }

    public static w1a[] values() {
        return (w1a[]) H.clone();
    }
}

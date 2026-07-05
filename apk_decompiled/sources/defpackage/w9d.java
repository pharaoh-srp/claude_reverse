package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class w9d {
    public static final w9d E;
    public static final w9d F;
    public static final w9d G;
    public static final w9d H;
    public static final w9d I;
    public static final /* synthetic */ w9d[] J;

    static {
        w9d w9dVar = new w9d("NONE", 0);
        E = w9dVar;
        w9d w9dVar2 = new w9d("EXPECT_KEY", 1);
        F = w9dVar2;
        w9d w9dVar3 = new w9d("EXPECT_COLON", 2);
        G = w9dVar3;
        w9d w9dVar4 = new w9d("EXPECT_VALUE", 3);
        H = w9dVar4;
        w9d w9dVar5 = new w9d("AFTER_VALUE", 4);
        I = w9dVar5;
        J = new w9d[]{w9dVar, w9dVar2, w9dVar3, w9dVar4, w9dVar5};
    }

    public static w9d valueOf(String str) {
        return (w9d) Enum.valueOf(w9d.class, str);
    }

    public static w9d[] values() {
        return (w9d[]) J.clone();
    }
}

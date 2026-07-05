package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b5a {
    public static final b5a F;
    public static final b5a G;
    public static final b5a H;
    public static final b5a I;
    public static final b5a J;
    public static final /* synthetic */ b5a[] K;
    public static final /* synthetic */ gq6 L;
    public final String E;

    static {
        b5a b5aVar = new b5a("FIVE_HOUR", 0, "5h");
        F = b5aVar;
        b5a b5aVar2 = new b5a("SEVEN_DAY", 1, "7d");
        G = b5aVar2;
        b5a b5aVar3 = new b5a("SEVEN_DAY_OPUS", 2, "7d_opus");
        H = b5aVar3;
        b5a b5aVar4 = new b5a("SEVEN_DAY_SONNET", 3, "7d_sonnet");
        I = b5aVar4;
        b5a b5aVar5 = new b5a("OVERAGE", 4, "overage");
        J = b5aVar5;
        b5a[] b5aVarArr = {b5aVar, b5aVar2, b5aVar3, b5aVar4, b5aVar5};
        K = b5aVarArr;
        L = new gq6(b5aVarArr);
    }

    public b5a(String str, int i, String str2) {
        this.E = str2;
    }

    public static b5a valueOf(String str) {
        return (b5a) Enum.valueOf(b5a.class, str);
    }

    public static b5a[] values() {
        return (b5a[]) K.clone();
    }
}

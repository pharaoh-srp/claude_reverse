package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w3b {
    public static final w3b E;
    public static final w3b F;
    public static final w3b G;
    public static final /* synthetic */ w3b[] H;

    static {
        w3b w3bVar = new w3b("SetAll", 0);
        E = w3bVar;
        w3b w3bVar2 = new w3b("Tool", 1);
        F = w3bVar2;
        w3b w3bVar3 = new w3b("Spacer", 2);
        G = w3bVar3;
        H = new w3b[]{w3bVar, w3bVar2, w3bVar3};
    }

    public static w3b valueOf(String str) {
        return (w3b) Enum.valueOf(w3b.class, str);
    }

    public static w3b[] values() {
        return (w3b[]) H.clone();
    }
}

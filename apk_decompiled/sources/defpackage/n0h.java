package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n0h {
    public static final n0h E;
    public static final n0h F;
    public static final n0h G;
    public static final /* synthetic */ n0h[] H;

    static {
        n0h n0hVar = new n0h("StartToEnd", 0);
        E = n0hVar;
        n0h n0hVar2 = new n0h("EndToStart", 1);
        F = n0hVar2;
        n0h n0hVar3 = new n0h("Settled", 2);
        G = n0hVar3;
        H = new n0h[]{n0hVar, n0hVar2, n0hVar3};
    }

    public static n0h valueOf(String str) {
        return (n0h) Enum.valueOf(n0h.class, str);
    }

    public static n0h[] values() {
        return (n0h[]) H.clone();
    }
}

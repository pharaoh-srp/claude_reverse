package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n1h {
    public static final n1h E;
    public static final n1h F;
    public static final n1h G;
    public static final n1h H;
    public static final n1h I;
    public static final /* synthetic */ n1h[] J;

    static {
        n1h n1hVar = new n1h("UNKNOWN", 0);
        E = n1hVar;
        n1h n1hVar2 = new n1h("CHARGING", 1);
        F = n1hVar2;
        n1h n1hVar3 = new n1h("DISCHARGING", 2);
        G = n1hVar3;
        n1h n1hVar4 = new n1h("NOT_CHARGING", 3);
        H = n1hVar4;
        n1h n1hVar5 = new n1h("FULL", 4);
        I = n1hVar5;
        J = new n1h[]{n1hVar, n1hVar2, n1hVar3, n1hVar4, n1hVar5};
    }

    public static n1h valueOf(String str) {
        return (n1h) Enum.valueOf(n1h.class, str);
    }

    public static n1h[] values() {
        return (n1h[]) J.clone();
    }
}

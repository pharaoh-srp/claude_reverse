package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c9h {
    public static final c9h E;
    public static final c9h F;
    public static final c9h G;
    public static final /* synthetic */ c9h[] H;

    static {
        c9h c9hVar = new c9h("Loading", 0);
        E = c9hVar;
        c9h c9hVar2 = new c9h("Live", 1);
        F = c9hVar2;
        c9h c9hVar3 = new c9h("Ended", 2);
        G = c9hVar3;
        H = new c9h[]{c9hVar, c9hVar2, c9hVar3};
    }

    public static c9h valueOf(String str) {
        return (c9h) Enum.valueOf(c9h.class, str);
    }

    public static c9h[] values() {
        return (c9h[]) H.clone();
    }
}

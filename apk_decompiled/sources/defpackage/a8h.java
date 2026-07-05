package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a8h {
    public static final a8h E;
    public static final a8h F;
    public static final /* synthetic */ a8h[] G;

    static {
        a8h a8hVar = new a8h("REST", 0);
        E = a8hVar;
        a8h a8hVar2 = new a8h("SSE", 1);
        F = a8hVar2;
        G = new a8h[]{a8hVar, a8hVar2};
    }

    public static a8h valueOf(String str) {
        return (a8h) Enum.valueOf(a8h.class, str);
    }

    public static a8h[] values() {
        return (a8h[]) G.clone();
    }
}

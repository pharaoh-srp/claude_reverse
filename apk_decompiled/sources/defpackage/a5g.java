package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a5g {
    public static final a5g E;
    public static final a5g F;
    public static final /* synthetic */ a5g[] G;

    static {
        a5g a5gVar = new a5g("AboveContent", 0);
        E = a5gVar;
        a5g a5gVar2 = new a5g("OverContent", 1);
        F = a5gVar2;
        G = new a5g[]{a5gVar, a5gVar2};
    }

    public static a5g valueOf(String str) {
        return (a5g) Enum.valueOf(a5g.class, str);
    }

    public static a5g[] values() {
        return (a5g[]) G.clone();
    }
}

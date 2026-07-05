package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class w9g {
    public static final w9g E;
    public static final w9g F;
    public static final /* synthetic */ w9g[] G;

    static {
        w9g w9gVar = new w9g("THUMB", 0);
        E = w9gVar;
        w9g w9gVar2 = new w9g("TRACK", 1);
        F = w9gVar2;
        G = new w9g[]{w9gVar, w9gVar2};
    }

    public static w9g valueOf(String str) {
        return (w9g) Enum.valueOf(w9g.class, str);
    }

    public static w9g[] values() {
        return (w9g[]) G.clone();
    }
}

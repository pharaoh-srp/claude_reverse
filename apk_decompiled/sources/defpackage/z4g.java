package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z4g {
    public static final z4g E;
    public static final /* synthetic */ z4g[] F;

    static {
        z4g z4gVar = new z4g("Center", 0);
        E = z4gVar;
        F = new z4g[]{z4gVar, new z4g("Start", 1)};
    }

    public static z4g valueOf(String str) {
        return (z4g) Enum.valueOf(z4g.class, str);
    }

    public static z4g[] values() {
        return (z4g[]) F.clone();
    }
}

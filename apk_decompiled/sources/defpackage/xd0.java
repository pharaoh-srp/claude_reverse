package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 {
    public static final xd0 E;
    public static final xd0 F;
    public static final /* synthetic */ xd0[] G;

    static {
        xd0 xd0Var = new xd0("Vector", 0);
        E = xd0Var;
        xd0 xd0Var2 = new xd0("FontGlyph", 1);
        F = xd0Var2;
        G = new xd0[]{xd0Var, xd0Var2};
    }

    public static xd0 valueOf(String str) {
        return (xd0) Enum.valueOf(xd0.class, str);
    }

    public static xd0[] values() {
        return (xd0[]) G.clone();
    }
}

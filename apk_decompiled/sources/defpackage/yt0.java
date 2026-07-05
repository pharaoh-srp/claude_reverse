package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yt0 {
    public static final yt0 E;
    public static final yt0 F;
    public static final /* synthetic */ yt0[] G;

    static {
        yt0 yt0Var = new yt0("PREVIEW", 0);
        E = yt0Var;
        yt0 yt0Var2 = new yt0("CODE", 1);
        F = yt0Var2;
        G = new yt0[]{yt0Var, yt0Var2};
    }

    public static yt0 valueOf(String str) {
        return (yt0) Enum.valueOf(yt0.class, str);
    }

    public static yt0[] values() {
        return (yt0[]) G.clone();
    }
}

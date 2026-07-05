package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ky2 {
    public static final ky2 E;
    public static final ky2 F;
    public static final ky2 G;
    public static final ky2 H;
    public static final ky2 I;
    public static final ky2 J;
    public static final /* synthetic */ ky2[] K;

    static {
        ky2 ky2Var = new ky2("HUMAN", 0);
        E = ky2Var;
        ky2 ky2Var2 = new ky2("ASSISTANT", 1);
        F = ky2Var2;
        ky2 ky2Var3 = new ky2("PARTIAL_RESPONSE_ERROR", 2);
        G = ky2Var3;
        ky2 ky2Var4 = new ky2("MCP_AUTH_REQUIRED", 3);
        H = ky2Var4;
        ky2 ky2Var5 = new ky2("CLAUDE_FOOTER", 4);
        I = ky2Var5;
        ky2 ky2Var6 = new ky2("BOTTOM_SPACE", 5);
        J = ky2Var6;
        K = new ky2[]{ky2Var, ky2Var2, ky2Var3, ky2Var4, ky2Var5, ky2Var6};
    }

    public static ky2 valueOf(String str) {
        return (ky2) Enum.valueOf(ky2.class, str);
    }

    public static ky2[] values() {
        return (ky2[]) K.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            throw new IllegalStateException((this + " is not a post-message slot").toString());
        }
        if (iOrdinal == 2) {
            return 0;
        }
        if (iOrdinal == 3) {
            return 1;
        }
        if (iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal == 5) {
            return 3;
        }
        wg6.i();
        return 0;
    }
}

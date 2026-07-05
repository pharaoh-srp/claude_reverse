package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r71 {
    public static final r71 E;
    public static final r71 F;
    public static final /* synthetic */ r71[] G;

    static {
        r71 r71Var = new r71("Model", 0);
        E = r71Var;
        r71 r71Var2 = new r71("OptIn", 1);
        F = r71Var2;
        G = new r71[]{r71Var, r71Var2};
    }

    public static r71 valueOf(String str) {
        return (r71) Enum.valueOf(r71.class, str);
    }

    public static r71[] values() {
        return (r71[]) G.clone();
    }
}

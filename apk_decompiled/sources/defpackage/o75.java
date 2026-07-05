package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o75 {
    public static final o75 E;
    public static final o75 F;
    public static final /* synthetic */ o75[] G;

    static {
        o75 o75Var = new o75("CHOOSE_TEMPLATE", 0);
        E = o75Var;
        o75 o75Var2 = new o75("ADD_TITLE", 1);
        F = o75Var2;
        G = new o75[]{o75Var, o75Var2};
    }

    public static o75 valueOf(String str) {
        return (o75) Enum.valueOf(o75.class, str);
    }

    public static o75[] values() {
        return (o75[]) G.clone();
    }
}

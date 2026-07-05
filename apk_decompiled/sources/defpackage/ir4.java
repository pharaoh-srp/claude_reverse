package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ir4 {
    public static final ir4 E;
    public static final ir4 F;
    public static final /* synthetic */ ir4[] G;

    static {
        ir4 ir4Var = new ir4("App", 0);
        E = ir4Var;
        ir4 ir4Var2 = new ir4("Chat", 1);
        F = ir4Var2;
        G = new ir4[]{ir4Var, ir4Var2};
    }

    public static ir4 valueOf(String str) {
        return (ir4) Enum.valueOf(ir4.class, str);
    }

    public static ir4[] values() {
        return (ir4[]) G.clone();
    }
}

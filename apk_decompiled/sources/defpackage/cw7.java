package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cw7 {
    public static final cw7 E;
    public static final cw7 F;
    public static final /* synthetic */ cw7[] G;

    static {
        cw7 cw7Var = new cw7("SiblingAssistant", 0);
        E = cw7Var;
        cw7 cw7Var2 = new cw7("SiblingHuman", 1);
        F = cw7Var2;
        G = new cw7[]{cw7Var, cw7Var2};
    }

    public static cw7 valueOf(String str) {
        return (cw7) Enum.valueOf(cw7.class, str);
    }

    public static cw7[] values() {
        return (cw7[]) G.clone();
    }
}

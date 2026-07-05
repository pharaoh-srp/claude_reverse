package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class le6 {
    public static final le6 E;
    public static final le6 F;
    public static final /* synthetic */ le6[] G;

    static {
        le6 le6Var = new le6("CHAT", 0);
        E = le6Var;
        le6 le6Var2 = new le6("PROJECT", 1);
        F = le6Var2;
        G = new le6[]{le6Var, le6Var2, new le6("SPACER", 2)};
    }

    public static le6 valueOf(String str) {
        return (le6) Enum.valueOf(le6.class, str);
    }

    public static le6[] values() {
        return (le6[]) G.clone();
    }
}

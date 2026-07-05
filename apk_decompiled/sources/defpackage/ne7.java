package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ne7 {
    public static final ne7 E;
    public static final ne7 F;
    public static final /* synthetic */ ne7[] G;

    static {
        ne7 ne7Var = new ne7("RETRY", 0);
        E = ne7Var;
        ne7 ne7Var2 = new ne7("RELOAD", 1);
        F = ne7Var2;
        G = new ne7[]{ne7Var, ne7Var2};
    }

    public static ne7 valueOf(String str) {
        return (ne7) Enum.valueOf(ne7.class, str);
    }

    public static ne7[] values() {
        return (ne7[]) G.clone();
    }
}

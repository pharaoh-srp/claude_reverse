package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n56 {
    public static final n56 F;
    public static final /* synthetic */ n56[] G;
    public static final /* synthetic */ gq6 H;
    public final String E;

    static {
        n56 n56Var = new n56("Default", 0, "default");
        F = n56Var;
        n56[] n56VarArr = {n56Var, new n56("Popular", 1, "popular"), new n56("Trending", 2, "trending"), new n56("New", 3, "new"), new n56("Alphabetical", 4, "alphabetical")};
        G = n56VarArr;
        H = new gq6(n56VarArr);
    }

    public n56(String str, int i, String str2) {
        this.E = str2;
    }

    public static n56 valueOf(String str) {
        return (n56) Enum.valueOf(n56.class, str);
    }

    public static n56[] values() {
        return (n56[]) G.clone();
    }
}

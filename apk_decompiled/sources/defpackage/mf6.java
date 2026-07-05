package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mf6 {
    public static final mf6 E;
    public static final mf6 F;
    public static final mf6 G;
    public static final mf6 H;
    public static final mf6 I;
    public static final mf6 J;
    public static final mf6 K;
    public static final mf6 L;
    public static final mf6 M;
    public static final mf6 N;
    public static final /* synthetic */ mf6[] O;

    static {
        mf6 mf6Var = new mf6("HEADER", 0);
        E = mf6Var;
        mf6 mf6Var2 = new mf6("NEW_CHAT", 1);
        F = mf6Var2;
        mf6 mf6Var3 = new mf6("MORE_TABS", 2);
        G = mf6Var3;
        mf6 mf6Var4 = new mf6("CUSTOMIZE", 3);
        H = mf6Var4;
        mf6 mf6Var5 = new mf6("LAUNCH_TAB_PICKER", 4);
        I = mf6Var5;
        mf6 mf6Var6 = new mf6("DONE", 5);
        J = mf6Var6;
        mf6 mf6Var7 = new mf6("EDUCATION_UPSELL", 6);
        mf6 mf6Var8 = new mf6("PROJECTS_DIVIDER", 7);
        mf6 mf6Var9 = new mf6("STARRED_SECTION_DIVIDER", 8);
        K = mf6Var9;
        mf6 mf6Var10 = new mf6("STARRED_SECTION_HEADER", 9);
        L = mf6Var10;
        mf6 mf6Var11 = new mf6("RECENTS_SECTION_DIVIDER", 10);
        M = mf6Var11;
        mf6 mf6Var12 = new mf6("RECENTS_SECTION_HEADER", 11);
        N = mf6Var12;
        O = new mf6[]{mf6Var, mf6Var2, mf6Var3, mf6Var4, mf6Var5, mf6Var6, mf6Var7, mf6Var8, mf6Var9, mf6Var10, mf6Var11, mf6Var12, new mf6("PROJECTS_HEADER", 12), new mf6("PROJECTS_EMPTY_STATE", 13), new mf6("PROJECTS_UPSELL", 14), new mf6("ALL_PROJECTS", 15), new mf6("SEARCH_EMPTY_STATE", 16), new mf6("BOTTOM_SPACER", 17)};
    }

    public static mf6 valueOf(String str) {
        return (mf6) Enum.valueOf(mf6.class, str);
    }

    public static mf6[] values() {
        return (mf6[]) O.clone();
    }
}

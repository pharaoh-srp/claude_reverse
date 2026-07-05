package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lc9 {
    public static final lc9 E;
    public static final lc9 F;
    public static final lc9 G;
    public static final lc9 H;
    public static final lc9 I;
    public static final lc9 J;
    public static final /* synthetic */ lc9[] K;

    static {
        lc9 lc9Var = new lc9("PROJECT_DETAILS", 0);
        E = lc9Var;
        lc9 lc9Var2 = new lc9("EMPTY_STATE", 1);
        F = lc9Var2;
        lc9 lc9Var3 = new lc9("SECTION_HEADER", 2);
        G = lc9Var3;
        lc9 lc9Var4 = new lc9("CHAT_ITEM", 3);
        H = lc9Var4;
        lc9 lc9Var5 = new lc9("MEMORY_ITEM", 4);
        I = lc9Var5;
        lc9 lc9Var6 = new lc9("BOXES_ROW_ITEM", 5);
        J = lc9Var6;
        K = new lc9[]{lc9Var, lc9Var2, lc9Var3, lc9Var4, lc9Var5, lc9Var6};
    }

    public static lc9 valueOf(String str) {
        return (lc9) Enum.valueOf(lc9.class, str);
    }

    public static lc9[] values() {
        return (lc9[]) K.clone();
    }
}

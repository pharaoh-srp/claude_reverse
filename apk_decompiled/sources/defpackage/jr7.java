package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jr7 {
    public static final jr7 E;
    public static final /* synthetic */ jr7[] F;

    /* JADX INFO: Fake field, exist only in values array */
    jr7 EF0;

    static {
        jr7 jr7Var = new jr7("Visible", 0);
        jr7 jr7Var2 = new jr7("Clip", 1);
        E = jr7Var2;
        F = new jr7[]{jr7Var, jr7Var2, new jr7("ExpandIndicator", 2), new jr7("ExpandOrCollapseIndicator", 3)};
    }

    public static jr7 valueOf(String str) {
        return (jr7) Enum.valueOf(jr7.class, str);
    }

    public static jr7[] values() {
        return (jr7[]) F.clone();
    }
}

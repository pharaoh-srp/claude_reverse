package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class crb {
    public static final /* synthetic */ crb[] E;
    public static final /* synthetic */ gq6 F;

    static {
        crb[] crbVarArr = {new crb("JANUARY", 0), new crb("FEBRUARY", 1), new crb("MARCH", 2), new crb("APRIL", 3), new crb("MAY", 4), new crb("JUNE", 5), new crb("JULY", 6), new crb("AUGUST", 7), new crb("SEPTEMBER", 8), new crb("OCTOBER", 9), new crb("NOVEMBER", 10), new crb("DECEMBER", 11)};
        E = crbVarArr;
        F = new gq6(crbVarArr);
    }

    public static crb valueOf(String str) {
        return (crb) Enum.valueOf(crb.class, str);
    }

    public static crb[] values() {
        return (crb[]) E.clone();
    }
}

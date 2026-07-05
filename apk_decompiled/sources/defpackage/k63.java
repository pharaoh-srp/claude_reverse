package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k63 {
    public static final /* synthetic */ k63[] E;
    public static final /* synthetic */ gq6 F;

    static {
        k63[] k63VarArr = {new k63("TOP_BAR", 0), new k63("CONTENT", 1), new k63("INPUT", 2)};
        E = k63VarArr;
        F = new gq6(k63VarArr);
    }

    public static k63 valueOf(String str) {
        return (k63) Enum.valueOf(k63.class, str);
    }

    public static k63[] values() {
        return (k63[]) E.clone();
    }
}

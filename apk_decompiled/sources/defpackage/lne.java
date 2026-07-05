package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lne {
    public static final lne E;
    public static final lne F;
    public static final /* synthetic */ lne[] G;

    static {
        lne lneVar = new lne("Ltr", 0);
        E = lneVar;
        lne lneVar2 = new lne("Rtl", 1);
        F = lneVar2;
        G = new lne[]{lneVar, lneVar2};
    }

    public static lne valueOf(String str) {
        return (lne) Enum.valueOf(lne.class, str);
    }

    public static lne[] values() {
        return (lne[]) G.clone();
    }
}

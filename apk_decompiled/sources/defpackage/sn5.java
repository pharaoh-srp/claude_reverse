package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sn5 {
    public static final /* synthetic */ sn5[] E;
    public static final /* synthetic */ gq6 F;

    static {
        sn5[] sn5VarArr = {new sn5("MONDAY", 0), new sn5("TUESDAY", 1), new sn5("WEDNESDAY", 2), new sn5("THURSDAY", 3), new sn5("FRIDAY", 4), new sn5("SATURDAY", 5), new sn5("SUNDAY", 6)};
        E = sn5VarArr;
        F = new gq6(sn5VarArr);
    }

    public static sn5 valueOf(String str) {
        return (sn5) Enum.valueOf(sn5.class, str);
    }

    public static sn5[] values() {
        return (sn5[]) E.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 {
    public static final /* synthetic */ hd1[] E = {new hd1("PRESENT", 0), new hd1("ABSENT", 1), new hd1("PRESENT_OPTIONAL", 2), new hd1("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    hd1 EF5;

    public static hd1 valueOf(String str) {
        return (hd1) Enum.valueOf(hd1.class, str);
    }

    public static hd1[] values() {
        return (hd1[]) E.clone();
    }
}

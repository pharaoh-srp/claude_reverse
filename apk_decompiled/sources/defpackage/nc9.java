package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nc9 {
    public static final /* synthetic */ nc9[] E = {new nc9("CREATED", 0), new nc9("STARTED", 1), new nc9("RESUMED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    nc9 EF5;

    public static nc9 valueOf(String str) {
        return (nc9) Enum.valueOf(nc9.class, str);
    }

    public static nc9[] values() {
        return (nc9[]) E.clone();
    }
}

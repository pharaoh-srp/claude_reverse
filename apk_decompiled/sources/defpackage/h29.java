package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h29 {
    public static final /* synthetic */ h29[] E = {new h29("Primary", 0), new h29("Secondary", 1), new h29("Success", 2), new h29("Danger", 3), new h29("Warning", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    h29 EF5;

    public static h29 valueOf(String str) {
        return (h29) Enum.valueOf(h29.class, str);
    }

    public static h29[] values() {
        return (h29[]) E.clone();
    }
}
